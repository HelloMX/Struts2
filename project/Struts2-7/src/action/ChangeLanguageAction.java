package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by 马昕 on 2018/10/23.
 */
public class ChangeLanguageAction extends ActionSupport {
    private String username;
    private String password;

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
