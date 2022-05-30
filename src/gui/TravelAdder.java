package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class TravelAdder extends JFrame {

	public TravelAdder() {
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel lableCountry = new JLabel("Country:  ", JLabel.TRAILING);  // edge�� ���¸� üũ 
		JTextField fieldCountry = new JTextField(10); //Text�� ���̸� 10���� �������ݴϴ�.
		lableCountry.setLabelFor(fieldCountry); //TextField�� lable�� �־��ݴϴ�.
		panel.add(lableCountry);  
		panel.add(fieldCountry);
		
		JLabel lableDay = new JLabel("Day:  ", JLabel.TRAILING);
		JTextField fieldDay = new JTextField(10); //Text�� ���̸� 10���� �������ݴϴ�.
		lableDay.setLabelFor(fieldDay);
		panel.add(lableDay);
		panel.add(fieldDay);
		
		JLabel lableFood = new JLabel("Food:  ", JLabel.TRAILING);
		JTextField fieldFood = new JTextField(10); //Text�� ���̸� 10���� �������ݴϴ�.
		lableFood.setLabelFor(fieldFood);
		panel.add(lableFood);
		panel.add(fieldFood);
		
		JLabel lableActivity = new JLabel("Activity:  ", JLabel.TRAILING);
		JTextField fieldActivity = new JTextField(10); //Text�� ���̸� 10���� �������ݴϴ�.
		lableActivity.setLabelFor(fieldActivity);
		panel.add(lableActivity);
		panel.add(fieldActivity);
		
		panel.add(new JButton("save"));  // �����ϱ� ���� save ��ư�� �־��ݴϴ�.
		panel.add(new JButton("cancel")); // ����ϱ� ���� cancle ��ư�� �־��ݴϴ�.
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);		
		this.setSize(300, 300);   //������Ʈ�� ũ�⸦ �������ݴϴ�.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //X�� ������ �� �������ݴϴ�.
		
		this.setContentPane(panel);  // ���ο� panel�� �����մϴ�.
		this.setVisible(true);  // ȭ�鿡 ���̱� ���� Visible�� true�� ���ݴϴ�.
	}

}
