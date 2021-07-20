package co.cindy.prj;

public class Calcuator {
	public int sum(int a, int b) {
		return a + b;
	}

	public void sub(int a, int b) { // 함수 오버로딩
		System.out.println(a - b);
	}

	public void sub(float f, int b) {
		System.out.println(f - b);
	}

	public long sub(long l, long m) {
		return l - m;
	}
}
