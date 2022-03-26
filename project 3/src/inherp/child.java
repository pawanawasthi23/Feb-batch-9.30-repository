package inherp;

public class child extends parent
{
public void b1()
	{
		System.out.println("child method");
	}
public static void main(String[] args) {
	child obj=new child();
	obj.a();
	obj.a1();
	obj.b1();
	obj.age=54;
	System.out.println(obj.age);
}
	}


