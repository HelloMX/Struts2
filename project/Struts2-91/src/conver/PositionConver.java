package conver;

import bean.Position;
import ognl.DefaultTypeConverter;

import java.util.Map;

/**
 * Created by 马昕 on 2018/10/24.
 */
public class PositionConver extends DefaultTypeConverter {
    @Override
    public Object convertValue(Map context, Object value, Class toType) {
        if(toType== Position.class){
            //前台传递到后台的时候
            Position position=new Position();
            String[] str=(String[]) value;
            String pos=str[0];
            String[] xy=pos.split(",");
            position.setX(Float.valueOf(xy[0]));
            position.setY(Float.valueOf(xy[1]));
            return position;
        }else{
            //后台传递到前台的时候，值就是放在request范围中的值
            Position position=(Position)value;
            return position.getX()+"，"+position.getY();
        }

    }
}
