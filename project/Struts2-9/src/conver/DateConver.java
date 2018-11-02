package conver;

import ognl.DefaultTypeConverter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * Created by 马昕 on 2018/10/24.
 */
public class DateConver extends DefaultTypeConverter {
    //我们实现类型转换器有两种方式
    //1：继承ognl的DefaultTypeConverter类或者实现TypeConverter接口
    //2：基于struts库的DefaultTypeConverter，实际上struts库也是基于ognl的再次封装，简化一定操作，
    //struts2重写两个方法，一个是从字符串转换成某种类型，另一个是从某种类型转换成字符串
    //ognl只重写一个方法，实现双向转换

    //第一个参数：上下文
    //第二个参数：前台传递过来的数据
    //第三个参数：转换后的目标类型
    @Override
    public Object convertValue(Map context, Object value, Class toType) {
        Date date=null;
        //struts2基于更全面的 考虑，参数以数组的方式接受，防止用户提交的要转换的数据是多选
        String[] params=(String[])value;
        SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMdd");
        try {
            date=sdf.parse(params[0]);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
//        return super.convertValue(context, value, toType);
    }
}
