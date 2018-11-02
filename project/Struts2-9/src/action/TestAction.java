package action;

import com.opensymphony.xwork2.ActionSupport;

import java.util.Date;

/**
 * Created by 马昕 on 2018/10/24.
 */
public class TestAction extends ActionSupport {
    private Date times;

    @Override
    public String execute() throws Exception {
        System.out.println(times.toString());
        return SUCCESS;
    }

    public Date getTimes() {
        return times;
    }

    public void setTimes(Date times) {
        this.times = times;
    }
}
