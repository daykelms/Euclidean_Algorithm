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

		while (numb != 0 && numa !=0 ) {
			 
			temp = numb;
			numb = numa % numb;
			numa = temp;
		
		}
		System.out.println("The GCD is: " + (numa + numb));
	}

}
