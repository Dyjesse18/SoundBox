import java.awt.*;
import java.awt.event.*;
import java.swing.*;
import java.io.*;
import java.lang.*;
import javax.sound.sampled.AudioInputStream;            //plays the clips
import javax.sound.sampled.AudioSystem;                 //allows the clips to be played
import javax.sound.sampled.Clip;                        //allows preloaded audio files
import javax.sound.sampled.DataLine;                    //for using Data line
import javax.sound.sampled.LineEvent;                   //for using  Line events
import javax.sound.sampled.LineListener;                //for reading line listening


//this program will have:
//6 buttons
//1 soundbutton panel
//play sounds from the windows system
//records 

public class Beatbox extends JFrame implements ActionListener {
        
        // Private variables
        private static final long serialVersionUID = 1;
        private JPanel mainPanel;
        private JPanel buttonPanel;
        private boolean static flag = false;
        private boolean static flag2 = false;
        private double c = 0;
        private double a = 0;
        private double b = 0;
        private double d = 1
        
        public LayoutTest() {
                
                //constructor
                super( "BeatBox" );
                JButton button;
                JLable label;
                
                //array list for sounds
                anArray[0] = "Alarm01.wav";
                        System.out.println("Element0_created");
                                
                                        System.out.println("Loading_Sound_Alarm01.wav");
                                File soundFile0 = new File("This PC/OS(C:)/Windows/media/Alarm01.wav");
                                        System.out.println("Sound_Alarm01.wav_Loaded");
                                
                anArray[1] = "Alarm02.wav";
                        System.out.println("Element1_created");
                        
                                        System.out.println("Loading_Sound_Alarm02.wav");
                                File soundFile1 = new File("This PC/OS(C:)/Windows/media/Alarm02.wav");
                                        System.out.println("Sound_Alarm02.wav_Loaded");
                                
                anArray[2] = "tada.wav";
                        System.out.println("Element2_created");
                
                                        System.out.println("Loading_Sound_tada.wav");
                                File soundFile2 = new File("This PC/OS(C:)/Windows/media/tada.wav");
                                        System.out.println("Sound_tada.wav_Loaded");
                                
                anArray[3] = "Alarm03.wav";
                        System.out.println("Element3_created");
                        
                                        System.out.println("Loading_Sound_Alarm03.wav");
                                File soundFile3 = new File("This PC/OS(C:)/Windows/media/Alarm03.wav");
                                        System.out.println("Sound_Alarm03.wav_Loaded");
                                
                anArray[4] = "Alarm04.wav";
                        System.out.println("Element4_created");
                
                                        System.out.println("Loading_Sound_Alarm04.wav");
                                File soundFile4 = new File("This PC/OS(C:)/Windows/media/Alarm04.wav");
                                        System.out.println("Sound_Alarm04.wav_Loaded");
                                
                anArray[5] = "notify.wav";
                        System.out.println("Element5_created");
                
                                        System.out.println("Loading_Sound_notify.wav");
                                File soundFile5 = new File("This PC/OS(C:)/Windows/media/notify.wav");
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
                layout = new GridBagLayout();
                myFrame.setLayout( layout );
                        System.out.println("Added_Layout_To_JFrame");
                
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
                try
                {
                button = new JButton( "Record" );
                button.setActionCommand( " Seven " );
                button.addActionCommand( this );
                buttonPanel.add( button );
                }catch
                {
                        System.out.println("Failed_To_Create_Button7");
                }else
                {
                        System.out.println("Record_Button_Added_To_ButtonPanel");
                }//end of else record
                
                        System.out.println("Creating_Button1");
                try
                {
                button = new JButton( "Sound1" );
                button.setActionCommand( " One " );
                button.addActionCommand( this );
                buttonPanel.add( button );
                }catch
                {
                        System.out.println("Failed_To_Create_Button1");
                }else
                        System.out.println("Sound1_Button_Added_To_ButtonPanel");
                }//end of else sound1
                
                        System.out.println("Creating_Button2");
                try
                {
                button = new JButton( "Sound2" );
                button.setActionCommand( " Two " );
                button.addActionCommand( this );
                buttonPanel.add( button );
                }catch
                {
                        System.out.println("Failed_To_Create_Button2");
                }else
                {
                        System.out.println("Sound2_Button_Added_To_ButtonPanel");
                }//end of else sound 2
                        System.out.println("Creating_Button3");
                try
                {
                        button = new JButton( "Sound3" );
                        button.setActionCommand( " Three " );
                        button.addActionCommand( this );
                        buttonPanel.add( button );
                }catch
                {
                        System.out.println("Failed_To_Create_Button3");
                }else
                {
                        System.out.println("Sound3_Button_Added_To_ButtonPanel");
                }//end of else sound3
                        System.out.println("Creating_Sound4");
                try
                {
                button = new JButton( "Sound4" );
                button.setActionCommand( " Four " );
                button.addActionCommand( this );
                buttonPanel.add( button );
                }catch
                {
                        System.out.println("Failed_To_Create_Button4");
                }catch
                {
                        System.out.println("Sound4_Button_Added_To_ButtonPanel");
                }//end of else sound 4
                
