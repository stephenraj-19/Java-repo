import java.util.Scanner;
public class AssignmentOperator {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A value");
		int a = sc.nextInt();
		System.out.println(a+=10);
		System.out.println(a-=10);
		System.out.println(a*=10);
		System.out.println(a/=10);
		System.out.println(a%=10);
	}
}