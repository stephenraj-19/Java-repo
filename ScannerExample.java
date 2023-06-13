import java.util.Scanner;
class ScannerExample{
	public static void main(String args[]){
		System.out.println("Enter your name");
		Scanner sc=new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("Enter your rollno");
		int rollno = sc.nextInt();
		System.out.println("Enter your mobile no");
		long pno=sc.nextLong();
		System.out.println("Enter your Float value");
		Float value1 = sc.nextFloat();
		System.out.println("Enter your Double value");
		double value2 = sc.nextDouble();
		System.out.println("Enter your Short");
		short value3 = sc.nextShort();
		System.out.println("Enter your Boolean");
		boolean value4 = sc.nextBoolean();
		System.out.println("Enter the Byte value");
		byte value5 =sc.nextByte();
		System.out.println("Enter the character");
		char character=sc.next().charAt(0);
		System.out.println("Your name is " + name);
		System.out.println("Rollno- " + rollno);
		System.out.println("Phone number- " + pno);
		System.out.println("float- " + value1);
		System.out.println("double-" + value2);
		System.out.println("short- " + value3);
		System.out.println("Boolean- " + value4);
		System.out.println("Byte" + value5);
		System.out.println("Character- " + character);
  }
}