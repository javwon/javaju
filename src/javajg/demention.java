package javajg;

public class demention {

	public static void main(String[] args) {
		//다차원배열 초기화 및 선언
		int[][] IntArr = {{1,2,3},{4,5,6}};
		//선언 - 초기화 따로
		int[][] IntArr2 = new int[3][2];
		IntArr2 = new int[][] {{1,2},{4,5}};
		IntArr2[0] = new int[2];
		IntArr2[1] = new int[] {1,2};
		
		//향상된 for 문 이용하여 출력 및 더하기
		int[][] Score = {{100,100,100},{20,20,20},{30,30,30},{40,40,40}};
		for(int i=0; i<Score.length;i++)
			for(int j=0; j<Score[i].length;j++)
				System.out.printf("Score[%d][%d] =%d%n",i,j,Score[i][j]);
		
		int sum=0;
		for(int[] tem: Score)
			for (int i : tem)
				sum += i;
		for(int[] tem: Score)
			for(int i : tem)
				System.out.println(i);
		
		//간단한 평균구하기
		int kortotal =0;
		int mathtotal =0;
		int engtotal =0;
		
		System.out.println("-----------------------");
		System.out.println("번호   국어  영어  수학  총점  평균");
		for(int i=0; i<Score.length;i++)
			{System.out.printf("%2d",i+1);
			int sum1=0;
			for(int j=0; j<Score[i].length;j++)
				{System.out.printf("%4d",Score[i][j]);
					sum1+=Score[i][j];
				}
			kortotal += Score[i][0];
			mathtotal += Score[i][2];
			engtotal += Score[i][1];
			System.out.printf("%5d",sum1);
			System.out.printf("%7.1f", (float)sum1/Score[i].length);
			System.out.println();
			}
		System.out.println("========================");
		System.out.println("총점 : "+kortotal+" "+engtotal+" "+mathtotal);
		
	 //가변길이 배열 (각 배열의 원소가 포인터처럼 작용하니까 아주 간단)
		int[][] Score2 = new int[5][];
		Score2[0]= new int[2];
		Score2[1] = new int[1];
		
		
	}

}
