package action;

import bean.Position;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

/**
 * Created by 马昕 on 2018/10/24.
 */
public class TestAction extends ActionSupport {
    Position position;
    @Override
    public String execute() throws Exception {
        System.out.println(position.getX());
        System.out.println(position.getY());
        ServletActionContext.getRequest().setAttribute("position",position);
        return SUCCESS;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
