/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colorjpanel;

/**
 *
 * @author geneivaocampo
 */
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class LinesRectOvals extends JPanel
{
// display various lines, rectangles and ovals
public void paintComponent( Graphics g )
{
        super.paintComponent( g ); // call superclass's paint method
        this.setBackground( Color.WHITE );
        g.setColor( Color.RED );
        g.drawLine( 5, 30, 380, 30 );
        g.setColor( Color.BLUE );
        g.drawRect( 5, 40, 90, 55 );
        g.fillRect( 100, 40, 90, 55 );
        g.setColor( Color.BLACK );
        g.fillRoundRect( 195, 40, 90, 55, 50, 50 );
        g.drawRoundRect( 290, 40, 90, 55, 20, 20 );
        g.setColor( Color.GREEN );
        g.draw3DRect( 5, 100, 90, 55, true );
        g.fill3DRect( 100, 100, 90, 55, false );
        g.setColor( Color.MAGENTA );
        g.drawOval( 195, 100, 90, 55 );
        g.fillOval( 290, 100, 90, 55 );

        // letter G
        g.setColor(Color.RED);
        g.drawLine(20, 400, 20, 340);
        g.drawLine(20, 400, 80, 400);
        g.drawLine(20, 340, 80, 340);
        g.drawLine(80, 400, 80, 370);
        g.drawLine(80, 370, 50, 370);
 

        // letter E
        g.setColor(Color.BLUE);
        g.drawLine(90, 340, 90, 420);
        g.drawRect(90, 340, 40, 20);
        g.fillRect(90, 340, 40, 20);
        g.drawRect(90, 370, 40, 20);
        g.fillRect(90, 370, 40, 20);
        g.drawRect(90, 400, 40, 20);
        g.fillRect(90, 400, 40, 20);
        g.drawLine(90, 355, 130, 355); 
        

        //  Letter N 
        g.setColor(Color.orange);
        g.drawRect(160, 340, 20, 60);
        g.drawRect(240, 340, 20, 60);
        g.drawLine(160, 340, 260, 400); 
        g.fillRect(160, 340, 20, 60);
        g.fillRect(240, 340, 20, 60);

        // letter Y 
        g.setColor(Color.GREEN);
        g.drawLine(270, 340, 300, 370);
        g.drawLine(330, 340, 300, 370);
        g.drawLine(300, 370, 300, 400);
        
} // end method paintComponent
}