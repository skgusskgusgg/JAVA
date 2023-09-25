package exec01;

import java.util.Scanner;

public class test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("----------1번 문제----------");
		int a;
		int b;
		int c;
		int answer;
		
		System.out.print("Insert Number : ");
		a = scan.nextInt();
		
		System.out.print("Insert Number : ");
		b = scan.nextInt();
		
		System.out.print("연산자를 입력하세요. ");
		String operator = scan.next();
		
		if(operator.equals("+")) {
			answer = a + b;
			System.out.println("정답은 ? " + answer);
		}else if(operator.equals("-")) {
			if(a < b) {
				c = b;
				b = a;
				a = c; 
			}
			answer = a - b;
			System.out.println("정답은 ? " + answer);
		}else if(operator.equals("*")) {
			answer = a * b;
			System.out.println("정답은 ? " + answer);
		}else if(operator.equals("/")) {
			answer = a / b;
			System.out.println("정답은 ? " + answer);
		}else {
			System.out.println("올바른 값을 입력하세요.");
		}

		System.out.println("----------2번 문제----------");
	
		int f = 0;
		int g = 0;;
		String result;
		
		System.out.println("점수를 입력하세요.");
		f = scan.nextInt();
		
		if (f > 100 || f < 0) {
			System.out.println("점수를 다시 입력해주세요.");
			return;
		}
		
		if(f >= 90 ) {
			g=96;
			result = "A 학점";
		}else if (f >= 80) {
			g=86;
			result = "B 학점";
		}else if (f >= 70 ) {
			g=76;
			result = "C 학점";
		}else {
			g=0;
			result = "F 학점";
		}
		if(f  > g) {
			result = "+" + result;
		}
		
		System.out.println("사용자의 점수는 ? " + result + "입니다.");

	      System.out.print("점수 :");
	      int score = scan.nextInt();
	      int aa = score % 10;
	      String msg;
	      
	      
	      if (score >= 90) {
	    	  msg="A";
	      		}
	      else if (score >= 80 ) {
	    	  msg="B";
	    	 	}
	      else if (score >= 70) {
	    	  msg="C";
	    	  }
	      else {
	    	  msg="F";
	    	  }

	      if ((aa > 6 && score >= 70 ) || score == 100) {
	    		  msg = msg+"+";
	     }
	      
	      System.out.printf(msg+" 입니다.");
		
	
	}

}
