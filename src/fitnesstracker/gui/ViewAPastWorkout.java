package fitnesstracker.gui;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import fitnesstracker.logic.IOHandler;

public class ViewAPastWorkout {
	
	JFrame frame;
	ArrayList<String> workoutList;
	JButton saveButton, backButton;
	
	public ViewAPastWorkout(JFrame frame) {
		this.frame = frame;
	}
	
	protected void initGUI() {
		frame.getContentPane().removeAll();

		IOHandler iohandler = new IOHandler();
		
		workoutList = iohandler.readFromDocument("workouts.txt");
		
		if (workoutList.size() == 0) {
			JOptionPane.showMessageDialog(frame, "You haven't logged any workouts!");
			Homepage homepage = new Homepage(frame);
			homepage.initGUI();
		}
		else {
			String[] arrayForJList = new String[workoutList.size()/37]; 	/* this will create an array where the first two elements
																					are the date and workout number of the first workout
																					in the list, and so on
																			*/
			
			JPanel mainPanel = new JPanel();
			mainPanel.setLayout(new GridLayout(2,0));
			
			JLabel jListArea = new JLabel();
			jListArea.setLayout(new FlowLayout());
			
			for (int i=0,j=0; i<workoutList.size(); i+=37,j++) {
				arrayForJList[j] = workoutList.get(i) + ' ' + workoutList.get(i+1);
			}
			
			JList<String> workoutJList = new JList<String>(arrayForJList);
			workoutJList.addMouseListener(new MouseAdapter());
			mainPanel.add(workoutJList);
			
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
	}
	
	private class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			JButton trackAWorkout_button_selection = (JButton)e.getSource();
			
			if (trackAWorkout_button_selection.equals(saveButton)) {
				System.out.println();
				
			}
			else if (trackAWorkout_button_selection.equals(backButton)) {
				Homepage homepage = new Homepage(frame);
				homepage.initGUI();
			}
		}
	}
	
	private class MouseAdapter implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			JList list = (JList)e.getSource();
	         if (e.getClickCount() == 2) {
	        	 SinglePastWorkoutViewer singlePastWorkoutViewer = new SinglePastWorkoutViewer(frame, list.locationToIndex(e.getPoint()), workoutList);
	        	 singlePastWorkoutViewer.initGUI();
	          }			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
