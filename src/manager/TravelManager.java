package manager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import TraveL.AllchoiceTravel;
import TraveL.Recommendactivity;
import TraveL.Recommendfood;
import TraveL.Travel;
import TraveL.TravelInput;
import TraveL.TravelKind;


public class TravelManager implements Serializable {
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 163205160290728555L;

	ArrayList <TravelInput> travels = new ArrayList<TravelInput>();
	transient Scanner input;
	
	TravelManager(Scanner input){
		this.input=input;
	}
	
	public void setScanner(Scanner input) {
		this.input= input;
	}
	
	public void addTravel(String country, int day, String food, String activity) {
		  TravelInput travelInput = new AllchoiceTravel (TravelKind.Allchoice);
		  travelInput.getUserInput(input);
		  travels.add(travelInput);	
	}
	
	public void addTravel(TravelInput travelInput) {
		  travels.add(travelInput);	
	}
	
	
	public void addTravel() {
		int kind = 0;
		TravelInput travelInput;
		while(kind < 1 || kind > 3) {
		 try {
			 System.out.println("go into add travels in while");
			 System.out.println("1 for All choice");
			 System.out.println("2 for Food is not decided");
			 System.out.println("3 for Activity is not decided");
			 System.out.println("Select num 1, 2 or 3 for Travel kind ");
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
		 catch(InputMismatchException e) {
			 System.out.println("Please put an integer between 1 and 3!");
				if(input.hasNext()) {
					input.next();
				}
				kind = -1;
			 
		 }
		}
		
	}
	public void deleteTravel() {
        System.out.print("어디로 여행을 떠나실건가요?");
		String country = input.next();
		int index = findIndex(country);
		removefromTravel(index, country);
	}
	
	public int findIndex(String country) {
		int index=-1;
		for(int i=0; i<travels.size(); i++) {
			  if(travels.get(i).getCountry().equals(country)) {
		        	index=i;
		        	break;
		       }
		}
		return index;
	}
	
	public void removefromTravel(int index, String country) {
		if(index>=0) {
			travels.remove(index);
			System.out.println(country + " 여행이 취소되었습니다.");
			return ;
		}
		else {
			System.out.println("여행지 등록이 안되었습니다.");
			return ;
	} 	
		
	}
	
	public void editTravel() {
		System.out.print("어디로 여행을 떠나실건가요?");
		String country = input.next();
		for(int i=0; i<travels.size(); i++) {
			TravelInput travel = travels.get(i);
		      if((travel.getCountry()).equals(country)) {
			    int num=-1;
			      while(num != 5) {
			    	showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						travel.setTravelCountry(input);
						break;
					case 2:
						travel.setTravelDay(input);
						break;
					case 3:
						travel.setTravelFood(input);
						break;
					case 4:
						travel.setTravelActivity(input);
						break;
					default:	
						continue;
					} 
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
    
    public int size() {
    	return travels.size();
    }
    
    public TravelInput get(int index) {
    	return (Travel) travels.get(index);
    }
     
     public void showEditMenu() {
    	 System.out.println("**Travel Info Edit Menu**");
			System.out.println("1. Edit Country ");
			System.out.println("2. Edit Day ");
			System.out.println("3. Edit Food ");
			System.out.println("4. Edit Activity ");
			System.out.println("5. Exit");
			System.out.println("Select one number between 1 - 5");
    	 
     }
		
	}

	
	
	
	