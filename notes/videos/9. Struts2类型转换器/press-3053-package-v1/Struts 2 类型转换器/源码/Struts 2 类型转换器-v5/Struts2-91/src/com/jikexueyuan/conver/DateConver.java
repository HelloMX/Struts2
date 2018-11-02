package com.jikexueyuan.conver;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import ognl.DefaultTypeConverter;


public class DateConver extends DefaultTypeConverter{
	//����ʵ������ת���� �����ַ�ʽ
	// 1: �̳� ognl��DefaultTypeConverter�� ���� ʵ��TypeConverter �ӿ�
	// 2: ����struts2�⣬ʵ����struts2���Ҳ�ǻ��� ognl���ٴη�װ����һ���Ĳ���
	//    DefaultTypeConverter,
	
	//����  ognl ֻ��дһ��������ʵ��˫���ת��
	//     struts2�� ��д2��������
	//       һ���Ǵ��ַ���ת����ĳ������ convertFromString
	//       ��һ���� ��ĳ������ת�����ַ��� 	convertToString
	
	
	
	/***
	 * ��һ������������ת����������
	 * �ڶ���������ǰ̨���ݹ���������
	 * ������������ת�����Ŀ������
	 */
	public Object convertValue(Map context, Object value, Class toType) {
		//struts2���ڸ�ȫ��Ŀ��ǣ�����������ķ�ʽ���ܣ���ֹ�û��ύ��Ҫת��������
		//�Ƕ�ѡ��
		Date da = null;
		String[] params = (String[])value;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		try {
			 da = sdf.parse(params[0]);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return da;
	}
}
