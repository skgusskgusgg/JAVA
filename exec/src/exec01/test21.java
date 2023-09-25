package exec01;
public class test21 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Products p1 = new Products();
		Products p2 = new Products();
		Products p3 = new Products();
		
		System.out.println("p1의 제품 번호(seral no)는 " + p1.serialNo);
		System.out.println("p2의 제품 번호(seral no)는 " + p2.serialNo);
		System.out.println("p3의 제품 번호(seral no)는 " + p3.serialNo);
	}

}
class Products{
	static int count = 0;
	int serialNo;
	
	{
		++count;
		serialNo = count;
	}
	public Products() {}
}
