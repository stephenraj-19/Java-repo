public class TwoDimensionArray {
	public static void main(String args[]) {
		int[] [] a = {{1,2,3,4},{2,3,4,5,6}};
		int i,j;
		for(i = 0;i < a.length;++i){
			for(j = 0; j<a[i].length ;++j){
				System.out.print(a[i][j]);
			}
		}
	}
}
		