package action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by 马昕 on 2018/10/23.
 */
public class LoginAction extends ActionSupport{
    @Override
    public String execute() throws Exception {
        System.out.println("login");
        return SUCCESS;
    }
}
