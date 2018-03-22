package pvt.test;

import java.util.ArrayList;

public class Dancer {

	private int allSteps = 0;
	private DanceFloor danceFloor = new DanceFloor();
	private int position = 0;
	private ArrayList<Integer> dancerSequance;

	public int getAllSteps() {
		return allSteps;
	}

	public void setAllSteps(int allSteps) {
		this.allSteps = allSteps;
	}

	public DanceFloor getSizeOfDancefloor() {
		return danceFloor;
	}

	public void setSizeOfDancefloor(DanceFloor danceFloor) {
		this.danceFloor = danceFloor;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public ArrayList<Integer> getDancerSequance() {
		return dancerSequance;
	}

	public void setDancerSequance(ArrayList<Integer> dancerSequance) {
		this.dancerSequance = dancerSequance;
	}

	public boolean isCanDance() {
		int firstNumber = dancerSequance.get(0);
		if ((firstNumber % 2 != 0 && allSteps == 0)
				|| (firstNumber % 2 == 0 && firstNumber > danceFloor.getSizeOfDanceFloor())) {
			allSteps = 0;
			return false;
		}
		return true;
	}

}
