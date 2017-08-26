package w1p3_Class_Call;

public class ThisClass {
	public static void main(String[] args) {
		String words = "this is being printed from a different class";
		ThatClass.thatPrint(words);
	}
}
