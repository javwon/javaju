package classPack;

class Tv{ 
	//설계도 
	//속성(멤버변수)
	String color;
	boolean power;
	int channel;
	//기능(메써드)
	void power() {power = !power;}
	void channelUp() {channel++;}
	void channelDown() {channel--;}
}

public class Ch6_1 {

	public static void main(String[] args) {
		Tv t; //클래스 참조를 위한 참조변수 선언
		t = new Tv(); // TV클래스 객체를 생성 객체의 주소를 참조변수에 저장 t는 TV의 인스턴스를 가리킴
		t.channel =7;
		t.channelDown();
		System.out.println(t.channel);
		
		//객체의 배열
		Tv[] tArr = new Tv[3]; // Tv인스턴스를 가리킬 수 있는 참조변수만 선언한 것 Tv t;와 같음 
		tArr[0] = new Tv(); //인스턴스 생성 
		//
		for(int i=0; i<tArr.length;i++)
		{
			tArr[i] = new Tv();
			tArr[i].channel = i+10;
		}
		for(int i=0; i<tArr.length;i++)
			{tArr[i].channelUp();
			System.out.println();
			}
	}
	
	public void print() // 여기서 쓰는건 상관없어보이는데.. public vs static..
	{
		System.out.println("hello");
		System.out.println("hi");
	}

}
