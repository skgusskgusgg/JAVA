package exec01;

import java.util.Scanner;

/* 조건문 : 조건에 맞춰서 구문을 실행
 * 1. if : 만약에..
 * 
 * < 형태 >
 * if(조건){
 *  // 조건이 참이라면..
 *  }else{
 *  // 그 밖에 모든 것들..
 *  }
 *  
 */

public class test02 {
	public static void main(String[] args) {
		/* 1. 스캐너로 숫자 두개 입력 + 연산자
		 * 2. 더하기 연산
		 * 3. 결과값 출력
		 * 
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		int x;
		int y;
		String z;
		int c = 0;
	
		System.out.print("x의 값은 : ");
		x = scan.nextInt();
		
		System.out.print("y의 값은 : ");
		y = scan.nextInt();
		
		System.out.print("z의 연산자는 : ");
		z = scan.next(); 
		
		
		
		if(z.equals("+")) {
			System.out.println("정답은 ? " + (x + y));
		}else if(z.equals("-")) {
			/* 뺄셈 연산시,
			 * 예를들어 3, 8 입력 : -5
			 * 개선 8, 3 입력과 같게 : 5
			 */ 
			if(x < y) {
				c = y;
				y = x;
				x = c;
			} 
			c = x - y;
			System.out.println("정답은 ? " + c);
		}else if(z.equals("*")){
			System.out.println("정답은 ? " + (x * y));
		}else if(z.equals("/")) {
			System.out.println("정답은 ? " + (x / y));
		}else {
			System.out.println("올바른 연산자를 입력하세요.");
		}
	
	}
}
