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
                                fileName= "Alarm01.wav";
                                flag= true;
                                System.out.println("Playing Alarm01");
                                break;
                        case " Two ":
                                fileName = "Alarm02.wav";
                                flag= true;
                                System.out.println("Playing Alarm02");
                                break;
                        case " Three ":
                                fileName = "tada.wav";
                                flag= true;
                                System.out.println("Playing tada");
                                break;
                        case " Four ":
                                fileName = "Alarm03.wav";
                                flag= true;
                                System.out.println("Playing Alarm03");
                                break;
                        case " Five ":
                                fileName = "Alarm04.wav";
                                flag= true;
                                System.out.println("Playing Alarm04");
                                break;
                        case " Six ":
                                fileName = "notify.wav";
                                flag= true;
                                System.out.println("Playing notify");
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
        AudioInputStream sound = AudioSystem.getAudioInputStream(soundFile);
        
        //gets the data for the clip
        DataLine.Info info = new DataLine.Info(Clip.class, sound.getFormat());
        Clip clip = (Clip) AudioSystem.getLine(info);
        clip.open(sound);
        
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
                //pause in between
                thread.sleep(sleepSec);
                //stops playing clips
                flag = false;
        }//END OF FLAG
}//end of main
      
