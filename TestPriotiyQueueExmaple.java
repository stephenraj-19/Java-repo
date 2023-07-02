import java.util.*;
class TestPriotiyQueueExmaple{
	public static void main(String args[]){
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Ravi");
		queue.add("Naveen Vijay");
		queue.add("Bad Ravi");
		queue.add("Ravi");
		System.out.println(queue);
		System.out.println(queue.element());
		System.out.println(queue.peek());
		System.out.println(queue);
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