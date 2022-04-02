import java.util.Scanner;

public class TravelManager {
	Travel travel;
	
	Scanner input;
	
	TravelManager(Scanner input){
		this.input=input;
		
	}
	public void addTravel() {
		travel = new Travel();
	
		System.out.print("어디로 여행을 떠나실건가요?");
		travel.country = input.next();
		System.out.print("몇일을 가실 건가요?");
		travel.day = input.nextInt();
		System.out.print("그 나라의 어떤 음식을 드시고 싶나요?");
		travel.food = input.next();
		System.out.print("하고 싶은 활동들은 무엇이 있나요?");
		travel.activity = input.next();
	}
	public void deleteTravel() {
        System.out.print("어디로 여행을 떠나실건가요?");
		String country = input.next();
		if (travel==null) {
			System.out.println("여행지 등록이 안되었습니다.");
			return;
		}
        if(travel.country==country) {
        	travel=null;
        	System.out.println("여행지가 삭제되었습니다.");
        }
        	
        	
        }
	public void editTravel() {
		System.out.print("어디로 여행을 떠나실건가요?");
		String country = input.next();
		 if(travel.country==country) {
	        System.out.println("선택하신 여행지는:" + country);
	        }
		
	}
     public void viewTravel() {
    	System.out.print("어디로 여행을 떠나실건가요?");
 		String country = input.next();
 		 if(travel.country==country) {
 	        travel.printInfo();
 	        }
 		
		
	}
}
	
	
	
	


