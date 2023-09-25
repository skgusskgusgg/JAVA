package exec01;

import java.util.Scanner;

public class test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// switch문
		// 학점 처리
		Scanner scan = new Scanner(System.in);
		int score  = 0;
		String grade = "";
		
		System.out.println("학점을 입력하세요");
		score = scan.nextInt();
		
		switch(score / 10) {
		case 10 :
			grade = "A+";
			break;
		case 9 :  
			grade ="A";
			break;
		case 8 :
			grade ="B";
			break;
		case 7 :
			grade ="C";
			break;
		default :
			grade ="F";
			}
		
		switch(score % 10) {
		case 9, 8, 7 :
			if(score > 70) {
				grade = grade + '+';
			}
			break;
		}
	
		System.out.println("당신의 학점은 " + grade + "학점 입니다.");
	}

}
