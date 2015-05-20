import java.awt.*;


import javax.swing.*;

public class mainMethod extends JApplet {
	protected JButton b1 = new JButton("Hello World!");
	
	public void init(){
			Container main = getContentPane();
			main.setLayout(new FlowLayout());
			main.add(b1);
		
	}
	public void paint (Graphics g){
		
	}
	
	public static void main (String[] args){
		Toolkit tk = Toolkit.getDefaultToolkit();
	    Dimension d = tk.getScreenSize();
	    System.out.println("Screen width = " + d.width);
	    System.out.println("Screen height = " + d.height);
	    
	    run(new mainMethod(), d.height, d.height*4/3);
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
