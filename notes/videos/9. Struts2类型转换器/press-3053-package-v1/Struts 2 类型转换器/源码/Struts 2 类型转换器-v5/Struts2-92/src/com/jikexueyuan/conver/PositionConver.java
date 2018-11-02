package com.jikexueyuan.conver;

import java.util.Map;

import com.jikexueyuan.bean.Position;


import ognl.DefaultTypeConverter;

public class PositionConver extends DefaultTypeConverter {
	@Override
	public Object convertValue(Map context, Object value, Class toType) {
		//从前台传递过来数据的时候是12.6,22.7 自动封装成position类对象
		if (toType==Position.class) {
			Position po = new Position();
			String[] str = (String[])value;
			String zuobiao = str[0];
			String xy[] = zuobiao.split(",");//12.3,44.8
			po.setX(Float.valueOf(xy[0]));
			po.setY(Float.valueOf(xy[1]));
			return po;
		}
		//后台传递到前台时候，值就是放在request范围中的值
		if (toType==String.class) {
			Position po = (Position)value;
			String poo = "坐标为："+po.getX()+","+po.getY();
			return poo;
		}
		return null;
	}
}
