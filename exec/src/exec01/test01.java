package exec01;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.printf("Hello World  %n");
//		System.out.print("Hello World~     ");
//		System.out.println("Hello World!!!");  
		/** 연산을 위한 단계
		 * 1. 숫자 입력 받기 : scanner
		 * 2. 연산하기 : 변수
		 * 3. 결과 출력 하기 : print
		 */
//		int a = 2;
		int b = 5;
//		int c = a * b;
		 
//		System.out.printf("%d와 %d의 곱셈은 %d입니다. %n", a, b, c);
//		System.out.print(a + "와 " + b + "의 곱셈은 " + c + "입니다." );
//		System.out.println(a + "와 " + b + "의 곱셈은 " + c + "입니다.");
//		
		Scanner scan = new Scanner(System.in);
		System.out.println("두자리 정수를 하나 입력해주세요.");
		
		int input = scan.nextInt();
		int input2 = scan.nextInt();
		
		int num = input;
		int num2 = input2;
		
		System.out.println("입력 내용 : " + input);
		System.out.println("num + num2 = " + num + num2);
	
	}
}
