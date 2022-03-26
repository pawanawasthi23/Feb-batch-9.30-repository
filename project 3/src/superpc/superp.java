package superpc;
//3ppm/dp/1ppm/2ppm/cd/3cpm/1cpm/2cpm
public class superp {
public void a() {
	System.out.println("parent default method");
}
public void a1(int a)
{
	System.out.println("parent one parameterized method");
}
public void a2(int a, int b)
{
	this.a3(1,2,3);
	this.a();
	this.a1(1);
	System.out.println("parent two parameterized method");
}
public void a3(int a, int b, int c)
{
	System.out.println("parent three parameterized method");
}

}