                        System.out.println("Creating_Button5");
                try
                {
                button = new JButton( "Sound5" );
                button.setActionCommand( " Five " );
                button.addActionCommand( this );
                buttonPanel.add( button );
                }catch
                {
                        System.out.println("Failed_To_Create_Button5");
                }else
                {
                        System.out.println("Sound5_Button_Added_To_ButtonPanel");
                }//end of else sound5
                
                        System.out.println("Creating_Button6");
                try{
                button = new JButton( "Sound6" );
                button.setActionCommand( " Six " );
                button.addActionCommand( this );
                buttonPanel.add( button );
                }catch
                {
                        System.out.println("Failed_To_Create_Button6");
                }else
                {
                        System.out.println("Sound6_Button_Added_To_ButtonPanel");
                }//end of else sound 6
                
                        System.out.println("Creating_Play_Button");
                try
                {
                button = new JButton( "Play" );
                button.setActionCommand( " Eight " );
                button.addActionCommand( this );
                buttonPanel.add( button );
                }catch
                {
                        System.out.println("Failed_To_Create_Button8");
                }else
                {
                        System.out.println("Play_Button_Added_To_ButtonPanel");
                }//end of else play
                
                        System.out.println("Adding_Buttons_To_ButtonPanel");
                add(buttonPanel, BorderLayout.SOUTH);
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
        
        public void  actionPerformed( SctionEvent f ){
                JButton button = (JButton)f.getSource();
                
                //button actions 
                switch(button.getActionCommand() ) {
                        case " One ":
                                fileName= anArray[0];
                                c++;
                                soundFile = soundFile0;
                                        System.out.println("Selected_Alarm01");
                                        
                                if(flag2 == true)
                                {
                                        b++;
                                        final arryayRec[b] = soundFile0;
                                }        
                                //clip starts
                                clip.start();
                                        System.out.println("Playing_" + fileName);
                                        
                                break;
                        case " Two ":
                                fileName = anArray[1];
                                c++;
                                soundFile = soundFile1;
                                        System.out.println("Selected_Alarm02");
                                        
                                if(flag2 == true)
                                {
                                        b++;
                                        final arryayRec[b] = soundFile1;
                                }
                                //clip starts
                                clip.start();
                                        System.out.println("Playing_" + fileName);
                                        
                                break;
                        case " Three ":
                                fileName = anArray[2];
                                c++;
                                soundFile = soundFile2;
                                        System.out.println("Selected_tada");
                                        
                                if(flag2 == true)
                                {
                                        b++;
                                        final arryayRec[b] = soundFile2;
                                }//end of if        
                                //clip starts
                                clip.start();
                                        System.out.println("Playing_" + fileName); 
                                        
                                break;
                        case " Four ":
                                fileName = anArray[3];
                                c++;
                                if(flag2 == true)
                                {
                                        b++;
                                        final arryayRec[b] = soundFile3;
                                }
                                soundFile = soundFile3;
                                        System.out.println("Selected_Alarm03");
                                        

                                //clip starts
                                clip.start();
                                        System.out.println("Playing_" + fileName);
                                        
                                        
                                break;
                        case " Five ":
                                fileName = anArray[4];
                                c++;
                                soundFile = soundFile4;
                                        System.out.println("Selected_Alarm04");
                                
                                if(flag2 == true)
                                {
                                        b++;
                                        final arryayRec[b] = soundFile4;
                                }//end of if
                                //clip starts
                                clip.start();
                                        System.out.println("Playing_" + fileName);
                                                
                                break;
                        case " Six ":
                                fileName = anArray[5];
                                c++;
                                soundFile = soundFile5;
                                        System.out.println("Selected_notify");
                                        
                                if(flag2 == true)
                                {
                                        b++;
                                        final arryayRec[b] = soundFile5;
                                }//end of if
                                                
                                //clip starts
                                clip.start();
                                        System.out.println("Playing_" + fileName);
                                                
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
                                        arrayRec.clear();
                                        a ==2;
                                }//end of i a =1
                                break;
                        case " Eight ":
                                //gonna play the recorded mix
                                d++;
                                if(d == 2)
                                {
                                        while(b<= c)
                                        {
                                                clip.start(arrayRec);        
                                        }//while b is less or equal to c
                                        d = 1;
                                }//if d = 2 end
                                break;
                        default:
                                JOptionPane.showMessageDialog( this, "WHERE ARE YOU! THIS DOESNT EXIST!OH GOD HOW DID YOU GET HERE" );
                                break;
                }//end of switch
                
        }//end of action performed
public static void mian(String[] args)
{
        new LayoutTest();
        final int sleepSec = Interfer.parseInt(args[100]);
        
                System.out.println("Total_Sounds_Played: " + c);
        try
        {  
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
}//end of main
      
