package exec01;

import java.util.Scanner;

public class test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 학점 처리
		 * 1. 사용자에게 점수 입력받기
		 * 2. 점수에 따라 학점 부여하기
		 * 3. 사용자가 입력한 점수에 따른 학점 출력하기
		 * 90점 이상 : A학점
		 * 80점 이상 : B학점
		 * 70점 이상 : C학점
		 * 그 이하 : F학점
		 * */
		Scanner scan = new Scanner(System.in); 
		
		int score = 0;
		String result;
		
		System.out.println("사용자의 점수는 ? ");
		score = scan.nextInt();
		
		result = score >= 90 ? "A" : score >= 80 ? "B" : score >= 70 ? "C" : "F";
			
		System.out.println(result);
		
		/*
		if(score >= 90 && score <= 100) {
			result = "A학점";
		}
		if(score >= 80 && score < 90) {
			result = "B학점";
		}
		if(score >=70 && score < 80) {
			result = "C학점";
		}
		if(score > 0 && score < 70){
			result = "F학점";
		}
		System.out.println(result);
		*/
		
		/*
		if(score >= 90 && score <= 100) {
			result = "A";
		}else if(score >= 80 && score < 90) {
			result = "B";
		}else if(score >=70 && score < 80) {
			result = "C";
		}else if(score > 0 && score < 70) {
			result = "F";
		}else{
			result = "올바른 점수를 입력하세요."
		}
		*/
		
		
	}

}
