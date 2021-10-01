package example.chap4;

class Sample {
	public int a;
	private int b;
	int c;
}

public class AccessEx {
	public static void main(String[] args) {
		Sample aClass = new Sample();
		aClass.a = 10;
		// aClass.b = 10; b는 private이므로 이 클래스에서 접근할 수 없다.
		aClass.c = 10;
	}
}