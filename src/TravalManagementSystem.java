import java.util.Scanner;

public class TravalManagementSystem {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while(num != 6) {
		System.out.println("***Travel Management System***");
		System.out.println("1. Add Travel ");
		System.out.println("2. Delete Travel ");
		System.out.println("3. Edit Travel ");
		System.out.println("4. View Travel ");
		System.out.println("5. Show a menu ");
		System.out.println("6. Exit");
		System.out.println("Select one number between 1 - 6");
		num = input.nextInt();
	    if(num==1) {
	    	addTravel();
	    }
    }
}		
	public static void addTravel() {
		Scanner input = new Scanner(System.in);
		System.out.println("���� ������ �����ǰǰ���?");
		String country = input.next();
		System.out.println("������ ���� �ǰ���?");
		int day = input.nextInt();
		System.out.println("�� ������ � ������ ��ð� �ͳ���?");
		String food = input.next();
		System.out.println("�ϰ� ���� Ȱ������ ������ �ֳ���?");
		String activity = input.next();
		System.out.println(country);
		System.out.println(day);
		System.out.println(food);
		System.out.println(activity);
	}

        	
        	
        	
        }