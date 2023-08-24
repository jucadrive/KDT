package ch10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exercise10_4 {

	public static void main(String[] args) {
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		date1.set(1994, 2, 31); // 1994년 3월 31일로 설정
		date2.set(2023, 5, 20);	// 오늘 날짜
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println("birthDay = " + df.format(new Date(date1.getTimeInMillis())));	// Calendar 타입 객체를 Date 타입으로 변환
		System.out.println("today = " + df.format(new Date(date2.getTimeInMillis())));
		
		// 두 날짜 간의 차이를 얻으려면, getTimeInMillis() 천분의 1초 단위로 변환해야 한다
		long difference = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;	
		
		System.out.println(difference / (24 * 60 * 60) + "days");	// 1일 : 24 * 60 * 60
	}

}
