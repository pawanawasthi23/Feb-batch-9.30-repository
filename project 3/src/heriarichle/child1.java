package heriarichle;

public class child1 extends father {

public void b1()
{
	System.out.println("child1 method");
}
public static void main(String[] args) {
	child1 obj=new child1();
	obj.a1();
	obj.b1();
}
}
