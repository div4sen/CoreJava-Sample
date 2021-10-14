package ifCondition;

import java.util.Scanner;

public class IfCondition {

	public static void main(String[] args) {

		System.out.println("Enter the alphabet");
		Scanner s = new Scanner(System.in);
		String value = s.next();
		
		displayName(value);

	}

	/**
	 * @param value
	 */
	private static void displayName(String value) {
		if(value.equalsIgnoreCase("G")) {
			System.out.println("Your Name is GAYATHRI SENAN");
		}else if(value.equalsIgnoreCase("B")) {
			System.out.println("Your Name is BOBSEN");
		}else if(value.equalsIgnoreCase("DS")) {
			System.out.println("Your Name is DEVASENAN");
		}else if(value.equalsIgnoreCase("D")) {
			System.out.println("Your Name is DIVYA");
		}else  {
			System.out.println("You are not in our family");
		}
	}

}
