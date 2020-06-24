/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;

/**
 *
 * @author b00069477
 */
public class Controller {
    TempModel temp = new TempModel();
    ArrayList<View> views = new ArrayList();

    public Controller(ArrayList<View> c, TempModel p, JButton Inc, JButton Dec)
    {
        views = c;
        temp = p;
           Inc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                temp.incTemp();
                for(int i =0; i < views.size(); i++)
                {
                    views.get(i).updateviews(temp.getTemperature());
                }
                
            }
        }
        );
           Dec.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                temp.decTemp();
                 for(int i =0; i < views.size(); i++)
                {
                    views.get(i).updateviews(temp.getTemperature());
                }
                
                
                
                
            }
        }
        );
           
           
           
           
    }
    

    
    
    
}
