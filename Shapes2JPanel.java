/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colorjpanel;

// Fig. 12.31: Shapes2JPanel.java
// Demonstrating a general path.
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.util.Random;
import javax.swing.JPanel;
public class Shapes2JPanel extends JPanel
{
// draw general paths
public void paintComponent( Graphics g )
{
        super.paintComponent( g ); // call superclass's paintComponent
        Random random = new Random(); // get random number generator
        int[] xPoints = { 55, 67, 109, 73, 83, 55, 27, 37, 1, 43 };
        int[] yPoints = { 0, 36, 36, 54, 96, 72, 96, 54, 36, 36 };
        Graphics2D g2d = ( Graphics2D ) g;
        GeneralPath star = new GeneralPath(); // create GeneralPath object
        // set the initial coordinate of the General Path
        star.moveTo( xPoints[ 0 ], yPoints[ 0 ] );
        // create the star--this does not draw the star
        for ( int count = 1; count < xPoints.length; count++ )
        star.lineTo( xPoints[ count ], yPoints[ count ] );
        star.closePath(); // close the shape
        g2d.translate( 150, 150 ); // translate the origin to (150, 150)
        // rotate around origin and draw stars in random colors
        for ( int count = 1; count <= 20; count++ )
        {
        g2d.rotate( Math.PI / 10.0 ); // rotate coordinate system
        // set random drawing color
        g2d.setColor( new Color( random.nextInt( 256 ),
        random.nextInt( 256 ), random.nextInt( 256 ) ) );
        g2d.fill( star ); // draw filled star

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
} // end for
} // end method paintComponent
} // end class Shapes2JPanel
