import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener{
	
	JButton button;
	JLabel label;

	MyFrame() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());				// Flow Layout neatly arranges all of the elements in the JFrame.
		
		button = new JButton("Pick a color");
		button.addActionListener(this);					// Creating a butotn
		
		label = new JLabel();
		label.setBackground(Color.white);
		label.setText("Try changing the color of this text!");
		label.setFont(new Font("Times New Roman", Font.BOLD, 75));
		label.setOpaque(true);										// Creating and styling a label.
		
		this.add(button);
		this.add(label);
		this.pack();
		this.setVisible(true);						// Adding everything to the JFrame, and making it visible.
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== button) {
			JColorChooser colorChooser = new JColorChooser();
			
			Color color = JColorChooser.showDialog(null, "Pick a color", Color.black);
			label.setForeground(color);						// Changes the texts color.
		}
		
	}
}