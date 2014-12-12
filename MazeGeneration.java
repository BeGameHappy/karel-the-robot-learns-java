import stanford.karel.SuperKarel;

public class MazeGeneration extends SuperKarel {

	// You fill in this part
	
	public void run() {
		recMaze();	
	}
	
	public void recMaze() {
		paintCorner(YELLOW);
		faceRandom();
		
		for (int i = 0; i < 4; i++) {
			if (frontIsBlocked()) {
				turnRight();
			} else {
				move();
				if (beepersPresent()) {
					getBack();
					turnRight();
				} else {
					if (cornerColorIs(YELLOW)) {
						getBack();
						turnRight();
					} else {
						// unexplored area
						putBeeperInFront();
						recMaze();
					}
				}
			}
		}
		
	}
	
	public void faceRandom() {
		
		for (int i = 0; i < 4; i++) {
			if (random()) {
				turnRight();
			}	
		}
		
	}
	
	public void getBack() {
		
		turnAround();
		move();
		turnAround();
		
	}
	
	public void putBeeperInFront() {
		
		if (frontIsClear()) {
			move();
			putBeeper();
			getBack();
		}
		
	}

}