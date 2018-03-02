import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;

public class LightButton extends JButton{
	//attributes
	private static int SIZE = 100;
	boolean isOn = false;
	private int row = 0;
	private int col = 0;
	
	public LightButton(int r, int c) {
		row = r;
		col = c;
		
		setBackground(Color.black);
		
		Dimension size = new Dimension(SIZE, SIZE);
		setPreferredSize(size);
	}
	
	public boolean getIsOn() {
		return isOn;
	}
	
	public int getRow() {
		return row;
	}
	
	public int getCol() {
		return col;
	}
	
	public void reset() {
		isOn = false;
		setBackground(Color.black);
	}
	
	public void toggle() {
		if (isOn == true) {
			isOn = false;
			setBackground(Color.black);
		} else {
			isOn = true;
			setBackground(Color.white);
		}
	}
	
}
