public class ScopeExample{
	public static void myMethod(){
		int x=5;
			if(x<6){
			  int y=10;
			  System.out.println(y);
			}
		System.out.println(x); //Block Scope
		//System.out.println(y);
	}
	public static void myMethod1(){
		System.out.println(x); //Method Scope
	}
	public static void main(String args[]){
		myMethod();
		myMethod1();
	}
}