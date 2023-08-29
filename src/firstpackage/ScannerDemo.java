package firstpackage;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		System.out.println("Enter Numbers for Multiplication:");
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int product=a*b;
		System.out.println(product);
	}

}
