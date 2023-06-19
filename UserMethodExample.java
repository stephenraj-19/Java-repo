public class UserMethodExample {
	public  void myMethod() {
		System.out.println("I just got excecuted");
	}
		public static void main(String args[]){
			
			UserMethodExample obj= new UserMethodExample();
			obj.myMethod(); 
		}
}