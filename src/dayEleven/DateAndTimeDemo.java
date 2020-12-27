package dayEleven;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class DateAndTimeDemo {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		LocalTime time = LocalTime.now();
		System.out.println(time);
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		//
		date = date.plusDays(2);
		System.out.println(date);
		
		int d = date.getDayOfMonth();
		System.out.println(d);
		
		int m = date.getMonthValue();
		System.out.println(m);
		
		int y = date.getDayOfYear();
		System.out.println(y);
		
		System.out.println(date.isLeapYear());
		
		boolean before = LocalDate.parse("2020-01-02").isBefore(LocalDate.parse("2020-02-20"));
		System.out.println(before);
		
		LocalTime lt = LocalTime.of(4, 57);
		System.out.println(lt);
		
		LocalDate after5days = LocalDate.now().plus(Period.ofDays(5));
		System.out.println(after5days);
		
		int days = Period.between(LocalDate.now(), after5days).getDays();
		System.out.println(days);
		
	
		
		/*
		 * date and time of courier/parcel registration
		 * you are suppose to find out the delivery date and time 
		 * additionally values u may receive will be
		 * 1.distance of the destination place example =143km
		 * 2.working hours per day of the transport vehicle - 9hrs
		 * 
		 * constrains
		 * 1.sunday holiday
		 * 2. jan 1, 26 jan, 15 august, oct 2, and 2nd saturday holiday
		 * 3. vehicle average speed -45 kms per hour
		 * */
		//object oriented exercise 
		
		/*
		 * math.random can get u number 
		 * 50 question 4 option 
		 * pick question based on question number
		 * 10 question input given by user 20/10 sec
		 * finish and calculate the score
		 * have a collection question set
		 * map
		 * 30 to 40 questions
		 * */
	}
}
