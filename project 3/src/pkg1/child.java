package pkg1;//pdc/2ppc/3ppc/1ppc/c3pc/1cpc/2cpc/cdc

public class child extends parent {

public child() {
	this(1,2);
	System.out.println("child default constructor");
}
public child(int a)
{
this(1,2,3);
System.out.println("child one parameterized constructor ");
}
public child(int a, int b)
{
	this(1);
	System.out.println("child two parameterized constructor");
	}
public child(int a, int b, int c)
{
	super(1);
	System.out.println("child three parameterized constructor");
}
public static void main(String[] args) {
	child obj=new child();
}
}

