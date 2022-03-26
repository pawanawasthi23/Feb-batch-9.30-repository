package pkg3;

import java.net.PasswordAuthentication;

public class pawan {
public pawan() {
	System.out.println("Default constructor");
}
public pawan(int a) {
	
	System.out.println("one parameterized constructor");
}
public pawan(int a, int b) {
	System.out.println("two parameterized constructor");
}
public static void main(String[] args) {
	pawan obj=new pawan();
	pawan obj1 =new pawan(1);
	pawan obj2=new pawan(1,2);
}
}
