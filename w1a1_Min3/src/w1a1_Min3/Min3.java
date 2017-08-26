package w1a1_Min3;

public class Min3 {

	public static void main(String[] args) {
		Min3(3,56,78);
	}
	public static void Min3(int min1, int min2, int min3) {
		int min = min1;
		if (min2 < min){
			min = min2;
		}  
		if (min3 < min){
			min = min3;
		}
		System.out.print("The smallest number of the three entered is: " + min);
	}

}
