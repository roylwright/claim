package w1a1_JustStuff5;

public class PeteAndRepete {

	public static void main(String[] args) {
		stringTimes("hi", 1);
	}
	public static void stringTimes(String word, int count) {
		for(int i =0; i<count; i++) {
			System.out.print(word);
		}
	}
}
