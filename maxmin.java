import java.util.Scanner;

/**
 * @author Doğan Seyfi Şen - 2022
 */

public class Driver {
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int min = 0;
		int max = 0;
		System.out.print("Kaç adet tam sayı gireceksiniz?\nSayı adedi: ");
		int length = inp.nextInt();
		
		for (int i = 1; i <= length; i++) {
			System.out.print(i +". " + "tam sayıyı girin: ");
			int x = inp.nextInt();
			
			if(i == 1) {
				max = x;
				min = x;
			}else if(x <= min) {
				min = x;
			}else {
				max = x;
			}
			
		}
		
		System.out.print("Minimum tam sayı: " + min);
		System.out.print("\nMaksimum tam sayı: " + max);
	}
}
