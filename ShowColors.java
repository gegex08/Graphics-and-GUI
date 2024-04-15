/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colorjpanel;

import java.awt.Color;
import javax.swing.JFrame;
public class ShowColors
{
// execute application
public static void main( String[] args )
{
// create frame for ColorJPanel
    
JFrame frame = new JFrame( "Genny Using colors" );
frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
ColorJPanel colorJPanel = new ColorJPanel(); // create ColorJPanel
frame.add( colorJPanel ); // add colorJPanel to frame
frame.setSize( 400, 180 ); // set frame size
frame.setVisible( true ); // display frame
System.out.println("");


ShowColors2JFrame application = new ShowColors2JFrame();
application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
// create frame for FontJPanel
JFrame frame2 = new JFrame( "Genny Using fonts" );
frame2.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
FontJPanel fontJPanel = new FontJPanel(); // create FontJPanel
frame2.add( fontJPanel ); // add fontJPanel to frame
frame2.setSize( 420, 150 ); // set frame size
frame2.setVisible( true ); // display frame

JFrame frame3 = new JFrame( "Genny Drawing lines, rectangles and ovals" );
frame3.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
LinesRectOvals linesRectOvals = new LinesRectOvals();
linesRectOvals.setBackground( Color.WHITE );
frame3.add( linesRectOvals ); // add panel to frame
frame3.setSize( 400, 210 ); // set frame size
frame3.setVisible( true ); // display frame
    
// create frame for Shapes2JPanel
JFrame frame4 = new JFrame( "Genny Drawing 2D Shapes" );
frame4.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
Shapes2JPanel shapes2JPanel = new Shapes2JPanel();
frame4.add( shapes2JPanel ); // add shapes2JPanel to frame
frame4.setBackground( Color.WHITE ); // set frame background color
frame4.setSize( 280, 330 ); // set frame size
frame4.setVisible( true ); // display frame
} // end main
} // end class ShowColors

