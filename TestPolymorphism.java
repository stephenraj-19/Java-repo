class Bank {
float getRateOfInterest(){
	return 0;
	}
}
class SBI extends Bank {
float getRateOfInterest(){
	return 8.4f;
	}
}
class ICCI extends Bank {
float getRateOfInterest(){
	return 7.3f;
	}
}
class AXIS extends Bank {
float getRateOfInterest(){
	return 9.7f;
	}
}
class TestPolymorphism  {
public static void main(String args[]) {
	Bank b;
	b=new SBI();
	System.out.println("SBI rate of Interest:"+b.getRateOfInterest());
	b=new ICCI();
	System.out.println("ICCI rate of Interest:"+b.getRateOfInterest());
	b=new AXIS();
	System.out.println("AXIS rate of Interest:"+b.getRateOfInterest());
	}
}