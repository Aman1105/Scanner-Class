package ScannerDemo;
import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.println("enter your name");
		
		String value = in.nextLine();
		System.out.println("your name is.." + value);
		
		in.close();
		
		

	}

}
