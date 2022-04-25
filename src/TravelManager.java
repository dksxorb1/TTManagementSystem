import java.util.ArrayList;
import java.util.Scanner;
import TraveL.Travel;

public class TravelManager {
	ArrayList <Travel> travels = new ArrayList<Travel>();
	
	Scanner input;
	
	TravelManager(Scanner input){
		this.input=input;
		
	}
	public void addTravel() {
		int kind = 0;
		Travel travel;
		while(kind != 1 && kind!=2) {
		 System.out.println("1 for Asia");
		 System.out.println("2 for Europe");
		 System.out.println("Select num for Travel Kind between 1 and 2: ");
		 kind = input.nextInt();
		 if(kind==1) {
			  travel = new Travel();
			  travel.getUserInput(input);
			  travels.add(travel);	
			 break;
		 }
		 else if(kind==2) {
			 travel = new Travel();
			 travel.getUserInput(input);
			 travels.add(travel);	
			 break;
		 }
		 else {
			 System.out.println("Select num for Travel Kind between 1 and 2: ");
			 
		 }
		}
		
	}
	public void deleteTravel() {
        System.out.print("어디로 여행을 떠나실건가요?");
		String country = input.next();
		int index=-1;
		for(int i=0; i<travels.size(); i++) {
			  if(travels.get(i).getCountry().equals(country)) {
		        	index=i;
		        	break;
		        	
			  }
		}
		if(index>=0) {
			travels.remove(index);
			System.out.println(country + " 여행이 취소되었습니다.");
		}
		else {
			System.out.println("여행지 등록이 안되었습니다.");
			return;
	} 	
}
	public void editTravel() {
		System.out.print("어디로 여행을 떠나실건가요?");
		String country = input.next();
		for(int i=0; i<travels.size(); i++) {
			Travel travel = travels.get(i);
		      if((travel.getCountry()).equals(country)) {
			    int num=-1;
			      while(num != 5) {
					System.out.println("**Travel Info Edit Menu**");
					System.out.println("1. Edit Country ");
					System.out.println("2. Edit Day ");
					System.out.println("3. Edit Food ");
					System.out.println("4. Edit Activity ");
					System.out.println("5. Exit");
					System.out.println("Select one number between 1 - 5");
					num = input.nextInt();
					if(num==1) {
						System.out.println("Travel Country");
						String country1 = input.next();
						travel.setCountry(country);
					}
					else if(num==2) {
						System.out.println("Travel Day");
						int day =input.nextInt();
						travel.setDay(day);

					}
					else if(num==3) {
						System.out.println("Local Food");
						String food =input.next();
						travel.setFood(food);

					}
					else if(num==4) {
						System.out.println("Activity");
						String activity =input.next();
						travel.setActivity(activity);

					}
					else {
						continue;
					} //if
	      	     }//while
			 break;
		 }//if
		}//for
	}
     public void viewTravels() {
//    	System.out.print("어디로 여행을 떠나실건가요?");
// 		String country = input.next();
// 
 	//	 if((travel.country).equals(country)) {
 			for(int i=0; i<travels.size(); i++) {
 				travels.get(i).printInfo();
 		 }
   }
 		
		
	}

	
	
	
	


