package multiinher;

public class CHI extends FATHER {
int age2;
public void c()
{
	System.out.println("child method");
}
public static void main(String[] args) {
	CHI obj= new CHI();
	obj.a();
	obj.b();
	obj.c();
	obj. age=65;
	
	System.out.println(obj.age);
	obj.age1=45;
	System.out.println(obj.age1);
	obj.age2=23;
	System.out.println(obj.age2);
	
	
	
}
	
}




