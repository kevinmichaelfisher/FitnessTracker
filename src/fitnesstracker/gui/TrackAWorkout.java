package fitnesstracker.gui;

import java.awt.FlowLayout;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import fitnesstracker.logic.IOHandler;


public class TrackAWorkout {
	
	JFrame frame;
	JButton saveButton, backButton;
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
		
		//make panel and set layout
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(16,0));					
							
		//date label and text field
		JLabel dateLabel = new JLabel();
		dateLabel.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JLabel dateText = new JLabel();
		dateText.setText("Date (MM/DD/YY)");
		dateLabel.add(dateText);
		
		final JTextField dateInput = new JTextField(10);
		//dateInput.getDocument().putProperty("dateInput" , dateInput);
		dateLabel.add(dateInput);
		mainPanel.add(dateLabel);
		
		//weight jtextfields
		final JTextField mainLift1WeightInput = new JTextField(4),
							mainLift2WeightInput = new JTextField(4),
							mainLift3WeightInput = new JTextField(4),
							mainLift4WeightInput = new JTextField(4),
							accessory1WeightInput = new JTextField(4),
							accessory2WeightInput = new JTextField(4),
							accessory3WeightInput  = new JTextField(4);
		
		//set jtextfields
		final JTextField mainLift1Set1Input = new JTextField(2),
							mainLift1Set2Input = new JTextField(2),
							mainLift1Set3Input = new JTextField(2),
							mainLift1Set4Input = new JTextField(2),
							mainLift1Set5Input = new JTextField(2),
							mainLift1Set6Input = new JTextField(2),
							mainLift2Set1Input = new JTextField(2),
							mainLift2Set2Input = new JTextField(2),
							mainLift2Set3Input = new JTextField(2),
							mainLift2Set4Input = new JTextField(2),
							mainLift3Set1Input = new JTextField(2),
							mainLift3Set2Input = new JTextField(2),
							mainLift3Set3Input = new JTextField(2),
							mainLift3Set4Input = new JTextField(2),
							mainLift4Set1Input = new JTextField(2),
							mainLift4Set2Input = new JTextField(2),
							mainLift4Set3Input = new JTextField(2),
							mainLift4Set4Input = new JTextField(2),
							accessory1Set1Input = new JTextField(2),
							accessory2Set1Input = new JTextField(2),
							accessory3Set1Input = new JTextField(2);
		
		final JLabel mainLift1Text = new JLabel(), 
				mainLift1WeightText = new JLabel(), 
				mainLift1Set1Text = new JLabel(), 
				mainLift1Set2Text = new JLabel(), 
				mainLift1Set3Text = new JLabel(), 
				mainLift1Set4Text = new JLabel(), 
				mainLift1Set5Text = new JLabel(), 
				mainLift1Set6Text = new JLabel(), 
				
				mainLift2Text = new JLabel(),
				mainLift2WeightText = new JLabel(),
				mainLift2Set1Text = new JLabel(),
				mainLift2Set2Text = new JLabel(),
				mainLift2Set3Text = new JLabel(),
				mainLift2Set4Text = new JLabel(),
				
				mainLift3Text = new JLabel(),
				mainLift3WeightText = new JLabel(),
				mainLift3Set1Text = new JLabel(),
				mainLift3Set2Text = new JLabel(),
				mainLift3Set3Text = new JLabel(),
				mainLift3Set4Text = new JLabel(),
				
				mainLift4Text = new JLabel(),
				mainLift4WeightText = new JLabel(),
				mainLift4Set1Text = new JLabel(),
				mainLift4Set2Text = new JLabel(),
				mainLift4Set3Text = new JLabel(),
				mainLift4Set4Text = new JLabel(),
				
				accessory1Text = new JLabel(),
				accessory1WeightText = new JLabel(),
				accessory1Set1Text = new JLabel(),
				
				accessory2Text = new JLabel(),
				accessory2WeightText = new JLabel(),
				accessory2Set1Text = new JLabel(),
				
				accessory3Text = new JLabel(),
				accessory3WeightText = new JLabel(),
				accessory3Set1Text = new JLabel();
		
		mainLift1WeightText.setText("Weight");
		mainLift2WeightText.setText("Weight");
		mainLift3WeightText.setText("Weight");
		mainLift4WeightText.setText("Weight");
		accessory1WeightText.setText("Weight");
		accessory2WeightText.setText("Weight");
		accessory3WeightText.setText("Weight");
		mainLift1Set1Text.setText("Set 1");
		mainLift1Set2Text.setText("Set 2");
		mainLift1Set3Text.setText("Set 3");
		mainLift1Set4Text.setText("Set 4");
		mainLift1Set5Text.setText("Set 5");
		mainLift1Set6Text.setText("Set 6");
		
		mainLift2Set1Text.setText("Set 1");
		mainLift2Set2Text.setText("Set 2");
		mainLift2Set3Text.setText("Set 3");
		mainLift2Set4Text.setText("Set 4");
		
		mainLift3Set1Text.setText("Set 1");
		mainLift3Set2Text.setText("Set 2");
		mainLift3Set3Text.setText("Set 3");
		mainLift3Set4Text.setText("Set 4");
		
		mainLift4Set1Text.setText("Set 1");
		mainLift4Set2Text.setText("Set 2");
		mainLift4Set3Text.setText("Set 3");
		mainLift4Set4Text.setText("Set 4");
		
		accessory1Set1Text.setText("Set 1");
		accessory2Set1Text.setText("Set 1");
		accessory3Set1Text.setText("Set 1");
		
		if (input.equals("Workout 1")) {
			workoutNumber = 1;
			
			//main lift 1
			mainLift1Text.setText("Squat");
			mainPanel.add(mainLift1Text);
			
			JLabel mainLift1Fields = new JLabel();
			mainLift1Fields.setLayout(new FlowLayout(FlowLayout.LEFT));
			
			mainLift1Fields.add(mainLift1WeightText);
			//squatWeightInput.getDocument().putProperty("squatWeightInput" , squatWeightInput);
			mainLift1Fields.add(mainLift1WeightInput);
			
			mainLift1Fields.add(mainLift1Set1Text);
			mainLift1Fields.add(mainLift1Set1Input);
			
			mainLift1Fields.add(mainLift1Set2Text);
			mainLift1Fields.add(mainLift1Set2Input);
			
			mainLift1Fields.add(mainLift1Set3Text);
			mainLift1Fields.add(mainLift1Set3Input);
			
			mainLift1Fields.add(mainLift1Set4Text);
			mainLift1Fields.add(mainLift1Set4Input);

			mainLift1Fields.add(mainLift1Set5Text);
			mainLift1Fields.add(mainLift1Set5Input);

			mainLift1Fields.add(mainLift1Set6Text);
			mainLift1Fields.add(mainLift1Set6Input);
			
			mainPanel.add(mainLift1Fields);
			
			//main lift 2
			mainLift2Text.setText("Bench Press");
			mainPanel.add(mainLift2Text);
			
			JLabel mainLift2Fields = new JLabel();
			mainLift2Fields.setLayout(new FlowLayout(FlowLayout.LEFT));
			
			mainLift2Fields.add(mainLift2WeightText);
			mainLift2Fields.add(mainLift2WeightInput);
			
			mainLift2Fields.add(mainLift2Set1Text);
			mainLift2Fields.add(mainLift2Set1Input);
			
			mainLift2Fields.add(mainLift2Set2Text);
			mainLift2Fields.add(mainLift2Set2Input);

			mainLift2Fields.add(mainLift2Set3Text);
			mainLift2Fields.add(mainLift2Set3Input);

			mainLift2Fields.add(mainLift2Set4Text);
			mainLift2Fields.add(mainLift2Set4Input);
			
			mainPanel.add(mainLift2Fields);
			
			//main lift 3
			mainLift3Text.setText("Deadlift");
			mainPanel.add(mainLift3Text);
			
			JLabel mainLift3Fields = new JLabel();
			mainLift3Fields.setLayout(new FlowLayout(FlowLayout.LEFT));
			
			mainLift3Fields.add(mainLift3WeightText);
			mainLift3Fields.add(mainLift3WeightInput);
			
			mainLift3Fields.add(mainLift3Set1Text);
			mainLift3Fields.add(mainLift3Set1Input);
			
			mainLift3Fields.add(mainLift3Set2Text);
			mainLift3Fields.add(mainLift3Set2Input);
			
			mainLift3Fields.add(mainLift3Set3Text);
			mainLift3Fields.add(mainLift3Set3Input);
			
			mainLift3Fields.add(mainLift3Set4Text);
			mainLift3Fields.add(mainLift3Set4Input);
			
			mainPanel.add(mainLift3Fields);
			
			//main lift 4
			mainLift4Text.setText("Overhead Press");
			mainPanel.add(mainLift4Text);
			
			JLabel mainLift4Fields = new JLabel();
			mainLift4Fields.setLayout(new FlowLayout(FlowLayout.LEFT));
			
			mainLift4Fields.add(mainLift4WeightText);
			mainLift4Fields.add(mainLift4WeightInput);
			
			mainLift4Fields.add(mainLift4Set1Text);
			mainLift4Fields.add(mainLift4Set1Input);
			
			mainLift4Fields.add(mainLift4Set2Text);
			mainLift4Fields.add(mainLift4Set2Input);
			
			mainLift4Fields.add(mainLift4Set3Text);
			mainLift4Fields.add(mainLift4Set3Input);
			
			mainLift4Fields.add(mainLift4Set4Text);
			mainLift4Fields.add(mainLift4Set4Input);
			
			mainPanel.add(mainLift4Fields);
			
			//accessory 1
			accessory1Text.setText("Lat Pulldowns");
			mainPanel.add(accessory1Text);
			
			JLabel accessory1Fields = new JLabel();
			accessory1Fields.setLayout(new FlowLayout(FlowLayout.LEFT));
			
			accessory1Fields.add(accessory1WeightText);
			accessory1Fields.add(accessory1WeightInput);

			accessory1Fields.add(accessory1Set1Text);
			accessory1Fields.add(accessory1Set1Input);
			
			mainPanel.add(accessory1Fields);
			
			//accessory 2
			accessory2Text.setText("Rows");
			mainPanel.add(accessory2Text);
			
			JLabel accessory2Fields = new JLabel();
			accessory2Fields.setLayout(new FlowLayout(FlowLayout.LEFT));

			accessory2Fields.add(accessory2WeightText);
			accessory2Fields.add(accessory2WeightInput);

			accessory2Fields.add(accessory2Set1Text);
			accessory2Fields.add(accessory2Set1Input);
			
			mainPanel.add(accessory2Fields);
			
			//accessory 3
			accessory3Text.setText("Bicep Curls");
			mainPanel.add(accessory3Text);
			
			JLabel accessory3Fields = new JLabel();
			accessory3Fields.setLayout(new FlowLayout(FlowLayout.LEFT));

			accessory3Fields.add(accessory3WeightText);
			accessory3Fields.add(accessory3WeightInput);

			accessory3Fields.add(accessory3Set1Text);
			accessory3Fields.add(accessory3Set1Input);
			
			mainPanel.add(accessory3Fields);
		}
		
		
		JLabel buttons = new JLabel();
		buttons.setLayout(new FlowLayout());
		
		//back button
		backButton = new JButton("Back");
		backButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Homepage homepage = new Homepage(frame);
				homepage.initGUI();
			}
		});
		buttons.add(backButton);
		
		
		//save button
		saveButton = new JButton("Save");
		saveButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ArrayList<String> data = new ArrayList<String>();
				IOHandler io = new IOHandler();
				
				data.add(dateInput.getText());
				
				if (workoutNumber == 1)
					data.add("Workout 1");
				else if (workoutNumber == 2)
					data.add("Workout 2");
				else if (workoutNumber == 3)
					data.add("Workout 3");
				else if (workoutNumber == 4)
					data.add("Workout 4");
				
				data.add(mainLift1Text.getText());
				data.add(mainLift1WeightInput.getText());
				data.add(mainLift1Set1Input.getText());
				data.add(mainLift1Set2Input.getText());
				data.add(mainLift1Set3Input.getText());
				data.add(mainLift1Set4Input.getText());
				data.add(mainLift1Set5Input.getText());
				data.add(mainLift1Set6Input.getText());
				
				data.add(mainLift2Text.getText());
				data.add(mainLift2WeightInput.getText());
				data.add(mainLift2Set1Input.getText());
				data.add(mainLift2Set2Input.getText());
				data.add(mainLift2Set3Input.getText());
				data.add(mainLift2Set4Input.getText());
				
				data.add(mainLift3Text.getText());
				data.add(mainLift3WeightInput.getText());
				data.add(mainLift3Set1Input.getText());
				data.add(mainLift3Set2Input.getText());
				data.add(mainLift3Set3Input.getText());
				data.add(mainLift3Set4Input.getText());
				
				data.add(mainLift4Text.getText());
				data.add(mainLift4WeightInput.getText());
				data.add(mainLift4Set1Input.getText());
				data.add(mainLift4Set2Input.getText());
				data.add(mainLift4Set3Input.getText());
				data.add(mainLift4Set4Input.getText());
				
				data.add(accessory1Text.getText());
				data.add(accessory1WeightInput.getText());
				data.add(accessory1Set1Input.getText());
				
				data.add(accessory2Text.getText());
				data.add(accessory2WeightInput.getText());
				data.add(accessory2Set1Input.getText());
				
				data.add(accessory3Text.getText());
				data.add(accessory3WeightInput.getText());
				data.add(accessory3Set1Input.getText());
				
				io.writeToDocument(data, "workouts.txt");
				//idea is to have a joptionpane confirm that the workout gets saved, but I'm pretty sure even if it fails
				//to write the workout to the file in the iohandler the joptionpane will still pop up
				//so I need to detect if the throw blocks get triggered in the writeToDocument method
				//if they don't, the save was successful, if they do it wasn't
				JOptionPane.showMessageDialog(frame, "Workout successfully logged!");
				Homepage homepage = new Homepage(frame);
				homepage.initGUI();
			}
		});
		buttons.add(saveButton);
		
		mainPanel.add(buttons);
	
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
