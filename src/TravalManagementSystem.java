import java.util.InputMismatchException;
import java.util.Scanner;

public class TravalManagementSystem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		TravelManager travelManager = new TravelManager(input);
		
		selectMenu(input, travelManager);
		
		
	}
	public static void selectMenu(Scanner input, TravelManager travelManager) {
		int num = -1;
		while(num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					travelManager.addTravel();
					break;
				
				case 2: 
					travelManager.deleteTravel();
					break;
				
				case 3: 
					travelManager.editTravel();
					break;
					
				case 4:
					travelManager.viewTravels();
					break;
					
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
				
				//system.exit(-1);
			}
		}
		
	}
	
	public static void showMenu() {
		System.out.println("***Travel Management System***");
		System.out.println("1. Add Travel ");
		System.out.println("2. Delete Travel ");
		System.out.println("3. Edit Travel ");
		System.out.println("4. View Travels ");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1 - 5");
	}
} 
	