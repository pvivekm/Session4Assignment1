package acad;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Acad2 {

	public static void main(String[] args) {

		double num1, num2;
		try {
			System.out.println("Enter number 1:");
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			String s1 = br.readLine();
			DecimalFormat df = new DecimalFormat();
			Number n = df.parse(s1);
			num1 = n.doubleValue();
			System.out.println("Enter number 2:");
			String s2 = br.readLine();
			n = df.parse(s2);
			num2 = n.doubleValue();

		} catch (Exception e) {
			num1 = 0;
			num2 = 0;
		} 
		System.out.println("Sum of the numbers is " + (num1 + num2));
	}

}
