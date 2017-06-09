//Alex Bledsoe, 06/09/2017

// Code from http://cs.lmu.edu/~ray/notes/javagraphics/ 
// and https://stackoverflow.com/questions/16206417/trying-to-draw-lines-with-jpanel

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;

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
    	 
    	 // Draw The letter 'A'
         g.drawLine(10,200,60,50);
         g.drawLine(60,50,110,200);
         g.drawLine(35, 130, 85, 130);

         //Draw the letter 'L'
        g.drawLine(120,50,120,200);
        g.drawLine(120,200,180,200);

        //Draw the letter 'E'
        g.drawLine(190,200,190,50);
        g.drawLine(190,50,240,50);
        g.drawLine(190,125,240,125);
        g.drawLine(190,200,240,200);

        //Draw the letter 'X'
        g.drawLine(250,50,370,200);
        g.drawLine(250,200,370,50);
		 
		 
		 
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
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
        
        // 4. Put a panel on the window
        frame.add(new LinesDemo());
    }
}
