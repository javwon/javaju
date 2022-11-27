package classPack;

public class Ch6_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data1 d1 =new Data1();
		Data2 d2 = new Data2();
	
		
		Car c1 = new Car();
		c1.color ="white";
		c1.gearType = "auto";
		c1.door = 4;
		
		Car c2 = new Car("white","auto",4); //훨씬 읽기 간편하다. 
		Car c3 = new Car("white","auto","wow","he");
		System.out.println(c3.a[3]);
		
		String[] h = {"hi","hi","hi","hi"};
		String[] we = new String[2];
		
		we[0] = new String("hhhhhhhh");
		we[1] = new String("dsdsdsadasdsadasdsadas");
		
		c3.a=we;
		
	}

}
class Data1 {int value;}
class Data2 {
	int value; 
Data2(int x) //int 매개변수로 받는 생성자.
{value =x;}

Data2() {} //기본생성자

}
class Car
{	String color; //색상
	String gearType;
	int door;
	String[] a;
Car(){}

Car(String c, String b, int d) //매개변수 생성자
{	color = c;
	gearType = b;
	door = d;}
	
Car(String...args) //가변인자로 받아도됨 뭐..이거좋다 그냥 String 배열보다.
{
	a=args;
	}

	}