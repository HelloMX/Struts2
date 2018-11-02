package action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.StrutsStatics;
import org.apache.struts2.interceptor.RequestAware;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.xml.bind.SchemaOutputResolver;
import java.util.Map;

/**
 * Created by 马昕 on 2018/10/23.
 */
//使用requestAware拦截器
//org.apache.struts2.interceptor.RequestAware
public class SecondAction extends ActionSupport implements RequestAware{

    private ServletRequest request;
    private ServletResponse response;
    private ServletContext context;

    @Override
    public String execute() throws Exception {
        System.out.println("使用Struts2 RequestAware拦截器（Second Action）:");
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        System.out.println(username+"  "+password);
        return "success";
    }

    @Override
    public void setRequest(Map<String, Object> map) {
        request=(ServletRequest)map.get(StrutsStatics.HTTP_REQUEST);
        response=(ServletResponse) map.get(StrutsStatics.HTTP_RESPONSE);
        context=(ServletContext)map.get(StrutsStatics.SERVLET_CONTEXT);

    }
}
