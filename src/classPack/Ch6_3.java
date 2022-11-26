package classPack;

public class Ch6_3 {

	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 6L);
		long result2 = mm.subtract(5L, 6L);
		long result3 = mm.muiltiply(5L, 6L);
		double result4= mm.divide(5L, 6L);
		
	}

}

class MyMath{
	
	long add(long a, long b) {
		long result = a+b;
		return result;
	}
	long subtract(long a, long b) {return a-b;}
	long muiltiply(long a, long b) {return a*b;}
	double divide(double a, double b) {return a/b;}
	
	
	
}
