public class TypeCastingExp {
	public static void main(String args[]) {
		/* System.out.println("TypeCasting widening");
		int a=5;
		double b=a;
		System.out.println(a);
		System.out.println(b);*/
	
		System.out.println("TypeCasting narrowing");
		double a=4.3d;
		int b=(int) a;
		System.out.println(a);
		System.out.println(b);
		}
}