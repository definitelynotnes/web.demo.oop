package interfaces;

import java.util.Calendar;

public class A {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, calendar.get(Calendar.YEAR));
		calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH));
		calendar.set(Calendar.DATE, calendar.get(Calendar.DATE));
		StringBuilder str = new StringBuilder();
		str.append(calendar);
		System.out.println(str);

	}

}
