package javaBegining;

import java.util.Scanner;

public class Mango {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a float number");
		float N= s.nextFloat();
		
		System.out.println("Enter a number");
		int a= s.nextInt();
		
		System.out.println("Enter a name");
		String b= s.next();
		
		System.out.println("Your float no is \n"+N);
		System.out.println("Your no is \n"+a);
		System.out.println("Your name is \n"+b);
		
	}

}
