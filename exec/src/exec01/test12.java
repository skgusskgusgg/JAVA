package exec01;

import java.util.Scanner;

public class test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int num;
		String str;
		System.out.println("num 입력");
		num = input.nextInt();
		
		
		// nextLine은 enter키도 인식 -> 숫자 값도 왠만하면 쓰임(형 변환 후에 사용)
		System.out.println("str 입력");
		str = input.nextLine();
		
		System.out.println("num : " + num);
		System.out.println("str : " + str);
		
		// Integer.parseInt : 문자열 => 숫자
		int number = Integer.parseInt(input.nextLine());
		float flo = Float.parseFloat(input.nextLine());
		
		// Integer.toString : 숫자 => 문자
		String str2 = Integer.toString(1234);
		
		// String 클래스 정의
		/**
		 * charAt() : 해당 문자열의 특정 인덱스에 해당하는 문자를 반환.
		 * concat() : 해당 문자열의 뒤에 인수로 전달된 문자열을 추가한 새로운 문자열 반환.
		 * equals() : 두 문자열을 비교.
		 * length() : 총 문자 수. 
		 * replace(처음(숫자),끝(문자)) : 처음(숫자)인덱스 위치를 끝(문자)로 변환. 
		 * split() : 괄호 안에 들어가는 것을 바탕으로 배열 형식으로 문자열을 잘라줌.
		 * substring : (처음(숫자), 끝(숫자)) : 처음 인덱스 위치에서 끝 위치까지 잘라낸 문자열.(처음 인덱스만 쓰면 끝까지 반환) 
		 * tostiring() : '간결하면서 사람이 읽기 쉬운 형태의 유익한 정보' 를 반환
		 * trim() : 해당 문자열의 맨 앞과 맨 뒤에 포함된 모든 공백 문자를 제거.
		 * valueOf() : 숫자를 문자로 반환.
		 */
	}

}
