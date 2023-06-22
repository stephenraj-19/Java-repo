class Adder {
static int add(int a,int b){
	return a+b;
}
static double add(double a,double b){
	return a+b;
}
}
public class TestOverloading2{
public static void main(String args[]){
	System.out.println(Adder.add(2,3));
	System.out.println(Adder.add(2.1,2.1));
	}
}