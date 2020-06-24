/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TempDisplay {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override public void run() {
				//Create the frame and buttons
				JFrame frame = new JFrame("Temperature Views");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); frame.setResizable(false);
				JPanel cPanel = new JPanel(); 
				JButton incButton = new JButton("Increase"); cPanel.add(incButton);
				JButton decButton = new JButton("Decrease"); cPanel.add(decButton); 


				//1. Create the MODEL class, to store the temperature and provide related operations
				TempModel theModel = new TempModel();

				//2. Create two VIEWs to display the temperature digitally and graphically
				ArrayList<View> theViews = new ArrayList<>();

				DigitalView tDigital = new DigitalView();
				tDigital.setPreferredSize(new Dimension(130, 80));  
				theViews.add(tDigital);

				GraphicalView tGraphic = new GraphicalView();
				tGraphic.setPreferredSize(new Dimension(130, 270));  
				theViews.add(tGraphic);


				//3. Create the CONTROLLER, that handles interactions between the views and the model
				Controller theController = new Controller(theViews, theModel, incButton, decButton);


				//Add the components to the frame
				frame.add(tDigital, BorderLayout.WEST);
				frame.add(tGraphic, BorderLayout.EAST);
				frame.add(cPanel, BorderLayout.NORTH);
				frame.pack();
				frame.setVisible(true);
				
			}});
	}

}