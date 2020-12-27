package assignments;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class CourierDelivery {
	public static void main(String[] args) throws Exception {
		//new January(jan);
		System.out.println(new Sunday().isHoliday(26));
		Scanner scan = new Scanner(System.in);
		LocalDateTime dateTime =LocalDateTime.now();
//		String input = getString(dateTime.getDayOfWeek());
//		System.out.println(input);
//		Class c = Class.forName(input);
//		Holiday holiday = (Holiday) c.newInstance();
//		System.out.println(holiday.isHoliday(12)); 
//		String result=input.substring(0,index)+input.substring(index,input.length()).toUpperCase();
		System.out.println("Enter a Distance...");
		int desDistance = scan.nextInt();
		
		System.out.println("Enter working hours per day...");
		int workingHours = scan.nextInt();
		
		int travelPerDay = workingHours * 45;
		int travelled = 0;
		int totalDays = 0;
		while(desDistance > travelled) {
			String input = getString(dateTime.getDayOfWeek());
			//System.out.println(input);
			Class c = Class.forName(input);
			Holiday holiday = (Holiday) c.newInstance();
			if(holiday.isHoliday(12)) {
				dateTime.plusDays(1);
				travelled = travelled + travelPerDay;
				totalDays = totalDays + 1;
			}
		}
		System.out.println(dateTime);
	}
	
	public static String getString(DayOfWeek day) {
		switch(day) {
		case MONDAY : return "Monday";
		case TUESDAY : return "Tuesday";
		case WEDNESDAY : return "assignments.Sunday";
		case THURSDAY : return "Thursday";
		case FRIDAY : return "Friday";
		case SATURDAY : return "assignments.Saturday";
		case SUNDAY : return "Sunday";
		}
		return null;
	}
}

abstract class Holiday {
	public abstract boolean isHoliday(int date);
}
class January extends Holiday {

	int leave[] = {1,26};
	public January() {}
	public January(int leave[]) {
		this.leave	 = leave;
	}
	@Override
	public boolean isHoliday(int date) {
		for(int i = 0; i < leave.length; i++) {
			if(date==leave[i]) {
				return true;
			}
		}
		return false;
	}
}

class August extends Holiday {
	int leave[] = {15};
	public August() {}
	public August(int leave[]) {
		this.leave = leave;
	}
	@Override
	public boolean isHoliday(int date) {
		for(int i = 0; i < leave.length; i++) {
			if(date==leave[i]) {
				return true;
			}
		}
		return false;
	}
}

class October extends Holiday {
	int leave[] = {2};
	public October() {}
	public October(int leave[]) {
		this.leave = leave;
	}
	@Override
	public boolean isHoliday(int date) {
		for(int i = 0; i < leave.length; i++) {
			if(date==leave[i]) {
				return true;
			}
		}
		return false;
	}	
}
class Sunday extends Holiday {
	public Sunday() {}
	@Override
	public boolean isHoliday(int date) {
		// TODO Auto-generated method stub
		return true;
	}
}
class SecondSaturday extends Holiday {
	int leave[] = {8,9,10,11,12,13,14};
	@Override
	public boolean isHoliday(int date) {
		for(int i = 0; i < leave.length; i++) {
			if(date==leave[i]) {
				return true;
			}
		}
		return false;
	}
}