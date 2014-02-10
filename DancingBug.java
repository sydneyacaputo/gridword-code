 
import info.gridworld.actor.Bug; 
public class DancingBug extends Bug 
{ 
    private int[] list; 
    private int current; 
 
    public DancingBug(int[] array) {
	list = array; 
	current = 0; 
    } 
 
    public void act() 
    { 
	if(current == list.length) 
	    { current = 0; }
	for (int c = 0; c < list[current];c++){
	    turn();
	}
	current++; 
	super.act(); 
    } 
} 