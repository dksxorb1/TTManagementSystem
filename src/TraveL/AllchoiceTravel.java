package TraveL;

import java.util.Scanner;

public class AllchoiceTravel extends Travel {
	
	public AllchoiceTravel (TravelKind kind) {	
		super(kind);
	}

	 public void getUserInput(Scanner input) {
		   setTravelCountry(input);
		   setTravelDay(input);
		   setTravelFood(input);
		   setTravelActivity(input);
		   
			
	  }
	 public void printInfo() {
		 String skind = getKindString();
		 System.out.println("kind " + skind + " country:" + country  +  " day:"+ day +  " food:" +  food  +   " activity:" +  activity);
	 }
}