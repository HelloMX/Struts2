package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Enumeration;

/**
 * Created by 马昕 on 2018/10/22.
 */
public class BaseServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    //当请求发送到action前
    //调用MLoginAction类中getModel()获取要将数据表单封装到哪个实例化的对象中
    //获得该对象后，我们可以获得类的类型
    //获得类的类型之后，获得类中的属性
    //request.getParameters获得表单提交的所有数据名
    //从而获得值
    //如果表单提交的name值与实体类中的属性名一致
    //那么我们将获得表单中的数据 封装到user对象中去
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            //在程序运行时获得当前类的getModel方法
            Method method=this.getClass().getDeclaredMethod("getModel",null);

            //通过invoke方法 调用该方法获得实体类对象
            Object object=method.invoke(this,null);
//            System.out.println(object);
           //通过实体类对象 获得类类型
            Class cl=object.getClass();

            //通过类类型 获得类中属性对象数组
            Field[] fi=cl.getDeclaredFields();

            //通过request获得所有的表单中提交的name值
            Enumeration em=req.getParameterNames();

            //循环枚举中的值
            while (em.hasMoreElements()){
                String fieldName=em.nextElement().toString();
                System.out.println("从表单中获得的name值为："+fieldName);
                for(int i=0;i<fi.length;i++){
                    System.out.println("    从类中获得的属性值为："+fi[i].getName());
                    if(fieldName.equals(fi[i].getName())){
                        fi[i].setAccessible(true);//尤为重要，可以被外部赋值
                        fi[i].set(object,req.getParameter(fieldName));

                    }
                }
                Method method1=this.getClass().getDeclaredMethod("execute",null);
                Object url=method1.invoke(this,null);
                req.getRequestDispatcher(String.valueOf(url)).forward(req,resp);

            }

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }


}
