class MultiConstructor {
	int id;
	String name;
	int age;
	
	MultiConstructor(int i,String n){
		id=i;
		name=n;
	}
	MultiConstructor(int i,String n,int a){
		id=i;
		name=n; 
		age=a;
	}
	void display(){System.out.println(id+" "+name+" "+age);}
	
	public static void main(String args[]) {
		MultiConstructor s1 = new MultiConstructor(111,"Stephen");
		MultiConstructor s2 =new MultiConstructor(112,"Hari",23);
		s1.display();
		s2.display();
	}
}	