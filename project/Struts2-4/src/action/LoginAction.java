package action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import pojo.Users;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by 马昕 on 2018/10/23.
 */
public class LoginAction extends ActionSupport {
    private String username;
    private String password;

    //通过属性自动封装
    @Override
    public String execute() throws Exception {
        System.out.println(username);
        System.out.println(password);
        if(username.equals("admin")&&password.equals("123")){
            Users user=new Users();
            user.setUsername(username);
            user.setPassword(password);

            ServletRequest request= ServletActionContext.getRequest();
            HttpServletRequest httpServletRequest=(HttpServletRequest)request;
            HttpSession session=httpServletRequest.getSession();
            session.setAttribute("us",user);
            return "success";
        }else{
            return "fail";
        }

        //servletContext 也就是application对象
        //服务器对象  只要服务器不关闭，那么这个信息永远存在
        //该信息是存在服务器内存中的
        //一般数据我们是严禁向application对象中放入的，容易导致服务器内存溢出，程序崩溃
        //驾校考试系统，一般只要注册用户就可以免费使用，用户量庞大
        //每次只出现一个题，然后昨晚本道题自动跳到下一个题
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
