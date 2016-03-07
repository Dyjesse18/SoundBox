import java.awt.*;
import java.awt.event.*;
import java.swing.*;
import java.io.*;
import java.lang.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;


//this program will have:
//6 buttons
//1 soundbutton panel
//play sounds from the windows system

public class Beatbox extends JFrame implements ActionListener {
        
        // Private variables
        private static final long serialVersionUID = 1;
        private JPanel mainPanel;
        private JPanel buttonPanel;
        boolean static flag = false;
        
        public LayoutTest() {
                
                //constructor
                super( "BeatBox" );
                JButton button;
                JLable label;
                
                JFrame myFrame = new JFrame("Beat_Box");
                        System.out.println("Created_JFrame");
                        
                myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                myFrame.setVisible( true );
                        System.out.println("Window_Visibilty_Capability_Ready");
                        
                myFrame.setLayout( new GridLayout( 2, 2, 50, 10 ) );
                        System.out.println("GridBag_");
                layout = new GridBagLayout();
                myFrame.setLayout( layout );
                
                //allows  window to be closed
                setDefaultClose Operation(JFrame.EXIT_ON_CLOSE);
                
                //creates border layout
                setLayout( new BorderLayout() );
                        System.out.println("Border_Created")
                
                // general constraints
                GridBagConstraints c = new GridBagConstraints();
                c.fill = GridBagConstraints.BOTH;
        
                // label constraints
                c.weightx = 0.0;
                c.gridwidth = GridBagConstraints.RELATIVE;
                
                //creates the button
                buttonPanel = new JPanel();
                
                //creates the button layout
                buttonPanel.setLayout( new GridLayout(1 , 8) );
                
                //creates record button 7
                button = new JButton( "Record" );
                button.setActionCommand( " Seven " );
                button.addActionCommand( this );
                buttonPanel.add( button );
                        System.out.println("Record_Button_Added_To_ButtonPanel");
                
                //creates button 1
                button = new JButton( "Sound1" );
                button.setActionCommand( " One " );
                button.addActionCommand( this );
                buttonPanel.add( button );
                        System.out.println("Sound1_Button_Added_To_ButtonPanel");
                
                //creates button 2
                button = new JButton( "Sound2" );
                button.setActionCommand( " Two " );
                button.addActionCommand( this );
                buttonPanel.add( button );
                        System.out.println("Sound2_Button_Added_To_ButtonPanel");
                
                //creates button 3
                button = new JButton( "Sound3" );
                button.setActionCommand( " Three " );
                button.addActionCommand( this );
                buttonPanel.add( button );
                        System.out.println("Sound3_Button_Added_To_ButtonPanel");
                
                //creates button 4
                button = new JButton( "Sound4" );
                button.setActionCommand( " Four " );
                button.addActionCommand( this );
                buttonPanel.add( button );
                        System.out.println("Sound4_Button_Added_To_ButtonPanel");
                
                //creates button 5
                button = new JButton( "Sound5" );
                button.setActionCommand( " Five " );
                button.addActionCommand( this );
                buttonPanel.add( button );
                        System.out.println("Sound5_Button_Added_To_ButtonPanel");
                
                //creates button 6
                button = new JButton( "Sound6" );
                button.setActionCommand( " Six " );
                button.addActionCommand( this );
                buttonPanel.add( button );
                        System.out.println("Sound6_Button_Added_To_ButtonPanel");
                
                //creates play button8
                button = new JButton( "Play" );
                button.setActionCommand( " Eight " );
                button.addActionCommand( this );
                buttonPanel.add( button );
                        System.out.println("Play_Button_Added_To_ButtonPanel");
                
                //adds buttons
                add(buttonPanel, BorderLayout.SOUTH);

                //sizes the window to the prefered size
                setSize( getPreferredSize() );
                //packs all the components together
                pack();
                        System.out.println("Window_components_have_been_packed");
                        
                //makes the window visible
                setVisible( true );
                        System.out.println("Window_is_now_visible");
                
        }// layout test end
        
        public void  actionPerformed( SctionEvent e ){
                JButton button = (JButton)e.getSource();
                
                //button actions 
                switch(button.getActionCommand() ) {
                        case " One ":
                                fileName= "Alarm01.wav";
                                flag= true;
                                        System.out.println("Selected_Alarm01");
                                        
                                break;
                        case " Two ":
                                fileName = "Alarm02.wav";
                                flag= true;
                                        System.out.println("Selected_Alarm02");
                                        
                                break;
                        case " Three ":
                                fileName = "tada.wav";
                                flag= true;
                                        System.out.println("Selected_tada");
                                        
                                break;
                        case " Four ":
                                fileName = "Alarm03.wav";
                                flag= true;
                                        System.out.println("Selected_Alarm03");
                                        
                                break;
                        case " Five ":
                                fileName = "Alarm04.wav";
                                flag= true;
                                        System.out.println("Selected_Alarm04");
                                        
                                break;
                        case " Six ":
                                fileName = "notify.wav";
                                flag= true;
                                        System.out.println("Selected_notify");
                                        
                                break;
                        case " Seven ":
                                //gonna record all the buttons pushed
                                break;
                        case " Eight ":
                                //gonna play the recorded mix
                                break;
                        default:
                                JOptionPane.showMessageDialog( this, "WHERE ARE YOU! THIS DOESNT EXIST!OH GOD HOW DID YOU GET HERE" );
                                break;
                }//end of switch
                
        }//end of action performed
public static void mian(String[] args)
{
        final int sleepSec = Interfer.parseInt(args[100]);
        
        //finds the file for sound
        File soundFile = new File("This PC/OS(C:)/Windows//media/" + fileName);
                System.out.println("Loading_" + fileName);
                
        AudioInputStream sound = AudioSystem.getAudioInputStream(soundFile);
                System.out.println("Loaded_" + fileName);
        
        //gets the data for the clip
        DataLine.Info info = new DataLine.Info(Clip.class, sound.getFormat());
                System.out.println("Data_retrieved_for_" + fileName);
                
        Clip clip = (Clip) AudioSystem.getLine(info);
                System.out.println("Temporary_Name_For_" + FileName +"_Is_Clip");
                
        clip.open(sound);
                System.out.println("Opening_" + fileName);
        
        clip.addLineListener(new LineListener() 
        {
                public void update(LineEvent event) 
                {
                        if (event.getType() == LineEvent.Type.STOP)
                        {
                                event.getLine().close();
                                System.exit(0);
                        }//if end
                }//update end
        });//end of clip listener
        if(flag==true)
        {
                //clip starts
                clip.start();
                        System.out.println("Playing_" + fileName);
                        
                //pause in between
                thread.sleep(sleepSec);
                //stops playing clips
                flag = false;
                        System.out.println("Closing_" + fileName);
                        
        }//END OF FLAG
}//end of main
      
