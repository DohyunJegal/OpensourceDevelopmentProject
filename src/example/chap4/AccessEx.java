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
		// aClass.b = 10; b�� private�̹Ƿ� �� Ŭ�������� ������ �� ����.
		aClass.c = 10;
	}
}