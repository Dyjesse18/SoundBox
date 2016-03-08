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
                
                //array list for sounds
                anArray[0] = "Alarm01.wav";
                        System.out.println("Element0_created");
                        
                                File soundFile0 = new File("This PC/OS(C:)/Windows//media/Alarm01.wav");
                                        System.out.println("Sound_Alarm01.wav_Loaded");
                                
                anArray[1] = "Alarm02.wav";
                        System.out.println("Element1_created");
                        
                                File soundFile1 = new File("This PC/OS(C:)/Windows//media/Alarm02.wav");
                                        System.out.println("Sound_Alarm02.wav_Loaded");
                                
                anArray[2] = "tada.wav";
                        System.out.println("Element2_created");
                
                                File soundFile2 = new File("This PC/OS(C:)/Windows//media/tada.wav");
                                        System.out.println("Sound_tada.wav_Loaded");
                                
                anArray[3] = "Alarm03.wav";
                        System.out.println("Element3_created");
                
                                File soundFile3 = new File("This PC/OS(C:)/Windows//media/Alarm03.wav");
                                        System.out.println("Sound_Alarm03.wav_Loaded");
                                
                anArray[4] = "Alarm04.wav";
                        System.out.println("Element4_created");
                
                                File soundFile4 = new File("This PC/OS(C:)/Windows//media/Alarm04.wav");
                                        System.out.println("Sound_Alarm04.wav_Loaded");
                                
                anArray[5] = "notify.wav";
                        System.out.println("Element5_created");
                
                                File soundFile5 = new File("This PC/OS(C:)/Windows//media/notify.wav");
                                        System.out.println("Sound_notify.wav_Loaded");
                                
                                        System.out.println("Array_List_Created");
                
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
                
                        System.out.println("Creating_General_Constraints");
                GridBagConstraints c = new GridBagConstraints();
                c.fill = GridBagConstraints.BOTH;
        
                        System.out.println("Creating_Restraints");
                c.weightx = 0.0;
                c.gridwidth = GridBagConstraints.RELATIVE;
                
                        System.out.println("Creating_ButtonPanel");
                buttonPanel = new JPanel();
                
                        System.out.println("Creating_ButtonPanel_Layout");
                buttonPanel.setLayout( new GridLayout(1 , 8) );
                
                        System.out.println("Creating_Record_Button");
                button = new JButton( "Record" );
                button.setActionCommand( " Seven " );
                button.addActionCommand( this );
                buttonPanel.add( button );
                        System.out.println("Record_Button_Added_To_ButtonPanel");
                
                        System.out.println("Creating_Button1");
                button = new JButton( "Sound1" );
                button.setActionCommand( " One " );
                button.addActionCommand( this );
                buttonPanel.add( button );
                        System.out.println("Sound1_Button_Added_To_ButtonPanel");
                
                        System.out.println("Creating_Button2");
                button = new JButton( "Sound2" );
                button.setActionCommand( " Two " );
                button.addActionCommand( this );
                buttonPanel.add( button );
                        System.out.println("Sound2_Button_Added_To_ButtonPanel");
                
                        System.out.println("Creating_Button3");
                button = new JButton( "Sound3" );
                button.setActionCommand( " Three " );
                button.addActionCommand( this );
                buttonPanel.add( button );
                        System.out.println("Sound3_Button_Added_To_ButtonPanel");
                
                        System.out.println("Creating_Sound4");
                button = new JButton( "Sound4" );
                button.setActionCommand( " Four " );
                button.addActionCommand( this );
                buttonPanel.add( button );
                        System.out.println("Sound4_Button_Added_To_ButtonPanel");
                
                System.out.println("Creating_Button5");
                button = new JButton( "Sound5" );
                button.setActionCommand( " Five " );
                button.addActionCommand( this );
                buttonPanel.add( button );
                        System.out.println("Sound5_Button_Added_To_ButtonPanel");
                
                        System.out.println("Creating_Button6");
                button = new JButton( "Sound6" );
                button.setActionCommand( " Six " );
                button.addActionCommand( this );
                buttonPanel.add( button );
                        System.out.println("Sound6_Button_Added_To_ButtonPanel");
                
                        System.out.println("Creating_Play_Button");
                button = new JButton( "Play" );
                button.setActionCommand( " Eight " );
                button.addActionCommand( this );
                buttonPanel.add( button );
                        System.out.println("Play_Button_Added_To_ButtonPanel");
                
                        System.out.println("Adding_Buttons_To_ButtonPanel");
                add(buttonPanel, BorderLayout.SOUTH);
                        System.out.println("Added_Buttons_to_ButtonPanel");

                        System.out.println("Sizing_Window");
                setSize( getPreferredSize() );
                        System.out.println("Window_Sized");
                        
                        System.out.println("Packing_Components_Into_Window");
                pack();
                        System.out.println("Window_components_have_been_packed");
                        
                        System.out.println("");
                setVisible( true );
                        System.out.println("Window_is_now_visible");
                
        }// layout test end
        
        public void  actionPerformed( SctionEvent e ){
                JButton button = (JButton)e.getSource();
                
                //button actions 
                switch(button.getActionCommand() ) {
                        case " One ":
                                fileName= anArray[0];
                                soundFile = soundFile0;
                                        System.out.println("Selected_Alarm01");
                                        
                                //clip starts
                                clip.start();
                                        System.out.println("Playing_" + fileName);
                                        
                                break;
                        case " Two ":
                                fileName = anArray[1];
                                soundFile = soundFile1;
                                        System.out.println("Selected_Alarm02");
                                
                                //clip starts
                                clip.start();
                                        System.out.println("Playing_" + fileName);
                                        
                                break;
                        case " Three ":
                                fileName = anArray[2];
                                soundFile = soundFile2;
                                        System.out.println("Selected_tada");
                                        
                                //clip starts
                                clip.start();
                                        System.out.println("Playing_" + fileName); 
                                        
                                break;
                        case " Four ":
                                fileName = anArray[3];
                                soundFile = soundFile3;
                                        System.out.println("Selected_Alarm03");
                                //clip starts
                                clip.start();
                                        System.out.println("Playing_" + fileName);
                                        
                                        
                                break;
                        case " Five ":
                                fileName = anArray[4];
                                soundFile = soundFile4;
                                        System.out.println("Selected_Alarm04");
                                
                                
                                //clip starts
                                clip.start();
                                        System.out.println("Playing_" + fileName);
                                                
                                break;
                        case " Six ":
                                fileName = anArray[5];
                                soundFile = soundFile5;
                                        System.out.println("Selected_notify");
                                                
                                //clip starts
                                clip.start();
                                        System.out.println("Playing_" + fileName);
                                                
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
}//end of main
      