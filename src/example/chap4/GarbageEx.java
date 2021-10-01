package example.chap4;

public class GarbageEx {
	public static void main(String[] args) {
		String a = new String("Good");
		String b = new String("Bad");
		String c = new String("Normal");
		String d, e;

		a = null; // garbage ¹ß»ý
		d = c;
		c = null;
	}
}