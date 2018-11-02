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
public class ThirdAction extends ActionSupport{


    @Override
    public String execute() throws Exception {
        ActionContext actionContext=ActionContext.getContext();
        ServletRequest request=(ServletRequest)actionContext.get(ServletActionContext.HTTP_REQUEST);
        ServletResponse response=(ServletResponse)actionContext.get(ServletActionContext.HTTP_RESPONSE);
        ServletContext context=(ServletContext)actionContext.get(ServletActionContext.SERVLET_CONTEXT);

        System.out.println("使用Struts2内置静态对象ActionContext（Third Action）:");
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        System.out.println(username+"  "+password);
        return super.execute();
    }
}
