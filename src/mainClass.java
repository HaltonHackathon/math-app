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
		repaint();
	}
	
	
	protected JPanel graph = new JPanel(), value = new JPanel(), buttons = new JPanel();
	
	
	protected JButton reset = new JButton("Reset"), apply = new JButton("Apply Changes");
	
	Toolkit tk = Toolkit.getDefaultToolkit();
	protected static Dimension d;
	
	
	protected void setDim(){
		d = new Dimension(800, 600);
		graph.setBounds(0, 0, (int)d.getWidth(), (int)d.getHeight()*2/3);
		value.setBounds( 0, (int)d.getHeight()*2/3, (int)d.getWidth()/2, (int)d.getHeight()/3);
		buttons.setBounds((int)d.getWidth()/2, (int)d.getHeight()*2/3, (int) d.getWidth()/2, (int)d.getHeight()/3 );
		
		
	}
	
	
	
	public void init(){
		setDim();
			
			Container main = getContentPane();
			main.add(graph);
			main.add(value);
			main.add(buttons);
			main.setLayout(null);
			
			value.setLayout(new CardLayout());
			
			
			
			buttons.add(apply);
			buttons.add(reset);
			
			
			
			
			graph.setVisible(true);
			value.setVisible(true);
			buttons.setVisible(true);
			
			
			setDim();
			
			
			apply.addActionListener(new ActionListener() {
				public void actionPerformed (ActionEvent e){
		
				}
			});
			
			reset.addActionListener(new ActionListener() {
				public void actionPerformed (ActionEvent e){
			
				}

				

				

			});
			
			
	}
	
	public void paint (Graphics g){
		this.paintComponents(g);
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
