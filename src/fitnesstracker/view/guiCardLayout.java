package fitnesstracker.view;

import java.awt.CardLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class guiCardLayout {
	
	JFrame frame;
	CardLayout cardLayout;
	
	public guiCardLayout() { 
		
	}
	
	/**
	 * Create and display the window
	 */
	public void createWindow() {
		frame = new JFrame("Fitness Tracker");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setVisible(true);		
	}

	/**
	 * Initialize the gui to the current window
	 */
	public void showGui() {
		JPanel mainPanel = new JPanel();
		
	//begin homepage
		JPanel homepage = new JPanel();
		//jp.addComponentListener(new ResizeListener());
		GridLayout homepage_layout_gridLayout = new GridLayout(2,0);
		homepage.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
		homepage.setLayout(homepage_layout_gridLayout);
			 
		JLabel homepage_label_logo = new JLabel();
		//jl1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		homepage_label_logo.setLayout(new BoxLayout(homepage_label_logo, BoxLayout.PAGE_AXIS));
		////fitnesstrackertext.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		//fitnesstrackertext.setHorizontalAlignment(JLabel.CENTER);
		BufferedImage logoImage;
		try {
			logoImage = ImageIO.read(new File("barbell.png"));
			JLabel logoImageLabel = new JLabel(new ImageIcon(logoImage));
			logoImageLabel.setAlignmentX((float) 0.5);
			//fitnesstrackertext.add(picLabel);
			homepage_label_logo.add(logoImageLabel);

		} catch (IOException e) {
			e.printStackTrace();
		}
		JLabel logoText = new JLabel();
		logoText.setText("Fitness Tracker");
		logoText.setFont(new Font("Arial", Font.BOLD, 50));
		logoText.setAlignmentX((float) 0.5);
		homepage_label_logo.add(logoText);

		homepage.add(homepage_label_logo);
		
		
		JLabel homepage_label_mainButtonsArea = new JLabel();
		//options.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		homepage_label_mainButtonsArea.setLayout(new GridLayout(2,2));
		 
		JButton homepage_button_trackAWorkout = new JButton("Track a workout");
		//homepage_button_trackAWorkout.addActionListener(new ButtonListener());
		homepage_label_mainButtonsArea.add(homepage_button_trackAWorkout);
		 
		JButton homepage_button_viewAPastWorkout = new JButton("View a past workout");
		//homepage_button_viewAPastWorkout.addActionListener(new ButtonListener());
		homepage_label_mainButtonsArea.add(homepage_button_viewAPastWorkout);
		 
		JButton homepage_button_trackAMeasurement = new JButton("Track a measurement");
		//homepage_button_trackAMeasurement.addActionListener(new ButtonListener());
		homepage_label_mainButtonsArea.add(homepage_button_trackAMeasurement);
		
		JButton homepage_button_viewAPastMeasurement = new JButton("View measurement progress");
		//homepage_button_viewAPastMeasurement.addActionListener(new ButtonListener());
		homepage_label_mainButtonsArea.add(homepage_button_viewAPastMeasurement);
		
		homepage.add(homepage_label_mainButtonsArea);
	//end homepage
		
	
		
		cardLayout = new CardLayout();
		mainPanel.setLayout(cardLayout);
		mainPanel.add("homepage", homepage);
		frame.add(mainPanel);
		cardLayout.show(mainPanel, "homepage");
		
	
		
	}
	
}
