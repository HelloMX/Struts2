package action;

import bean.Users;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by 马昕 on 2018/10/23.
 */
public class LoginAction extends ActionSupport {
    private Users us;

    @Override
    public String execute() throws Exception {
        System.out.println(us.getUsername());
        System.out.println(us.getPassword());
        return "success";
    }

    public Users getUs() {
        return us;
    }

    public void setUs(Users us) {
        this.us = us;
    }
}
