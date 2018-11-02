package interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;

/**
 * Created by 马昕 on 2018/10/23.
 */
public class CheckLoginInterceptor implements Interceptor {
    @Override
    public void destroy() {

    }

    @Override
    public void init() {

    }

    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        System.out.println("进入check login拦截器");
        String url="";
        if(null!= ServletActionContext.getRequest().getSession().getAttribute("username")){
            url=actionInvocation.invoke();
        }else{
            url="fail";
        }
        System.out.println("离开check login拦截器");
        return url;
    }
}
