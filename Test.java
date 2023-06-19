import java.io.*;
public class Test {
 public static void main(String args[])throws IOException{
 	DataInputStream d = new DataInputStream(new FileInputStream("C:\\Users\\user\\OneDrive\\Desktop\\text.txt"));
 	DataOutputStream out = new DataOutputStream(new FileOutputStream("C:\\Users\\user\\OneDrive\\Desktop\\copy1.txt"));
 	String count;
 	while((count = d.readLine()) != null){
 	String u = count.toUpperCase();
 	System.out.println(u);
 	out.writeBytes(u + " ,");
	 }
	 d.close();
	 out.close();
 }
}