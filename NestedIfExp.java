import java.util.Scanner;
public class NestedIfExp {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the country");
		String country = sc.nextLine();
		if(country.equals("India")){
			System.out.println("Enter Your Age");
			int age = sc.nextInt();
			if (age>=18) {
				System.out.println("Your are eligible for vote");
			}else {
				System.out.println("Your are not eligible for vote");
			}
        }
		else {
			System.out.println("Your Country is not India");
	}
}
}

			