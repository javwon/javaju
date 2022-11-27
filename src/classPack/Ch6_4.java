package classPack;

public class Ch6_4 {

	public static void main(String[] args) {
		
		Data d =new Data();
		d.x = 10;
		System.out.println("main() : x ="+ d.x);
		change(d.x);
		System.out.println("Afther chage"+ d.x);
		System.out.println("main :x"+d.x);
		
		change2(d);
		System.out.println("After change2"+d.x);
		
		int[] x = {10};
		change3(x);
		change3(d.y);
		System.out.println(d.y[0]);
		
	}
	
	static void change(int x) {
		//기본형 매개변수 (클래스에 대한)
		x =1000;
		System.out.println("change x"+x);
		} 
	
	
	static void change2(Data d) 
	{//클래스를 참조하는 매개변수 (클래스에 대한)
		d.x=1000;
		System.out.println("chage2 () "+d.x);
	}
	
	static void change3(int[] x) 
	{//참조형 매개변수 (배열에 대한) 
		x[0] = 1000;
		System.out.println("chage3()"+x[0]);
		}
	
}

class Data 
{
	int x;
	int[] y= new int[1];

}



