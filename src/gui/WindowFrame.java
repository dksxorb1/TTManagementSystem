package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.TravelManager;

public class WindowFrame extends JFrame{
	
	TravelManager travelManager;
	
	MenuSelection menuselection; 
	TravelAdder traveladder;
	TravelViewer travelviewer;

	
	public WindowFrame(TravelManager travelManager){
		this.setSize(500, 300);  //������Ʈ�� ũ�⸦ �������ݴϴ�.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //X�� ������ �� �������ݴϴ�.
		this.setTitle("My Frame");
		
		
		this.travelManager = travelManager;
		menuselection = new MenuSelection(this); 
		traveladder = new TravelAdder(this, this.travelManager);
		travelviewer = new TravelViewer(this, this.travelManager);
		
		
		this.add(menuselection);
		
		this.setVisible(true); // ȭ�鿡 ���̱� ���� Visible�� true�� ���ݴϴ�.
	}
	

	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public TravelAdder getTraveladder() {
		return traveladder;
	}

	public void setTraveladder(TravelAdder traveladder) {
		this.traveladder = traveladder;
	}

	public TravelViewer getTravelviewer() {
		return travelviewer;
	}

	public void setTravelviewer(TravelViewer travelviewer) {
		this.travelviewer = travelviewer;
	}
}
