/*
Group 3 Final Project: CSET3600
    Justin Keating
    Chase Conrad
    Mike Bishop
    Joshua Higgins
*/

package NetworkSetup;
import NetworkSetup.networksetup.Config.Host;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Character.UnicodeBlock.of;
import java.util.*;
import javax.swing.*;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;


public class networksetup{
    
    public static void main(String[] args) throws IOException { 
        
        
           //This is the GUI to being with 
           
          JFrame window = new JFrame("New Host");
          window.setVisible(true);
          window.setSize(400,530);                 //creates GUI FRAME
          window.setResizable(false);
          window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          
          JPanel panel = new JPanel();
          panel.setLayout(null);
          window.add(panel);
          
          JButton hostb = new JButton("New Host"); //create host button
          hostb.setBounds(100,50,200,100);
          panel.add(hostb);
          
          JButton routerb = new JButton ("New Router"); //create router button
          routerb.setBounds(100,200,200,100);
          panel.add(routerb);
          
          JButton networkSwitchb = new JButton ("New Switch");  //create switch button
          networkSwitchb.setBounds(100,350,200,100);
          panel.add(networkSwitchb);
          
          
          hostb.addActionListener(new ActionListener()  {     /*when hostb is pressed create config user input for host starts*/
            @Override
            public void actionPerformed(ActionEvent e)  { 
                try {
                    Config.hostConfigWriter();     //button goes to this method  with exception
                } catch (IOException ex) {
                    Logger.getLogger(networksetup.class.getName()).log(Level.SEVERE, null, ex);
                }
                                  
            } 
        }
    );
          
          
          networkSwitchb.addActionListener(new ActionListener()  {     /*when switchb is pressed create config user input for switch starts*/
            @Override
            public void actionPerformed(ActionEvent e)  { 
                try {
                    Config.switchConfigWriter(); //this button goes to switch method with excpetion
                } catch (IOException ex) {
                    Logger.getLogger(networksetup.class.getName()).log(Level.SEVERE, null, ex);
                }
                                  
            } 
        }
    );
          
          routerb.addActionListener(new ActionListener()  {     /*when routerb is pressed create config user input for switch starts*/
            @Override
            public void actionPerformed(ActionEvent e)  { 
                try {
                    Config.routerConfigWriter(); //router button methd with excpetion
                } catch (IOException ex) {
                    Logger.getLogger(networksetup.class.getName()).log(Level.SEVERE, null, ex);
                }
                                  
            } 
        }
    );
          
            
    }

public static class Config      
{
    
    public static void hostConfigWriter() throws IOException  //method to create hst config
    {

       PrintWriter writer = new PrintWriter("C:/NetworkSetup/Host_Config.txt", "UTF-8"); //creates file with format
       
            int test1;

            Scanner operatingtest1 = new Scanner(System.in);
            System.out.println("Enter Amount of Host's Needed (integer please): ");  //user input of host needed
            test1 = operatingtest1.nextInt();
            
            for (int i = 0; i < test1; i++) { //simple for loop iterating user input of host needed
                
        

       String namer1 = Host.CreateConfigPname();    //Calls Host class method create stores return value into tester 

       String tester1 = Host.CreateConfigP();    //Calls Host class method create stores return value into tester

       String tester2 = Host.CreateConfigPV();    //Calls Host class method create stores return value into tester

       String tester3 = Host.CreateConfigPI();      //Calls Host class method create stores return value into tester
       
       writer.println("vm " + namer1 + " {" + '\n' + "   os: " + tester1
               + '\n'  + "   ver: " + tester2 + '\n' + "   eth0: " + tester3 + '\n' + "}" + '\n');
            }
            
            // prints out one iteration of for loop user input then closes file after complete
            
       writer.close();
                 
   
}

    public static void switchConfigWriter() throws IOException 
    {

        PrintWriter writer = new PrintWriter("C:/NetworkSetup/Switch_Config.txt", "UTF-8");
       
            int test2;

            Scanner switchtest2 = new Scanner(System.in);
            System.out.println("Enter Amount of Switch's Needed (integer please): ");  /*User input of switches needed*/
            test2 = switchtest2.nextInt();
            
            for (int i = 0; i < test2; i++) { //for loop of user # switches enterd
                
     

       String namer1 = Switch.CreateConfigSwname();       //Calls Host class method create stores return value into tester

       String tester1 = Switch.CreateConfigSw();   //Calls Host class method create stores return value into tester

       String tester2 = Switch.CreateConfigSwsub();   //Calls Host class method create stores return value into tester

       String tester3 = Switch.CreateConfigSwnet();   //Calls Host class method create stores return value into tester
       
       writer.println("vm " + namer1 + " {" + '\n' + "   os: " + tester1
               + '\n'  + "   ver: " + tester2 + '\n' + "   eth0: " + tester3 + '\n' + "}" + '\n');
            }
            
            // prints out one iteration of for loop user input then closes file after complete
            
       writer.close();

   
}

