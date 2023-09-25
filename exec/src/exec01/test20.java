package exec01;

public class test20 {
	static double getDistance (int x, int y, int x1, int y1) {// 6번
		return Math.sqrt(((x - x1)*(x - x1)) + ((y - y1) * (y - y1)));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SutdaCards card1 = new SutdaCards(3,false);
		SutdaCards card2 = new SutdaCards();

		System.out.println(card1.info());
		System.out.println(card2.info());

		Student s = new Student("홍길동", 1, 1, 100, 60,76);
		s.name = "홍길동";// 3번
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		System.out.println("이름 : " + s.name);
		System.out.println("총점 : " + s.getTotal());
		System.out.println("평균 : " + s.getAverage());
		System.out.println(s.info());

		System.out.println(getDistance(1,1,2,2));

		MyPoint p = new MyPoint(1,1);
		System.out.println(p.getDistance(2, 2));
	}
}
class SutdaCards{ // 1, 2번
	int num;
	boolean isKwang;

	SutdaCards(){
		this(1,true);
	}

	SutdaCards(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}

	public String info(){
		return num + (isKwang == true ? "k" : "");
	}
}
class Student{ //4번
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public int getTotal() {
		return kor + eng + math;
	}
	public float getAverage() {
		return (int)(((kor + eng + math) / 3f) * 100 + 0.5f) / 100f ;
	}
	public String info() {
		return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math + ", " + getTotal() + ", " + getAverage() ;
	}
}
class MyPoint{
	int x;
	int y;

	MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	double getDistance (int x1, int y1) {// 7번
		return Math.sqrt(((x - x1)*(x - x1)) + ((y - y1) * (y - y1)));
	}
}