class program{
	int id;
	String name;
	int age;
	program(int i,String n){
		id=i;
		name=n;
	}
	program(int i,String n,int a){
		id=i;
		name=n;
		age=a;
	}
	void display(){
		System.out.println(id+" "+name+" ",age);
	}
	public static void main(String args[]){
		
		program a1 = new program(10,"alkaif");
		program a3 = new program(10,"alkaif",33);
		a1.display();	
		a3.display();	
	}
}