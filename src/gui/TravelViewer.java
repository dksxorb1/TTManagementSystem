
package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import TraveL.TravelInput;
import manager.TravelManager;


public class TravelViewer extends JPanel {
	
	WindowFrame frame;
	
	TravelManager travelManager;
	
	public TravelManager getTravelManager() {
		return travelManager;
	}

	public void setTravelManager(TravelManager travelManager) {
		this.travelManager = travelManager;
		this.removeAll();
		
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Country");
		model.addColumn("Day");
		model.addColumn("Food");
		model.addColumn("Activity");
		
		for(int i = 0;  i<travelManager.size(); i++) {
			Vector row = new Vector();
			TravelInput si = travelManager.get(i);
			row.add(si.getCountry());
			row.add(si.getDay());
			row.add(si.getFood());
			row.add(si.getActivity());
			model.addRow(row);
		}
	
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table); //컴포넌트에 스크롤 기능을 제공하기 위해 JScrollPane을 사용해줍니다.

		this.add(sp);
	}

	public TravelViewer(WindowFrame frame, 	TravelManager travelManager) {
		this.frame = frame;
		this.travelManager = travelManager;
		
		System.out.println("***" + travelManager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Country");
		model.addColumn("Day");
		model.addColumn("Food");
		model.addColumn("Activity");
		
		for(int i = 0;  i<travelManager.size(); i++) {
			Vector row = new Vector();
			TravelInput si = travelManager.get(i);
			row.add(si.getCountry());
			row.add(si.getDay());
			row.add(si.getFood());
			row.add(si.getActivity());
			model.addRow(row);
		}
	
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table); //컴포넌트에 스크롤 기능을 제공하기 위해 JScrollPane을 사용해줍니다.

		this.add(sp);
	}

}
