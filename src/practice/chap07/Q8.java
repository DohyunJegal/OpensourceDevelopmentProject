package practice.chap07;
import java.util.*;

public class Q8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> hash = new HashMap<String, Integer>();

		System.out.println("** ����Ʈ ���� ���α׷��Դϴ� **");

		while (true) {
			System.out.print("�̸��� ����Ʈ �Է� >> ");
			String name = scanner.next();

			if (name.equals("�׸�"))
				break;

			int point = scanner.nextInt();

			if (hash.get(name) == null) {
				hash.put(name, point);
			} else {
				hash.put(name, hash.get(name) + point);
			}

			Set<String> key = hash.keySet();
			Iterator<String> it = key.iterator();

			while (it.hasNext()) {
				String person = it.next();
				Integer sum = hash.get(person);
				System.out.print("(" + person + "," + sum + ")");
			}
			System.out.println();
		}
		scanner.close();
	}
}