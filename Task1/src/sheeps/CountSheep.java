package sheeps;
import java.util.Scanner;
public class CountSheep {

	public static void count(int number) {
		for(int i=1; i<=number; i++) {
			System.out.print(i+" Sheep...");
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner object = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number = object.nextInt();
		count(number);
		
			
		}

	

}
