package edu.ucsb.cs56.w15.drawings.zixia.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.geom.AffineTransform; // translation, rotation, scale
import java.awt.Shape; // general class for shapes

// all imports below this line needed if you are implementing Shape
import java.awt.geom.Point2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.Rectangle;
import java.awt.geom.PathIterator;
import java.awt.geom.AffineTransform;
import java.awt.geom.Arc2D;

import edu.ucsb.cs56.w15.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.w15.drawings.utilities.GeneralPathWrapper;

/**
 A vector drawing of a umbrella with rain that implements
 the Shape Umbrella, and so can be drawn, as well as
 rotated, scaled, etc.
 
 @author Zixia Weng
 @version for CS56, Winter 14, UCSB
 
*/
public class RainyUmbrella extends Umbrella implements Shape
{
    /**
 *      * Constructor for objects of class RainyUmbrella
 *           */
    public RainyUmbrella(double x, double y, double width, double height)
    {
        // construct the basic Umbrella shell
       	super(x,y,width,height);
        
        // get the GeneralPath that we are going to append stuff t
       	GeneralPath gp = this.get();
       
     	Line2D.Double RainDropOne = new Line2D.Double(x + width/8, y - height/2, x + width/8, y - height/4);
	
	Line2D.Double RainDropTwo = new Line2D.Double(x + width/3, y - height/2 - height/10, x + width/3, y - height/4 - height/10);
        
	Line2D.Double RainDropThree = new Line2D.Double(x + width/2, y - height/2, x + width/2, y - height/4);
	
	Line2D.Double RainDropFour = new Line2D.Double(x + width/2 + width/4, y - height/2 - height/10, x + width/2 + width/4, y - height/4 - height/10);

	Line2D.Double RainDropFive = new Line2D.Double(x + width - width/8, y -height/2, x + width - width/8, y - height/4);

    	GeneralPath wholeUmbrella = this.get();
	
	wholeUmbrella.append(RainDropOne,false);
	wholeUmbrella.append(RainDropTwo,false);
	wholeUmbrella.append(RainDropThree,false);
	wholeUmbrella.append(RainDropFour,false);
	wholeUmbrella.append(RainDropFive,false);
    }
}
