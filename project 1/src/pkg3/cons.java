package pkg3;//4/d/2/3/1

public class cons {
public cons() {
this(1,2,3,4);
System.out.println("default constructor");
	
}
public cons(int a) {
	this(1,2,3);
	System.out.println("one parameterized constructor");
}
public cons(int a, int b) {
	this();
	System.out.println("two parameterized constructor");
}
public cons(int a, int b, int c) {
	this(1,2);
	System.out.println("three parameterized constructor");
}
public cons(int a, int b,int c,int d) {
	System.out.println("four parameterized constructor");
}
public static void main(String[] args) {
	cons obj=new cons(1);
	
}
}

