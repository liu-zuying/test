//������Ը�������
//С��
package test;


 class A
{
	
	 void f()//С��
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

	public static void D(A aa)//����������࣬�������ʹ�������м̳С���д�ķ���
	{					    //���Ǹ����βε���Ҳ��������������൱�ڰ����ำ���˸���
		
		aa.f();
		System.out.printf("\n");
	}
	
	public static void main(String[] args) {
	

		
		A aa=new A();      
		B bb=new B();
		C cc=new C();
/*		
		A aa1= new B(); //�������������ÿ���ʹ�������м̳С���д�ķ���,����ʹ��������еķ���
		aa1.b();
*/		
		
		D(aa); D(bb); D(cc);
	}

}
