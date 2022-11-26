package classPack;


class Math2{
	long a,b;
	
	long add() {return a+b;}
	long subtract() {return a-b;}
	
	static long add(long a,long b) {return a+b;}
	static long subtract(long a, long b) {return a-b;}
	
	void change(Math2 d) {long temp; temp = d.a; d.a = d.b; d.b = temp;}
	void chage2()
	{
		a=22;
		b =33;
	}
	
}


public class ch6_6 {

	public static void main(String[] args) {
		Math2 mm;
		mm = new Math2();
		mm.a=10;
		mm.b=11;
		
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		mm.change(mm);
		mm.chage2();
		System.out.println(mm.a+" "+mm.b);
		
		System.out.println(Math2.add(5, 10));
		
		MemberCall.staticMethod2();

	}
	static void print1()
	{
		System.out.println("hi");
	}
	public void print2()
	
	{
		System.out.println("hi");
	}
	

}

class MemberCall{
	
	int iv =10;
	static int cv =20;
	
	int iv2 =cv;
	//static int cv2 =iv; (사용할 수없음)
	static int cv2 = new MemberCall().iv; //사용가능
	
	static void staticMehod1()
	{
		System.out.println(cv);
		//System.out.println(iv); -에러 스테틱 메서드에서 인스턴스 변수 사용
		
		MemberCall m = new MemberCall();
		System.out.println(m.iv); //이래야 사용가능
	}
	void instanceMehod()
	{
		System.out.println(cv);
		System.out.println(iv); //바로 사용가능
	}
	
	static void staticMethod2() {
		staticMehod1();
		//instanceMegod(); 사용불가능
		ch6_6.print1();
		//ch6_6.print2();
		ch6_6 m2= new ch6_6();
		m2.print2();
	}
	

	
}
