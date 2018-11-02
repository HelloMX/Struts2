package action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by 马昕 on 2018/10/23.
 */
public class NewsAction extends ActionSupport {
    public String show() throws Exception {
        System.out.println("进入 News show：");
        return "Newssuccess";
    }

    public String update() throws Exception {
        System.out.println("进入News update：");
        return "Newssuccess";
    }

    public String add() throws Exception {
        System.out.println("进入News add：");
        return "Newssuccess";
    }
    public String delete() throws Exception {
        System.out.println("进入News delete：");
        return "Newssuccess";
    }
}
