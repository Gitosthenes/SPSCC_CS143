// Student Name     Today's Date

// Code from http://cs.lmu.edu/~ray/notes/javagraphics/ 
// and https://stackoverflow.com/questions/16206417/trying-to-draw-lines-with-jpanel

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * This is an extremely scaled-down sketching canvas; with it you
 * can only scribble thin black lines.  For simplicity the window
 * contents are never refreshed when they are uncovered.
 */
public class LinesDemo extends JPanel {
   
	@Override
    public void paintComponent(Graphics g) {
    	super.paintComponent(g);
    	
		// ############################################################################################################################
		// YOUR CODE GOES HERE
		
    	// Draw some lines on-screen
    	 g.setColor(Color.BLACK);
    	 
    	 // Draw a line down and to the right
         g.drawLine(10,10,20,20);
         
         // Draw a line from the end of ^, up and to the right
         g.drawLine(20,20,40,5);

         // Draw a line from the end of ^, up and to the right
         g.drawLine(40, 5, 60, 10);
		 
		 
		 
		 // END OF STUDENT CODE
		 // ############################################################################################################################
		
    }

    /**
     * A tester method that embeds the panel in a frame so you can
     * run it as an application.
     */
    public static void main(String[] args) {
    	// 1. Create a Window
        JFrame frame = new JFrame("Draw some lines");       
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
        
        // 4. Put a panel on the window
        frame.add(new LinesDemo());
    }
}
