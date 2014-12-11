import stanford.karel.SuperKarel;

public class MazeGeneration extends SuperKarel {

	// You fill in this part
	
	public void run() {
		paintCorner(YELLOW);
		move();
		move();
		turnAround();
		for (int i = 0; i < 4; i++) {
			if (random()) {
				turnRight();
			}	
		}
	}

}