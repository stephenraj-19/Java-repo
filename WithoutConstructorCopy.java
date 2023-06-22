public class WithoutConstructorCopy {
int id;
String name;
WithoutConstructorCopy  (int i,String n) {
id = i;
name = n;
}
void display() {
System.out.println(id+" "+name);
}
public static void main(String args[]) {
WithoutConstructorCopy  s1 = new WithoutConstructorCopy (101,"hari");
WithoutConstructorCopy  s2 = new WithoutConstructorCopy ();
s2.id=s1.id;
s2.name=s1.name;
s1.display();
s2.display();
}
}