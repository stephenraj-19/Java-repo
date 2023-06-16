import java.util.Scanner;
public class HcfOfTwonumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A value ");
		int a = sc.nextInt();
		System.out.println("Enter B value");
		int b = sc.nextInt();
		int hcf=0,i;
		for(i = 1; i <= a || i <= b; i++) { 
			if( a%i == 0 && b%i == 0 ) {
				hcf = i;
			}
		}System.out.println("HCF of two numbers " + hcf);
	}
}

		
		 