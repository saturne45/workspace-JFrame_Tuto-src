package ca.devrevoltium.jframetuto;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Main extends JFrame {
	
	public Main() {
		JFrame frame = new JFrame();
		
		frame.setTitle("Tuto_JFrame");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
			
	}

	public static void main(String[] args) {
		new Main();	
		
	}

}
