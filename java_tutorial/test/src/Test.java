
public class Test {
	String[] weeks = {"mon","tue","wed","thu","fri","Sat","sun"};
	
	public void checkDay() {
		for (String day : weeks){ 
			System.out.println(day);
		}
	}
	public static void main(String[] args) {
		Test test = new Test();
		test.checkDay();
		
	}
}
