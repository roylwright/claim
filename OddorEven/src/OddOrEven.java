import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");	
		int getnumber=scan.nextInt();
		System.out.println(getnumber);
		scan.close();
		
		  if ( getnumber % 2 == 0 )
		     System.out.println("This is an even number.");
		  else
		     System.out.println("This is an odd number.");
	}

}
