package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Value for x?");
		int x = in.nextInt();
		System.out.println("Value for y?");
		int y = in.nextInt();
		System.out.println("Value for z?");
		int z = in.nextInt();
		
		boolean isOrder = true;
		
		if (x < y && y< z)
		{
			System.out.print(isOrder);
		}
		else if (z<y && y< x )
		{
			System.out.print(isOrder);
		}
		else
		{
			isOrder = false;
			System.out.print(isOrder);
		}
			

	}

}
