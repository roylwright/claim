package w1a1_IsFactor;

public class IsFactor {

	public static void main(String[] args) {
		isFactor(23,46);

	}

	private static void isFactor(int k, int n) {
		if (n % k == 0) {
			System.out.print(k + " is a factor of " + n);
		} else {
			System.out.print(k + " is not a factor of " + n);
		}
		
	}

}