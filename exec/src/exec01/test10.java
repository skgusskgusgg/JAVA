package exec01;

public class test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1부터 3까지의 랜덤한 수를 구하기 
		// 최대수를 먼저 곱하고 최소를 더하면 랜덤한 숫자가 나옴
		double num =(int) (Math.random() * 3) + 1;
		System.out.println(num);
		
		// for문
		/*
		for(int i = 1; i <= 5; i++) {
			System.out.print(i);
		}
		*/

		
		for ( int i = 1; i <= 10; i++) {
			if(i % 3 ==0) {
				System.out.print(i  );
			}
		}
		
		System.out.printf("\n");
		
		int number= 0;
		for(int j = 0; j <= 20; j++) {
			if(j % 2 == 0) {
				number += j;	
			}
		}
		System.out.println(number);
		
		for(int x = 10; x >= 1; x --) {
			System.out.println(x);
		}
		
		// 구구단
		// 2단
		for(int z = 1; z < 10; z++) {
			System.out.println("2  * " + z + " = " + (2 * z));
		}
		
		// 2~9단
		for(int a = 2; a < 10; a++) {
			System.out.println("-----"+ a + "단-----");
			for(int b = 1; b <10; b++) {
				System.out.println(a + " * " + b + " = " + (a * b));
			}
		}
		}
	}

