package w1a1_JustStuff4;

public class XXX {

	public static void main(String[] args) {
		int num = countXX("xxxx");
		System.out.println("XX repeated " + num + " times.");
	}
	public static int countXX(String letters) {
		int num = 0;
		for (int i = 0; i < (letters.length()-1); i++) {
			String a = letters.substring(i,(i+2));
			if (a.equals("xx")) {
				num++;
			}
		}
		return num;
	}
}
