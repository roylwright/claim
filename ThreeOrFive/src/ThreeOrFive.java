import java.util.Scanner;

public class ThreeOrFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");	
		int getnumber=scan.nextInt();
		System.out.println(getnumber);
		scan.close();
		
		  if (( getnumber % 3 == 0 ) & ( getnumber % 5 == 0 )) {
		     System.out.println("This number is divisable by 3 and 5.");
		  } else if ( getnumber % 3 == 0 ) {
		     System.out.println("This number is divisable by 3.");
		  } else if ( getnumber % 5 == 0 ) {
			     System.out.println("This number is divisable by 5.");
		  } else System.out.println("This number is not divisable by either 3 nor 5.");
	}

}
