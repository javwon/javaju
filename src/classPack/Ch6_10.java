package classPack;


class StaticBlocktest{
	
	static int[] arr = new int[10];
	
	static {
		for(int i=0; i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*10)+1;
		}
	}
}


public class Ch6_10 {
	
	public static void main(String[] args) {
		
		for(int i=0; i<StaticBlocktest.arr.length;i++)
		{
			System.out.println("arr["+i+"] :"+StaticBlocktest.arr[i]);
		}
		
		Product p1 =new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println(p1.serialNo);
		System.out.println(p2.serialNo);
		System.out.println(p3.serialNo);
		
		Document d1 = new Document();
		Document d2 = new Document();
		Document d3 = new Document("자바.txt");
		Document d4 = new Document();
		
	}
	
}

class Product
{
	static int count =0;
	int serialNo; 
	
	{
		count++; //인스턴스 생성 될 때마다 반복하도록 만들기.
		serialNo=count;
	}
	
}
class Document
{
	String bookName;
	static int bookNum;
	
	
	Document()
	{
		this("제목없음"+ ++bookNum); //기본생성자 사용시에만 반응하게 만들기
		
	}
	
	Document(String bookName)
	{
		this.bookName = bookName;
		System.out.println(this.bookName+"이 생성됨");
	}
	
	
}


