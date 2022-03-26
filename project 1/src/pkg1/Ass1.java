package pkg1;//solve Ass 1 (((((10+2)+2)-2)*2)/2)

public class Ass1 {


public int sum(int a,int b) {
	int c= a+b;
	return c;
}
public int sub(int a, int b) {
	int c=a-b;
	return c;
	
	
}
public int mul(int a, int b) {
	int c=a*b;
	return c;
	
}
public void div(int a,int b) {
	int c=a/b;
	System.out.println("result of divison "+c );
}
public static void main(String[] args) {
	Ass1 obj=new Ass1();
	int sum1=obj.sum(10,2 );
	int sum2=obj.sum( sum1,2);
	int sub=obj.sub(sum2, 2);
	int mul=obj.mul(sub, 2);
	obj.div(mul, 2);
	
	
}
}


	
	

			
	
	

