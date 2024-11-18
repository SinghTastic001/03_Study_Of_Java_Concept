package NewFeaturesDemo;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DateTimeDemo {
	
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println(datetime);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalDate leap = LocalDate.of(2024, 12, 12);
		System.out.println(leap.isLeapYear());
		
		LocalDate leap1 =  LocalDate.of(2023, 12, 30);
		System.out.println(leap1.isLeapYear());
		
		Date d = new Date();
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String strdate = dateformat.format(d);
		System.out.println(strdate);
	}

}
