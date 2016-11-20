import java.util.Scanner;

/**
 * 
 */

/**
 * @author DivyaVipin
 *
 */
public class Sum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num1,num2;
        int sum=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: "+"\n");
	    num1 = in.nextInt();
	    System.out.print("Enter second number: "+"\n");
	    num2= in.nextInt();
	    sum = Integer.sum(num1,num2);
	    System.out.println("Sum of two numbers is "+sum);
		
		
	}

}
