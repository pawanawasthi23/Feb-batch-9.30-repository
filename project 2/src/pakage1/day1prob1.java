package pakage1;

public class day1prob1 {
int age;
int rollno;
public void display1() {
	System.out.println("wellcome all of you");
}
public void display2() {
	System.out.println("automation is very easy");
}

public static void main(String[] args) {
	day1prob1 rahul=new day1prob1();
	rahul.display1();
	rahul.display2();
	rahul.age=12;
	rahul.rollno=1234;	
	System.out.println(rahul.age);
	rahul.rollno=1234;
	System.out.println(rahul.rollno);
	
	
}
}
