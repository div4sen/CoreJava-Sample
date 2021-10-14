import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SumCalculator {

	public static void main (String args[]) {
		
		
		System.out.println("Enter 2 Numbers");
		
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b =s.nextInt();
		int c = a+b;
		
		System.out.println("The Sum of numbers are :"+c);
		
		JFrame jf = new JFrame();
		jf.setSize(500, 600);
		jf.setLayout(null);
		
		JButton okBtn = new JButton("OK");
		okBtn.setBounds(10,20,10,20);
		
		jf.add(okBtn);
		jf.setVisible(true);
	}
}
