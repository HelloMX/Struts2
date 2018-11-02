package action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by 马昕 on 2018/10/23.
 */
public class UsersAction extends ActionSupport {

    public String show() throws Exception {
        System.out.println("进入show：");
        return "Userssuccess";
    }

    public String update() throws Exception {
        System.out.println("进入update：");
        return "Userssuccess";
    }

    public String add() throws Exception {
        System.out.println("进入add：");
        return "Userssuccess";
    }
    public String delete() throws Exception {
        System.out.println("进入delete：");
        return "Userssuccess";
    }
}
