package TraveL;

import java.util.Scanner;

 public class Asia extends Travel {

	 public void getUserInput(Scanner input) {
		   System.out.print("���� ������ �����ǰǰ���?");
			String country = input.next();
			this.setCountry(country);
			
			
			char answer = 'x';
			while(answer != 'y' && answer != 'Y' && answer != 'n'&& answer !='N')
			{
				System.out.print("1�� �̻��� �Ͻó���? (Y/N");
				answer = input.next().charAt(0);
				if(answer == 'y' || answer == 'Y') {
					System.out.print("������ ���� �ǰ���?");
					int day = input.nextInt();
					this.setDay(day);
					break;
				}
				else if(answer == 'n' || answer == 'N') {
					this.setDay(answer);
					break;
					
				} else {
					
				}
			}	
				System.out.print("�� ������ � ������ ��ð� �ͳ���?");
				String food = input.next();
				this.setFood(food);
			
				System.out.print("�ϰ� ���� Ȱ������ ������ �ֳ���?");
				String activity = input.next();
				this.setActivity(activity);
			
			}
	   

}
