package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class TravelAdder extends JFrame {

	public TravelAdder() {
		JPanel panel = new JPanel( new SpringLayout());
		panel.setLayout(new SpringLayout());
		
		JLabel lableCountry = new JLabel("Country:  ", JLabel.TRAILING);
		JTextField fieldCountry = new JTextField(10);
		lableCountry.setLabelFor(fieldCountry);
		panel.add(lableCountry);
		panel.add(fieldCountry);
		
		JLabel lableDay = new JLabel("Day:  ", JLabel.TRAILING);
		JTextField fieldDay = new JTextField(10);
		lableDay.setLabelFor(fieldDay);
		panel.add(lableDay);
		panel.add(fieldDay);
		
		JLabel lableFood = new JLabel("Food:  ", JLabel.TRAILING);
		JTextField fieldFood = new JTextField(10);
		lableFood.setLabelFor(fieldFood);
		panel.add(lableFood);
		panel.add(fieldFood);
		
		JLabel lableActivity = new JLabel("Activity:  ", JLabel.TRAILING);
		JTextField fieldActivity = new JTextField(10);
		lableActivity.setLabelFor(fieldActivity);
		panel.add(lableActivity);
		panel.add(fieldActivity);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setContentPane(panel);
		this.setVisible(true);
	}

}
