package action;

import bean.Users;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.net.httpserver.Authenticator;

/**
 * Created by 马昕 on 2018/10/24.
 */
public class RegisterAction extends ActionSupport {
    private Users user;

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }


    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
