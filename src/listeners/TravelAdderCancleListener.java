package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.WindowFrame;

public class TravelAdderCancleListener implements ActionListener {

	WindowFrame frame;
	
	public TravelAdderCancleListener (WindowFrame frame) {
		this.frame = frame;
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getMenuselection());
		frame.revalidate();
		frame.repaint(); 
		
	
	}
}
