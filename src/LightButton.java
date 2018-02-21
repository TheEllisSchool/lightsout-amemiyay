import java.awt.Dimension;

import javax.swing.JButton;

public class LightButton extends JButton{
	//attributes
	private static int SIZE = 50;
	private boolean isOn = false;
	
	public LightButton() {
		isOn = false;
		
		Dimension size = new Dimension(SIZE, SIZE);
		setPreferredSize(size);
	}
	
	public boolean getIsOn() {
		return isOn;
	}
	
	public void reset() {
		isOn = false;
	}
	
	public void toggle() {
		if (isOn = true) {
			isOn = false;
		} else {
			isOn = true;
		}
	}
}
