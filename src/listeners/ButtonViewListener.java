package listeners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import gui.TravelViewer;
import gui.WindowFrame;
import manager.TravelManager;

public class ButtonViewListener implements ActionListener {

	WindowFrame frame;
	
	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		TravelViewer travelViewer = frame.getTravelviewer();
		TravelManager travelManager = getObject("travelmanager.ser");
		travelViewer.setTravelManager(travelManager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(travelViewer);
		frame.revalidate();
		frame.repaint(); 		
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
}
