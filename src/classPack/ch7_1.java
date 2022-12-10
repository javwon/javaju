package classPack;

class Tv1 {
	boolean power;
	int channel;
	void power() {power = !power;}
	void channelUp(){++channel;}
	void channelDown() {--channel;};
}
class CaptionTv extends Tv1{
	boolean caption;
	void displaycaption(String text) {
		if(caption) System.out.println(text);
	}
	
}


public class ch7_1 {

	public static void main(String[] args) {
		CaptionTv t1 = new CaptionTv();
		t1.channel =10;
		t1.channelUp();
		System.out.println(t1.channel);
		t1.displaycaption("hello");
		t1.caption=true;
		t1.displaycaption("hello");
				

	}

}
