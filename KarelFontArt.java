/*
 * File: KarelFontArt.java
 * ----------------------------
 * Print some bitmap font characters with the beepers.
 */

import stanford.karel.SuperKarel;

public class KarelFontArt extends SuperKarel {

	public void run() {
		moveTop();
		upperK();
	}
	
	private void moveTop() {
		turnLeft();
		while (frontIsClear()) {
			move();
		}
		turnRight();
	}
	
	private void getBack() {
		turnRight();
		move();
		turnRight();
		for (int i = 0; i < 14; i++) {
			move();
		}
		turnAround();
	}
	
	
	private void upperK() {
		//Line #1
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		move();
		move();
		move();
		move();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		move();
		getBack();
		
		//Line #2
		putBeeper();
		move();
		move();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		move();
		move();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		getBack();
		
		//Line #3
		putBeeper();
		move();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		move();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		getBack();
		
		//Line #4
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		getBack();
		
		//Line #5
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		move();
		getBack();
		
		//Line #6
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		move();
		move();
		getBack();
		
		//Line #7
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		move();
		move();
		move();
		getBack();
		
		//Line #8
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		move();
		move();
		getBack();
		
		//Line #9
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		move();
		getBack();
		
		//Line #10
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		getBack();
		
		//Line #11
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		getBack();
		
		//Line #12
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		move();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		getBack();	
		
		//Line #13
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		move();
		move();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		getBack();	
		
		//Line #14
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		move();
		move();
		move();
		move();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		move();
		getBack();	
	}

}
