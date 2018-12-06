package com.xt.xingtong.tool;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTool {
	private static Map<String, Object> map = new HashMap<String, Object>();

	public static Map<String, Object> mapTool(int count, String msg) {
		if (count > 0) {
			map.put("success", true);
			map.put("message", msg + "成功");
		} else {
			map.put("success", false);
			map.put("message", msg + "失败,系统繁忙稍后再试");

		}
		return map;

	}
	
	public static Map<String, Object> importData(int count, String msg) {
		if (count > 0) {
			map.put("success", true);
			map.put("msg", msg+":"+count+"条");
		} else {
			map.put("success", false);
			map.put("msg", msg + "失败");

		}
		return map;

	}

	public static long MinuteInteval(Date date) throws ParseException {
	/*	设置日期格式SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");*/ 
		Calendar dateOne = Calendar.getInstance(), dateTwo = Calendar
				.getInstance();
		dateOne.setTime(new Date()); // 设置为当前系统时间
		dateTwo.setTime(date);
		long timeOne = dateOne.getTimeInMillis();
		long timeTwo = dateTwo.getTimeInMillis();
		long minute = (timeOne - timeTwo) / (1000 * 60);
		return minute;
	}
	
	
	
	public static Map<String, Object> getPagination(List<?> list,int count) {
	
			map.put("data", list);
			map.put("count", count);
			map.put("code", 0);
			map.put("msg", "");
	    	return map;

	}

	public static Object mapTool(Object object, String msg) {
		if (object !=null) {
			map.put("success", true);
			map.put("msg", msg + "成功");
		} else {
			map.put("success", false);
			map.put("msg", msg + "失败");

		}
		return map;
	}
	
	
}