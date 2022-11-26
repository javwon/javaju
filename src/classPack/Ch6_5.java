package classPack;

public class Ch6_5 {

	public static void main(String[] args) {
		
		data23 d = new data23();
		d.x =10;
		
		data23 d2 = copy(d);
		System.out.println("d.x "+d.x);
		System.out.println("d2.x " +d2.x);
		
		System.out.println(d +" "+ d2);
		
		

	}
	
	static data23 copy(data23 d) 
	{	data23 temp =new data23();
		temp.x =d.x;
		return temp;
		//다른주소 
	}
	static data23 copy2(data23 d)
	{	data23 temp;
		temp=d;
		return temp;
		//동일주소
	}

}

class data23{int x;}