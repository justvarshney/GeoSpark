/*
 * 
 */
package org.datasyslab.geospark.utils;

import java.io.Serializable;
import java.util.Comparator;

import com.vividsolutions.jts.geom.Point;

// TODO: Auto-generated Javadoc
/**
 * The Class PointXComparator.
 * 
 */
public class PointXComparator extends GemotryComparator implements Comparator<Point>, Serializable {
    

 	/** 
	  * This is use to compare two point's x coordinate
	  * @param point1, point2
	  * @return 
	  *  1 means point1's X coordinate is larger than point2's X coordinate <br>
	  *  0 means point1's X coordinate is equal to point2's X coordinate <br>
	  *  -1 means point1's X coordinate is smaller than point2's X coordinate 
	  */
	 public int compare(Point point1, Point point2) {
	    if(point1.getX()>point2.getX())
	    {
	    	return 1;
	    }
	    else if (point1.getX()<point2.getX())
	    {
	    	return -1;
	    }
	    else return 0;
	    }
}