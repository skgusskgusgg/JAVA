package exec01;

public class test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[4];
		for(int i=0; i < array.length;i++) {
			array[i] = i + 1;
			System.out.println(array[i]);
		}
		
		int[] arr = new int[7];
		
		System.out.println("--> 길이가 7인 arr 배열에 1~10사이의 숫자 랜덤으로 저장 & 출력");
		for(int i=0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("--> Arr배열에서 인덱스가 짝수인 것만, 값 출력");
		for(int i=0; i < arr.length; i++) {
			if(i % 2 == 0 && i != 0) {
				  System.out.print(arr[i] + " ");  
			  }
		}
		System.out.println();
		System.out.println("--> Arr 배열에서 저장된 값이 짝수인 것만, 값 출력");
		for(int i=0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
