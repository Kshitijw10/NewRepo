package demo;
import java.util.Scanner;

public class calc {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a list");
		int a = sc.nextInt();
		
		System.out.println("Enter 2nd number");
		int b = sc.nextInt();
		
		System.out.println("Addition :" + math.add(a,b));
		sc.close();
	}

}