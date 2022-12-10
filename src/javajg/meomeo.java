package javajg;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class meomeo {

	public static void main(String[] args) {
		
	int[][] arr =new int[4][5];
	
	for(int y=0;y<arr.length;y++)
		for(int x=0; x<arr[0].length;x++)
			{	if(y<2)
				arr[y][x]=5+(y*5);
				else
				arr[y][x]=10+((y-1)*10);
				
			
			}
	for(int y=0; y<arr.length;y++)
	System.out.println(Arrays.toString(arr[y]));
	
	int total=0;
	BigDecimal average1 = new BigDecimal(0);
	float average2=0f;
	
	for(int y=0; y<arr.length;y++)
		for(int x=0; x<arr[0].length;x++)
			total+=arr[y][x];
	
	average2 = total/(float)(arr.length*arr[0].length);
	average1 = average1.add(new BigDecimal(total));
	average1= average1.divide(new BigDecimal(arr.length*arr[0].length));
	System.out.println("total :" + total);
	System.out.println("average1 "+average1);
	System.out.println("average2 "+average2);
	
	}
	
	
	
}
