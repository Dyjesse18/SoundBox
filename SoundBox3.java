import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.lang.*;
import java.net.MalformedURLException;
import java.sql.Clob;

import javax.sound.sampled.AudioInputStream;            //plays the clips
import javax.sound.sampled.AudioSystem;                 //allows the clips to be played
import javax.sound.sampled.Clip;                        //allows preloaded audio files
import javax.sound.sampled.DataLine;                    //for using Data line
import javax.sound.sampled.LineEvent;                   //for using  Line events
import javax.sound.sampled.LineListener;                //for reading line listening
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


//this program will have:
//6 buttons
//1 soundbutton panel
//play sounds from the windows system
//records 

@SuppressWarnings("unused")
public class SoundBox3 extends JFrame implements ActionListener {
        
        // Private variables
        private static final long serialVersionUID = 1;
        private JPanel mainPanel;
        private JPanel buttonPanel;
        private boolean  flag = false;
        private boolean  flag2 = false;
        private static double c = 0;
        private double a = 0;
        private int b = 0;
        private double d = 1;
		private String[] sAs;
		private static File soundFile;
		private File soundFile2 = null;
		private File soundFile1 = null ;
		private File soundFile0 = null;
		private File soundFile3 = null;
		private File soundFile4 = null;
		private File soundFile5 = null;
        public SoundBox3() {
                
                //constructor
                super( "BeatBox" );
                JButton button;
                JLabel label;
                
                sAs = new String[6];
                sAs[0] = "Alarm01.wav";
                        System.out.println("Element0_created");
                                
                                        System.out.println("Loading_Sound_Alarm01.wav");
                                File soundFile0 = new File("C:/Windows/media/Alarm01.wav");
                                        System.out.println("Sound_Alarm01.wav_Loaded");
                                
                sAs[1] = "Alarm02.wav";
                        System.out.println("Element1_created");
                        
                                        System.out.println("Loading_Sound_Alarm02.wav");
                                File soundFile1 = new File("C:/Windows/media/Alarm02.wav");
                                        System.out.println("Sound_Alarm02.wav_Loaded");
                                
                sAs[2] = "tada.wav";
                        System.out.println("Element2_created");
                
                                        System.out.println("Loading_Sound_tada.wav");
                                File soundFile2 = new File("PC/OS(C:)/Windows/media/tada.wav");
                                        System.out.println("Sound_tada.wav_Loaded");
                                
                sAs[3] = "Alarm03.wav";
                        System.out.println("Element3_created");
                        
                                        System.out.println("Loading_Sound_Alarm03.wav");
                                File soundFile3 = new File("C:/Windows/media/Alarm03.wav");
                                        System.out.println("Sound_Alarm03.wav_Loaded");
                                
                sAs[4] = "Alarm04.wav";
                        System.out.println("Element4_created");
                
                                        System.out.println("Loading_Sound_Alarm04.wav");
                                File soundFile4 = new File("C:/Windows/media/Alarm04.wav");
                                        System.out.println("Sound_Alarm04.wav_Loaded");
                                
                sAs[5] = "notify.wav";
                        System.out.println("Element5_created");
                
                                        System.out.println("Loading_Sound_notify.wav");
                                File soundFile5 = new File("C:/Windows/media/notify.wav");
                                        System.out.println("Sound_notify.wav_Loaded");
                                
                                        System.out.println("Array_List_Created");
                
                        System.out.println("Creating_JFrame");
                JFrame myFrame = new JFrame("Beat_Box");
                        System.out.println("Created_JFrame");
                        
                myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        System.out.println("Creating_Visibility");
                myFrame.setVisible( true );
                        System.out.println("Window_Visibilty_Capability_Ready");
                        
                myFrame.setLayout( new GridLayout( 2, 2, 50, 10 ) );
                        System.out.println("Created_GridBag_Layout");
                GridBagLayout Layout = new GridBagLayout();
                myFrame.setLayout( Layout );
                        System.out.println("Added_Layout_To_JFrame");
                
                //creates border layout
                setLayout( new BorderLayout() );
                        System.out.println("Border_Created");
                
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
                
                JButton button7 = new JButton( "Record" );
                button7.setActionCommand( " Seven " );
                button7.addActionListener( this );
                buttonPanel.add( button7 );

                JButton button1 = new JButton( "Sound1" );
                button1.setActionCommand( " One " );
                button1.addActionListener (this );
                buttonPanel.add( button1 );
                
                JButton button2 = new JButton( "Sound2" );
                button2.setActionCommand( " Two " );
                button2.addActionListener (this );
                buttonPanel.add( button2 );
                
                JButton button3 = new JButton( "Sound3" );
                button3.setActionCommand( " Three " );
                button3.addActionListener ( this );
                buttonPanel.add( button3 );

                JButton button4 = new JButton( "Sound4" );
                button4.setActionCommand( " Four " );
                button4.addActionListener ( this );
                buttonPanel.add( button4 );

                JButton button5 = new JButton( "Sound5" );
                button5.setActionCommand( " Five " );
                button5.addActionListener ( this );
                buttonPanel.add( button5 );

                JButton button6 = new JButton( "Sound6" );
                button6.setActionCommand( " Six " );
                button6.addActionListener ( this );
                buttonPanel.add( button6 );

                JButton button8 = new JButton( "Play" );
                button8.setActionCommand( " Eight " );
                button8.addActionListener (this );
                buttonPanel.add( button8 );
                

                add( buttonPanel , BorderLayout.SOUTH);
                        System.out.println("Added_Buttons_to_ButtonPanel");

                        System.out.println("Sizing_Window");
                setSize( getPreferredSize() );
                        System.out.println("Window_Sized");
                        
                        System.out.println("Packing_Components_Into_Window");
                pack();
                        System.out.println("Window_components_have_been_packed");
                        
                        System.out.println("Enabling_Window_Visibilties");
                setVisible( true );
                        System.out.println("Window_is_now_visible");
                
        }// layout test end
        
