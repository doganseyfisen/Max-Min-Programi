import java.util.*;

/**
 * @author Doğan Seyfi Şen - 2022
 */

public class Driver {
	public static void main(String[] args) {
		int numArr[] = {1, -2, 35, -14, 5, 81, 23, -8};
		
		Arrays.sort(numArr);
		for(int i = 0; i < numArr.length; i++)
		System.out.print(numArr[i] + " \n");
		
		int min = numArr[0];
		int max = numArr[0];
		
		for(int i : numArr) {
			if(i < min) {
				min = i;
			}
			if(i > max) {
				max = i;
			}
		}
		
		System.out.println("Minimum değer= " + min);
		System.out.println("Maximum değer= " + max);
	}
}
