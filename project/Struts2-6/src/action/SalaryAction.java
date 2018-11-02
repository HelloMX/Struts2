package action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by 马昕 on 2018/10/23.
 */
public class SalaryAction extends ActionSupport {

    public String show() throws Exception {
        System.out.println("进入Salary show：");
        return "success";
    }

    public String update() throws Exception {
        System.out.println("进入Salary update：");
        return "success";
    }

    public String add() throws Exception {
        System.out.println("进入Salary add：");
        return "success";
    }
    public String delete() throws Exception {
        System.out.println("进入Salary delete：");
        return "success";
    }
}
