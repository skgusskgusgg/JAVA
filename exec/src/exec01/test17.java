package exec01;

public class test17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score = {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40}
		};
		// score[%d][%d]=%d%n의 형태로 출력
		// 출력 순서 100,100,100,20,20,20...
		int sum = 0;
		for(int i = 0; i <score.length;i++) {
			for(int j =0; j <score[i].length; j++) {
				System.out.printf("[%d][%d]=%d%n",i,j,score[i][j]);	
				sum += score[i][j];
			}		
			System.out.println();
		}
		System.out.println("합="+sum);
	}
}
