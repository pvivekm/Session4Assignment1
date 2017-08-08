package acad;

public class Acad3 {

	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("Usage: java Acad3 <num1> <num2>");
			return;
		}
		
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		System.out.println("First number is : " + num1);
		System.out.println("Second number is : " + num2);
		System.out.println("sum is: " + sum(num1, num2));
	}

	private static int sum(int num1, int num2) {
		return num1 + num2;
	}

}
