package TraveL;

import java.util.Scanner;

 public class Asia extends Travel {

	 public void getUserInput(Scanner input) {
		   System.out.print("어디로 여행을 떠나실건가요?");
			String country = input.next();
			this.setCountry(country);
			
			
			char answer = 'x';
			while(answer != 'y' && answer != 'Y' && answer != 'n'&& answer !='N')
			{
				System.out.print("1박 이상을 하시나요? (Y/N");
				answer = input.next().charAt(0);
				if(answer == 'y' || answer == 'Y') {
					System.out.print("몇일을 가실 건가요?");
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
				System.out.print("그 나라의 어떤 음식을 드시고 싶나요?");
				String food = input.next();
				this.setFood(food);
			
				System.out.print("하고 싶은 활동들은 무엇이 있나요?");
				String activity = input.next();
				this.setActivity(activity);
			
			}
	   

}
