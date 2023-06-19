public class ArrayExample {
	public static void main(String args[]) {
		int [] sum = {6,42,34,54};
		int value = 0,x;
		for(x=0;x<sum.length;x++){
			value+=sum[x];
			//System.out.println(value);
		}
	System.out.println(value);
	}
}