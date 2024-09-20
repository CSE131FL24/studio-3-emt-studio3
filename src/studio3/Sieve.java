package studio3;

import java.util.Arrays;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Number: " );
		int num = in.nextInt(); //put number in
		boolean[] array = new boolean[num+1]; //boolean array w/ size num+1 w/ initialized values false
		Arrays.fill(array, true); //initializes array to all true values
		array[0] = false; //0 is not a prime
		array[1] = false; //1 is not a prime
		
		for (int i = 2; i <= num; i++) { //goes through indexes of the array until it reaches last number
            int multiplier = 2;
			while (multiplier <= (num / i)) { //multiplies until reaches biggest multiple less than num
            	array[multiplier * i] = false;
            	multiplier++;
            }
        }
		
		int[] primes = new int[num+1]; //makes new array for primes
		int index = 0; //starts at 0
		for (boolean prime : array) {
			if ((prime == true) && (index <= num)) { //looks for prime numbers
				primes[index] = index; //replaces value w/ index number
				System.out.print(index + " ");
			}
			else {}
			index++;
		}
	}

}
