/**
	* Lesson: Input
	* Author: Mansoor Muhammad
	* Date Created: February 17, 2026
	* Date Last Modified: February 18, 2026
	*/
import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
	}

	public static void q1() {
		Scanner input = new Scanner(System.in);
		String nam;
		System.out.print("What is your name: ");
		nam = input.nextLine();
		System.out.println(nam);

	}

	public static void q2() {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.print("Input a whole number: ");
		num = input.nextInt();
		System.out.println( num  * 2 + 2);
	}

	public static void q3() {
		Scanner input = new Scanner(System.in);
		double nums;
		System.out.print( "Input a radius: ");
		nums = input.nextDouble();
		System.out.println(nums * 3.14 * (2));
		System.out.println(nums * 3.14 * nums);

	}

	public static void q4() {
		Scanner input = new Scanner(System.in);
		String fn;
		System.out.print("Input a first name: ");
		fn = input.nextLine();

		String ln;
		System.out.print("Input a last name: ");
		ln = input.nextLine();

		int ag;
		System.out.print( "Input an age: ");
		ag = input.nextInt();

		System.out.println(ln + ", " + fn + " - " + ag);


	}

	public static void q5() {
		Scanner input = new Scanner(System.in);
		String name; 
		System.out.print("Input a name: ");
		name = input.nextLine();


		int age;
		System.out.print("Input an age: ");
		age = input.nextInt();
		
		
		int iq;
		iq = age;
		age = age+3;

		System.out.println(name+age);
		System.out.println(iq);
	

		
	}

}
