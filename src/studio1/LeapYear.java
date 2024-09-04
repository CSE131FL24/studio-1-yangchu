package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year");
		int year = sc.nextInt();
		boolean trueFalse = (((year % 4 == 0) && (year % 100!= 0)) || (year%400== 0 ));
		System.out.print(year + " is a leap year: " + trueFalse);

	}

}
