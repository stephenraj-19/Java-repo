import java.lang.String;
public class StringEx {
	public static void main(String args[]) {
		
		String value = "Batch-15 is Hyperactive";
		
		String value2 = "Batch15 is toxic";
		
		String value3 = "Batch-15 is toxic";
	
		String value4 ="Kgm@fs@batch15@thursday";

		//contains() method check whether the given value available in given varaiable is along with case sensitive 
		System.out.println("contains() :"+value.contains("Hyperactive")); 
		
		//concat() is used to add two different string and present it as single string
		System.out.println("concat()"+value2.concat(" By birth"));
			
		//equal() check whether the variable and given string is equal are not it is case sensitive and space concerned
		System.out.println("equals() :"+value3.equals("Batch-15 is toxic"));
		
		//equalsIgnoreCase() method ignore the case sensitive and check the value with the specified variable,also space concerned
		System.out.println("equalsIgnoreCase() :"+value3.equalsIgnoreCase("BATCH-15 IS TOXIC"));

		//toUppercase() change all the Alphabets to capital letters
		System.out.println("toUpperCase() :"+value3.toUpperCase());
		
		//toLowercase() change all the Alphabets to small letters
		System.out.println("toLowerCase() :"+value3.toLowerCase());

		//length() returns the length of the variable along with space
		System.out.println("length() :"+value3.length());
		
		//charAt() returns the index of the variable
		System.out.println("charAt() :"+value3.charAt(4));

		//compareTo() return the lexicographic positive value if it contains any term that has been available in the variable
		System.out.println("compareTo() :"+value3.compareTo(value));
		
		//compareToIgnoreCase() returns the lexicographic zero value if the variable are same
		System.out.println("compareToIgnoreCase() :"+value3.compareToIgnoreCase(value));

		//indexOf() returns the index value of specified char
		System.out.println("indexOf() :" +value.indexOf('s'));	

		//isEmpty() is used to check the given variable is empty or not
		System.out.println("isEmpty() :"+value.isEmpty());

		//replace() used to replace the specified word with the specified value
		System.out.println("replace() :"+value3.replace("toxic","Vedappu"));
		
		//substring() is used to get the string that has mentioned from start index to end 
		System.out.println("substring(): "+value.substring(3,11));
		
		//trim() is used to remove the space from start and end.
		System.out.println("trim(): "+value.trim());
		
		//lastIndexOf() return the index of the last occurence of the given character
		System.out.println("lastIndexOf(): "+value.lastIndexOf('i'));
		
		//hashCode() return the key from the hash table which hold variable as value
		System.out.println("hashCode(): "+value.hashCode()); 
	
		//format() changes the given data in the specified format
		System.out.println("format(): "+String.format("%x",5)); 

		//join() is used set the delimiter and join the parameterized value 
		System.out.println("join(): "+String.join("-","Stephen","Hari","Vinoth","Santhosh","Sabari","Sathish","Tharun"));

		//replaceAll() is  
		System.out.println("replaceAll(): "+value.replaceAll("i","y")); 

		//split()
		String[] arr1 = value4.split("@",2);
		for(String a1: arr1){
		System.out.println("pattern1"+a1);
		 }

}
}