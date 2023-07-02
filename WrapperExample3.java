public class WrapperExample3 {
	public static void main(String args[]) {
		byte b=10;
		short s=20;
		int i=30;
		long l=40;
		float f=50.0F;
		double d=60.0D;
		char c='a';
		boolean b2=true;
		
		Byte byteobj=b;
		Short shortobj=s;
		Integer intobj=i;
		Long longobj=l;
		Float floatobj=f;
		Double doubleobj=d;
		Character charobj=c;
		Boolean boolobj=b2;
		
		System.out.println("---Printing object values---");
		System.out.println("byteobj : "+byteobj);
		System.out.println("shortobj : "+shortobj);
		System.out.println("intobj : "+intobj);
		System.out.println("floatobj : "+floatobj);
		System.out.println("doubleobj : "+doubleobj);
		System.out.println("charobj : "+charobj);
		System.out.println("boolobj : "+ boolobj);
		
		byte bytevalue=byteobj;
		short shortvalue=shortobj;
		int intvalue=intobj;
		long longvalue=longobj;
		float floatvalue=floatobj;
		double doublevalue=doubleobj;
		char charvalue=charobj;
		boolean boolvalue=boolobj;



		System.out.println("---Printing primitive value---");
		System.out.println("bytevalue : "+bytevalue);
		System.out.println("shortvalue : "+shortvalue);
		System.out.println("longvalue : "+longvalue);
		System.out.println("floatvalue : "+floatvalue);
		System.out.println("doublevalue : "+doublevalue);
		System.out.println("charvalue : "+charvalue);
		System.out.println("boolvalue : "+boolvalue);
	}
}