package com.jikexueyuan.conver;

import java.util.Map;

import com.jikexueyuan.bean.Position;


import ognl.DefaultTypeConverter;

public class PositionConver extends DefaultTypeConverter {
	@Override
	public Object convertValue(Map context, Object value, Class toType) {
		//��ǰ̨���ݹ������ݵ�ʱ����12.6,22.7 �Զ���װ��position�����
		if (toType==Position.class) {
			Position po = new Position();
			String[] str = (String[])value;
			String zuobiao = str[0];
			String xy[] = zuobiao.split(",");//12.3,44.8
			po.setX(Float.valueOf(xy[0]));
			po.setY(Float.valueOf(xy[1]));
			return po;
		}
		//��̨���ݵ�ǰ̨ʱ��ֵ���Ƿ���request��Χ�е�ֵ
		if (toType==String.class) {
			Position po = (Position)value;
			String poo = "����Ϊ��"+po.getX()+","+po.getY();
			return poo;
		}
		return null;
	}
}
