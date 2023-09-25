package exec01;

public class test18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 번호 국어 영어 수학 총점 평균 
		 * ===================== 
		 * 1  100 100 100 300 100.0 
		 * 2  20  20  20  60  20.0 
		 * 3  30  30  30  90  30.0 
		 * 4  40  40  40  120 40.0 
		 * 5  50  50  50  150 50.0
		 * ===================== 
		 * 총점 240 240 240
		 */
		int[][] score = { 
				{ 100, 100, 100 }, 
				{ 20, 20, 20 }, 
				{ 30, 30, 30 }, 
				{ 40, 40, 40 }, 
				{ 50, 50, 50 } 
				};
		int totalScore = 0;
		float average = 0;
		int sum = 0;
		System.out.println("번호 국어  영어  수학  총점  평균");
		System.out.println("==========================");
		for (int i = 0; i < score.length; i++) {
			System.out.print(i + 1 + "   ");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + " ");
				sum += score[i][j];
				if(score[i][j] < 100) {
					System.out.print(" ");
				}
			}
			System.out.print(sum + " ");
			average = sum / score[i].length;
			if(average <= 30) {
				System.out.print(" ");
			}
			System.out.println(" " +average);
			sum = 0;
			System.out.println();
		}
		System.out.println("==========================");
		System.out.print("총점:");
		for(int j = 0; j < 3; j++) {
			totalScore = 0;
			for (int i = 0; i < score.length; i++) {
				totalScore += score[i][j];
			}
			System.out.print(totalScore + " ");
		}
		
		

	}

}
