import java.awt.*;
import java.awt.event.*;
import java.swing.*;
import java.io.*;
import java.lang.*;




public class Test extends JFrame implements ActionListener {
        
        // Private variables
        private static final long serialVersionUID = 1;
        private JPanel mainPanel;
        private JPanel buttonPanel;
        private JPanel buttonPanel1;
        private JPanel buttonPanel2;
        public double EnemyHP = 30;
        public double YourHP = 30;
        Random Ran = new Random();
        int x = Ran.nextInt(1, 2, 3, 4);

        
        
        public LayoutTest() {
                
                //constructor
                super( "Test" );
                JButton button;
                JButton button1;
                JButton button2
                JLable label;
                
                JFrame myFrame = new JFrame("Pokemon ripoff");
                myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                myFrame.setVisible( true );
                myFrame.setLayout( new GridLayout( 2, 2, 50, 10 ) );
                layout = new GridBagLayout();
                myFrame.setLayout( layout );
                
                //allows  window to be closed
                setDefaultClose Operation(JFrame.EXIT_ON_CLOSE);
                setLayout( new BorderLayout() );
                
                GridBagConstraints c = new GridBagConstraints();
                // general constraints
                c.fill = GridBagConstraints.BOTH;
        
                // label constraints
                c.weightx = 0.0;
                c.gridwidth = GridBagConstraints.RELATIVE;
        
                myLabel2= new JLable("Your hp:" + YourHP);
                myLabel2.setForeground(Color.BLUE);
                myLabel2.setFont(new Font("TimesRoman", Font.BOLD, 24));
                layout.setConstraints( myLabel2, c );
                myFrame.add(myLabel2);
                
                myLabel= new JLable("Enemy hp:" + EnemyHP);
                myLabel.setForeground(Color.RED);
                myLabel.setFont(new Font("TimesRoman", Font.BOLD, 24));
                layout.setConstraints( myLabel, c );
                myFrame.add(myLabel);
                
                //creates the button
                buttonPanel = new JPanel();
                buttonPanel.setLayout( new GridLayout(1 , 3) );
                
                //creates button 1
                button = new JButton( "BATTLE" );
                button.setActionCommand( " One " );
                button.addActionCommand( this );
                buttonPanel.add( button );
                
                //creates button 2
                button = new JButton( "ITEMS" );
                button.setActionCommand( " Two " );
                button.addActionCommand( this );
                buttonPanel.add( button );
                
                //creates button 3
                button = new JButton( "RUN" );
                button.setActionCommand( " Three " );
                button.addActionCommand( this );
                buttonPanel.add( button );
                
                //adds buttons
                add(buttonPanel, BorderLayout.SOUTH);
                
                //creates button1 1
                button1 = new JButton( "PUNCH" );
                button1.setActionCommand( " 1 " );
                button1.addActionCommand( this );
                buttonPanel1.add( button1 );
                
                //Creates button1 2
                button1 = new JButton( "KICK" );
                button1.setActionCommand( " 2 " );
                button1.addActionCommand( this );
                buttonPanel1.add( button1 );
                
                button1 = new JButton( "BACK" );
                button1.setActionCommand( " 3 " );
                button1.addActionCommand( this );
                buttonPanel1.add( button1 );
                
                //adds buttons
                add(buttonPanel1, BorderLayout.SOUTH);
                
                //creates button2 a
                button2 = new JButton( "POTION" );
                button2.setActionCommand( " a " );
                button2.addActionCommand( this );
                buttonPanel2.add( button2 );
                
                //creates button2 B
                button2 = new JButton( "ROCK" );
                button2.setActionCommand( " b " );
                button2.addActionCommand( this );
                buttonPanel2.add( button2 );
                
                //creates button2 c
                button2 = new JButton( "BACK" );
                button2.setActionCommand( " c " );
                button2.addActionCommand( this );
                buttonPanel2.add( button2 );
                
                //sizes the window to the prefered size
                setSize( getPreferredSize() );
                //packs all the components together
                pack();
                //makes the window visible
                setVisible( true );
                
        }// layout test end
        
        public void  actionPerformed( ActionEvent e ){
                JButton button = (JButton)e.getSource();
                
                //button actions 
                switch(button.getActionCommand() ) {
                        case " One ":
                                fileName= "Alarm08.wav";
                                flag = true;
                                buttonPanel.setvisible(false);
                                buttonPanel1.setvisble(true);
                                break;
                        case " Two ":
                                fileName= "Alarm07.wav";
                                flag = true;
                                buttonPanel.setvisible(false);
                                buttonPanel2.setvisble(true);
                                break;
                        case " Three ":
                                system.exit();
                                break;
                        default:
                                JOptionPane.showMessageDialog( this, "WHERE ARE YOU! THIS DOESNT EXIST!OH GOD HOW DID YOU GET HERE" );
                                break;
                }//end of switch
        }//end of Action performed e
                
        public void  actionPerformed( ActionEvent f ){
                JButton button1 = (JButton)f.getSource();
                
                //button actions 
                switch(button1.getActionCommand() ) {
                        case " 1 ":
                                fileName= "Alarm04.wav";
                                flag = true;
                                YourHP + x;
                                YourHP - x-1;
                                buttonPanel1.setvisible(false);
                                buttonPanel.setvisible(true);
                                break;
                        case " 2 ":
                                fileName= "Alarm05.wav";
                                flag = true;
                                EnemyHP-x+1;
                                YourHP-x;
                                buttonPanel1.setvisible(false);
                                buttonPanel.setvisible(true);
                                break;
                        case " 3 ":
                                fileName= "Alarm03.wav";
                                flag = true;
                                buttonPanel1.setvisible(false);
                                buttonPanel.setvisible(true);
                                break;

                        default:
                                JOptionPane.showMessageDialog( this, "WHERE ARE YOU! THIS DOESNT EXIST!OH GOD HOW DID YOU GET HERE" );
                                break;
                }//end of switch
        }//end of action performed f
        
        public void  actionPerformed( ActionEvent g ){
                JButton button2 = (JButton)g.getSource();
                
                //button actions 
                switch(button2.getActionCommand() ) {
                        case " a ":
                                EnemyHP-x;
                                fileName= "Alarm02.wav";
                                flag = true;
                                YourHP-x;
                                buttonPanel2.setvisible(false);
                                buttonPanel.setvisible(true);
                                break;
                        case " b ":
                                EnemyHP-x;
                                fileName= "Alarm01.wav";
                                flag = true;
                                YourHP-x;
                                buttonPanel2.setvisible(false);
                                buttonPanel.setvisible(true);
                                break;
                        case " c ":
                                fileName= "Alarm03.wav";
                                flag = true;
                                buttonPanel2.setvisible(false);
                                buttonPanel.setvisible(true);
                                break;
                        default:
                                JOptionPane.showMessageDialog( this, "WHERE ARE YOU! THIS DOESNT EXIST!OH GOD HOW DID YOU GET HERE" );
                                break;
                }//end of switch
        }//end of action performed g

public static void main(Strings[]args)
{
        new.layoutTest();
        
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
        
        if(EnemyHP<= 0)
        {
                JOptionPane.showMessageDialog( this, "YOU WIN"); 
                fileName = "tada.wav";
                flag = true;
        }//if win
        if(YourHP<=0)
        {
                JOptionPane.showMessageDialog( this, "YOU LOSE");
                fileName = "Windows Hardware Insert.wav";
                flag = true;
        }//if lose
}//end of main
