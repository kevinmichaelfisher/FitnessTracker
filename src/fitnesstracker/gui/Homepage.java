package fitnesstracker.gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
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
		jp.addComponentListener(new ResizeListener());
		GridLayout gl1 = new GridLayout(2,0);
		jp.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
		jp.setLayout(gl1);
			 
		JLabel jl1 = new JLabel();
		//jl1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		jl1.setLayout(new BoxLayout(jl1, BoxLayout.PAGE_AXIS));
		////fitnesstrackertext.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		//fitnesstrackertext.setHorizontalAlignment(JLabel.CENTER);
		BufferedImage myPicture;
		try {
			myPicture = ImageIO.read(new File("barbell.png"));
			JLabel picLabel = new JLabel(new ImageIcon(myPicture));
			picLabel.setAlignmentX((float) 0.5);
			//fitnesstrackertext.add(picLabel);
			jl1.add(picLabel);

		} catch (IOException e) {
			e.printStackTrace();
		}
		JLabel fitnesstrackertext = new JLabel();
		fitnesstrackertext.setText("Fitness Tracker");
		fitnesstrackertext.setFont(new Font("Arial", Font.BOLD, 50));
		fitnesstrackertext.setAlignmentX((float) 0.5);
		jl1.add(fitnesstrackertext);

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
	
	private class ResizeListener implements ComponentListener {

		@Override
		public void componentResized(ComponentEvent e) {
			Homepage h = new Homepage(frame);
			h.initGUI();
		}

		@Override
		public void componentMoved(ComponentEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void componentShown(ComponentEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void componentHidden(ComponentEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
}
