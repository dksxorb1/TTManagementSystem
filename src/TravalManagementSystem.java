import java.util.Scanner;

public class TravalManagementSystem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		TravelManager travelManager = new TravelManager(input);
		
		int num = -1;
		while(num != 5) {
		System.out.println("***Travel Management System***");
		System.out.println("1. Add Travel ");
		System.out.println("2. Delete Travel ");
		System.out.println("3. Edit Travel ");
		System.out.println("4. View Travel ");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1 - 5");
		num = input.nextInt();
	    if(num==1) {
	    	travelManager.addTravel();
	    }
	    else if(num==2) {
	    	travelManager.deleteTravel();
	    }
	    else if(num==3) {
	    	travelManager.editTravel();
	    }
	    else if(num==4) {
	    	travelManager.viewTravel();
	    }
	    else {
	    	continue;
	    }
		}
	}
} 
	