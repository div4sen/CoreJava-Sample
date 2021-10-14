package forLoop;

import java.util.Scanner;

public class ForLoopSample {

	public static void main(String[] args) {
		
		System.out.println("Enter count of even numbers");
		
		Scanner s = new Scanner(System.in);
		int length = s.nextInt();
		
		System.out.println("First "+ length +" Even Numbers:");
		
		int k=0;
		for (int i=0; i<length ;i ++) {
			
			System.out.print(k+",");
			k=k+2;
		}

	}

}