    public static void routerConfigWriter() throws IOException 
    {
        
      PrintWriter writer = new PrintWriter("C:/NetworkSetup/Router_Config.txt", "UTF-8");
       
            int test3;

            Scanner routertest3 = new Scanner(System.in);
            System.out.println("Enter Amount of Router's Needed (integer please): ");  /*user input of Routers needed*/
            test3 = routertest3.nextInt();
            
            for (int i = 0; i < test3; i++) {
        

       String namer1 = Router.CreateConfigRname();     //Calls Host class method create stores return value into tester

       String tester1 = Router.CreateConfigR();   //Calls Host class method create stores return value into tester

       String tester2 = Router.CreateConfigRsub();  //Calls Host class method create stores return value into tester

       String tester3 = Router.CreateConfigRnet();  //Calls Host class method create stores return value into tester
       
       writer.println("vm " + namer1 + " {" + '\n' + "   os: " + tester1
               + '\n'  + "   ver: " + tester2 + '\n' + "   eth0: " + tester3 + '\n' + "}" + '\n');
            }
            
            // prints out one iteration of for loop user input then closes file after complete
            
       writer.close();
   
}


public static class Host{ /*class for hosts*/
        
        
        public static String CreateConfigPname() throws IOException { //gets hosts name
            
            String userNAME;

            Scanner operatingName = new Scanner(System.in);
            System.out.println("Enter Host's Name: ");  //gets hosts name
            userNAME = operatingName.nextLine();

            return userNAME; //returns host name to store into .cfg
            
        }
    
        
        public static String CreateConfigP() throws IOException { /*method for uer input to create host (server&pc)*/
            
            String userOS;

            Scanner operatingSystem = new Scanner(System.in);
            System.out.println("Enter Host's Operating System");  /*gets operating system*/
            userOS = operatingSystem.nextLine();

            return userOS; //returns host os to store into .cfg
            
        }
        
        
        public static String CreateConfigPV() throws IOException {
            
            String userOSV;
            
            Scanner operatingVersion = new Scanner(System.in);
            System.out.println("Enter Host's Operating System Version");   /*creating operating version*/
            userOSV = operatingVersion.nextLine();
            
            return userOSV; //returns host osv to store into .cfg
            
        }
        
        
        public static String CreateConfigPI() throws IOException {
            
            String userETH;
            
            Scanner operatingEthernet = new Scanner(System.in);
            System.out.println("Enter Host's Ethernet");              /*ip address*/
            userETH = operatingEthernet.nextLine();
            
            return userETH; //returns host eth to store into .cfg
            
        }
               
    }


public static class Switch { /*Class for swtiches*/
    
    
        public static String CreateConfigSwname() throws IOException { //gets swtich name
            
            String swNAME;

            Scanner swName = new Scanner(System.in);
            System.out.println("Enter Switch's Name: ");  /*gets switches name user input system*/
            swNAME = swName.nextLine();

            return swNAME; //returns switch name to store into .cfg
            
        }
    
        public static String CreateConfigSw() throws IOException {
            
            String swETH;
            
            Scanner swEthernet = new Scanner(System.in);
            System.out.println("Enter Switch's IP Address: ");              /*switch ip address input*/
            swETH = swEthernet.nextLine();
            
            return swETH; //returns switch eth to store into .cfg
            
        }
        
        public static String CreateConfigSwsub() throws IOException {
            
            String swSUB;
            
            Scanner swSubnet = new Scanner(System.in);
            System.out.println("Enter Switch's Subnet Address: ");              /*switch sub address input*/
            swSUB = swSubnet.nextLine();
            
            return swSUB;  //returns switch subnet to store into .cfg
            
        }
      
        public static String CreateConfigSwnet() throws IOException {
            
            String swNET;
            
            Scanner swNetmask = new Scanner(System.in);
            System.out.println("Enter Switch's Netmask Address: ");              /*switch netmask address input*/
            swNET = swNetmask.nextLine();
            
            return swNET;   //returns switch netmask to store into .cfg
            
        }
            
        }
         
    
public static class Router{ /*class  for routers*/
    
        public static String CreateConfigRname() throws IOException { //gets router name
            
            String rNAME;

            Scanner rName = new Scanner(System.in);
            System.out.println("Enter Router's Name: ");  /*gets router name input*/
            rNAME = rName.nextLine();

            return rNAME;  //returns router name to store into .cfg
            
        }
    
        public static String CreateConfigR() throws IOException {
            
            String rETH;
            
            Scanner rEthernet = new Scanner(System.in);
            System.out.println("Enter Router's IP Address: ");              /*routers ip address input*/
            rETH = rEthernet.nextLine();
            
            return rETH; //returns router  eth to store into .cfg 
            
        }
    
        public static String CreateConfigRsub() throws IOException {
            
            String rSUB;
            
            Scanner rSubnet = new Scanner(System.in);
            System.out.println("Enter Router's Subnet Address: ");              /*router sub address input*/
            rSUB = rSubnet.nextLine();
            
            return rSUB;  //returns router subnet to store into .cfg
            
        }
    
        public static String CreateConfigRnet() throws IOException {
            
            String rNET;
            
            Scanner rNetmask = new Scanner(System.in);
            System.out.println("Enter Router's Netmask Address: " );              /*routers net address input*/
            rNET = rNetmask.nextLine();
            
            return rNET; //returns router netmask to store into .cfg
            
        }
      
        
    }

    }
}

