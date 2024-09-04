package studio1;
import java.util.Scanner;


public class Average {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the first of the two numbers you want to average?");
		int n1 = sc.nextInt();
		System.out.println("What is the second of the two numbers you want to average?");
		int n2 = sc.nextInt();
		System.out.print("Average of "+n1+" and "+n2+ " is " +(double) (n1+n2)/2 );
		

	}

}
