package pkg1;

public class p1 {
int age=23;
int rollno=321;
public void a() {
	System.out.println("welcome to all of you");
}
public void b() {
	System.out.println("automation is very easy");
}
public static void main(String[] args) {
	p1 obj=new p1();
	obj.a();
	obj.b();
	System.out.println(obj.age);
	System.out.println(obj.rollno);
	obj.age=12;
	System.out.println(obj.age);
	obj.rollno=21;
	System.out.println(obj.rollno);
	
	
}
}
