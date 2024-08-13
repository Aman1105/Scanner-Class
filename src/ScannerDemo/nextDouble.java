package ScannerDemo;

import java.util.Scanner;

public class nextDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner (System.in);
		System.out.println("enter a double value");
		
		double value = in.nextDouble();
		System.out.println("enter a double value " + value);
		
		in.close();

	}

}
