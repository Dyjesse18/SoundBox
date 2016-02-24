import java.awt.*;
import java.awt.event.*;
import java.swing.*;
import java.io.*;


//this program will have:
//6 buttons
//1 soundbutton panel
//

public class Beatbox extends JFrame implements ActionListener {
        
        // Private variables
        private static final long serialVersionUID = 1;
        private JPanel mainPanel;
        private JPanel buttonPanel;
        private boolean sound1 = false;
        private boolean sound2 = false;
        private boolean sound3 = false;
        private boolean sound4 = false;
        private boolean sound5 = false;
        private boolean sound6 = false;
        
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
                                break;
                        case " Two ":
                                sound2 = true;
                                break;
                        case " Three ":
                                sound3 = true;
                                break;
                        case " Four ":
                                sound4 = true;
                                break;
                        case " Five ":
                                sound5 = true;
                                break;
                        case " Six ":
                                sound6 = true;
                                break;
                        default:
                                JOptionPane.showMessageDialog( this, "WHERE ARE YOU! THIS DOESNT EXIST!OH GOD HOW DID YOU GET HERE" );
                                break;
                }//end of switch
                
        }//end of action performed
        
        public static void main(String[] args) {
                
                new LayoutTest();
                if(sound1==true)
                {
                        try
                        {
                                WavFile wavFile = WavFile.openWavFile(new File(args[0]));
                                int framesRead;
                                double min = Double.MAX_VALUE;
                                double max = Double.MIN_VALUE;
                                wavFile.display();
                                int numChannels = wavFile.getNumChannels();
                                double[] buffer = new double[100 * numChannels];
                        
                        do
                        {
                                framesRead = wavFile.readFrames(buffer, 100);
                                for (int s=0 ; s<framesRead * numChannels ; s++)
                                { 
                                        if (buffer[s] > max) max = buffer[s];
                                        if (buffer[s] < min) min = buffer[s];
                                }//end of for loop
                                
                        }//end of do
                        while (framesRead != 0);
                        {
                                wavFile.close();
                        }//while end
                        catch (Exception r)
                        {
                                System.err.println(r);
                        }//catch end
                        
                }//end of sound1
                if(sound2==true)
                {
                        try
                        {
                                WavFile wavFile = WavFile.openWavFile(new File(args[0]));
                                int framesRead;
                                double min = Double.MAX_VALUE;
                                double max = Double.MIN_VALUE;
                                wavFile.display();
                                int numChannels = wavFile.getNumChannels();
                                double[] buffer = new double[100 * numChannels];
                        
                        do
                        {
                                framesRead = wavFile.readFrames(buffer, 100);
                                for (int s=0 ; s<framesRead * numChannels ; s++)
                                { 
                                        if (buffer[s] > max) max = buffer[s];
                                        if (buffer[s] < min) min = buffer[s];
                                }//end of for loop
                                
                        }//end of do
                        while (framesRead != 0);
                        {
                                wavFile.close();
                        }//while end
                        catch (Exception r)
                        {
                                System.err.println(r);
                        }//catch end
                        
                }//end of sound2
                if(sound3==true)
                {
                        try
                        {
                                WavFile wavFile = WavFile.openWavFile(new File(args[0]));
                                int framesRead;
                                double min = Double.MAX_VALUE;
                                double max = Double.MIN_VALUE;
                                wavFile.display();
                                int numChannels = wavFile.getNumChannels();
                                double[] buffer = new double[100 * numChannels];
                        
                        do
                        {
                                framesRead = wavFile.readFrames(buffer, 100);
                                for (int s=0 ; s<framesRead * numChannels ; s++)
                                { 
                                        if (buffer[s] > max) max = buffer[s];
                                        if (buffer[s] < min) min = buffer[s];
                                }//end of for loop
                                
                        }//end of do
                        while (framesRead != 0);
                        {
                                wavFile.close();
                        }//while end
                        catch (Exception r)
                        {
                                System.err.println(r);
                        }//catch end
                        
                }//end of sound3
                if(sound4==true)
                {
                        try
                        {
                                WavFile wavFile = WavFile.openWavFile(new File(args[0]));
                                int framesRead;
                                double min = Double.MAX_VALUE;
                                double max = Double.MIN_VALUE;
                                wavFile.display();
                                int numChannels = wavFile.getNumChannels();
                                double[] buffer = new double[100 * numChannels];
                        
                        do
                        {
                                framesRead = wavFile.readFrames(buffer, 100);
                                for (int s=0 ; s<framesRead * numChannels ; s++)
                                { 
                                        if (buffer[s] > max) max = buffer[s];
                                        if (buffer[s] < min) min = buffer[s];
                                }//end of for loop
                                
                        }//end of do
                        while (framesRead != 0);
                        {
                                wavFile.close();
                        }//while end
                        catch (Exception r)
                        {
                                System.err.println(r);
                        }//catch end
                        
                }//end of sound4
                if(sound5==true)
                {
                        try
                        {
                                WavFile wavFile = WavFile.openWavFile(new File(args[0]));
                                int framesRead;
                                double min = Double.MAX_VALUE;
                                double max = Double.MIN_VALUE;
                                wavFile.display();
                                int numChannels = wavFile.getNumChannels();
                                double[] buffer = new double[100 * numChannels];
                        
                        do
                        {
                                framesRead = wavFile.readFrames(buffer, 100);
                                for (int s=0 ; s<framesRead * numChannels ; s++)
                                { 
                                        if (buffer[s] > max) max = buffer[s];
                                        if (buffer[s] < min) min = buffer[s];
                                }//end of for loop
                                
                        }//end of do
                        while (framesRead != 0);
                        {
                                wavFile.close();
                        }//while end
                        catch (Exception r)
                        {
                                System.err.println(r);
                        }//catch end
                        
                }//end of sound5
                if(sound6==true)
                {
                        try
                        {
                                WavFile wavFile = WavFile.openWavFile(new File(args[0]));
                                int framesRead;
                                double min = Double.MAX_VALUE;
                                double max = Double.MIN_VALUE;
                                wavFile.display();
                                int numChannels = wavFile.getNumChannels();
                                double[] buffer = new double[100 * numChannels];
                        
                        do
                        {
                                framesRead = wavFile.readFrames(buffer, 100);
                                for (int s=0 ; s<framesRead * numChannels ; s++)
                                { 
                                        if (buffer[s] > max) max = buffer[s];
                                        if (buffer[s] < min) min = buffer[s];
                                }//end of for loop
                                
                        }//end of do
                        while (framesRead != 0);
                        {
                                wavFile.close();
                        }//while end
                        catch (Exception r)
                        {
                                System.err.println(r);
                        }//catch end
                        
                }//end of sound6
        }//main method end

  }//end of program
  

