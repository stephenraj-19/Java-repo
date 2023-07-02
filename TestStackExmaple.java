import java.util.*;
class TestStackExmaple{
	public static void main(String args[]){
		Stack<String> list = new Stack<String>();
		list.push("Ravi");
		list.push("Vijay");
		list.push("Ravi");
		list.push("Vijay");
		System.out.println(list);
		list.pop();
		System.out.println(list);
		/*System.out.println(list.isEmpty());
		System.out.println(list.size());
		Collections.sort(list);
		System.out.println(list);
		System.out.println(list.set(1,"Mouni"));
		System.out.println(list);
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}*/
	}
}