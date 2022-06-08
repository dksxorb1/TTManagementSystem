
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
	
	public MenuSelection(WindowFrame frame) {      //������
		this.frame = frame;
		
		this.setLayout(new BorderLayout());
	
		JPanel panel1 = new JPanel();  //flow layout
		JPanel panel2 = new JPanel();
		JLabel lable = new JLabel("Menu Selection"); //�гο� �ٿ��� lable�� �����մϴ�.
		
		JButton button1 = new JButton("Add Travel");   // Add Travel ��ư�� ������ݴϴ�.
		JButton button2 = new JButton("View Travel"); // View Travel ��ư�� ������ݴϴ�.
		JButton button3 = new JButton("Edit Travel");  // Edit Travel ��ư�� ������ݴϴ�.
		JButton button4 = new JButton("Delete Travel");  // Delete Travel ��ư�� ������ݴϴ�.
		JButton button5 = new JButton("Exit Program");   // Exit ��ư�� ������ݴϴ�.
		
		button1.addActionListener(new ButtonAddListener(frame));
		button2.addActionListener(new ButtonViewListener(frame));
		
		panel1.add(lable);   //������� panel�� �ٿ��ݴϴ�.
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);

		this.add(panel1 , BorderLayout.NORTH);  // panel1�� ��ġ�� ���ʿ� ��ġ��ŵ�ϴ�.
		this.add(panel2 , BorderLayout.CENTER);  // panel2�� ��ġ�� ���ͷ� ��ġ��ŵ�ϴ�.
	}
}