package TraveL;

import java.util.Scanner;

public class Travel {
	protected TravelKind kind = TravelKind.Asia;
	
	protected String country;
	protected int day;
	protected String food;
	protected String activity;
	
	public Travel() {
		
	}


   public Travel(String country, int day, String food, String activity) {
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
   public void printInfo() {
	   System.out.println("country:" + country  +  " day:"+ day +  " food:" +  food  +   " activity:" +  activity);
   }


   public void getUserInput(Scanner input) {
	   System.out.print("���� ������ �����ǰǰ���?");
		String country = input.next();
		this.setCountry(country);
		
		System.out.print("������ ���� �ǰ���?");
		int day = input.nextInt();
		this.setDay(day);
		
		System.out.print("�� ������ � ������ ��ð� �ͳ���?");
		String food = input.next();
		this.setFood(food);
		
		System.out.print("�ϰ� ���� Ȱ������ ������ �ֳ���?");
		String activity = input.next();
		this.setActivity(activity);
		
		
   }
}