public class ThreeDimensionArray {
	public static void main(String args[]) {
		int[][][] a = {{{1, 2, 3},{4, 5, 6},{7, 8, 9}},{{10, 11, 12},{13, 14, 15},{16, 17, 18}},{{19, 20, 21},{22, 23, 24},{25,26,27}}};
		int i,j,k;
		System.out.println("------------");
		for(i=0;i<a.length;++i){
			for(j=0;j<a[i].length;++j){
				for(k=0;k<a[i][j].length;++k){
					System.out.print(a[i][j][k]+" |");
				}System.out.println("");
			}System.out.println("------------");
		}
	}
}