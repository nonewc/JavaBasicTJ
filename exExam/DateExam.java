package exExam;


import java.util.*; // 구버전
import java.time.*; // 신버전
import java.time.format.DateTimeFormatter;

public class DateExam {
	
/*
 * Calendar 추상클래스이기 때문에 객체를 생성할 수 없고 메서드를 통해서만 사용한다.
 * 		Calendar cal = new Calander() // 에러
 * 		Calendar cal = Calendar.getInstance();
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
	
	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance();
		
		System.out.println("올해의 연도는 : " + today.get(Calendar.YEAR));
		System.out.println("현재의 월은 :" + today.get(Calendar.MONTH));
		// MONTH는 0에서 시작한다.
		System.out.println("올해 중 몇 번째 주 :" + today.get(Calendar.WEEK_OF_YEAR));
		
		System.out.println("올해의 몇  일 :" + today.get(Calendar.DATE));
		System.out.println("이달의 몇 일 :" + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("올해의 몇 일:" + today.get(Calendar.DAY_OF_YEAR));
		
		System.out.println("올해의 몇 일:" + today.get(Calendar.DAY_OF_WEEK));
		
		
		
		
		String[] yi = {"","일","월","화","수","목","금","토"};
		System.out.println("요일: " + yi[today.get(Calendar.DAY_OF_WEEK)]+"요일" );
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		date1.set(2000,1,1);
		
//		System.out.println("date1은" + date1);
//		System.out.println("date1은" + date1);
		
		long diff = (date2.getTimeInMillis() - date1.getTimeInMillis())/1000;
		System.out.println("date1부터 date2까지" + diff + "초 지났습니다.");
		
		System.out.println("date1부터 date2까지" + diff/60/60/24 + "일 지났습니다.");
		
		
		/////////////////////////////
		
		LocalDate now = LocalDate.now();
		
		System.out.println(now); // 현재 날짜, 컴퓨터의 날짜
		
		LocalDate pari = LocalDate.now(ZoneId.of("Europe/Paris"));
		
		System.out.println(pari); //현재 날짜, 파리 날짜
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy/MM/dd");
		
		int year = now.getDayOfYear();
		System.out.println("현재의 연도는" + year + "입니다.");
		
		String mon = now.getMonth().toString();
		System.out.println("현재의 월은" + mon + "입니다.");
		
		int monVal = now.getMonthValue();
		System.out.println("현재의 월은" + monVal + "입니다.");
		
		String dofw = now.getDayOfWeek().toString();
		System.out.println("오늘은" + dofw + "입니다.");
		
		int dofwVal = now.getDayOfWeek().getValue();
		System.out.println("오늘은" + dofwVal + "입니다."); // 월요일이 1 일요일이 7
			
		
		LocalTime ntime = LocalTime.now();
		System.out.println(ntime);
		
		DateTimeFormatter form = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
		
		String formatedTime = ntime.format(form);
		System.out.println(formatedTime);
		
		int hour = ntime.getHour();
		int minute = ntime.getMinute();
		int second = ntime.getSecond();
		
		System.out.println("현재 시각은" + hour + "입니다.");
		System.out.println("현재 분은" + minute + "입니다.");
		System.out.println("현재 초는" + second + "입니다.");
		
		
		/*****************************
				날짜와 시간을 함께 처리
		*****************************/
		
		
		LocalDateTime curr = LocalDateTime.now();
		
		DateTimeFormatter form2 = DateTimeFormatter.ofPattern("yy년 MM월 dd일 HH시 mm분 ss초");
		
		String formatedTime2 = curr.format(form2);
		
		System.out.println(formatedTime2);
		
		int year2 = curr.getYear();
		int month2 = curr.getMonthValue();
		int day2 = curr.getDayOfMonth();
		int hour2 = curr.getHour();
		int minute2 = curr.getMinute();
		int second2 = curr.getSecond();
		
		System.out.println("올해는" + year2 + "년 입니다.");
		System.out.println("이번달은" + month2 + "월 입니다.");
		System.out.println("오늘은" + day2 + "일 입니다.");
		System.out.println("현재 시각은" + hour2 + "시 입니다.");
		System.out.println("현재 분은" + minute2 + "분 입니다.");
		System.out.println("현재 초는" + second2 + "초 입니다.");
		
		
		
		
	}

}
