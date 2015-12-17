package fitnesstracker.gui;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TrackAMeasurement {
	
	JFrame frame;
	
	public TrackAMeasurement(JFrame frame) {
		this.frame = frame;
	}
	
	public void initGUI() {
		
		frame.getContentPane().removeAll();
		
		JPanel j = new JPanel();
		j.setLayout(new GridLayout(2,0));
		
		JLabel mainArea = new JLabel();
		mainArea.setLayout(new FlowLayout(FlowLayout.LEFT));
		String[] measurementTypes = {
				"Chest",
				"Waist",
				"Hip",
				"Thigh",
				"Lower Abdomen using calipers",
				"Upper Abdomen using calipers"
		};
		JComboBox comboBox_measurementType = new JComboBox(measurementTypes);
		comboBox_measurementType.setSelectedIndex(0);
		mainArea.add(comboBox_measurementType);
		
		JLabel label_measurementValue = new JLabel();
		label_measurementValue.setText("Value");
		mainArea.add(label_measurementValue);
		
		JTextField textField_measurementValue = new JTextField(4);
		mainArea.add(textField_measurementValue);
		
		j.add(mainArea);
		
		JLabel buttons = new JLabel();
		buttons.setLayout(new FlowLayout());
		JButton backButton = new JButton("Back");
		backButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Homepage homepage = new Homepage(frame);
				homepage.initGUI();
			}
		});
		buttons.add(backButton);
		j.add(buttons);
		
		frame.add(j);

		
		frame.revalidate();
		frame.repaint();
	}

}
