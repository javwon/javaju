package classPack;

import java.util.Vector;

public class ch7_23 {

	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		Tvc tv= new Tvc();
		Computer122 com = new Computer122();
		Audio1 audio = new Audio1();
		
		b.BuyProduct(tv);
		b.BuyProduct(com);
		b.BuyProduct(audio);
		
		b.summary();
		
		b.refund(com);
		b.summary();
	}

}

class Product12{
	int price;
	int bonusPoint;
	Product12(int price){
		this.price = price;
		this.bonusPoint = (int)(price/10.0);
	}
	Product12(){
		this.bonusPoint =0;
		this.price=0;
	}
}

class Tvc extends Product12 {
	Tvc(){
		super(100);
	}
	public String toString() {
		return "Tv";
	}
}
class Computer122 extends Product12{
	Computer122(){
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}
class Audio1 extends Product12{
	Audio1(){
		super(50);
	}
	public String toString() {
		return "Audio";
	}
}
class Buyer2{
	int money =1000;
	int bonusPoint =0;
	Vector v = new Vector();
	
	void BuyProduct(Product12 product) {
		if(this.money < product.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		this.money-=product.price;
		this.bonusPoint+=product.bonusPoint;
		System.out.println(product+"을/를 구매하셨습니다.");
		v.add(product);
	}
	void summary() {
		int sum =0;
		String itemlist ="";
		if(v.isEmpty()) {System.out.println("구입하신 제품이 없습니다."); return;}
		for(int i=0; i<v.size();i++)
		{
			Product12 temp = (Product12)v.get(i);
			sum+=temp.price; 
			itemlist += (i==0)? " "+temp:" ,"+temp; //이거 아주 좋음..
			
		}
		System.out.println("구입하신 총 금액은"+sum+"입니다.");
		System.out.println("구입 하신 제품은"+itemlist+"입니다.");
	}
	void refund(Product12 p) { //나만의
		String[] itemlist = {"Tv","Computer","Audio"};
		
		System.out.println(p+"를 반품하셨습니다.");
		for(int i=0; i<itemlist.length;i++)
		{
			if(itemlist[i].equalsIgnoreCase(p.toString()))
			{	this.money+=p.price;
				this.bonusPoint-=p.bonusPoint;
				v.remove(i);
			}
		}
	
	}
	void refund2(Product12 p) 
	{
		if(v.remove(p)) {//그냥 넣어도 된다. 왜냐면 인스턴스를 확인하는 것. 참조변수만 조상으로 되었을뿐.. 실체는 각각의 인스턴스임. Tv,computer등등 
							//단지 담은 참조변수만 조상이고, 본질은 자손 -> 참조변수가 범위가 더 작어서 할 수 있는일이 조금 적을 뿐이야 
			this.money+=p.price;
			this.bonusPoint-=p.bonusPoint;
			System.out.println(p+"를 반품하셨습니다.");
		}
		else {System.out.println("해당제품이 없습니다.");}
	}
	
}