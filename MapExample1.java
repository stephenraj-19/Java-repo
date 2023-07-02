import java.util.*;
public class MapExample1 {
	public static void main(String args[]) {
		Map<String,String>map=new HashMap<String,String>();
		map.put("Sp101","Stephen");
		map.put("Sp102","Sathish");
		map.put("Sp103","Santhosh");
		map.put("Sp104","Sabari");
	//null value accepted in map
		map.put("Sp105"," ");
	//not supported null Key in map
		//map.put("","Hari");
		//System.out.println(map);
	//entrySet() is used to convert map to Array
		System.out.println(map.entrySet());
		/*for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}*/
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
	}
}