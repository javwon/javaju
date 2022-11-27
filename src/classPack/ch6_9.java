package classPack;

public class ch6_9 {

	public static void main(String[] args) {
		Car2 c1 = new Car2();
		Car2 c2 = new Car2(c1);
		System.out.println(c1.color+" "+c1.gear+" "+c1.door);
		System.out.println(c2.color+c2.gear+c2.door);
	}

}

class Car2
{
	String color;
	String gear;
	int door;
	
	Car2()
	{
		this("white","auto",4); //Car2(String,String,int) 호출한 것이다. (인스턴스 변수를 마치 클래스 변수처럼)
	}
	
	Car2(String color)
	{
		this(color,"auto",4);
	}
	Car2(String color, String gear, int door)
	{
		this.color =color; //매개변수랑 인스턴스 변수 이름 같을 때 구별해주는 용도
		this.gear = gear;
		this.door = door;
	}
	Car2(Car2 c) //복사를 위한 생성자
	{this(c.color,c.gear,c.door);
	 color = c.color;
	gear = c.gear;
	door = c.door;

	}
}