package w1a1_JustStuff2;

public class Squirrels {

	public static void main(String[] args) {
		boolean play = squirrelPlay(95, true);
		System.out.print(play);
	}
	public static boolean squirrelPlay(int temp, boolean summer) {
		if (summer == true) {
			if (( temp >= 60)&&(temp <= 100)) {
				return true;
			} else {
				return false;
			}
		} else {
			if ((temp >= 60)&&(temp <= 90)){
				return true;
			} else {
				return false;
			}
		}
	}
}
