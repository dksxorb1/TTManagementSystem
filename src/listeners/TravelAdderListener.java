package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import TraveL.AllchoiceTravel;
import TraveL.TravelInput;
import TraveL.TravelKind;
import manager.TravelManager;

public class TravelAdderListener implements ActionListener {
	
	JTextField fieldCountry;
	JTextField fieldDay;
	JTextField fieldFood;
	JTextField fieldActivity;
	TravelManager travelManager;
	
	public TravelAdderListener(
			JTextField fieldCountry, 
			JTextField fieldDay, 
			JTextField fieldFood,
			JTextField fieldActivity,
			TravelManager travelManager) {
		this.fieldCountry = fieldCountry;
		this.fieldDay = fieldDay;
		this.fieldFood = fieldFood;
		this.fieldActivity = fieldActivity;
		this.travelManager = travelManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		TravelInput travel = new AllchoiceTravel(TravelKind.Allchoice);
		
		travel.setCountry(fieldCountry.getText());
		travel.setDay(Integer.parseInt(fieldDay.getText() ));
		travel.setFood(fieldFood.getText());
		travel.setActivity(fieldActivity.getText());
		travelManager.addTravel(travel);
		putObject(travelManager, "travelmanager.ser");
		travel.printInfo();
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
