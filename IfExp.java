import java.util.Scanner;
public class IfExp {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A value");
		int a = sc.nextInt();
		System.out.println("Enter B value");
		int b = sc.nextInt();
		//int a=10,b=20;
		if (a!=b) {
			System.out.println("Executing if statement");
		}
		System.out.println("if condition not satisfied");
	}
}
