package action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

/**
 * Created by 马昕 on 2018/10/23.
 */
public class LoginAction extends ActionSupport {
    private String username;
    @Override
    public String execute() throws Exception {
        System.out.println("进入LoginAction");
        if(username.equals("admin")){
            ServletActionContext.getRequest().getSession().setAttribute("username",username);
            return "success";
        }else{
            return "fail";
        }

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
