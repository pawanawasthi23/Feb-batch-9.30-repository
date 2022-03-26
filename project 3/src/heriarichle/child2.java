package heriarichle;

public class child2 extends father {
	public void c1()
	{
		System.out.println("child2 method");
	}
	public static void main(String[] args) {
		child2 obj=new child2();
		obj.a1();
		obj.c1();
	}
}


