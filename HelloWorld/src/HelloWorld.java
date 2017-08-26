import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
	      System.out.println("Enter an integer ");
	      Scanner in = new Scanner(System.in);
	      x = in.nextInt();
	 
	      if ( x % 2 == 0 )
	         System.out.println("This is an even number.");
	      else
	         System.out.println("This is an odd number.");

	}

}
