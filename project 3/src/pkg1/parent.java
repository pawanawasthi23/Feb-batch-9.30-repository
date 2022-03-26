package pkg1;//pdc/2ppc/3ppc/1ppc/c3pc/1cpc/2cpc/cdc

public class parent {
public parent() {
	System.out.println("parent default constructor");
}

 public parent(int a)
 {
	this(1,2,3);
	System.out.println("parent one parameterized constructor");
 }
 public parent(int a, int b)
 {
	 this();
	 System.out.println("parent two parameterized constructor");
	 
 }
 public parent(int a, int b ,int c)
 {
	 this(1,2);
	System.out.println("parent three parameterized"); 
 }

	}

