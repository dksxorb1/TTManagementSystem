package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class TravelViewer extends JFrame {
	
	public TravelViewer() {
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Country");
		model.addColumn("Day");
		model.addColumn("Food");
		model.addColumn("Activity");
	
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table); //컴포넌트에 스크롤 기능을 제공하기 위해 JScrollPane을 사용해줍니다.

		this.add(sp);
		this.setSize(300, 300); //컴포넌트의 크기를 결정해줍니다.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //X를 눌렀을 때 꺼지해줍니다.
		this.setVisible(true); // 화면에 보이기 위해 Visible에 true를 해줍니다.
		
	}

}
