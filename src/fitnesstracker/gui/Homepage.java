package fitnesstracker.gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Homepage {
	
	JFrame frame;
	JButton homepage_button_trackAWorkout,
			homepage_button_viewAPastWorkout,
			homepage_button_trackAMeasurement,
			homepage_button_viewAPastMeasurement;
	
	public Homepage() {
		
	}
	
	public Homepage(JFrame frame) {
		this.frame = frame;
	}
	
	protected void startApp() {
		frame = new JFrame("Fitness Tracker");
		
		JPanel jp = new JPanel();
		GridLayout gl1 = new GridLayout(2,0);
		jp.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
		jp.setLayout(gl1);
			 
		JLabel jl1 = new JLabel();
		//jl1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		jl1.setLayout(new BorderLayout());
		JLabel fitnesstrackertext = new JLabel();
		fitnesstrackertext.setText("Fitness Tracker");
		//fitnesstrackertext.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		fitnesstrackertext.setHorizontalAlignment(JLabel.CENTER);
		jl1.add(fitnesstrackertext, BorderLayout.CENTER);
		jp.add(jl1);
		
		
		JLabel options = new JLabel();
		//options.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		options.setLayout(new GridLayout(2,2));
		 
		homepage_button_trackAWorkout = new JButton("Track a workout");
		homepage_button_trackAWorkout.addActionListener(new ButtonListener());
		options.add(homepage_button_trackAWorkout);
		 
		homepage_button_viewAPastWorkout = new JButton("View a past workout");
		homepage_button_viewAPastWorkout.addActionListener(new ButtonListener());
		options.add(homepage_button_viewAPastWorkout);
		 
		homepage_button_trackAMeasurement = new JButton("Track a measurement");
		homepage_button_trackAMeasurement.addActionListener(new ButtonListener());
		options.add(homepage_button_trackAMeasurement);
		 
		homepage_button_viewAPastMeasurement = new JButton("View measurement progress");
		homepage_button_viewAPastMeasurement.addActionListener(new ButtonListener());
		options.add(homepage_button_viewAPastMeasurement);
		
		jp.add(options);
		
		frame.add(jp);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setVisible(true);		
	}


	protected void initGUI() {
		
		frame.getContentPane().removeAll();
		
		JPanel jp = new JPanel();
		GridLayout gl1 = new GridLayout(2,0);
		jp.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
		jp.setLayout(gl1);
			 
		JLabel jl1 = new JLabel();
		//jl1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		jl1.setLayout(new BorderLayout());
		JLabel fitnesstrackertext = new JLabel();
		fitnesstrackertext.setText("Fitness Tracker");
		//fitnesstrackertext.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		fitnesstrackertext.setHorizontalAlignment(JLabel.CENTER);
		jl1.add(fitnesstrackertext, BorderLayout.CENTER);
		jp.add(jl1);
		
		
		JLabel options = new JLabel();
		//options.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		options.setLayout(new GridLayout(2,2));
		 
		homepage_button_trackAWorkout = new JButton("Track a workout");
		homepage_button_trackAWorkout.addActionListener(new ButtonListener());
		options.add(homepage_button_trackAWorkout);
		 
		homepage_button_viewAPastWorkout = new JButton("View a past workout");
		homepage_button_viewAPastWorkout.addActionListener(new ButtonListener());
		options.add(homepage_button_viewAPastWorkout);
		 
		homepage_button_trackAMeasurement = new JButton("Track a measurement");
		homepage_button_trackAMeasurement.addActionListener(new ButtonListener());
		options.add(homepage_button_trackAMeasurement);
		 
		homepage_button_viewAPastMeasurement = new JButton("View measurement progress");
		homepage_button_viewAPastMeasurement.addActionListener(new ButtonListener());
		options.add(homepage_button_viewAPastMeasurement);
		
		jp.add(options);
		
		frame.add(jp);
		frame.revalidate();
		frame.repaint();
	}
	
	private class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			JButton homepage_button_selection = (JButton)e.getSource();
			
			if (homepage_button_selection.equals(homepage_button_trackAWorkout)) {
				TrackAWorkout t = new TrackAWorkout(frame);
				t.initGUI();
			}
			else if (homepage_button_selection.equals(homepage_button_viewAPastWorkout)) {
				ViewAPastWorkout viewAPastWorkout = new ViewAPastWorkout(frame);
				viewAPastWorkout.initGUI();
			}
			else if(homepage_button_selection.equals(homepage_button_trackAMeasurement)) {
				TrackAMeasurement trackAMeasurement = new TrackAMeasurement(frame);
				trackAMeasurement.initGUI();
			}
			else if(homepage_button_selection.equals(homepage_button_viewAPastMeasurement)) {
				ViewMeasurementProgress p = new ViewMeasurementProgress(frame);
				p.initGUI();
			}
		}
	}
	
}
