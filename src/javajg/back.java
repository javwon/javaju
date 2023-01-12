package javajg;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.util.Scanner;


public class back  {

	public static void main(String[] args)  throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 String[] input = br.readLine().split(" ");
		     int h = Integer.parseInt(input[0]);
		     int m = Integer.parseInt(input[1]);
		     int plusm= Integer.parseInt(br.readLine());
		     m+=plusm;
		      while(m>=60){
		        
		        h+=1;
		        m-=60;
		        if(h>23)h=0;
		 
		      }
		    System.out.println(h+" "+m);
	}

}
