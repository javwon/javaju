package javajg;

public class str_and_demention {

	public static void main(String[] args) {
	 //String 배열의 선언과 생성 
		String[] str = new String[3];
	//String 배열의 초기화
		String[] str1 = new String[3];
		str1[0] = "me";
		String[] str2 = new String[] {"me"};
		String[] str3 = {"me"};
		
		//String 클래스에서만 마치 기본자료형 처럼 선언하게 해준거지 사실 String은 참조형임! 따라서
		String[] str4 = new String[2];
		str4[0] = new String("me");
		str4[1] = new String("jang");
		//c에서 처럼 String은 일종의 char배열임 String[] 변수 - 배열 첫 원소의 주소, 변수[0] -string의 주소 - string =char배열 첫문자의 주소 순
		//배열의 이름이  참조변수(주소를 담은 변수)의 주소를 의미한다. str4는 &str4[0] - str4[0] = me의 주소 
		
		//예제 1 
		String[] names = {"kim","park","yi"};
		for(int i=0; i<names.length;i++)System.out.println("names["+i+"] :"+names[i]);
		String temp = names[2];
		System.out.println("temp:"+temp);
		names[0] = "yu";
		for(String str22 : names) 
			System.out.println(str22);
		//예제2 16진수 2진수 변환예제 이런거 잘 봐둬야한다.
		char[] hex = {'C','A','F','E'};
		
		String[] binary = {"0000","0001","0010","0011","0100","0101","0110","0111","1000","1001","1010","1011"
							,"1100","1101","1110","1111"};
		String result ="";//String읜 +연산 가능
		for(int i=0; i<hex.length;i++)
		{
			if(hex[i]>='0'&&hex[i]<='9')
			{
				result += binary[hex[i]-'0'];
				
			}
			else {
				result += binary[hex[i]- 'A'+10]; //A가 10을 의미 문자 c-a=2 -->12
			}
		}
		System.out.println("hex"+new String(hex)); //new String("그냥문자열"&char[] 변수명)
		System.out.println("binary"+result);
		
		//char 배열과 String class
		//String 객체는 내용변경 못함  - +연산자 무튼 변경하면 새로운 문자열 생성되고, 변수는 그 주소(바뀐) 가져오는 것 
		//char배열과 String클래스의 변환
		char[] chArr = {'a','b','c'};
		String tem = new String(chArr); // char[] to String
		char[] chArr2 = tem.toCharArray();// String to char[] --기본자료형 배열은 Arrays.toString() (java.util)(복사System.arraycopy())
		
		//예제3
		String src ="ABCDE";
		for(int i=0; i<src.length();i++)
		{
			char ch = src.charAt(i);
			System.out.println(ch);
		}
		char[] chARR = src.toCharArray();
		System.out.println(chARR); //원래는 원소하나씩 뽑아서 저장해줘야하는거 쉽게 toCharArray()로 하기
		
		
		//모스부호 예제  귀찮다 너무 노가다 
		String word ="JANG";
		String[] morse = {"__"};
		//중요한점 이건 꼭 result += morse[word.charAt(i) -"A"] //String +연산 이어붙이기 가능하다는점 항상 상기할 것. 
		
		//커맨드라인 입력받기 
		//java 클래스명으로 실행할때 args말하는거.. 
		
		if(args.length<3)
		{
			System.out.println("more args plz");
			System.exit(0);
		}
		else {
			int num1 = Integer.parseInt(args[0]);
			char plz = args[1].charAt(0);
			int num2 = Integer.parseInt(args[2]);
			int result1 =0;
			
			switch(plz) {
			case '+': result1 = num1 + num2;
			          break;
			case '-':result1 = num1- num2;
					break;
			case '*' : result1 =num1*num2;
					break;
			}
			System.out.println(result1);
		}
		
	}

}
