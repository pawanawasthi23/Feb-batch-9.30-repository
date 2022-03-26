package superpc;
//3ppm/dp/1ppm/2ppm/cd/3cpm/1cpm/2cpm
public class superc extends superp {
	public void b()
	{
		super.a2(1, 2);
		System.out.println("child default method");
	}
	public void b1(int a)
	{
		System.out.println("child one parameterized method");
	}
	public void b2(int a, int b)
	{
		this.b();		
		this.b3(1,2,3);
		this.b1(1);
		System.out.println("child two parameterized method");
		
	}
	public void b3(int a, int b, int c)
	{
		System.out.println("child three parameterized method");
	}
	public static void main(String[] args) {
		superc obj=new superc();
		obj.b2(1, 2);
	}
}
