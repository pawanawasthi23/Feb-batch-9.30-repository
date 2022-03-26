package pkg2;//(((((10/2)-2)+2)-2)*2)

public class Ass2 {
public int div(int a, int b) {
	int c=a/b;
	return c;
	
}
	public int sub(int a , int b) {
		int c=a-b;
		return c;
		
	}
	public int sum(int a, int b) {
		int c=a+b;
		return c;
		
	}
	public void mul(int a, int b) {
		int c=a*b;
		System.out.println("result of mul " +c);
		
	}
	public static void main(String[] args) {
		Ass2 obj=new Ass2();
		int div1=obj.div(10, 2);
		int sub=obj.sub(div1, 2);
		int sum=obj.sum(sub,2);
		int sub2=obj.sub(sum,2);
		obj.mul(sub2, 2);
		
		
	}
}



