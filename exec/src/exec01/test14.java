package exec01;

public class test14 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int x = 2;
		int y = 5;
		char c = 'A';
		
		System.out.println(y >= 5 ||  x < 0 && x > 2);
		System.out.println(y += 10 - x++);
		System.out.println(x += 2);
		
		// 3-3
		int num =10;
		System.out.println("3-3 : " + (num > 0 ? "양수" : num < 0 ? "음수" : "0"));
		// 3-4
		num = 456;
		System.out.println("3-4 : " + ((num / 100) * 100));
		// 3-5
		// (num / 10) * 10 + 1
		num = 777;
		// int result = Integer.parseInt(String.valueOf((num / 10) + "" + (num / num)));
		int result = (num / 10) * 10 + 1;
		System.out.println("3-5 : " + result);
		
		// 3-6
		num = 24;
		result = 0;
		/*
		 * result =(((num)/ 10) + 1 )* 10;
		if(num % 10 == 0) result = 0;
		result = result - num;
		*/
		result = 10 - (num % 10);
		System.out.println("3-6 : " + (result));
		// 3-7
		int fahrenheit = 100;
//		float celcius = ((float)5 /(float)9) * (fahrenheit - 32);
//		String result2 = String.format("%.2f", celcius);
//		float celciusRe = Float.parseFloat(result2);
		float celcius = (int)((5/9f * (fahrenheit - 32)) * 100 + 0.5) / 100f;
		System.out.println("3-7 : " + celcius);

		// 3-8
		byte a1 = 10;
		byte b1 = 20;
		//정답
		byte c1 = (byte)(a1 + b1);
		
		char ch = 'A' + 2;
		//정답
		ch = (char)(ch+2);
		
		float f = 3/2f;
		long l = 3000 * 3000 * 3000L;
		
		float f2 = 0.01f;
		double d = 0.1;
		
		boolean result3 = (float)d == f2;
		
		System.out.println("-------------------");
		System.out.println("3-8 : ");
		System.out.println("c = " + c1);
		System.out.println("ch = " + ch);
		System.out.println("f = " + f);
		System.out.println("l = " + l);
		System.out.println("result3 = " + result3);
		System.out.println("-------------------");
		
		// 3-9
		char ch2 = '!';
		// ('a' <= ch && ch <= 'z') || ('A' <= ch && 'Z' <= ch) || (ch <= '0' && ch <= '9')
		boolean b =  (ch2 >= 48 && ch2 <= 57) || (ch2 >= 65 && ch2 <= 90) || (ch2 >= 97 && ch2 <= 122);
		System.out.println("3-9 : " + b);
		
		// 3-10
		char ch3 = 'a';
//		char lowerCase = ch3 < 97  ? (char)(ch3 + 32) : ch3;
		char lowerCase = 'A' <= ch3 && ch3 <='Z' ? (char)(ch3 + 32) : ch3;
		
		System.out.println("3-10 : ch : "+ ch3);
		System.out.println("ch to lowerCase : " + lowerCase);

		
	}

}
