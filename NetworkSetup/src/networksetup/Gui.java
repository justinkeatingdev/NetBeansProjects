/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networksetup;

import java.util.*;
import javax.swing.*;

/**
 *
 * @author user
 */
public class Gui {
    
    public void Layout(){
        
        Buttons();
        
    }
    
    public void Buttons(){
        
        JButton start = new JButton ("Start");
        start.setBounds(0, 0, 100, 30);
        
        JButton Done = new JButton ("Start");
        Done.setBounds(0, 0, 100, 30);
        
        JButton Test = new JButton ("Start");
        Test.setBounds(0, 0, 100, 30);
        
        JButton PC = new JButton ("PC");
        start.setBounds(0, 0, 100, 30);

	JButton Router = new JButton ("Router");
        start.setBounds(0, 0, 100, 30);

	JButton Server = new JButton ("Server");
        start.setBounds(0, 0, 100, 30);

	JButton Switch = new JButton ("Switch");
        start.setBounds(0, 0, 100, 30);
        
    }
    
    
}
