
package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

import listeners.ButtonAddListener;
import listeners.ButtonViewListener;

public class MenuSelection extends JPanel {
	
	 WindowFrame frame;
	
	public MenuSelection(WindowFrame frame) {      //생성자
		this.frame = frame;
		
		this.setLayout(new BorderLayout());
	
		JPanel panel1 = new JPanel();  //flow layout
		JPanel panel2 = new JPanel();
		JLabel lable = new JLabel("Menu Selection"); //패널에 붙여줄 lable을 설정합니다.
		
		JButton button1 = new JButton("Add Travel");   // Add Travel 버튼을 만들어줍니다.
		JButton button2 = new JButton("View Travel"); // View Travel 버튼을 만들어줍니다.
		JButton button3 = new JButton("Edit Travel");  // Edit Travel 버튼을 만들어줍니다.
		JButton button4 = new JButton("Delete Travel");  // Delete Travel 버튼을 만들어줍니다.
		JButton button5 = new JButton("Exit Program");   // Exit 버튼을 만들어줍니다.
		
		button1.addActionListener(new ButtonAddListener(frame));
		button2.addActionListener(new ButtonViewListener(frame));
		
		panel1.add(lable);   //순서대로 panel에 붙여줍니다.
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);

		this.add(panel1 , BorderLayout.NORTH);  // panel1의 위치를 북쪽에 위치시킵니다.
		this.add(panel2 , BorderLayout.CENTER);  // panel2의 위치를 센터로 위치시킵니다.
	}
}