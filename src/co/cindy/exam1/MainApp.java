package co.cindy.exam1;

public class MainApp {
	public static void main(String[] args) {
		MethodTest methodTest = new MethodTest();
		methodTest.strTest(); //void type ȣ��
		
		String name = methodTest.strTest2();
		System.out.println(name); //return type ȣ��
		
		String str = methodTest.strTest3();
		System.out.println(str);
	}
}
