import java.util.*;
public class MapExample2 {
	public static void main(String args[]) {
		Map<String,String>map=new HashMap<String,String>();
		map.put("Sp101","Stephen");
		map.put("Sp102","Sathish");
		map.put("Sp103","Santhosh");
		map.put("Sp104","Sabari");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
	}
}