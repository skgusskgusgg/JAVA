package exec01;

import java.util.Scanner;

public class test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // 숫자 입력 받아서, 3의 배수인지 아닌지 판별하는 프로그램
	      Scanner scan = new Scanner(System.in);
	      int num;
	      
	      System.out.println("숫자를 입력하세요 > ");
	      num = scan.nextInt();
	      
	      if(num % 3 == 0) {
	    	  System.out.println("3의 배수입니다.");
	      }else {
	    	  System.out.println("3의 배수가 아닙니다.");
	      }
	}

}
