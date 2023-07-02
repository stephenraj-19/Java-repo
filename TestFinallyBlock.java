class TestFinallyBlock {
	public static void main(String args[]) {
		try{
			int data=25/0;
			System.out.println(data);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			System.out.println("Finally block is always executed");
		}
		System.out.println("Rest of the code..");
	}
}