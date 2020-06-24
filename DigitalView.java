/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.Color;
import static java.awt.Component.TOP_ALIGNMENT;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author b00069477
 */
public class DigitalView extends View{
    private int current_temp = 20;
    private Font f = new Font("Verdana", Font.BOLD, 20);
    private Font def = new Font("Verdana", Font.BOLD, 10);
      @Override
    public void paintComponent(Graphics g)
    {
        Graphics2D g2D = (Graphics2D) g;
        g2D.setFont(def);
        g2D.drawString("Digital view", 50, 20);
        g2D.setFont(f);
        g2D.setColor(Color.red);
        g2D.drawString(Integer.toString(current_temp) + " C", 50, 50);
    }

    @Override
    public void updateviews(int temperature) {   
        current_temp = temperature;
        repaint();
    }
}
