/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colorjpanel;

import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class FontJPanel extends JPanel
{
// display Strings in different fonts and colors
public void paintComponent( Graphics g )
{
super.paintComponent( g ); // call superclass's paintComponent
// set font to Serif (Times), bold, 12pt and draw a string
g.setFont( new Font( "Serif", Font.BOLD, 12 ) );
g.drawString( "Geneiva Ocampo.", 20, 30 );
// set font to Monospaced (Courier), italic, 24pt and draw a string
g.setFont( new Font( "Monospaced", Font.ITALIC, 24 ) );
g.drawString( "Genny Ocampo.", 20, 50 );
// set font to SansSerif (Helvetica), plain, 14pt and draw a string
g.setFont( new Font( "SansSerif", Font.PLAIN, 14 ) );
g.drawString( "Genoveva.", 20, 70 );
// set font to Serif (Times), bold/italic, 18pt and draw a string
g.setColor( Color.RED );
g.setFont( new Font( "Genny", Font.BOLD + Font.ITALIC, 18 ) );
g.drawString( g.getFont().getName() + ' ' + g.getFont().getSize() +
" Ocampo.", 20, 90 );
} // end method paintComponent
} // end class FontJPanel


