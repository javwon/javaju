package javajg;
import java.util.*;
public class array1 {

	public static void main(String[] args) {
		//기본 배열 생성 
		int[] arr = new int[9];
		int[] arr2; //배열을 다루기 위한 참조변수로 
		arr2 = new int[10]; //따로 다뤄줘도 괜찮다.
		int[] arr3 = new int[0]; //길이가 0인배열도 생성가능
		
		//배열의 초기화
		int[] score = new int[] {50,10,20};
		int[] score2 = {10,20,30};
		//단 int[] socre; 선언 후에 socre = {}는 안됨 new int[] {하나씩} --new int[]마치 익명배열같은..
		
		//배열 출력 (보통 for문 돌려서 많이 출력함) 
		int[] stringarr;
		stringarr = new int[] {20,30,40};
		System.out.println(Arrays.toString(stringarr)); //arrary를 string으로 바꿔줌
		//char[]는 그냥 넣어도 출력해준다. 
		
		//배열 복사 새로운 배열을 만들어서 기존 배열을 복사하고 기존 배열 가리키던 변수를 새로운 변수 가리키도록 하면된다.
		int[] arr14 = {10,20,30};
		int[] temp = new int[6];
		for(int i=0; i<arr14.length;i++)temp[i]=arr14[i];
		arr14 = temp; //arr14가 temp가리키고(애초에 참초변수) - 기존 arr14의 배열은 자동으로 메모리에서 삭제됨

		//system.arrarycopy()이용 System.arraycopy(참조변수1,1인덱스,참조변수2,2인덱스) --복사해줌
		arr14[3] = 10;
		arr14[4] = 5;
		System.arraycopy(arr14, 3, temp, 3, 2); //자주 사용할 것 같다. 잘 봐두자. 
		System.out.println(Arrays.toString(temp));
		
		//생성,초기화,출력,복사 키워드 
	}

}
