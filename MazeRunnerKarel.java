import stanford.karel.SuperKarel;

public class MazeRunnerKarel extends SuperKarel {

	// You fill in this part
	
	public void run() {
		while (noBeepersPresent()) {
			turnRight();
			while (frontIsBlocked()) {
				turnLeft();
			}
			move();
		}
	}

}