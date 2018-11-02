package servlet;

import pojo.Users;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by 马昕 on 2018/10/22.
 */
public class LoginServlet extends BaseServlet {
    private Users user=new Users();

    public String execute() throws Exception {
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        return "/index.jsp";
    }

    public Users getModel() {
        return user;
    }

}
