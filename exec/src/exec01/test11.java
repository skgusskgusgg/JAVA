package exec01;

import java.util.Scanner;

public class test11 {
	public static void main(String[] args) {
		// 1번 문제
		for(int i = 1; i <= 5; i++) {
			for(int x = 1; x < i; x++) {
				System.out.print("     ");
			}
			for(int j=1; j <= i; j ++) {
				if(i == j) {
					System.out.println("["+i+","+j+"]");	
				}
			}
		}

		// 2번 문제
		Scanner scan = new Scanner(System.in);

		int num = 0;
		while(true) {
			System.out.print("숫자를 입력하세요 : ");
			int scanNumber = scan.nextInt();
			num += scanNumber;
			if(scanNumber == 0) {
				System.out.println("전체 합은 : " + num);
				break;
			}
		}

		// 3번 문제
		int com = (int)(Math.random() * 50) + 1;
		int wrong = 0;
		System.out.println("정답은 : "+com);
		/*while(true) {
			System.out.print("1 ~ 50까지의 숫자를 입력하세요 : ");
			int scanNumber = scan.nextInt();
			if(com != scanNumber) {
				wrong++;
				if(com > scanNumber) {
					System.out.println("더 큰 수를 입력하세요.");
				}else {
					System.out.println("더 작은 수를 입력하세요.");
				}
			}else {
				System.out.println("정답입니다.");
				System.out.println("오답 수 : " + wrong);
				break;
			}
		}*/
		
		int scanNumber;
		do {
			System.out.print("1 ~ 50까지의 숫자를 입력하세요 : ");
			scanNumber = scan.nextInt();
			if(com != scanNumber) {
				wrong++;
				if(com > scanNumber) {
					System.out.println("더 큰 수를 입력하세요.");
				}else {
					System.out.println("더 작은 수를 입력하세요.");
				}
			}else {
				System.out.println("정답입니다.");
				System.out.println("오답 수 : " + wrong);
				break;
			}
		}while(scanNumber != com);


			// 4번 문제
			for(int i = 1; i <= 5; i++) {
				for(int j = 5; j > i; j-- ) {
					System.out.print("*");
				}
				System.out.println("*");
			}

	}

}
