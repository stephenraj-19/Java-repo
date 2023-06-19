public class UserMethodExample3 {
	public  int myMethod(int a,int b) {
		int s=a+b;
		System.out.println(s);
		return s;
	}
		public static void main(String args[]){
			
			UserMethodExample3 obj= new UserMethodExample3();
			obj.myMethod(2,3); 
		}
}