

import info.gridworld.actor.Bug; 
import info.gridworld.grid.Location; 
public class ZBug extends Bug 
{ 
    private int segmentLength; 
    private int steps;
    private int part;  

    public ZBug(int length) 
    { 
	setDirection(Location.EAST); 
	steps = 0; 
	part = 1; 
	segmentLength = length; 
    } 
 
    public void act() 
    { 
	if (part < 4 && steps < segmentLength) 
	    { 
		if (canMove()) 
		    { 
			move(); 
			steps++; 
		    } 
	    } 

	else if (part == 1) 
	    { 
		setDirection(Location.SOUTHWEST); 
		steps = 0; 
		part++; 
	    } 

	else if (part == 2) 
	    { 
		setDirection(Location.EAST); 
		steps = 0; 
		part++; 
	    } 
    } 
} 
