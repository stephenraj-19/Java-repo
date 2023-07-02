//Hashset
import java.util.*;
public class TestHashSetCollection{
	public static void main(String args[]) {
		HashSet<String> obj =new HashSet<String>();
		obj.add("Ravi");
		obj.add("Vijay");
		obj.add("Ajay");
		obj.add("Raj");
		System.out.println(obj);
		System.out.println(obj.contains("Ravi"));
		System.out.println(obj.isEmpty());
		obj.removeAll(obj);
		System.out.println(obj.isEmpty());
		/*Iterator<String> itr = obj.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}*/
	}
}