import java.util.Scanner;
public class SwitchExample {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rating for movie Iron man Age of ultron(range 1 to 5)");
		int rating=sc.nextInt();
		
		switch(rating) {
		case 1:
		System.out.println("Opps sorry for the movie");
		break;
		case 2:
		System.out.println("We try to improve");
		break;
		case 3:
		System.out.println("We hope you enjoyed well!");
		break;
		case 4:
		System.out.println("Your rating Fells good");
		break;
		case 5:
		System.out.println("Thank you for the Love and Support we try to do movies like these in future");
		break;

		default:
		System.out.println("Enter a Rating between 1 to 5");
		break;
		}
	}
}