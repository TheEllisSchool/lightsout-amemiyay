import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class LightsOut extends JFrame {
	
	private static final int GRIDSIZE = 3;
	LightButton[][] lightBoard = new LightButton[GRIDSIZE][GRIDSIZE];
	
	public LightsOut() {
		initGUI();
		
		setTitle("Mine Duster");
		setSize(700, 200); 
		setResizable(false);
		pack();
		setLocationRelativeTo(null);

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void initGUI() {
		JPanel titlePanel = new JPanel();
		titlePanel.setBackground(Color.white);
		add(titlePanel, BorderLayout.PAGE_START);
		
		JLabel titleLabel = new JLabel("Framed!");
		Font titleFont = new Font ("Times New Roman", Font.BOLD, 48);
		titleLabel.setFont(titleFont);
		titleLabel.setForeground(Color.black);
		titlePanel.add(titleLabel);
	}
	
	public void boardSetUp() {
		//start with them on, then do random # of "button clicked"
	}
	
	public void buttonClicked(int r, int c) {
		//toggles that button and neighbors
		//check for win --> all outside on
	}
	
	public void promptForNewGame() {
		boardSetUp();
	}

	public static void main(String[] args) {
		try {
            String className = UIManager.getCrossPlatformLookAndFeelClassName();
            UIManager.setLookAndFeel(className);
        } catch ( Exception e) {}
        
        EventQueue.invokeLater(new Runnable (){
            @Override
            public void run() {
                new LightsOut();
            }   
        });

	}

}
