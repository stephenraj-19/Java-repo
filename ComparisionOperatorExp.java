import java.util.Scanner;
public class ComparisionOperatorExp {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Enter A value");
		a=sc.nextInt();
		System.out.println("Enter B value");
		b=sc.nextInt();
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<=b);
	}
}