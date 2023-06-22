class StudentDetailExp{
	int rollno;
	String name;
	static String college="Dr.N.G.P";
	
	StudentDetailExp(int r,String n){
		rollno=r;
		name=n;
	}
	static void change(){
		college="Dr.G.R.D";
	}
	void display(){
		System.out.println(rollno+" "+name+" "+college);
	}
}
class StaticExample{
	public static void main(String args[]){
		StudentDetailExp.change();
		StudentDetailExp obj = new StudentDetailExp(101,"Kavin");
		obj.display();
	}
}