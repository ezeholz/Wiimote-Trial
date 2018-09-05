package lll.wrj4P5;

import lll.Loc.*;
import wiiremotej.event.*;

/**
 * WiiDrum is the model of the Wii Drum. 
 */

public class WiiDrum {
	public Loc stick = new Loc();	// latest sensed 2D(Loc) location(%) of the stick.
//
	private WRDrumExtensionEvent cextevt;
//
	public void inputEvent(WRDrumExtensionEvent evt) {
		cextevt = evt;
		stick.move((float)cextevt.getAnalogStickData().getX(),
				   (float)cextevt.getAnalogStickData().getY(),
				   0
				);
	}
}
