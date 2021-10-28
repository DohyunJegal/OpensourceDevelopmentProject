package practice.chap07;
import java.util.*;

class Location {
	private String city;
	private int latitude, longitude;

	public Location(String city, int longitude, int latitude) {
		this.latitude = latitude;
		this.longitude = longitude;
		this.city = city;
	}
	public void show() {
		System.out.println(city + "\t" + longitude + "\t" + latitude);
	}
}

public class Q6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Location> hash = new HashMap<String, Location>();

		System.out.println("도시, 경도, 위도를 입력하세요.");

		for (int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String str = scanner.nextLine();

			StringTokenizer t = new StringTokenizer(str, ",");

			String city = t.nextToken().trim();
			int longitude = Integer.parseInt(t.nextToken().trim());
			int latitude = Integer.parseInt(t.nextToken().trim());
			hash.put(city, new Location(city, longitude, latitude));
		}

		Set<String> keys = hash.keySet();
		Iterator<String> it = keys.iterator();

		System.out.println("--------------------------");

		while (it.hasNext()) {
			String n = it.next();
			Location l = hash.get(n);
			l.show();
		}

		System.out.println("--------------------------");

		while (true) {
			System.out.print("도시 이름 >> ");
			String str = scanner.next();
			
			if (str.equals("그만")) {
				break;
			}

			if (hash.get(str) != null) {
				hash.get(str).show();
			}
			else {
				System.out.println(str + "는 없습니다.");
			}
		}

		scanner.close();
	}
}