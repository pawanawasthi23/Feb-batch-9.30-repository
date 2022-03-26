package globalvariable;

public class gv {
int a;
public void m(int para)
{
	a=para;
	
}
public static void main(String[] args) {
	gv obj=new gv();
	obj.m(24);
	System.out.println(obj.a);
}
}
