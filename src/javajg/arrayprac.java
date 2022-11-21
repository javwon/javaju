package javajg;

import java.util.Arrays;

public class arrayprac {

	public static void main(String[] args) {
		//배열 예제1 총합과 평균
	int sum =0;
	float average =0f;
	int[] score = {100,88,100,100,90};
	for(int i=0; i<score.length;i++)sum+=score[i];
	
	average = (float)sum/score.length; //연산자체가 int로 된 다음에 int가 float로 바뀌는 것 vs float로 하나 캐스팅해주고 하는거랑 결과다름
	//연산 결과를 자료형에 맞게 저장하고 싶으면 습관적으로 하나 달자. 어차피 한쪽만 자료형 달라도 알아서 맞춰줌 
	System.out.println("총 스코어 :" + sum);
	System.out.println("평균 :"+average);
	
	//배열에 최댓값과 최솟값 찾기 
	int[] score2 = {79,88,91,33,100,55,95};
	int min_numb=score2[0];
	int max_numb=score2[0];
	for (int i=0;i<score2.length;i++)
	{
		min_numb = (min_numb<score2[i])? min_numb:score2[i];
		max_numb = (max_numb>score2[i])? max_numb:score2[i];
	}
		
	System.out.println(min_numb +" "+max_numb);
	
	//배열 섞기 (배울점 on) //첫번째 값만 계속 자리 바꿔줘도 재밌는 결과 가능 
	int[] numArr = new int[10];
	for(int i=0; i < numArr.length;i++)
		{numArr[i]=i;
		System.out.print(numArr[i]);
		}
	System.out.println();
	for(int i=0; i<10;i++)
	{
		int n = (int)(Math.random()*10); //Math.random은 0.0~1.0사이의 수 집어 넣어줌 0포함 포함x
		int temp = numArr[0];
		numArr[0] = numArr[n];  //numArr[0]의 값과 numArr[n]의 값을 계속 바꾼다 (i가 아닌이유는..인덱스)
		numArr[n]=temp; //그냥 자리만 계속 바꾸기
	}
	System.out.println(Arrays.toString(numArr));
	
	//이렇게 하면 섞기기는 하는데.. 100번 1000번 셔플은 못함 
	for(int i=0; i<numArr.length;i++)
	{
		int n = (int)(Math.random()*10);
		int temp = numArr[i];
		numArr[i] = numArr[n];
		numArr[n] = temp;
	}
	System.out.println(Arrays.toString(numArr));
	
	
	
	//섞기2 (-0번 ~6번까지만 다른거로 바꾸기 로또생성예제)
	int[] ball = new int[45];
	
	for(int i=0; i<ball.length;i++)
	{
		ball[i]= i+1;
	}
	int temp;
	int j=0;
	for(int i=0;i<6;i++)
	{
		j=(int)(Math.random()*45);
		temp = ball[i];
		ball[i] = ball[j];
		ball[j] = temp;
	}
	
	for(int i=0; i<6;i++)System.out.println(ball[i]);
	
	//임의의 값으로 배열채우기 (저장된 배열에서 무작위로 뽑아서 다시 저장하기)
	int[] code = {-4,-1,3,6,11};
	int[] arrs = new int[10];
	for(int i=0; i<arrs.length;i++)
	{
		int temp1 = (int)(Math.random()*code.length); //0~*넘버까지 무작위생성
		arrs[i]=code[temp1];
	}
	//정렬(버블정렬)
	int inner_counter =0;
	int[] arr22= {9,7,6,5,2,1,10};
	for(int i=0; i<arr22.length-1;i++)
	{
		for(int jk=0;jk<arr22.length-1-i;jk++)
		{if(arr22[jk]>arr22[jk+1]) //jk+1때문에 전체 length에 -1 해줄 수 밖에없다.
			{inner_counter+=1;
			int tempk = arr22[jk];
			arr22[jk] = arr22[jk+1];
			arr22[jk+1] = tempk;
			}
		}
	}
	
	System.out.println(Arrays.toString(arr22));
	System.out.println(inner_counter);
	
	//빈도수 구하기(이건 신선했다)
	int[] numA = new int[10];
	int[] counterA = new int[10];
	
	for(int i=0; i<numA.length;i++)numA[i]=(int)(Math.random()*10);
	for(int i=0; i<numA.length;i++)counterA[numA[i]]++;
	for(int i=0; i<numA.length;i++)
	{
		System.out.println(i+"의 갯수"+counterA[i]);
	}
	
	
	}
}
