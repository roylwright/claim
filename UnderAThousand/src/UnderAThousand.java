
public class UnderAThousand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		int i = 0;
		
	while (i<1000) {
		if (( i % 3 == 0 ) | ( i % 5 == 0 ))
		     x = x + i;
		i++;
	}
	System.out.println("The total is " + x);
	}	
	

}
