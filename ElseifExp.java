import java.util.Scanner;
public class ElseifExp {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a mark between 0-100");
		int mark = sc.nextInt();
		if (mark<35){
			System.out.println("Your Grade is F");
		}else if (mark <=75 && mark>=35) {
	        	System.out.println("Your Grade is B");
		}else if (mark <=90 && mark>75) {
		 	System.out.println("Your Grade is A");
		}else if  (mark <=100 && mark>90){
		  	System.out.println("Your Grade is A+");
		}else {
			System.out.println("Enter a valid mark");
	}
   }
}