package w1a1_Max3;

public class Assignment1 {

	public static void main(String[] args) {
		Max3(113,1156,78);
	}
	public static void Max3(int max1, int max2, int max3) {
		int max = max1;
		if (max2 > max){
			max = max2;
		}  
		if (max3 > max){
			max = max3;
		}
		System.out.print("The largest number of the three entered is: " + max);
	}
}
