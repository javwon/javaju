package javajg;
import java.util.*;
public class demention_ex {

	public static void main(String[] args) {
	//뱃놀이
		final int Size =5;
		int x=0,y=0;
		char[][] board = new char[5][5];
		byte[][] shipBoard = {{0,0,0,0},{0,1,0,1},{0,1,1,1,0},{0,1,0,1,0},{0,1,0,1,0}};
		for(int i=1;i<Size;i++)board[i][0] = board[0][i] = (char)(i+'0');
		Scanner input = new Scanner(System.in);
		while(true)
		{
			System.out.printf("좌표를 입력하세요.(종료는 00)>");
			String input_String = input.nextLine();
			x = input_String.charAt(0)-'0';
			y = input_String.charAt(1)-'0';
			if(input_String.length()!=2||(x<0&&x>=Size)||(y<0&&y>=Size))
			{
				System.out.println("다시 입력해주세요");
				continue;
			}
			if(x==0&&y==0)break;
			
			board[x][y] =(shipBoard[x-1][y-1]==1)?'o':'x';
			for(int i=0; i<Size;i++)
				System.out.println(board[i]); //디버거 찍어보자 
			
		}

	}

}
