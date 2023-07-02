interface InterfaceMethod1 {
public void InterfaceExp();
}
class Override implements InterfaceMethod1{
public void InterfaceExp(){
	String a="A method is overridded";
	System.out.println(a);
}
public static void main(String args[]){
	InterfaceMethod1 obj;
	obj= new Override();
	obj.InterfaceExp();
	}

}