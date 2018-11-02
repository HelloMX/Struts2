package action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by 马昕 on 2018/10/23.
 */
//Struts2 Aware拦截器
//org.apache.struts2.interceptor.ServletRequestAware
public class FirstAction extends ActionSupport implements ServletRequestAware,ServletResponseAware ,ServletContextAware{

    private ServletRequest request;
    private ServletResponse response;
    private ServletContext context;
    @Override
    public String execute() throws Exception {
        System.out.println("使用Struts2 Aware拦截器（FirstAction）:");
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        System.out.println(username+"  "+password);
        return "success";
    }

    @Override
    public void setServletRequest(HttpServletRequest httpServletRequest) {
        request=httpServletRequest;
    }

    @Override
    public void setServletResponse(HttpServletResponse httpServletResponse) {
        response=httpServletResponse;
    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        context=servletContext;
    }
}
