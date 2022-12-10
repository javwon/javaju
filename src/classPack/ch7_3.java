package classPack;

public class ch7_3 {

	public static void main(String[] args) {
		Deck d = new Deck();
		Card1 c = d.pick(0); //카드를 섞기 전에 제일 위의 카드를 뽑는다.
		System.out.println(c);
		int i=0;
		while(true)
		{d.shuffle();
		c=d.pick(0);
		System.out.println(c);
		i++;
		if(i>10)
			break;
		}
		//포함관계 
		
	}

}

class Deck{
	
	final int CARD_NUM = 52; //카드 갯수 
	Card1 CardArr[] = new Card1[CARD_NUM]; // Card객체 
	Deck() {
		int i=0;
		for(int k=1; k<Card1.KIND_MAX+1; k++)// 왜 빼기로 했지?
		{
			for(int n=0; n<Card1.NUM_MAX;n++)
				CardArr[i++] = new Card1(k,n+1); //4*13 =52
		}
	}
	
	Card1 pick (int index) {
		return CardArr[index]; // 지정된 위치에 카드를 꺼내서 반환
	}
	Card1 pick() {
		int index =(int)(Math.random()*CARD_NUM); //덱에서 랜덤한 카드 뽑기 
		return pick(index);
		
	}
	void shuffle() {
		for(int x=0; x<CardArr.length;x++)
		{	int n=(int)(Math.random()*CARD_NUM);
			Card1 temp = CardArr[x];
			CardArr[x] = CardArr[n];
			CardArr[n] = temp;
		}
	}
}//Deck클래스 끝

class Card1{
	static final int KIND_MAX = 4; //카드 무늬
	static final int NUM_MAX = 13; //무늬별 카드수 
	
	static final int SPADE = 4;
	static final int DIAMOND =3;
	static final int  HEART =2;
	static final int CLOVER =1;
	
	int kind; 
	int number;
	Card1(){
		this(SPADE,1);
	}
	Card1(int kind, int number)
	{
		this.kind = kind;
		this.number = number;
	}
	public String toString() {
		String[] kind_s = {"","CLOVER","HEART","DIAMOND","SPADE"}; //string 처리 
		String num_s = "0123456789XJQK";
		return "kind: "+kind_s[this.kind]+","+" number: "+num_s.charAt(this.number);
	}
	
}