package staticpoly;

public class class1 {
public void sum(int a, int b)
{
	int c;
	c=a+b;
	System.out.println("sum of result "+c);
}
public void sum(float a, float b)
{
	float c;
	c=a+b;
	System.out.println("sum of result "+c);
}
public static void main(String[] args) {
	class1 obj=new class1();
	obj.sum(12, 13);
	obj.sum(12.3f, 12.6f);
	System.out.println("change done by pawan");
}
}
