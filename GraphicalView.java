/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author b00069477
 */
public class GraphicalView extends View {
    private int current_temp = 20;
	private static final int width = 20;
	private static final int top = 30;
	private static final int left = 42;
	private static final int right = 250;
	private static final int height = 200;
        private Font def = new Font("Verdana", Font.BOLD, 10);
   
        public void paintComponent(Graphics g)
    {
                g.setFont(def);
                g.drawString("Graphical View", 25, 20);
        	g.setColor(Color.black);
		g.drawRect(left,top, width, height);
		g.setColor(Color.red);
		g.fillOval(left-width/2, top+height-width/3,width*2, width*2);
		g.setColor(Color.black);
		g.drawOval(left-width/2, top+height-width/3,width*2, width*2);
		g.setColor(Color.white);
		g.fillRect(left+1,top+1, width-1, height-1);
		g.setColor(Color.red);
		long redtop = height*(current_temp - 50)/(0 - 50);
		g.fillRect(left+1, top + (int)redtop, width-1, height-(int)redtop);
    }
    

     @Override
    public void updateviews(int temperature) {   
        current_temp = temperature;
        repaint();
    }
  
}
