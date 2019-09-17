package 解题方法;

/**
 * 蔡勒公式Java实现例子
 * —— 蔡勒（Zeller）公式
 * 	历史上的某一天是星期几？未来的某一天是星期几？
 * 	关于这个问题，有很多计算公式（两个通用计算公式和一些分段计算公式），其中最著名的是蔡勒（Zeller）公式。
 * 	即w=y+[y/4]+[c/4]-2c+[26(m+1)/10]+d-1
 * 	公式中的符号含义如下，w：星期；c：世纪-1；y：年（两位数）；
 * 	m：月（m大于等于3，小于等于14，即在蔡勒公式中，某年的1、2月要看作上一年的13、14月来计算，比如2003年1月1日要看作2002年的13月1日来计算）；
 * 	d：日；
 * 	[ ]代表取整，即只要整数部分。
 * 	(C是世纪数减一，y是年份后两位，M是月份，d是日数。1月和2月要按上一年的13月和 14月来算，这时C和y均按上一年取值。)
 * @author pxs
 *
 */
public class Solution {
	public String dayOfTheWeek(int day, int month, int year) {
		if (month == 1) {
			month = 13;
			year--;
		}
		if (month == 2) {
			month = 14;
			year--;
		}
		int y = year % 100;
		int c = year /100 ;
		int h = (y + (y / 4) + (c / 4) - (2 * c) + ((26 * (month + 1)) / 10) + day - 1) % 7;
		String result = "";
		//可能是负值，因此计算除以7的余数之后需要判断是大于等于0还是小于0，如果小于0则将余数加7。
		if (h < 0){
			h += 7;
		}
		switch (Math.abs(h)) {
		case 0:
			result = "Sunday";
			break;
		case 1:
			result = "Monday";
			break;
		case 2:
			result = "Tuesday";
			break;
		case 3:
			result = "Wednesday";
			break;
		case 4:
			result = "Thursday";
			break;
		case 5:
			result = "Friday";
			break;
		case 6:
			result = "Saturday";
			break;
		default:
			break;
		}
		return result;

	}
}
