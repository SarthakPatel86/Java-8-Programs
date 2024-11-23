package com;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class DateAndTimeDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date d1 = new Date();
//		SimpleDateFormat df = new SimpleDateFormat();
//		System.out.println("Date : " + df.format(d1));
//
//		SimpleDateFormat df1 = new SimpleDateFormat("yyyy:MM:dd");
//		System.out.println("Date : " + df1.format(d1));
//
//		SimpleDateFormat df2 = new SimpleDateFormat("hh:mm");
//		System.out.println("time : " + df2.format(d1));
//
//		System.out.println(d1.getDate());
//		System.out.println(d1.getHours());
//		System.out.println(d1);

//		LocalDate l1 = LocalDate.now();
//		LocalTime l2 = LocalTime.now();
//		LocalDateTime l3 = LocalDateTime.now();
//
//		System.out.println("Date : "+l1);
//		System.out.println("Time : "+l2);
//		System.out.println("Date-Time : "+l3);

//		LocalDate l1 = LocalDate.now();
//		System.out.println(l1.getDayOfMonth());
//		System.out.println(l1.getDayOfYear());
//		System.out.println(l1.getYear());
//		System.out.println(l1.getDayOfWeek());
//		System.out.println(l1.getMonth());
//
//		System.out.println(l1.plusDays(45));
//		System.out.println(l1.minusDays(20));
//		System.out.println(l1.plusMonths(5));
//
//		LocalDate l2 = l1.of(1997, 05, 19);
//		System.out.println(l2);
//		System.out.println(l2.getYear());

//		LocalTime t1 = LocalTime.now();
//		System.out.println(t1);
//		System.out.println(t1.getHour());
//		System.out.println(t1.getMinute());
//		System.out.println(t1.getSecond());
//		System.out.println(t1.getNano());
//
//		System.out.println(t1.plusHours(2));
//		System.out.println(t1.minusHours(5));
//		System.out.println(t1.of(2, 15));
//
//		LocalDateTime lt = LocalDateTime.now();
//		System.out.println(lt.getDayOfMonth());

		ZoneId.getAvailableZoneIds().stream().forEach(ele -> System.out.println(ele));
		LocalDateTime lt = LocalDateTime.now();
		System.out.println(lt.atZone(ZoneId.of("Australia/Sydney")));
	}
}
