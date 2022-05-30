package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

public class MenuSelection extends JFrame {
	
	public MenuSelection() {      //생성자
		this.setSize(300, 300);  //컴포넌트의 크기를 결정해줍니다.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //X를 눌렀을 때 꺼지해줍니다.
		
		JPanel panel1 = new JPanel();  //flow layout
		JPanel panel2 = new JPanel();
		JLabel lable = new JLabel("Menu Selection"); //패널에 붙여줄 lable을 설정합니다.
		
		JButton button1 = new JButton("Add Travel");   // Add Travel 버튼을 만들어줍니다.
		JButton button2 = new JButton("Delete Travel"); // Delete Travel 버튼을 만들어줍니다.
		JButton button3 = new JButton("Edit Travel");  // Edit Travel 버튼을 만들어줍니다.
		JButton button4 = new JButton("View Travel");  // View Travel 버튼을 만들어줍니다.
		JButton button5 = new JButton("Exit Program");   // Exit 버튼을 만들어줍니다.
		
		panel1.add(lable);   //순서대로 panel에 붙여줍니다.
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);

		this.add(panel1 , BorderLayout.NORTH);  // panel1의 위치를 북쪽에 위치시킵니다.
		this.add(panel2 , BorderLayout.CENTER);  // panel2의 위치를 센터로 위치시킵니다.
		this.setVisible(true); // 화면에 보이기 위해 Visible에 true를 해줍니다.
		
	}
}