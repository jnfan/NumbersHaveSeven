//This class will count numbers from 1 to n that have 7 as a digit
import java.util.Scanner;

public class CountNumWith7 {
	public static void main(String[] args) {
		Scanner inputNum = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = inputNum.nextInt();
		System.out.println(countSevens(num));
	}
	
	//This method loops from 1 to n and uses the method haveSeven to check how many numbers have 7
	private static int countSevens(int num) {
		int count = 0;
		for(int i = 1; i <= num; i++) {
			if(haveSeven(i)) {
				count++;
			}
		}
		return count;
	}
	
	//This method is to check if a number has 7 as a digit
	private static boolean haveSeven(int num) {
		while(num > 0) {
			if(num % 10 == 7) {
				return true;
			}
			num /= 10;	
		}
		return false;
	}
}

/* Test Cases:
 * input = 5, count = 0;
 * input = 7, count = 1;
 * input = 27, count = 3
 * input = 77, count = 15; //7,17,27,37,47,57,67,70,71,72,73,74,75,76,77
 * input = 177, count = 34; // 9(7~97 except 7~) + 10(7~) + 7(107~167) + 8(170-177) = 34
 * input = 777, count = 211; //19 * 7(7,17...70,71...79...97,107...170...679) + 78(from 700 to 777) = 
 * input = 7777, count = 2675; //7 * (19 * 9 + 100)(numbers have 7 in every 1000 before 7000) + 778(numbers after 7000 before 8000 all have 7) = 2675
 */ 