        public void  actionPerformed1( ActionEvent f ){
                JButton button = (JButton)f.getSource();
                
                //button actions 
                Object arrayRec;
				Object clip = null;

				switch(button.getActionCommand() ) {
                        case " One ":
								String fileName = sAs[0];
                                c++;
                                
								soundFile =(soundFile0);
                                        System.out.println("Selected_Alarm01");
                                        
                                if(flag2 == true)
                                {
                                        b++;
                                         sAs[(int) b] = (soundFile0.getName());
                                }        
                                //clip starts
                                ((DataLine)(clip)).start();
                                        System.out.println("Playing_" + (fileName));
                                        
                                break;
                        case " Two ":
                                fileName = (sAs)[1];
                                c++;
                                
								soundFile = soundFile1;
                                        System.out.println("Selected_Alarm02");
                                        
                                if(flag2 == true)
                                {
                                        b++;
                                        (sAs)[(int) b] = soundFile0.getName();
                                }
                                //clip starts
                                ((DataLine)(clip)).start();
                                        System.out.println("Playing_" + (fileName));
                                        
                                break;
                        case " Three ":
                                fileName = sAs[2];
                                c++;
								soundFile = soundFile2;
                                        System.out.println("Selected_tada");
                                        
                                if(flag2 == true)
                                {
                                        b++;
                                        sAs[b] = soundFile2.getName();
                                }//end of if        
                                //clip starts
                                ((DataLine) (clip)).start();
                                        System.out.println("Playing_" + (fileName)); 
                                        
                                break;
                        case " Four ":
                                fileName = sAs[3];
                                c++;
								if(flag2 == true)
                                {
                                        b++;
                                         (sAs)[b] = (soundFile3.getName());
                                }
                                soundFile = soundFile3;
                                        System.out.println("Selected_Alarm03");
                                        

                                //clip starts
                                ((DataLine)(clip)).start();
                                        System.out.println("Playing_" + (fileName));
                                        
                                        
                                break;
                        case " Five ":
                                fileName = sAs[4];
                                c++;
								soundFile = soundFile4;
                                        System.out.println("Selected_Alarm04");
                                
                                if(flag2 == true)
                                {
                                        b++;
                                        (sAs)[b] = (soundFile4.getName());
                                        	
                                }//end of if
                                //clip starts
                                ((DataLine)(clip)).start();
                                        System.out.println("Playing_" + (fileName));
                                                
                                break;
                        case " Six ":
                                fileName = sAs[5];
                                c++;
                                
								soundFile = soundFile5;
                                        System.out.println("Selected_notify");
                                        
                                if(flag2 == true)
                                {
                                        b++;
                                        (sAs)[b] = (soundFile5.getName());
                                }//end of if
                                                
                                //clip starts
                                ((DataLine)(clip)).start();
                                        System.out.println("Playing_" + (fileName));
                                                
                                break;
                        case " Seven ":
                                //gonna record all the buttons pushed
                                a++;
                                if(a == 2)
                                {
                                        c = 0;
                                        flag2 = true;
                                }//end of if a = 2
                                if(a == 3)
                                {
                                        a = 0;
                                        flag2 = false;
                                }//end of if a = 3
                                if(a == 1)
                                {       
                                        a =2;
                                }//end of i a =1
                                break;
                        case " Eight ":
                                //gonna play the recorded mix
                                d++;
                                if(d == 2)
                                {
                                        while(b<= c)
                                        {
                                        	((DataLine)(clip)).start();
                                        }//while b is less or equal to c
                                        d = 1;
                                }//if d = 2 end
                                break;
                        default:
                                JOptionPane.showMessageDialog( this, "WHERE ARE YOU! THIS DOESNT EXIST!OH GOD HOW DID YOU GET HERE" );
                                break;
                }//end of switch
                
        }//end of action performed

		/*private Object[] (Object[] SA) {
			return sAs;
		}

		private Object (Object clip) {
			return clip;
		}*/
public static void main(String[] args)
{
	
        SoundBox3 SoundBox3= new SoundBox3();
        while(true){
        //final int sleepSec = Integer.parseInt(args[100]);
        
                //System.out.println("Total_Sounds_Played: " + c);
        try
        {  
        	
        	if(soundFile!= null)
        	{
        
		AudioInputStream sound = AudioSystem.getAudioInputStream(soundFile);
                String fileName = null;
				System.out.println("Loaded_" + soundFile.getName());
                      
                //gets the data for the clip
                DataLine.Info info = new DataLine.Info(Clip.class, sound.getFormat());

                
                Clip clip = (Clip) AudioSystem.getLine(info);
                
                clip.open(sound);
                        System.out.println("Opening_" + soundFile.getName());
        
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
                soundFile = null;
        	}//end of if null
        	
        }catch (MalformedURLException e) 
                {
                    throw new RuntimeException("Sound: Malformed URL: " + e);
                }//end of MalformedURLException
                catch (UnsupportedAudioFileException e) 
                {
                    throw new RuntimeException("Sound: Unsupported Audio File: " + e);
                }//end of UnSupportedAudioFileException
                catch (IOException e) 
                {
                    throw new RuntimeException("Sound: Input/Output Error: " + e);
                }//end of IOException
                catch (LineUnavailableException e) 
                {
                    throw new RuntimeException("Sound: Line Unavailable: " + e);
                }//end of lineUnavailableException
}
}
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}
}//end of main
