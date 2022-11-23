package javajg;
import java.util.*;
public class demention_ex {
	
	public void print_arr(int[][] input,int size)
	{
		for(int i=0; i<size;i++)
			{for(int j=0; j<size;j++)
			{
				System.out.printf("%3d",input[i][j]);
			}
		
	System.out.println();}
}
	
	public static void main(String[] args) {
			//뱃놀이
		final int Size = 5;
		char[][] board = new char[Size][Size];
		byte[][] sihpInBoard = {{0,0,0,0},{0,0,0,1},{1,0,1,0},{0,0,1,0}};
		for(int i=1; i<Size;i++)board[i][0] = board[0][i] = (char)(i+'0'); //이중대입연산 가능 + 아스키코드연산 
		Scanner input = new Scanner(System.in);
		demention_ex ex =new demention_ex();
		while(true)
		{
			int x=0,y=0;
			System.out.printf("좌표를 입력해보세요 끝내려면(00)");
			String inputString = input.nextLine();
			if(inputString.length() ==2)
			{
				x = inputString.charAt(0)-'0';
				y = inputString.charAt(1)-'0';
				if(x==0&&y==0)break;
			}
			
			if(inputString.length() != 2 || x<=0&&x>=Size||y<=0&&y>=Size)
			{
				System.out.println("잘못입력하셨습니다.");
				continue;
			}
			board[x][y]=(sihpInBoard[x-1][y-1]==1)?'o':'x';
			
			//for(int i=0;i<Size;i++)System.out.println(board[i]);
			ex.print_arr(board, Size);
		}
		input.close();
		
		//빙고 예제 
		//1~25 가지는 배열 만들기
		final int Size1 =5;
		int[][] Intarr =new int[Size1][Size1];
		
		for(int i=0;i<Size1;i++)
		{	
			for(int j=0;j<Size1;j++)
				Intarr[i][j]= (j+1)+(Size1*i);
		}
		//빙고 섞기 
		for(int i=0;i<Size1;i++)
		{
			int r= (int)(Math.random()*Size1);
			int c= (int)(Math.random()*Size1);
			for(int j=0; j<Size1;j++)
			{
				int temp = Intarr[i][j];
				Intarr[i][j] = Intarr[r][c];
				Intarr[r][c] = temp;
			}
		}
		demention_ex e = new demention_ex();
		
		e.print_arr(Intarr, Size1);
		Scanner input = new Scanner(System.in);
		//빙고 입력받기
		while(true)
		{
			System.out.printf("1~25의 숫자를 입력하세요 (종료:0)>");
			int input_int = input.nextInt();
			if(input_int == 0)
				break;
			outher:
				for(int i=0; i<Size1;i++)
					for(int j=0; j<Size1;j++)
					{
						if(Intarr[i][j]==input_int)
						{
							Intarr[i][j]=0;
							break outher;
						}
					}
			e.print_arr(Intarr, Size1);
		}
		input.close();
		
		//행렬의 곱셈 그래도..뭐 
		int[][] matrix1 = {{1,2,3},{4,5,6}}; //i행 모든열 x 모든행 i열 
		int[][] matrix2 = {{1,2},{3,4},{5,6}}; 
		int[][] NewMatrix=new int[matrix1.length][matrix2[0].length];
		int[] temp = new int[matrix1.length*matrix2[0].length]; //나올수 있는 행렬 
		//새로운 행렬의 행과 열은 앞 배열의 행, 뒷 행렬의 한 행의 열 --3X2 * 2X3 = 3X3행렬 나옴 
		System.out.println(matrix1.length);
		
		for(int i=0; i<matrix1.length;i++)
		{	
			for(int j=0;j<matrix1.length;j++)
			{	int a=0;
				for(int k=0; k<matrix1[0].length;k++)
				a += matrix1[i][k] * matrix2[k][j]; //부족한 점 
			temp[j+(matrix1.length*i)] = a;  //그래도 행렬 표현법 하나 배운셈.. 
			}
			
			
		}
		System.out.println(Arrays.toString(temp));
		for(int i=0;i<matrix1.length;i++)
			for(int j=0; j<matrix2[0].length;j++)
				NewMatrix[i][j] = temp[(matrix1.length*i)+j];
		demention_ex e = new demention_ex();
		e.print_arr(NewMatrix, matrix1.length);
		
		
		//matrix
		int[][] m1 = {{1,2,3},{4,5,6}}; 
		int[][] m2 = {{1,2},{3,4},{5,6}}; 
		final int ROW = m1.length;
		final int COL = m2[0].length;
		final int M2_ROW = m2.length;
		
		int[][] m3 = new int[ROW][COL];
		
		//m1*m2의 결과 m3에 저장
		for(int i=0; i<ROW;i++)
			for(int j=0; j<COL;j++)
				for(int k=0; k<M2_ROW;k++)
					m3[i][j] += m1[i][k] * m2[k][j];
		e.print_arr(m3, ROW);
	}

}
