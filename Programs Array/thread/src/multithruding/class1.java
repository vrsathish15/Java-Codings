package multithruding;

class class1 {
	
	int a=test();


	int test()
	{
		System.out.println("TB");//2
		System.out.println("this:"+this);//OBJ ADD
		System.out.println("var a:"+a);//
		System.out.println("TE");
		return 30;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("from main");//1
		class1 obj1=new class1();
		System.out.println("var a:"+obj1.a);
		System.out.println("=======");
		class1 obj2=new class1();
		System.out.println("from main");
	}
}


