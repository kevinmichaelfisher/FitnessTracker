package fitnesstracker.gui;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TrackAWorkout {
	
	JFrame frame;
	JButton trackAWorkout_button_saveButton, trackAWorkout_button_backButton;
	int[] squat, bench, deadlift, ohp, accessory1, accessory2, accessory3;
	int workoutNumber;
	
	
	public TrackAWorkout(JFrame frame) {
		this.frame = frame;
		squat = new int[7];
		bench = new int[5];
		deadlift = new int[5];
		ohp = new int[5];
		accessory1 = new int[2];
		accessory2 = new int[2];
		accessory3 = new int[2];
	}
	
	public void initGUI() {
		
		final JTextField squatWeightInput;

		frame.getContentPane().removeAll();
		
		Object[] options = 
			{
				"Workout 1",
				"Workout 2",
				"Workout 3",
				"Workout 4"
			};
		String input = (String)JOptionPane.showInputDialog(
								frame,
								"Which workout would you like to track?",
								"Choose workout",
								JOptionPane.QUESTION_MESSAGE,
								null,
								options,
								options[0]);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(16,0));
		
		//date
		JLabel dateLabel = new JLabel();
		dateLabel.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JLabel dateText = new JLabel();
		dateText.setText("Date (MM/DD/YY)");
		dateLabel.add(dateText);
		
		final JTextField dateInput = new JTextField(10);
		dateInput.getDocument().putProperty("dateInput" , dateInput);
		dateLabel.add(dateInput);
		mainPanel.add(dateLabel);
		
		
		
		
		
		if (input.equals("Workout 1")) {
			workoutNumber = 1;
			
			//squat
			JLabel squatText = new JLabel();
			squatText.setText("Squat");
			mainPanel.add(squatText);
			
			JLabel squatFields = new JLabel();
			squatFields.setLayout(new FlowLayout(FlowLayout.LEFT));
			
			JLabel squatWeightText = new JLabel();
			squatWeightText.setText("Weight");
			squatFields.add(squatWeightText);
			squatWeightInput = new JTextField(4);
			squatWeightInput.getDocument().putProperty("squatWeightInput" , squatWeightInput);
			squatFields.add(squatWeightInput);
			
			JLabel squatSet1Text = new JLabel();
			squatSet1Text.setText("Set 1");
			squatFields.add(squatSet1Text);
			JTextField squatSet1Input = new JTextField(2);
			squatSet1Input.getDocument().putProperty("squatSet1Input" , squatSet1Input);
			squatFields.add(squatSet1Input);
			
			JLabel squatSet2Text = new JLabel();
			squatSet2Text.setText("Set 2");
			squatFields.add(squatSet2Text);
			JTextField squatSet2Input = new JTextField(2);
			squatSet2Input.getDocument().putProperty("squatSet2Input" , squatSet2Input);
			squatFields.add(squatSet2Input);
			
			JLabel squatSet3Text = new JLabel();
			squatSet2Text.setText("Set 3");
			squatFields.add(squatSet2Text);
			JTextField squatSet3Input = new JTextField(2);
			squatSet3Input.getDocument().putProperty("squatSet3Input" , squatSet3Input);
			squatFields.add(squatSet3Input);
			
			JLabel squatSet4Text = new JLabel();
			squatSet4Text.setText("Set 4");
			squatFields.add(squatSet4Text);
			JTextField squatSet4Input = new JTextField(2);
			squatSet4Input.getDocument().putProperty("squatSet4Input" , squatSet4Input);
			squatFields.add(squatSet4Input);
			
			JLabel squatSet5Text = new JLabel();
			squatSet5Text.setText("Set 5");
			squatFields.add(squatSet5Text);
			JTextField squatSet5Input = new JTextField(2);
			squatSet5Input.getDocument().putProperty("squatSet5Input" , squatSet5Input);
			squatFields.add(squatSet5Input);
			
			JLabel squatSet6Text = new JLabel();
			squatSet6Text.setText("Set 6");
			squatFields.add(squatSet6Text);
			JTextField squatSet6Input = new JTextField(2);
			squatSet6Input.getDocument().putProperty("squatSet6Input" , squatSet6Input);
			squatFields.add(squatSet6Input);
			
			mainPanel.add(squatFields);
			
			//bench
			JLabel trackAWorkout_label_benchText = new JLabel();
			trackAWorkout_label_benchText.setText("Bench Press");
			mainPanel.add(trackAWorkout_label_benchText);
			
			JLabel trackAWorkout_label_benchFields = new JLabel();
			trackAWorkout_label_benchFields.setLayout(new FlowLayout(FlowLayout.LEFT));
			
			JLabel trackAWorkout_label_benchWeight = new JLabel();
			trackAWorkout_label_benchWeight.setText("Weight");
			trackAWorkout_label_benchFields.add(trackAWorkout_label_benchWeight);
			JTextField trackAWorkout_textField_benchWeight = new JTextField(4);
			trackAWorkout_label_benchFields.add(trackAWorkout_textField_benchWeight);
			
			JLabel trackAWorkout_label_benchSet1 = new JLabel();
			trackAWorkout_label_benchSet1.setText("Set 1");
			trackAWorkout_label_benchFields.add(trackAWorkout_label_benchSet1);
			JTextField trackAWorkout_textField_benchSet1 = new JTextField(2);
			trackAWorkout_label_benchFields.add(trackAWorkout_textField_benchSet1);
			
			JLabel trackAWorkout_label_benchSet2 = new JLabel();
			trackAWorkout_label_benchSet2.setText("Set 2");
			trackAWorkout_label_benchFields.add(trackAWorkout_label_benchSet2);
			JTextField trackAWorkout_textField_benchSet2 = new JTextField(2);
			trackAWorkout_label_benchFields.add(trackAWorkout_textField_benchSet2);
			
			JLabel trackAWorkout_label_benchSet3 = new JLabel();
			trackAWorkout_label_benchSet3.setText("Set 3");
			trackAWorkout_label_benchFields.add(trackAWorkout_label_benchSet3);
			JTextField trackAWorkout_textField_benchSet3 = new JTextField(2);
			trackAWorkout_label_benchFields.add(trackAWorkout_textField_benchSet3);
			
			JLabel trackAWorkout_label_benchSet4 = new JLabel();
			trackAWorkout_label_benchSet4.setText("Set 4");
			trackAWorkout_label_benchFields.add(trackAWorkout_label_benchSet4);
			JTextField trackAWorkout_textField_benchSet4 = new JTextField(2);
			trackAWorkout_label_benchFields.add(trackAWorkout_textField_benchSet4);
			
			mainPanel.add(trackAWorkout_label_benchFields);
			
			//deadlift
			JLabel trackAWorkout_label_deadliftText = new JLabel();
			trackAWorkout_label_deadliftText.setText("Deadlift");
			mainPanel.add(trackAWorkout_label_deadliftText);
			
			JLabel trackAWorkout_label_deadliftFields = new JLabel();
			trackAWorkout_label_deadliftFields.setLayout(new FlowLayout(FlowLayout.LEFT));
			
			JLabel trackAWorkout_label_deadliftWeight = new JLabel();
			trackAWorkout_label_deadliftWeight.setText("Weight");
			trackAWorkout_label_deadliftFields.add(trackAWorkout_label_deadliftWeight);
			JTextField trackAWorkout_textField_deadliftWeight = new JTextField(4);
			trackAWorkout_label_deadliftFields.add(trackAWorkout_textField_deadliftWeight);
			
			JLabel trackAWorkout_label_deadliftSet1 = new JLabel();
			trackAWorkout_label_deadliftSet1.setText("Set 1");
			trackAWorkout_label_deadliftFields.add(trackAWorkout_label_deadliftSet1);
			JTextField trackAWorkout_textField_deadliftSet1 = new JTextField(2);
			trackAWorkout_label_deadliftFields.add(trackAWorkout_textField_deadliftSet1);
			
			JLabel trackAWorkout_label_deadliftSet2 = new JLabel();
			trackAWorkout_label_deadliftSet2.setText("Set 2");
			trackAWorkout_label_deadliftFields.add(trackAWorkout_label_deadliftSet2);
			JTextField trackAWorkout_textField_deadliftSet2 = new JTextField(2);
			trackAWorkout_label_deadliftFields.add(trackAWorkout_textField_deadliftSet2);
			
			JLabel trackAWorkout_label_deadliftSet3 = new JLabel();
			trackAWorkout_label_deadliftSet3.setText("Set 3");
			trackAWorkout_label_deadliftFields.add(trackAWorkout_label_deadliftSet3);
			JTextField trackAWorkout_textField_deadliftSet3 = new JTextField(2);
			trackAWorkout_label_deadliftFields.add(trackAWorkout_textField_deadliftSet3);
			
			JLabel trackAWorkout_label_deadliftSet4 = new JLabel();
			trackAWorkout_label_deadliftSet4.setText("Set 4");
			trackAWorkout_label_deadliftFields.add(trackAWorkout_label_deadliftSet4);
			JTextField trackAWorkout_textField_deadliftSet4 = new JTextField(2);
			trackAWorkout_label_deadliftFields.add(trackAWorkout_textField_deadliftSet4);
			
			mainPanel.add(trackAWorkout_label_deadliftFields);
			
			//ohp
			JLabel trackAWorkout_label_ohpText = new JLabel();
			trackAWorkout_label_ohpText.setText("Overhead Press");
			mainPanel.add(trackAWorkout_label_ohpText);
			
			JLabel trackAWorkout_label_ohpFields = new JLabel();
			trackAWorkout_label_ohpFields.setLayout(new FlowLayout(FlowLayout.LEFT));
			
			JLabel trackAWorkout_label_ohpWeight = new JLabel();
			trackAWorkout_label_ohpWeight.setText("Weight");
			trackAWorkout_label_ohpFields.add(trackAWorkout_label_ohpWeight);
			JTextField trackAWorkout_textField_ohpWeight = new JTextField(4);
			trackAWorkout_label_ohpFields.add(trackAWorkout_textField_ohpWeight);
			
			JLabel trackAWorkout_label_ohpSet1 = new JLabel();
			trackAWorkout_label_ohpSet1.setText("Set 1");
			trackAWorkout_label_ohpFields.add(trackAWorkout_label_ohpSet1);
			JTextField trackAWorkout_textField_ohpSet1 = new JTextField(2);
			trackAWorkout_label_ohpFields.add(trackAWorkout_textField_ohpSet1);
			
			JLabel trackAWorkout_label_ohpSet2 = new JLabel();
			trackAWorkout_label_ohpSet2.setText("Set 2");
			trackAWorkout_label_ohpFields.add(trackAWorkout_label_ohpSet2);
			JTextField trackAWorkout_textField_ohpSet2 = new JTextField(2);
			trackAWorkout_label_ohpFields.add(trackAWorkout_textField_ohpSet2);
			
			JLabel trackAWorkout_label_ohpSet3 = new JLabel();
			trackAWorkout_label_ohpSet3.setText("Set 3");
			trackAWorkout_label_ohpFields.add(trackAWorkout_label_ohpSet3);
			JTextField trackAWorkout_textField_ohpSet3 = new JTextField(2);
			trackAWorkout_label_ohpFields.add(trackAWorkout_textField_ohpSet3);
			
			JLabel trackAWorkout_label_ohpSet4 = new JLabel();
			trackAWorkout_label_ohpSet4.setText("Set 4");
			trackAWorkout_label_ohpFields.add(trackAWorkout_label_ohpSet4);
			JTextField trackAWorkout_textField_ohpSet4 = new JTextField(2);
			trackAWorkout_label_ohpFields.add(trackAWorkout_textField_ohpSet4);
			
			mainPanel.add(trackAWorkout_label_ohpFields);
			
			//lat pulldown
			JLabel trackAWorkout_label_latpdText = new JLabel();
			trackAWorkout_label_latpdText.setText("Lat Pulldowns");
			mainPanel.add(trackAWorkout_label_latpdText);
			
			JLabel trackAWorkout_label_latpdFields = new JLabel();
			trackAWorkout_label_latpdFields.setLayout(new FlowLayout(FlowLayout.LEFT));
			
			JLabel trackAWorkout_label_latpdWeight = new JLabel();
			trackAWorkout_label_latpdWeight.setText("Weight");
			trackAWorkout_label_latpdFields.add(trackAWorkout_label_latpdWeight);
			JTextField trackAWorkout_textField_latpdWeight = new JTextField(4);
			trackAWorkout_label_latpdFields.add(trackAWorkout_textField_latpdWeight);
			
			JLabel trackAWorkout_label_latpdSet1 = new JLabel();
			trackAWorkout_label_latpdSet1.setText("Set 1");
			trackAWorkout_label_latpdFields.add(trackAWorkout_label_latpdSet1);
			JTextField trackAWorkout_textField_latpdSet1 = new JTextField(2);
			trackAWorkout_label_latpdFields.add(trackAWorkout_textField_latpdSet1);
			
			mainPanel.add(trackAWorkout_label_latpdFields);
			
			//rows
			JLabel trackAWorkout_label_rowsText = new JLabel();
			trackAWorkout_label_rowsText.setText("Rows");
			mainPanel.add(trackAWorkout_label_rowsText);
			
			JLabel trackAWorkout_label_rowsFields = new JLabel();
			trackAWorkout_label_rowsFields.setLayout(new FlowLayout(FlowLayout.LEFT));
			
			JLabel trackAWorkout_label_rowsWeight = new JLabel();
			trackAWorkout_label_rowsWeight.setText("Weight");
			trackAWorkout_label_rowsFields.add(trackAWorkout_label_rowsWeight);
			JTextField trackAWorkout_textField_rowsWeight = new JTextField(4);
			trackAWorkout_label_rowsFields.add(trackAWorkout_textField_rowsWeight);
			
			JLabel trackAWorkout_label_rowsSet1 = new JLabel();
			trackAWorkout_label_rowsSet1.setText("Set 1");
			trackAWorkout_label_rowsFields.add(trackAWorkout_label_rowsSet1);
			JTextField trackAWorkout_textField_rowsSet1 = new JTextField(2);
			trackAWorkout_label_rowsFields.add(trackAWorkout_textField_rowsSet1);
			
			mainPanel.add(trackAWorkout_label_rowsFields);
			
			//bicep curls
			JLabel trackAWorkout_label_curlsText = new JLabel();
			trackAWorkout_label_curlsText.setText("Bicep Curls");
			mainPanel.add(trackAWorkout_label_curlsText);
			
			JLabel trackAWorkout_label_curlsFields = new JLabel();
			trackAWorkout_label_curlsFields.setLayout(new FlowLayout(FlowLayout.LEFT));
			
			JLabel trackAWorkout_label_curlsWeight = new JLabel();
			trackAWorkout_label_curlsWeight.setText("Weight");
			trackAWorkout_label_curlsFields.add(trackAWorkout_label_curlsWeight);
			JTextField trackAWorkout_textField_curlsWeight = new JTextField(4);
			trackAWorkout_label_curlsFields.add(trackAWorkout_textField_curlsWeight);
			
			JLabel trackAWorkout_label_curlsSet1 = new JLabel();
			trackAWorkout_label_curlsSet1.setText("Set 1");
			trackAWorkout_label_curlsFields.add(trackAWorkout_label_curlsSet1);
			JTextField trackAWorkout_textField_curlsSet1 = new JTextField(2);
			trackAWorkout_label_curlsFields.add(trackAWorkout_textField_curlsSet1);
			
			mainPanel.add(trackAWorkout_label_curlsFields);
		}
		
		
		JLabel trackAWorkout_label_buttons = new JLabel();
		trackAWorkout_label_buttons.setLayout(new FlowLayout());
		
		//back button
		trackAWorkout_button_backButton = new JButton("Back");
		trackAWorkout_button_backButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Homepage homepage = new Homepage(frame);
				homepage.initGUI();
			}
		});
		trackAWorkout_label_buttons.add(trackAWorkout_button_backButton);
		
		
		//save button
		trackAWorkout_button_saveButton = new JButton("Save");
		/*trackAWorkout_button_saveButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ArrayList<String> data = new ArrayList<String>();
				
				if (workoutNumber == 1) {
					data.add(dateInput.getText());
					data.add(squatWeightInput.getText());
				}
				
				
				
			}
		});*/
		trackAWorkout_label_buttons.add(trackAWorkout_button_saveButton);
		
		mainPanel.add(trackAWorkout_label_buttons);
	
		frame.add(mainPanel);

		frame.revalidate();
		frame.repaint();
	}
/*	
	private class ButtonListener implements ActionListener, DocumentListener {

		@Override
		public void actionPerformed(ActionEvent e) {
		}

		@Override
		public void insertUpdate(DocumentEvent e) {			
		}

		@Override
		public void removeUpdate(DocumentEvent e) {			
		}

		@Override
		public void changedUpdate(DocumentEvent e) {			
		}
	}
	
	*/
	
}
