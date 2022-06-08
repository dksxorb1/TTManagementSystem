
package TraveL;

import java.util.Scanner;

public interface TravelInput {
	public String getCountry();
	
	public void setCountry(String country);
	
	public int getDay();
	
	public void setDay(int day);
	
	public String getFood();
	
	public void setFood(String food);
	
	public String getActivity();
	
	public void setActivity(String activity) ;
	
	public void getUserInput(Scanner input);

	public void printInfo(); 
	
	public void setTravelCountry(Scanner input);
	
	public void setTravelDay(Scanner input);

	 public void setTravelFood(Scanner input);
	
	 public void setTravelActivity(Scanner input);
	
}