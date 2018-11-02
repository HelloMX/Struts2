package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Created by 马昕 on 2018/10/23.
 */
public class FourthAction extends ActionSupport{
    @Override
    public String execute() throws Exception {
        ServletRequest request= ServletActionContext.getRequest();
        ServletResponse response=ServletActionContext.getResponse();
        ServletContext context=ServletActionContext.getServletContext();

        System.out.println("使用Struts2内置静态对象ServletActionContext（FourthAction）(推荐使用)");
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        System.out.println(username+"  "+password);
        return "success";
    }
}
