/**
 * 
 */
package euclidean_algorithm;

import java.util.Scanner;

/**
 * @author Daykel
 *
 */
public class Euclidean_Algorithm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp =0;
		
		Scanner kb = new Scanner(System.in);

		System.out.println("Please enter the first value");
		int numa = kb.nextInt();
		System.out.println("Please enter the second value");
		int numb = kb.nextInt();
	/* At the nth iteration the variable numb holds the latest remainder n−1, whereas the variable numa holds its predecessor n-2.
         * At the end of the loop, the variable numb holds the remainder n, whereas the variable numa holds its predecessor, n−1.
         */

		while (numb != 0 && numa !=0 ) {
			 
			temp = numb;
			numb = numa % numb;
			numa = temp;
		
		}
		System.out.println("The GCD is: " + (numa + numb));
	}

}
