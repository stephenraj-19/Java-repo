class TestOverloading4 {
public static void main(String args[]){
System.out.println("Main with String []");
main("Stephen");
main();
}
public static void main(String args){
System.out.println("Main with String");
}
public static void main(){
System.out.println("Main without args");
}
}
