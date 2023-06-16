public class JumpStatementExp {
	public static void main(String args[]) {
		int i;
		System.out.println("JumpStatement using Continue ");
		for (i=1;i<=10;i++) {
			if (i==5) {
				continue;
			}
		System.out.println(i);
		}
		System.out.println("JumpStatement using Break");
		for (i=1;i<=10;i++) {
			if (i==5) {
				break;
			}
		System.out.println(i);
		}
	}
}