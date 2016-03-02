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
        public double EnemyHP = 30;
        public double YourHP = 30;
        
        
        public LayoutTest() {
                
                //constructor
                super( "Test" );
                JButton button;
                JButton button1;
                JLable label;
                
                //allows  window to be closed
                setDefaultClose Operation(JFrame.EXIT_ON_CLOSE);
                setLayout( new BorderLayout() );
                
                //creates the button
                buttonPanel = new JPanel();
                buttonPanel.setLayout( new GridLayout(1 , 3) );
                
                //creates button 1
                button = new JButton( "BATTLE" );
                button.setActionCommand( " One " );
                button.addActionCommand( this );
                buttonPanel.add( button );
                
                //creates button 2
                button = new JButton( "RUN" );
                button.setActionCommand( " Two " );
                button.addActionCommand( this );
                buttonPanel.add( button );
                
                //creates button 3
                button = new JButton( "ITEMS" );
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
                
                button1 = new JButton( "back" );
                button1.setActionCommand( " 3 " );
                button1.addActionCommand( this );
                buttonPanel1.add( button1 );
                
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
                                buttonPanel.setvisible(false);
                                break;
                        case " Two ":
                                buttonPanel.setvisible(false);
                                break;
                        case " Three ":
                                system.exit();
                                break;

                        default:
                                JOptionPane.showMessageDialog( this, "WHERE ARE YOU! THIS DOESNT EXIST!OH GOD HOW DID YOU GET HERE" );
                                break;
                }//end of switch
        }//end of Action performed e
                
                public void  actionPerformed( SctionEvent f ){
                JButton button1 = (JButton)f.getSource();
                
                //button actions 
                switch(button1.getActionCommand() ) {
                        case " 1 ":
                                EnemyHP-3;
                                buttonPanel1.setvisible(false);
                                buttonPanel.setvisible(true);
                                break;
                        case " 2 ":
                                EnemyHP-4;
                                buttonPanel1.setvisible(false);
                                buttonPanel.setvisible(true);
                                break;
                        case " 3 ":
                                buttonPanel1.setvisible(false);
                                buttonPanel.setvisible(true);
                                break;

                        default:
                                JOptionPane.showMessageDialog( this, "WHERE ARE YOU! THIS DOESNT EXIST!OH GOD HOW DID YOU GET HERE" );
                                break;
                }//end of switch
        }//end of action performed f

public static void main(Strings[]args)
{
        new layoutTest();
}//end of main
