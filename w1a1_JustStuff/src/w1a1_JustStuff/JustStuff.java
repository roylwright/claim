package w1a1_JustStuff;

public class JustStuff {

	public static void main(String[] args) {
		
	int result = sum(2,3);
	System.out.print(result);

	}
	public static int sum(int a, int b) {
		String stringofA = a + "";
		int sum = a+b;
		String stringofSum = String.valueOf(sum);
		if(stringofA.length()==stringofSum.length()) {
			return sum;
		} else {
			return a;
		}
	}
}
