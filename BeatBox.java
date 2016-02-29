import java.awt.*;
import java.awt.event.*;
import java.swing.*;
import java.io.*;
import java.lang.*;


//this program will have:
//6 buttons
//1 soundbutton panel
//play sounds from the windows system

public class Beatbox extends JFrame implements ActionListener {
        
        // Private variables
        private static final long serialVersionUID = 1;
        private JPanel mainPanel;
        private JPanel buttonPanel;
        private static boolean sound1 = false;
        private static boolean sound2 = false;
        private static boolean sound3 = false;
        private static boolean sound4 = false;
        private static boolean sound5 = false;
        private static boolean sound6 = false;
        private static boolean sound  = false;
        
        public LayoutTest() {
                
                //constructor
                super( "BeatBox" );
                JButton button;
                JLable label;
                
                //allows  window to be closed
                setDefaultClose Operation(JFrame.EXIT_ON_CLOSE);
                setLayout( new BorderLayout() );
                
                //creates the button
                buttonPanel = new JPanel();
                buttonPanel.setLayout( new GridLayout(1 , 6) );
                
                //creates button 1
                button = new JButton( "Sound1" );
                button.setActionCommand( " One " );
                button.addActionCommand( this );
                buttonPanel.add( button );
                
                //creates button 2
                button = new JButton( "Sound2" );
                button.setActionCommand( " Two " );
                button.addActionCommand( this );
                buttonPanel.add( button );
                
                //creates button 3
                button = new JButton( "Sound3" );
                button.setActionCommand( " Three " );
                button.addActionCommand( this );
                buttonPanel.add( button );
                
                //creates button 4
                button = new JButton( "Sound4" );
                button.setActionCommand( " Four " );
                button.addActionCommand( this );
                buttonPanel.add( button );
                
                //creates button 5
                button = new JButton( "Sound5" );
                button.setActionCommand( " Five " );
                button.addActionCommand( this );
                buttonPanel.add( button );
                
                //creates button 6
                button = new JButton( "Sound6" );
                button.setActionCommand( " Six " );
                button.addActionCommand( this );
                buttonPanel.add( button );
                
                //adds buttons
                add(buttonPanel, BorderLayout.SOUTH);

                //sizes the window to the prefered size
                setSize( getPreferredSize() );
                //packs all the components together
                pack();
                //makes the window visible
                setVisible( true );
                
        }// layout test end
        
        public void  actionPerformed( SctionEvent e ){
                JButton button = (JButton)e.getSource();
                
                //button actions 
                switch(button.getActionCommand() ) {
                        case " One ":
                                sound1 = true;
                                Sound =true;
                                break;
                        case " Two ":
                                sound2 = true;
                                Sound =true;
                                break;
                        case " Three ":
                                sound3 = true;
                                Sound =true;
                                break;
                        case " Four ":
                                sound4 = true;
                                Sound =true;
                                break;
                        case " Five ":
                                sound5 = true;
                                Sound =true;
                                break;
                        case " Six ":
                                sound6 = true;
                                Sound =true;
                                break;
                        default:
                                JOptionPane.showMessageDialog( this, "WHERE ARE YOU! THIS DOESNT EXIST!OH GOD HOW DID YOU GET HERE" );
                                break;
                }//end of switch
                
        }//end of action performed
        
        public static void main(String[] args) {
                //list of buttons changing to files
                if(sound1== true)
                {
                     String wavFile = "Alarm01.wav";
                }//end of sound1
                
                if(sound2== true)
                {
                     String wavFile = "tada.wav";
                }//end of sound2
                
                if(sound3== true)
                {
                     String wavFile = "Alarm05.wav";
                }//end of sound3
                
                if(sound4== true)
                {
                     String wavFile = "Alarm02.wav";
                }//end of sound4
                
                if(sound5== true)
                {
                     String wavFile = "Alarm03.wav";
                }//end of sound5
                
                if(sound6== true)
                {
                     String wavFile = "Alarm04.wav";
                }//end of sound6
                
                //creates the layout
                new LayoutTest();
                
                //creates the runnable
                Thread thread = new Thread(new myRunnable());
                
                
        }//main method end
        if(Sound==true)
        {
                //starts thread
                thread.start();
                
                //runs the code together
                Runnable myRunnable = new Runnable()
                {
                        public void run()
                        {
                                 try
                                        {
                                                //selects wav file based on button
                                                WavFile wavFile = WavFile.openwavFile(new File(args[0]));
                                                
                                                //variables needed to play wav file
                                                int framesRead;
                                                double min = Double.MAX_VALUE;
                                                double max = Double.MIN_VALUE;
                                                
                                                //displays the wav file
                                                wavFile.display();
                                                
                                                //retrieves number of channels
                                                int numChannels = wavFile.getNumChannels();
                                                
                                                //creates a buffer
                                                double[] buffer = new double[100 * numChannels];
                        
                                        do
                                        {
                                                //reads the amount of frames in the wav file
                                                
                                                framesRead = wavFile.readFrames(buffer, 100);
                                                //for loop
                                                
                                                for (int s=0 ; s<framesRead * numChannels ; s++)
                                                { 
                                                        if (buffer[s] > max) max = buffer[s];
                                                        if (buffer[s] < min) min = buffer[s];
                                                }//end of for loop
                                
                                        }//end of do
                                        while (framesRead != 0);
                                        {
                                                //closes wav file
                                                wavFile.close();
                                        }//while end
                                        catch (Exception r)
                                        {
                                                //prints errors in console
                                                System.err.println(r);
                                        }//catch end
                                        sound= false;        
                        }//end of run
                }//end of runnable        
        }//end of sound 
  }//end of program
