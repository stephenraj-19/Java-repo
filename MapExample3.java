import java.util.*;
public class MapExample3 {
	public static void main(String args[]) {
		Map<String,String>map=new HashMap<String,String>();
		map.put("Sp101","Stephen");
		map.put("Sp102","Sathish");
		map.put("Sp103","Santhosh");
		map.put("Sp104","Sabari");
		map.put("","");
		//remove value in map
		map.remove("Sp105");
		//revereOrder() with map

		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
	}
}