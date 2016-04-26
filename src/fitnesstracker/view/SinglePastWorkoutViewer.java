package fitnesstracker.view;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class SinglePastWorkoutViewer {
	
	JFrame frame;
	JButton backButton;
	int index;
	ArrayList<String> workoutList;
	
	
	public SinglePastWorkoutViewer(JFrame frame, int index, ArrayList<String> workoutList) {
		this.frame = frame;
		this.index = index*37;
		this.workoutList = workoutList;
	}
	
	protected void displayPage() {
		frame.getContentPane().removeAll();
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(17,0));
		
		//date
		JLabel dateJLabel = new JLabel();
		dateJLabel.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JLabel dateText = new JLabel();
		dateText.setText("Date: " + workoutList.get(index++));
		dateJLabel.add(dateText);
		mainPanel.add(dateJLabel);
		
		//workout number
		JLabel workoutNumberJLabel = new JLabel();
		workoutNumberJLabel.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel workoutNumberText = new JLabel();
		workoutNumberText.setText(workoutList.get(index++));
		workoutNumberJLabel.add(workoutNumberText);
		mainPanel.add(workoutNumberJLabel);
		
		
		//main lift 1
		JLabel mainLift1ID = new JLabel();
		mainLift1ID.setText(workoutList.get(index++));
		mainPanel.add(mainLift1ID);
		
		JLabel mainLift1Details = new JLabel();
		mainLift1Details.setLayout(new FlowLayout(FlowLayout.LEFT));
		mainLift1Details.setText(
				"Weight: " + workoutList.get(index++) + 
				" Set 1: " + workoutList.get(index++) +
				" Set 2: " + workoutList.get(index++) +
				" Set 3: " + workoutList.get(index++) +
				" Set 4: " + workoutList.get(index++) +
				" Set 5: " + workoutList.get(index++) +
				" Set 6: " + workoutList.get(index++));
		mainPanel.add(mainLift1Details);
		
		//main lift 2
		JLabel mainLift2ID = new JLabel();
		mainLift2ID.setText(workoutList.get(index++));
		mainPanel.add(mainLift2ID);
		
		JLabel mainLift2Details = new JLabel();
		mainLift2Details.setLayout(new FlowLayout(FlowLayout.LEFT));
		mainLift2Details.setText(
				"Weight: " + workoutList.get(index++) + 
				" Set 1: " + workoutList.get(index++) +
				" Set 2: " + workoutList.get(index++) +
				" Set 3: " + workoutList.get(index++) +
				" Set 4: " + workoutList.get(index++));
		mainPanel.add(mainLift2Details);
		
		//main lift 3
		JLabel mainLift3ID = new JLabel();
		mainLift3ID.setText(workoutList.get(index++));
		mainPanel.add(mainLift3ID);
		
		JLabel mainLift3Details = new JLabel();
		mainLift3Details.setLayout(new FlowLayout(FlowLayout.LEFT));
		mainLift3Details.setText(
				"Weight: " + workoutList.get(index++) + 
				" Set 1: " + workoutList.get(index++) +
				" Set 2: " + workoutList.get(index++) +
				" Set 3: " + workoutList.get(index++) +
				" Set 4: " + workoutList.get(index++));
		mainPanel.add(mainLift3Details);
		
		//main lift 4
		JLabel mainLift4ID = new JLabel();
		mainLift4ID.setText(workoutList.get(index++));
		mainPanel.add(mainLift4ID);
		
		JLabel mainLift4Details = new JLabel();
		mainLift4Details.setLayout(new FlowLayout(FlowLayout.LEFT));
		mainLift4Details.setText(
				"Weight: " + workoutList.get(index++) + 
				" Set 1: " + workoutList.get(index++) +
				" Set 2: " + workoutList.get(index++) +
				" Set 3: " + workoutList.get(index++) +
				" Set 4: " + workoutList.get(index++));
		mainPanel.add(mainLift4Details);
		
		//accessory lift 1
		JLabel accessoryLift1ID = new JLabel();
		accessoryLift1ID.setText(workoutList.get(index++));
		mainPanel.add(accessoryLift1ID);
		
		JLabel accessoryLift1Details = new JLabel();
		accessoryLift1Details.setLayout(new FlowLayout(FlowLayout.LEFT));
		accessoryLift1Details.setText(
				"Weight: " + workoutList.get(index++) + 
				" Set 1: " + workoutList.get(index++));
		mainPanel.add(accessoryLift1Details);
		
		//accessory lift 2
		JLabel accessoryLift2ID = new JLabel();
		accessoryLift2ID.setText(workoutList.get(index++));
		mainPanel.add(accessoryLift2ID);
		
		JLabel accessoryLift2Details = new JLabel();
		accessoryLift2Details.setLayout(new FlowLayout(FlowLayout.LEFT));
		accessoryLift2Details.setText(
				"Weight: " + workoutList.get(index++) + 
				" Set 1: " + workoutList.get(index++));
		mainPanel.add(accessoryLift2Details);
		
		//accessory lift 1
		JLabel accessoryLift3ID = new JLabel();
		accessoryLift3ID.setText(workoutList.get(index++));
		mainPanel.add(accessoryLift3ID);
		
		JLabel accessoryLift3Details = new JLabel();
		accessoryLift3Details.setLayout(new FlowLayout(FlowLayout.LEFT));
		accessoryLift3Details.setText(
				"Weight: " + workoutList.get(index++) + 
				" Set 1: " + workoutList.get(index++));
		mainPanel.add(accessoryLift3Details);
		
		JLabel buttons = new JLabel();
		buttons.setLayout(new FlowLayout());
		
		//back button
		backButton = new JButton("Back");
		backButton.addActionListener(new ButtonListener());
		buttons.add(backButton);
		
		mainPanel.add(buttons);

		frame.add(mainPanel);

		
		frame.revalidate();
		frame.repaint();
	}
	
	private class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			JButton trackAWorkout_button_selection = (JButton)e.getSource();
			if (trackAWorkout_button_selection.equals(backButton)) {
				ViewAPastWorkout viewAPastWorkout = new ViewAPastWorkout(frame);
				viewAPastWorkout.displayPage();
			}
		}
	}
}
