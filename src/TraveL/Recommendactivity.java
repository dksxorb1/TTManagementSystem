
package TraveL;

import java.util.Scanner;

public class Recommendactivity extends Travel  {
	protected String recommendedfood;
	protected String recommendedactivity;
	

	public Recommendactivity (TravelKind kind) {	
		super(kind);
	}

	
	 public void getUserInput(Scanner input) {
		 setTravelCountry(input);
		 setTravelDay(input);
		 setTravelFood(input);
			   
					
				char answer = 'x';
				while(answer != 'y' && answer != 'Y' && answer != 'n'&& answer !='N')
				{
					System.out.print("Do you have a choice of activity? (Y/N)");
					answer = input.next().charAt(0);
					if(answer == 'y' || answer == 'Y') {
						setTravelActivity(input);
						break;
					}
					else if(answer == 'n' || answer == 'N') {
						this.setActivity(" ");
						break;
						
					} else {
						
					}
				}	
				answer = 'x';
				while(answer != 'y' && answer != 'Y' && answer != 'n'&& answer !='N')
				{
					System.out.print("Do you need a recommended activity? (Y/N)");
					answer = input.next().charAt(0);
					if(answer == 'y' || answer == 'Y') {
						System.out.print("추천활동을 입력해주세요: ");
						String activity = input.next();
						this.setActivity(activity);
						break;
					}
					else if(answer == 'n' || answer == 'N') {
						this.setActivity(" ");
						break;
						
					} else {
						
					}
				}	 
				
				

	}
	 public void printInfo() {
		 String skind = getKindString();
		   System.out.println("kind:"+ skind +" " + " country: " + country  +  " day : "+ day +  " food :" +  food  +   " activity :" +  activity + " food :" +  food  +   " recommended activity:" +  activity);
	   }

}
