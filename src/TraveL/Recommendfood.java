package TraveL;

import java.util.Scanner;

public class Recommendfood extends Travel  {
	
	protected String recommendedfood;
	protected String recommendedactivity;
	

	public Recommendfood (TravelKind kind) {	
		super(kind);
	}
	 
	 public void getUserInput(Scanner input) {
		 setTravelCountry(input);
		 setTravelDay(input);	 
		 setTravelFoodeithYN(input);
		 setTravelActivity(input);
	}
	 
	 public void setTravelFoodeithYN(Scanner input) {
		 char answer = 'x';
			while(answer != 'y' && answer != 'Y' && answer != 'n'&& answer !='N')
			{
				System.out.print("Do you have a choice of food? (Y/N)");
				answer = input.next().charAt(0);
				if(answer == 'y' || answer == 'Y') {
					 setTravelFood(input);
					break;
				}
				else if(answer == 'n' || answer == 'N') {
					this.setFood(" ");
					break;
					
				} else {
					
				}
			}	
			answer = 'x';
			while(answer != 'y' && answer != 'Y' && answer != 'n'&& answer !='N')
			{
				System.out.print("Do you need a recommended food(restaurant)? (Y/N)");
				answer = input.next().charAt(0);
				if(answer == 'y' || answer == 'Y') {
					setTravelFood(input);
					break;
				}
				else if(answer == 'n' || answer == 'N') {
					this.setFood(" ");
					break;
					
				} else {
					
				}
			}
		 
	 }
	 public void printInfo() {
		 String skind = getKindString();
		   System.out.println("kind:"+ skind +" " + "country:" + country  +  " day:"+ day +  " food:" +  food  +   " activity:" +  activity + " recommende food:" +  food  +   " activity:" +  activity);
	   }
	 
	
}
