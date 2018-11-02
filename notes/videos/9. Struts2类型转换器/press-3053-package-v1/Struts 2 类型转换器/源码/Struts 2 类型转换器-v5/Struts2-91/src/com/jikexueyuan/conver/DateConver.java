package com.jikexueyuan.conver;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import ognl.DefaultTypeConverter;


public class DateConver extends DefaultTypeConverter{
	//我们实现类型转换器 有两种方式
	// 1: 继承 ognl的DefaultTypeConverter类 或者 实现TypeConverter 接口
	// 2: 基于struts2库，实际上struts2库的也是基于 ognl的再次封装，简化一定的操作
	//    DefaultTypeConverter,
	
	//区别：  ognl 只重写一个方法，实现双向的转换
	//     struts2的 重写2个方法，
	//       一个是从字符串转换成某种类型 convertFromString
	//       另一个是 从某种类型转换成字符串 	convertToString
	
	
	
	/***
	 * 第一个参数：类型转换的上下文
	 * 第二个参数：前台传递过来的数据
	 * 第三个参数：转换后的目标类型
	 */
	public Object convertValue(Map context, Object value, Class toType) {
		//struts2基于更全面的考虑，参数以数组的方式接受，防止用户提交的要转换的数据
		//是多选。
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
