import java.util.Scanner;
public class Factorial {
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int number =sc.nextInt();
	int i,sum=1;
	for (i=1;i<=number;i++){
		sum = sum*i;
	}
	System.out.println(sum);
	}
}