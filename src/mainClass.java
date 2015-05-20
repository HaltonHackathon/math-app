//import org.jfree.chart.ChartPanel;
//import org.jfree.chart.ChartFactory;
//import org.jfree.chart.JFreeChart;
//import org.jfree.ui.ApplicationFrame;
//import org.jfree.ui.RefineryUtilities;
//import org.jfree.chart.plot.PlotOrientation;
//import org.jfree.data.category.DefaultCategoryDataset;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class mainClass extends JApplet implements ComponentListener{
	
	public mainClass(){
		setDim();
	}
	
	
	protected JPanel graph = new JPanel(), value = new JPanel(), buttons = new JPanel();
	
	Toolkit tk = Toolkit.getDefaultToolkit();
	protected static Dimension d;
	
	
	protected void setDim(){
		d = new Dimension(1280, 800);
		graph.setBounds(0, 0, (int)d.getWidth(), (int)d.getHeight()*2/3);
		value.setBounds( 0, (int)d.getHeight()*2/3, (int)d.getWidth()/2, (int)d.getHeight()/3);
		buttons.setBounds((int)d.getWidth()/2, (int)d.getHeight()*2/3, (int) d.getWidth()/2, (int)d.getHeight()/3 );
	}
	protected void setDim(double height, double width){
		graph.setBounds(0, 0, (int)width, (int)height*2/3);
		value.setBounds( 0, (int)height*2/3, (int)width/2, (int)height/3);
		buttons.setBounds((int)width/2, (int)height*2/3, (int) width/2, (int)height/3 );
		
	}
	
	
	public void init(){
		setDim();
			
			Container main = getContentPane();
			main.add(graph);
			main.add(value);
			main.add(buttons);
			main.setLayout(null);
			
			
			graph.setBackground(Color.BLUE);
			value.setBackground(Color.GREEN);
			buttons.setBackground(Color.RED);	
			
			graph.setOpaque(true);
			value.setOpaque(true);
			buttons.setOpaque(true);
			
			graph.setVisible(true);
			value.setVisible(true);
			buttons.setVisible(true);
			
			
			setDim();
			repaint();
			
			main.addComponentListener(new ComponentListener(){
				public void componentResized(ComponentEvent e){
					double height = main.getHeight();
					double width = main.getWidth();
					setDim(height, width);
				}

				@Override
				public void componentMoved(ComponentEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void componentShown(ComponentEvent e) {
					// TODO Auto-generated method stub
					repaint();
				}

				@Override
				public void componentHidden(ComponentEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
	}
	
	public void paint (Graphics g){
		
	}
	
	
	
	public static void main (String[] args){

	    run(new mainClass(), d.width, d.height);
	}
	
	public static void run(JApplet applet, int width, int height){
	    JFrame frame = new JFrame();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.getContentPane().add(applet);
	    frame.setSize(width, height);
	    applet.init();
	    applet.start();
	    frame.setVisible(true);
	    
	}


	@Override
	public void componentResized(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void componentMoved(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void componentShown(ComponentEvent e) {
		// TODO Auto-generated method stub
		setDim();
		repaint();
	}


	@Override
	public void componentHidden(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

}
