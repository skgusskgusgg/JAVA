package exec01;

import java.util.Scanner;

public class test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	      int numOfApples;
	      int numOfBucket = 0;
	      int sizeOfBucket = 10;
	      
	      System.out.print("사과의 수를 입력하세요 > ");
	      numOfApples = scan.nextInt();
	
	     // numOfBucket = numOfApples % sizeOfBucket  == 0  ? numOfApples/sizeOfBucket  :  (numOfApples/sizeOfBucket) + 1;
	      
	      if(numOfApples % sizeOfBucket == 0) {
	    	  numOfBucket = numOfApples/sizeOfBucket;
	      }else {
	    	  numOfBucket = (numOfApples/sizeOfBucket) + 1;
	      }
	      
	      System.out.println("필요한 바구니의 수 : " + numOfBucket);
	}

}
