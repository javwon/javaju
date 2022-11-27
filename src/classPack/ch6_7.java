package classPack;

public class ch6_7 {

	public static void main(String[] args) {
		String[] strArr = {"100","200","300"};
		Mymathod m = new Mymathod();
		
		System.out.println(Mymathod.concatenate("","100","200","300"));
		System.out.println(Mymathod.concatenate("-",strArr));
		System.out.println(m.concatenate(",",new String[] {"1","2","3"}));
		System.out.println(m.concatenate2(new String[0]));
		System.out.println(m.concatenate(","));
		
		//에러 발생확률 높으니 가변인자는 오버로딩 안하는게 낫다.
	}

}

class Mymathod{
	
	static String concatenate(String delim,String... args)
	{	String result = "";
		
	for(String str: args) //완전 배열처럼 다뤄짐 args[0] 걍 배열로만든다고 보면된다. 배열을 전달인자로 받기도한다.
	{
		result += str + delim;
	}
	
		return result;	
}
	static String concatenate2(String... args)
	{
		return concatenate("",args);
	}
	
}