//Array Deque
import java.util.*;
public class TestDequeueCollection{
	public static void main(String args[]){
		Deque<String> deque=new ArrayDeque<String>();
		deque.add("Gautham");
		deque.add("Karan");
		deque.add("Santhosh");
		System.out.println(deque);
		/*for(String str:deque){
			System.out.println(str);
			}*/
	}
}