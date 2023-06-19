public class UserMethodExample2 {
	public  String myMethod() {
		String s = "I just got excecuted";
		System.out.println(s);
		return s;
	}
		public static void main(String args[]){
			
			UserMethodExample2 obj= new UserMethodExample2();
			obj.myMethod(); 
		}
}