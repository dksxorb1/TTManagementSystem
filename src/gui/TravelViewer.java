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
		JScrollPane sp = new JScrollPane(table); //������Ʈ�� ��ũ�� ����� �����ϱ� ���� JScrollPane�� ������ݴϴ�.

		this.add(sp);
		this.setSize(300, 300); //������Ʈ�� ũ�⸦ �������ݴϴ�.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //X�� ������ �� �������ݴϴ�.
		this.setVisible(true); // ȭ�鿡 ���̱� ���� Visible�� true�� ���ݴϴ�.
		
	}

}
