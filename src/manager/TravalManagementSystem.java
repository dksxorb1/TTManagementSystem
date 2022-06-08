package manager;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;
import log.EventLogger;

public class TravalManagementSystem {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		TravelManager travelManager = getObject("travelmanager.ser");
		if(travelManager == null) {
			travelManager = new TravelManager(input);
		} 
	
		
		WindowFrame frame = new WindowFrame(travelManager);
		selectMenu(input, travelManager);
		putObject(travelManager, "travelmanager.ser");
		
		
	}
	public static void selectMenu(Scanner input, TravelManager travelManager) {
		int num = -1;
		while(num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					travelManager.addTravel();
					logger.log("add a travel");
					break;
				
				case 2: 
					travelManager.deleteTravel();
					logger.log("delete a travel");
					break;
				
				case 3: 
					travelManager.editTravel();
					logger.log("edit a travel");
					break;
					
				case 4:
					travelManager.viewTravels();
					logger.log("view a list of travel");
					break;
					
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
		
	}
	
	public static void showMenu() {
		System.out.println("***Travel Management System***");
		System.out.println("1. Add Travel ");
		System.out.println("2. Delete Travel ");
		System.out.println("3. Edit Travel ");
		System.out.println("4. View Travels ");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1 - 5");
	}
	
	public static TravelManager getObject(String filename) {
		TravelManager travelManager = null;
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			travelManager = (TravelManager) in.readObject();
			
			in.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			return travelManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return travelManager;
	}
	
	public static void putObject(TravelManager travelManager,String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(travelManager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}