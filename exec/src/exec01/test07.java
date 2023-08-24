package exec01;

import java.util.Scanner;

public class test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 숫자를 입력받아서, 짝수인지 홀수인지 판별하는 프로그램
		*/
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요 > ");
		int number = scan.nextInt();
		
		if(number % 2 == 0) {
			System.out.println("짝수 입니다.");
		}else {
			System.out.println("홀수 입니다");
		}
		
	}

}
