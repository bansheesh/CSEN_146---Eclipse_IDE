package lab1_2_5;
import java.util.Scanner;

public class Exercise5 {
	public boolean isItALeapYear(int year){
		//if the year is divisible by 4, but not 100 OR if the year is divisible by 400
		//print & return true or false
		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			System.out.print(year);
			System.out.println(" is a leap year.");
		
			return true;
		}else {
			System.out.print(year);
			System.out.println(" is not a leap year.");
			return false;
		}
	}
	
	public static void tester(){
		//declare scanner and object
		Scanner in = new Scanner(System.in);
		Exercise5 test = new Exercise5();
		//Let the user input a year
		System.out.print("Enter a year: ");
		int year = in.nextInt();
		test.isItALeapYear(year);
		in.close();

	}
	
	public static void main (String [] args){
		//testing with given dates
		Exercise5 test = new Exercise5();
		test.isItALeapYear(1716);
		test.isItALeapYear(1989);
		test.isItALeapYear(1992);
		test.isItALeapYear(2000);
		test.isItALeapYear(2010);
		test.isItALeapYear(2012);
		tester();
	}
}
