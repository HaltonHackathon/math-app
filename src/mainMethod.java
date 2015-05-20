import java.awt.*;


import javax.swing.*;

public class mainMethod extends JApplet {
	protected JPanel graph = new JPanel(), value = new JPanel(), buttons = new JPanel();
	
	public void init(){
			Container main = getContentPane();
			main.setLayout(null);;
			
			main.add(graph);
			main.add(value);
			main.add(buttons);
		
	}
	
	public void paint (Graphics g){
		
	}
	
	public static void main (String[] args){
		Toolkit tk = Toolkit.getDefaultToolkit();
	    Dimension d = tk.getScreenSize();
	    System.out.println("Screen width = " + d.height*4/3);
	    System.out.println("Screen height = " + d.height);
	    
	    run(new mainMethod(), d.height*4/3, d.height);
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

}
