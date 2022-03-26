package pakage1;

public class student {
	int a = 12;
	int b =43;
	public void guruji() {
		System.out.println("try hard to learn");
	}
	public static void main(String[] args) {
		student raghav=new student();
		raghav.guruji();
		System.out.println(raghav.a);
		System.out.println(raghav.b);
		raghav.a=23;
		System.out.println(raghav.a);
		raghav.b= 54;
		System.out.println(raghav.b);
				
		
	}
}