package ScannerDemo;

import java.util.Scanner;

public class nextInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.println("enter an integer");
		
		int value = in.nextInt();
		System.out.println("enter integer is" + value);
		
		in.close();

	}

}
