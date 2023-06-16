import java.util.Scanner;
public class Swap2No {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A value");
		int a = sc.nextInt();
		System.out.println("Enter B value");
		int b = sc.nextInt();
		System.out.println("Value before Swapping");
		System.out.println("A = "+a);
		System.out.println("B ="+b);
		System.out.println("value After Swapping");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("A = "+a);
		System.out.println("B ="+b);	
	}
}