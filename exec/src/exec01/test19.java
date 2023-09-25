package exec01;

import java.util.Arrays;

public class test19 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[5-1] - 정답 : e번 // int arr[5] => int arr[]=new int[5];

		//[5-2] - 정답 : 2개

		//[5-3]
		int[] arr = {10,20,30,40,50};
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		System.out.println("sum="+sum);

		//[5-4]
		int[][] arr2 = {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
		};
		int total = 0;
		float average = 0;
		for(int i =0; i <arr2.length; i++) {
			for(int j=0; j < arr2[i].length; j++) {
				total += arr2[i][j];
				average = (float)total / (arr2[i].length * arr2.length);
			}
			average = (float)total / (arr2[i].length * arr2.length);
		}
		System.out.println("total="+total);
		System.out.println("average="+average);

		//[5-5]
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		for(int i=0;i<ballArr.length;i++) {
			int j = (int)(Math.random() * ballArr.length);
			int temp = 0;
			// 1) 코드
				temp = ballArr[i];
				ballArr[i] = ballArr[j];
				ballArr[j] = temp;
		}
		/*
		for(int i=0; i<3; i++) {
			ball3[i] = ballArr[i];
		}
		*/
		System.arraycopy(ballArr, 0, ball3, 0,ball3.length);			
		//2) 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.
		for(int i=0; i<ball3.length;i++) {
			System.out.print(ball3[i]);
		}
		System.out.println();
		
		//[5-6]
		int[] coinUnit = {500,100,50,10};
		int money = 2680;
		System.out.println(""+ "money="+money);
		for(int i=0;i<coinUnit.length;i++) {			
			System.out.printf("%d원:%d%n",coinUnit[i],money/coinUnit[i]);
			money = money % coinUnit[i];
		}
	
//			if(coinUnit[i] == 500) {
//				change = money / coinUnit[i];
//				money = money - (change * coinUnit[i]);
//				System.out.println("500원 : " + change);
//			}
//			if(coinUnit[i]==100) {
//				change = money / coinUnit[i];
//				money = money - coinUnit[i];
//				System.out.println("100원 : " + change);
//			
//			}
//			if(coinUnit[i]==50) {
//				change = money / coinUnit[i];
//				money = money -(change * coinUnit[i]);
//				System.out.println("50원 : " + change);
//			}
//			if(coinUnit[i] == 10) {
//				change = money / coinUnit[i];
//				money = money - (change * coinUnit[i]);
//				System.out.println("10원 : " + change);
//				System.out.println(money);
//			}
			
		
		//[5-7]
		int coin = 3170;
		
		System.out.println("money="+coin);
		
		int[] coinType = {500,100,50,10};
		int[] coinCount = {5,5,5,5};
		
		for(int i=0;i<coinType.length;i++) {
			int coinNum = 0;
			/**
			 * 1) 금액(money)을 동전단위로 나눠서 필요한 동전의 개수(coinNum)를 구한다.
			 * 2) 배열 coinCount에서 coinNum만큼의 동전을 뺀다.
			 * (만일 충분한 동전이 없다면 배열 coinCount에 있는 만큼만 뺀다.)
			 * 3) 금액에서 동전의 개수(coinNum)와 동전단위를 곱한 값을 뺀다.
			 */
			coinNum = coin/coinType[i];
			if(coinCount[i] >= coinNum) { // coinNum : 동전갯수
				coinCount[i] -= coinNum;
			}else {
			  coinNum = coinCount[i];
			  coinCount[i] = 0;
			}
			coin -= coinNum * coinType[i];
			System.out.println(coinType[i]+"원 : " + coinNum);
		}
		if(coin > 0) {
			System.out.println("거스름돈이 부족합니다.");
			System.exit(0);
		}
		System.out.println("=남은 동전의 개수=");
		
		for(int i=0;i<coinType.length;i++) {
			System.out.println(coinType[i] + "원: " + coinCount[i]);
		}
		//[5-8]
		int[] answer = {1,4,4,3,1,4,4,2,1,3,2};
		int[] counter =new int[4];
		// counter = {0,0,0,0}
		for(int i=0;i<answer.length;i++) {
			counter[answer[i]-1]++;
		}
		for(int i=0;i<counter.length;i++) {
			System.out.print(i + 1 + ".갯수 :" + counter[i] + " "); 
			for(int j=0;j<counter[i];j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
