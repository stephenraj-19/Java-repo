class Employee	{
	float salary=40000;
}
class Programmer extends Employee {
	int bonus=10000;
		public static void main(String args[]) {							Programmer p=new Programmer();
			System.out.println("Programmer salary is :"+p.salary);
			System.out.println("Bonus for Programmer is :"+p.bonus);
			System.out.println("salary with Bonus is: "+(p.salary+p.bonus));
		}
}
