package lll.wrj4P5;

import lll.Loc.*;
import wiiremotej.event.*;

public class DrumEvent {
	public final static int BLUE = WRDrumExtensionEvent.BLUE;

	public final static int GREEN = WRDrumExtensionEvent.GREEN;

	public final static int MINUS = WRDrumExtensionEvent.MINUS;

	public final static int ORANGE = WRDrumExtensionEvent.ORANGE;

	public final static int PEDAL = WRDrumExtensionEvent.PEDAL;

	public final static int PLUS = WRDrumExtensionEvent.PLUS;

	public final static int RED = WRDrumExtensionEvent.RED;

	public final static int YELLOW = WRDrumExtensionEvent.YELLOW;

	//
	private WRDrumExtensionEvent cextevt;

	//
	public DrumEvent(WRDrumExtensionEvent evt) {
		cextevt = evt;
	}

	public boolean isAnyPressed(int button) { // check the given button is pressed.
		return cextevt.isAnyPressed(button);
	}

	public boolean isOnlyPressed(int button) { // check the given button is pressed.
		return cextevt.isOnlyPressed(button);
	}

	public boolean isPressed(int button) { // check the given button is pressed.
		return cextevt.isPressed(button);
	}

	public boolean wasOnlyPressed(int button) { // check the given button was pressed.
		return cextevt.wasOnlyPressed(button);
	}

	public boolean wasPressed(int button) { // check the given button was pressed.
		return cextevt.wasPressed(button);
	}

	public boolean wasReleased(int button) { // check the given button was released.
		return cextevt.wasReleased(button);
	}

	public Loc getStick() { // get the current stick 2D(Loc) position. (-1 to 1)
		return new Loc((float) cextevt.getAnalogStickData().getX(),
				(float) cextevt.getAnalogStickData().getY(), 0);
	}


	public float getSoftness() { // no hit (0.0) to the hardest hit(1.0),  (0 to 1)
		return (float) cextevt.getSoftness();
	}

	public int getSoftnessPad() { // pad id, the softness was sensed. (symbal/bass)
		return cextevt.getSoftnessPad();
	}
}
