package TraveL;

import java.util.Scanner;

public interface TravelInput {
	public void setCountry(String country);
	
	public void setDay(int day);
	
	public void setFood(String food);
	
	public void setActivity(String activity) ;
	
	public String getCountry();
	
	public void getUserInput(Scanner input);

	public void printInfo(); 
	
	public void setTravelCountry(Scanner input);
	
	public void setTravelDay(Scanner input);

	 public void setTravelFood(Scanner input);
	
	 public void setTravelActivity(Scanner input);
	
}