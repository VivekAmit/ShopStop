package newfeatures;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
/* Java 8 introduces a new date-time API under the package java.time.
It simply change the way we have been handling dates in java applications.



Important classes introduced in java.time package



Local − Simplified date-time API with no complexity of timezone handling.



Zoned − Specialized date-time API to deal with various timezones.
*/

public class DateTimeDemo {
	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1);
		System.out.println(d1.getDate());
		System.out.println(d1.getHours() +":" +d1.getMinutes());
		
		
		// Calendar class
		System.out.println("*********Calendar Class*********");
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		
		System.out.println("********* JAVA 8 *********");
		
		LocalDate d =LocalDate.now();
		LocalTime t = LocalTime.now();
		LocalDateTime dt =LocalDateTime.now();
		
		System.out.println("Date & Time is : "+d+" -->"+t);
		System.out.println("Before Formatting : "+dt);
		
		DateTimeFormatter format =  DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String dt1 = dt.format(format);
		System.out.println("After formatting : " +dt1 );
		
		Clock c1 = Clock.systemDefaultZone();
		System.out.println(c1.getZone());
	}
}
