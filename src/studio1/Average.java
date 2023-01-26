package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What is the first integer?");
		double n1 = in.nextInt();
		System.out.println("What is the second integr?");
		double n2 = in.nextInt();
		double Average = ((n1 + n2)/2);
		System.out.println("Average of " + n1 + " & " + n2 + " is " + Average );
	}

}
