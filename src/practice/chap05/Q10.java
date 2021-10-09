package practice.chap05;

abstract class PairMap{
	protected String keyArray [];
	protected String valueArray[];
	abstract String get(String key);
	abstract void put(String key, String value);
	abstract String delete(String key);
	abstract int length();
}

class Dictionary extends PairMap{
	protected int size, num = 0;
	
	public Dictionary(int size) {
		this.size = size;
		keyArray = new String[size];
		valueArray = new String[size];
	}
	@Override
	public void put(String key, String value) {
		for(int l = 0; l < size ; l++) {
			if(key.equals(keyArray[l])) {
				keyArray[l] = key;
				valueArray[l] = value;
			}
		}
		
		if(num < size) {
			keyArray[num] = key;
			valueArray[num++] = value;
		}
	}
	@Override
	public String get(String key) {
		for(int i = 0; i < size; i++) {
			if(key.equals(keyArray[i]))
				return valueArray[i];
		} return null;
	}
	@Override
	public String delete(String key) {
		String tmp;
		
		for(int j = 0; j < size; j++) {
			if(key.equals(keyArray[j])) {
				tmp = valueArray[j];
				valueArray[j] = null;
				keyArray[j] = null;
				return tmp;
			}
		} return null;
	}
	@Override
	public int length() {
		int count = 0;
		
		for(int k = 0; k < size; k++) {
			if(keyArray[k] != null)
				count++;
		}
		
		return count;
	}
}

public class Q10 {
	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("황기태", "자바");
		dic.put("이재문", "파이선");
		dic.put("이재문", "C++");
		System.out.println("이재문의 값은 " + dic.get("이재문"));
		System.out.println("황기태의 값은 " + dic.get("황기태"));
		dic.delete("황기태");
		System.out.println("황기태의 값은 " + dic.get("황기태"));
	}
}
