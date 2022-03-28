import java.util.Scanner;

public class TravalManagementSystem {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while(num != 6) {
		System.out.println("***Travel Management System***");
		System.out.println("1. Add Travel ");
		System.out.println("2. Delete Travel ");
		System.out.println("3. Edit Travel ");
		System.out.println("4. View Travel ");
		System.out.println("5. Show a menu ");
		System.out.println("6. Exit");
		System.out.println("Select one number between 1 - 5");
		num = input.nextInt();
		switch(num) {
		case 1:
		
			System.out.println("어디로 떠나시나요?");
			String Contry =input.next();	
			break;
		case 2:
			
			System.out.println("어디로 떠나시나요?");
			String Contry1 =input.next();	
			break;
		case 3:
			
			System.out.println("어디로 떠나시나요?");
			String Contry2 =input.next();	
			break;
		case 4:
			
			System.out.println("어디로 떠나시나요?");
			String Contry3 =input.next();	
			break;
			
		}
  }
 }
}