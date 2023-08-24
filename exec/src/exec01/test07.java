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
		System.out.println("1" + "2");
		System.out.println(true + "");
		System.out.println('A' + 'B'); // char보다 int가 더 우선순위이므로, 아스키코드 'A' = 65, 'B'=66 로 인식.
		System.out.println('1' + 2); // '1' = 49
		System.out.println('1' + '2'); // '1' = 49, '2' = 50
		System.out.println('J' + "ava");// char보다 String이 더 우선순위이므로 String으로 읽히기 때문에 문자열로 읽힘.
//		System.out.println(true + null);
		
		byte b= 10;
		char ch = 'A';
		int i = 100;
		long l = 1000L;
		
		b = (byte)i;// 생략 불가능
		ch = (char)b;// 생략 불가능
		short s = (short)ch;// 생략 불가능
		float f = (float)l; // 생략 가능
		i = (int)ch;// 생략 가능
	}

}
