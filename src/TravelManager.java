import java.util.Scanner;

public class TravelManager {
	Travel travel;
	
	Scanner input;
	
	TravelManager(Scanner input){
		this.input=input;
		
	}
	public void addTravel() {
		travel = new Travel();
	
		System.out.print("���� ������ �����ǰǰ���?");
		travel.country = input.next();
		System.out.print("������ ���� �ǰ���?");
		travel.day = input.nextInt();
		System.out.print("�� ������ � ������ ��ð� �ͳ���?");
		travel.food = input.next();
		System.out.print("�ϰ� ���� Ȱ������ ������ �ֳ���?");
		travel.activity = input.next();
	}
	public void deleteTravel() {
        System.out.print("���� ������ �����ǰǰ���?");
		String country = input.next();
		if (travel==null) {
			System.out.println("������ ����� �ȵǾ����ϴ�.");
			return;
		}
        if(travel.country==country) {
        	travel=null;
        	System.out.println("�������� �����Ǿ����ϴ�.");
        }
        	
        	
        }
	public void editTravel() {
		System.out.print("���� ������ �����ǰǰ���?");
		String country = input.next();
		 if(travel.country==country) {
	        System.out.println("�����Ͻ� ��������:" + country);
	        }
		
	}
     public void viewTravel() {
    	System.out.print("���� ������ �����ǰǰ���?");
 		String country = input.next();
 		 if(travel.country==country) {
 	        travel.printInfo();
 	        }
 		
		
	}
}
	
	
	
	


