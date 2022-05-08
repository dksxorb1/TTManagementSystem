import java.util.ArrayList;
import java.util.Scanner;

import TraveL.AllchoiceTravel;
import TraveL.Recommendactivity;
import TraveL.Recommendfood;
import TraveL.Travel;
import TraveL.TravelInput;
import TraveL.TravelKind;

public class TravelManager {
	ArrayList <TravelInput> travels = new ArrayList<TravelInput>();
	
	Scanner input;
	
	TravelManager(Scanner input){
		this.input=input;
		
	}
	public void addTravel() {
		int kind = 0;
		TravelInput travelInput;
		while(kind != 1 && kind!=2) {
		 System.out.println("1 for All choice");
		 System.out.println("2 for Food is not decided");
		 System.out.println("3 for Activity is not decided");
		 System.out.println("Select num for Travel Kind between 1 and 3: ");
		 kind = input.nextInt();
		 if(kind==1) {
			  travelInput = new AllchoiceTravel (TravelKind.Allchoice);
			  travelInput.getUserInput(input);
			  travels.add(travelInput);	
			 break;
		 }
		 else if(kind==2) {
			 travelInput = new Recommendfood(TravelKind.Recommendfood);
			 travelInput.getUserInput(input);
			 travels.add(travelInput);	
			 break;
		 }
		 else if(kind==3) {
			 travelInput = new Recommendactivity(TravelKind.Recommendactivity);
			 travelInput.getUserInput(input);
			 travels.add(travelInput);	
			 break;
		 }
		 else {
			 System.out.println("Select num for Travel Kind between 1 and 3: ");
			 
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
			TravelInput travelInput = travels.get(i);
		      if((travelInput.getCountry()).equals(country)) {
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
						System.out.println("Which country will you edit to?");
						String country1 = input.next();
						travelInput .setCountry(country);
					}
					else if(num==2) {
						System.out.println("How long will you travel?");
						int day =input.nextInt();
						travelInput .setDay(day);

					}
					else if(num==3) {
						System.out.println("What food would you like to edit to?");
						String food =input.next();
						travelInput .setFood(food);

					}
					else if(num==4) {
						System.out.println("What activity would you like to edit to?");
						String activity =input.next();
						travelInput .setActivity(activity);

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
 			for(int i=0; i<travels.size(); i++) {
 				travels.get(i).printInfo();
 		 }
   }
 		
		
	}

	
	
	
	


