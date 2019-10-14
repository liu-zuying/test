//子类可以赋给父类
//小孩
package test;


 class A
{
	
	 void f()//小孩
	 {
		System.out.println("A");
	 }

}
 class B extends A
{
	
	 void f()
	 {
		super.f();
		 System.out.println("B");
	
	 }
	 void b()
	 {
		 System.out.println("bbb");
	 }

}
 class C extends B
{
	
	 void f()
	 {
		 super.f();
		 System.out.println("C");
		
	 }

}

public class practice {

	public static void D(A aa)//父类包含子类，父类可以使用子类中继承、重写的方法
	{					    //虽是父类形参但是也可以用子类对象，相当于把子类赋给了父类
		
		aa.f();
		System.out.printf("\n");
	}
	
	public static void main(String[] args) {
	

		
		A aa=new A();      
		B bb=new B();
		C cc=new C();
/*		
		A aa1= new B(); //父类对子类的引用可以使用子类中继承、重写的方法,不能使用子类独有的方法
		aa1.b();
*/		
		
		D(aa); D(bb); D(cc);
	}

}
