import java.util.*;
class LinkedListExmaple{
	public static void main(String args[]){
		LinkedList<String> list = new LinkedList<String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Vijay");
		System.out.println(list);
		System.out.println(list.get(1));
		System.out.println(list.contains("Vijay"));
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		Collections.sort(list);
		System.out.println(list);
		System.out.println(list.set(1,"Mouni"));
		System.out.println(list);
		/*Iterator<String> itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}*/
	}
}