
public class Travel {
	
	String country;
	int day;
	String food;
	String activity;

	public Travel() {
		
	}
	public Travel(String country, int day) {
		this.country = country;
		this.day = day;
	}

   public Travel(String country, int day, String food, String activity) {
	
	this.country = country;
	this.day = day;
	this.food = food;
	this.activity = activity;
}
   public void printInfo() {
	 System.out.println("coutry:"+ country + "day:"+ day + "food:"+ food + "activity:"+ activity);
 }
}