
package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import listeners.TravelAdderCancleListener;
import listeners.TravelAdderListener;
import manager.TravelManager;

public class TravelAdder extends JPanel {
	
	WindowFrame frame;
	TravelManager travelManager;

	public TravelAdder(WindowFrame frame, TravelManager travelManager) {
		this.frame = frame;
		this.travelManager = travelManager;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel lableCountry = new JLabel("Country:  ", JLabel.TRAILING);  // edge의 형태를 체크 
		JTextField fieldCountry = new JTextField(10); //Text의 길이를 10으로 설정해줍니다.
		lableCountry.setLabelFor(fieldCountry); //TextField를 lable에 넣어줍니다.
		panel.add(lableCountry);  
		panel.add(fieldCountry);
		
		JLabel lableDay = new JLabel("Day:  ", JLabel.TRAILING);
		JTextField fieldDay = new JTextField(10); //Text의 길이를 10으로 설정해줍니다.
		lableDay.setLabelFor(fieldDay);
		panel.add(lableDay);
		panel.add(fieldDay);
		
		JLabel lableFood = new JLabel("Food:  ", JLabel.TRAILING);
		JTextField fieldFood = new JTextField(10); //Text의 길이를 10으로 설정해줍니다.
		lableFood.setLabelFor(fieldFood);
		panel.add(lableFood);
		panel.add(fieldFood);
		
		JLabel lableActivity = new JLabel("Activity:  ", JLabel.TRAILING);
		JTextField fieldActivity = new JTextField(10); //Text의 길이를 10으로 설정해줍니다.
		lableActivity.setLabelFor(fieldActivity);
		panel.add(lableActivity);
		panel.add(fieldActivity);
		
		
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new TravelAdderListener(fieldCountry, fieldDay, fieldFood, fieldActivity, travelManager));
		
		JButton cancelButton = new JButton("cancle");
		cancelButton.addActionListener(new TravelAdderCancleListener(frame));
		panel.add(saveButton);  // 저장하기 위해 save 버튼을 넣어줍니다.
		panel.add(cancelButton); // 취소하기 위해 cancle 버튼을 넣어줍니다.
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);		
		
		this.add(panel);  // 새로운 panel을 설정합니다.
		this.setVisible(true);  // 화면에 보이기 위해 Visible에 true를 해줍니다.
	}

}
