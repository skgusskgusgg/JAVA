package exec01;

import java.util.Arrays;

public class test16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열의 복사
		// 1) 1,2,3,4,5의 값을 가지고 있는 길이가 5인 arr1배열을 10개의 값을 저장할 수 있는 배열로 만드시오.
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = new int[10];
		for(int i =0;i < arr1.length;i++ ) {
			arr2[i] = arr1[i];
		}

		System.out.print("1번 문제) ");
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}

		/* 	
		    1 ~ 10 까지
		   	for(int i = arr1.length;i < arr2.length;i++) {
		   	arr2[i] = i + 1;
		 	System.out.print(arr2[i] + " ");
		 	}
		 */

		System.out.println();

		// 2) score배열에 {100,88,100,100,90}저장 후, 총합 & 평균 구하기
		int[] score = {100, 88, 100, 100, 90};
		int add = 0;
		int result = 0;

		for(int i = 0; i < score.length; i++) {
			add += score[i];
			result = add / score.length;
		}

		System.out.println("2번 문제) 총합 : " + add +  " & " + "평균 : " + result);

		// 3) 79,88,91,100,55,95의 값을 score배열에 저장 후 최대값 & 최소값 구하기
		int[] score2 = {79 ,88, 91, 100, 55, 95};
		int max = 0; 
		int min = 100;
		// int max = score2[0]; 
		// int min = score2[0];

		for(int i = 0; i < score2.length; i++) {
			if(score2[i] > max) {
				max = score2[i];
			}else if(score2[i] < min){
				min = score2[i];
			}
		}

		System.out.println("3번 문제) 최대 : " + max + " & " + "최소 : " + min);

		/* 4) 
		 * 1.크기가 10인 numArr배열에 0~9까지의 값 저장
		 * 2.배열에 저장된 값이 랜덤하게 섞일수 있도록 프로그램 작성
		 */

		// 1. 
		int[] numArr = new int[10];
		 
		int random = 0;
		int random2 = 0;
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = i;
		}
		System.out.println();

		for(int i=0; i<100; i++) {
			// 2.
			random =(int)(Math.random() * 10);
			random2 =(int)(Math.random() * 10);
			
			// A,B,T -> T = B -> B = A -> A = T
			int temp = numArr[random2];
			numArr[random2] = numArr[random];
			numArr[random] = temp;
		}

		for(int i=0;i<numArr.length;i++) {
			System.out.println(numArr[i]);
		}
		System.out.println(Arrays.toString(numArr));
		
		// 선생님 풀이
		for(int i=0; i<100; i++) {
			int n = (int)(Math.random() * 9) + 1;
			int temp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = temp;
		}
	
		for(int i=0;i<numArr.length;i++) {
			System.out.println(numArr[i]);
		}
		System.out.println(Arrays.toString(numArr));
		
 		// 로또
		int[] lotto = new int[45];
		
		for(int i=0; i<lotto.length;i++) {
			lotto[i] = i + 1;
		}
		
		int temp =0;
		int j = 0;
		for(int i = 0; i < 6; i++) {
			j = (int)(Math.random() * 45);
			temp = lotto[i];
			lotto[i] = lotto[j];
			lotto[j] = temp;
			System.out.printf("temp = %d, lotto[i] = %d, lotto[j] = %d %n", temp, lotto[i], lotto[j]);
		}
		
		for(int i = 0; i < 6; i++) {
			System.out.printf("lotto[%d] = %d %n", i, lotto[i]);
		}
		// 다차원 배열(2차원 배열까지만 사용)
		int [][] s = new int[5][3];
		for(int i=0; i < s.length; i++) {
			for(int x = 0; x <s[i].length; x++) {
				s[i][x]=10;
				System.out.printf("%d ",s[i][x]);
			}
			System.out.println();
		}
	}
}


