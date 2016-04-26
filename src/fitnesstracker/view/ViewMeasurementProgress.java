package fitnesstracker.view;

import java.awt.Dimension;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.time.Day;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import fitnesstracker.model.IOHandler;

public class ViewMeasurementProgress {
	
	JFrame frame;
	
	public ViewMeasurementProgress(JFrame frame) {
		this.frame = frame;
	}
	
	public void displayPage() {
		
		frame.getContentPane().removeAll();
		IOHandler iohandler = new IOHandler();
		
		ArrayList<String> data = iohandler.readFromDocument("chest.txt");
		//XYDataset dataset = createDataset(data);
		
		
		XYSeries xyseries = new XYSeries("Measurements");
		//measurements
		xyseries.add(1, 1.0);
		xyseries.add(2, 3.0);
		xyseries.add(3, 2.0);
		xyseries.add(4, 0.0);
		xyseries.add(5, 3.0);
		XYDataset xydataset = new XYSeriesCollection(xyseries);
		
		JFreeChart chart = ChartFactory.createXYLineChart("Goals", "Fixture Number", "Goals", xydataset);
		ChartPanel cp = new ChartPanel(chart) {

			@Override
			public Dimension getPreferredSize() {
				return new Dimension(320, 240);
			}
		};
		//cp.setMouseWheelEnabled(true);
		
		frame.add(cp);
		
		frame.revalidate();
		frame.repaint();
	}
	
	private XYDataset createDataset(ArrayList<String> data) {
	    TimeSeriesCollection dataset = new TimeSeriesCollection();

		for (int i=0; i<data.size(); i+=2) {
			Date date = new Date();
			DateFormat dateFormatter = null;
			try {
				date = dateFormatter.parse(data.get(i));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			TimeSeries timeSeries = new TimeSeries("data");
		    timeSeries.add(new Day(date),i+1);
		    dataset.addSeries(timeSeries);
		}
	    return dataset;

	}

}
