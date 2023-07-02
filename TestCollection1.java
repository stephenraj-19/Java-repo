import java.util.*;
public class TestCollection1 {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ajay");
		list.add("Ravi");
		Iterator itr=list.iterator();
		while(itr.hasNext()){
		System.out.println(itr.next());
		}
	}
}