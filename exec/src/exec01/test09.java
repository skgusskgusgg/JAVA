package exec01;

import java.util.Scanner;

public class test09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 주민번호를 입력 받아서 남자인지 여자인지 출력하기 (ex)regNo.charAt(7)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("주민등록 번호를 입력하세요.");
		String regNo = scan.nextLine();
		char gender = regNo.charAt(7);
		String result = "";
		
		switch(gender) {
		case '1','3':
			result = "남자";
			break;
		case '2', '4':
			result = "여자";
			break;
			default :	
				System.out.println("다시 입력해주세요");
		}
		System.out.println("당신의 성별은 " + result + "입니다");
		
	}

}
