package lll.wrj4P5;
import wiiremotej.event.*;

public class DrumPressedThread extends Thread {
	WRDrumExtensionEvent evt;
	int myId;
	Wrj4P5 parent;

	public DrumPressedThread(WRDrumExtensionEvent evt, Wrj4P5 parent, int rid) {
		super();
		this.evt = evt;
		this.parent = parent;
		this.myId = rid;
	}
	public void run() {
     	try{
    				parent.drumPressed.invoke(
    					parent.parent, 
    					new Object[] {
    					new DrumEvent(evt), 
    					new Integer(myId),
    					}
    				);
    		}catch (Exception e){
    			System.err.println("Disabling drum() for " + (parent.parent).getName() + " because of an error.");
    			e.printStackTrace();
    		}
	}
}
