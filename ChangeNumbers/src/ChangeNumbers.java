import java.util.Scanner;

//program would be more effective checking first then converting, but easier to write this way
public class ChangeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String first = "";
		String second = "";
		String third = "";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");	
		int getnumber=scan.nextInt();
		System.out.println(getnumber);
		int x = getnumber;
		scan.close();
		
		if (x<1) { second = "zero";
		} else if (x>99 & x<200) { third = "one hundred ";
		x = x-100;
		//^^ can insert "third placeholder" value here ^^ 100-999
		} 
		//under 100 below
		if (x>19 & x<30) { second = "twenty ";
			x = x-20; 
		} else if (x>29 & x<40) { second = "thirty ";
			x = x-30; 
		} else if (x>39 & x<50) { second = "forty ";
			x = x-40;
		} else if (x>49 & x<60) { second = "fifty ";
			x = x-50;
		} else if (x>59 & x<70) { second = "sixty ";
			x = x-60; 
		} else if (x>69 & x<80) { second = "seventy ";
			x = x-70; 
		} else if (x>79 & x<90) { second = "eighty ";
			x = x-80;
		} else if (x>89 & x<100) { second = "ninety ";
			x = x-90;
		}
		// ^^ can continue to check numbers higher than 19 and lower than 100 here ^^
		// under 20 below
		if (x<1) { first = "";
			} else if (x<2) { first = "one";
			} else if (x<3) { first = "two";
			} else if (x<4) { first = "three";
			} else if (x<5) { first = "four";
			} else if (x<6) { first = "five";
			} else if (x<7) { first = "six";
			} else if (x<8) { first = "seven";
			} else if (x<9) { first = "eight";
			} else if (x<10) { first = "nine";
			} else if (x<11) { first = "ten";
			} else if (x<12) { first = "eleven";
			} else if (x<13) { first = "twelve";
			} else if (x<14) { first = "thrirteen";
			} else if (x<15) { first = "fourteen";
			} else if (x<16) { first = "fifthteen";
			} else if (x<17) { first = "sixteen";
			} else if (x<18) { first = "seventeen";
			} else if (x<19) { first = "eighteen";
			} else if (x<20) { first = "nineteen";
			}
		  if (( getnumber % 3 == 0 ) | ( getnumber % 5 == 0 )) {
		     System.out.println( third + second + first);
		  } else System.out.println("Indivisible, with Liberty and justice for all.");
	}

}
