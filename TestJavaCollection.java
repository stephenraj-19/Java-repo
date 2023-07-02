//collection 
import java.util.*;
class TestJavaCollection{
	public static void main(String args[]){
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Vijay");
		System.out.println(list);
		System.out.println(list.size);
		System.out.println(list.get(1));
		System.out.println(list.get());
		System.out.println(list.contains("Vijay"));
		System.out.println(list.IsEmpty());		
		list.removeAll(list);
		System.out.println(list);
		
		/*Iterator<String> itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
			String name = itr.next();
			if(name.equals("Vijay")){
				System.out.println(name + "is good boy");
			}*/
			
	}	
}