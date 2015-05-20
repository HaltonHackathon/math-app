

import java.util.*;
import java.applet.Applet;
import java.awt.*;

public class Main extends Applet {
	public void init(){
		Button b = new Button("Hello World!");
		
		b.addActionListener([color=#FFFF00] new ActionListener() [/color] 
				{
			public void actionPerformed (ActionEvent e){
				System.out.println("Hello World!");
			}
				});
	}
	public void paint (Graphics g){
		
	}
}
