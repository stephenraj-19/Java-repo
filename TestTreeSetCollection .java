import java.util.*;
public class TestTreeSetCollection {
	public static void main(String args[]){
		TreeSet<String> set = new TreeSet<String>();
	set.add("Ravi");
	set.add("Vijay");
	set.add("Ajay");
	Iterator<String> itr=set.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}	
	}
}