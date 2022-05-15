package TraveL;

import java.util.Scanner;

public abstract class Travel implements TravelInput {
	protected TravelKind kind = TravelKind.Recommendfood;
	protected String country;
	protected int day;
	protected String food;
	protected String activity;
	
	public Travel() {	
	}
	
	public Travel(TravelKind kind) {	
		this.kind = kind;
	}


   public Travel(String country, int day, String food, String activity) {
	   this.country = country;
	   this.day = day;
	   this.food = food;
	   this.activity = activity;
  }
   public Travel(TravelKind kind, String country, int day, String food, String activity) {
	   this.kind = kind;
	   this.country = country;
	   this.day = day;
	   this.food = food;
	   this.activity = activity;
  }
   public TravelKind getKind() {
		return kind;
	}
	public void setKind(TravelKind kind) {
		this.kind = kind;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public String getActivity() {
		return activity;
	}
	public void setActivity(String activity) {
		this.activity = activity;
	}
	
	 public abstract void printInfo();

	 public void setTravelCountry(Scanner input) {
		 System.out.println("Travel Country :");
		 String country = input.next();
		 this.setCountry(country);
	 }
	 
	 public void setTravelDay(Scanner input) {
		 System.out.println("Travel day :");
		 int day = input.nextInt();
		 this.setDay(day);
	 }
	 
	 public void setTravelFood(Scanner input) {
		 System.out.println("Travel food :");
		 String food = input.next();
		 this.setFood(food);
	 }
	 
	 public void setTravelActivity(Scanner input) {
		 System.out.println("Travel activity :");
		 String activity = input.next();
		 this.setActivity(activity);
	 }
	 
	 public String getKindString() {
		 String skind = "none";
		 switch(this.kind) {
		 case Allchoice:
			 skind = "A";
			 break;
		 case Recommendfood:
			 skind = "R.f";
			 break;
		 case Recommendactivity:
			 skind = "R.a";
			 break;
		default:
		}
		return skind; 
		 }
	 
  
}