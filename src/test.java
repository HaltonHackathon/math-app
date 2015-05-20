import java.io.IOException;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

import javax.swing.*;

public class test extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	
	JLabel entryLabel = new JLabel("Entries");
	TextArea entryBox = new TextArea();
	
	JButton addButton = new JButton("Add Entries");
	
	public test ( String title ) throws IOException{
		super( title );
		
		setLayout(new FlowLayout());
		
		add(entryLabel);
		add(entryBox);
		
		add(addButton);
		
		entryLabel.setFont(entryLabel.getFont().deriveFont(Font.BOLD, 32.0f));
		entryBox.setEditable(false);
		
		addButton.addActionListener(this);
		
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}
	
	public static void run() throws IOException{
		test frame  = new test( "Home" );
	    
   		frame.setSize( 800, 600 );
    	frame.setVisible(true);  
//    	frame.setResizable(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) throws IOException{
		run();
	}
}
