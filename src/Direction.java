
public class Direction {
	private int Position;
	/* It generates the random position of the Soldier from 0-7.
	 */
	public Direction() {

		Position = RandomUtil.nextInt(8);
	}
	/* It returns the Icon of the Soldier.
	 */
	public String getIcon() {
		return "E";
	}
	/*It returns the Position of the soldier
	 */
	public int getPosition() {
		return Position;
	}
	
	public void move(Square[][] battlefield, int currentRowIndex,
			int currentColumnIndex) {

		switch (RandomUtil.nextInt(4)) {//random number from 0-3 to decide where the soldier is going to move
		case 0://go East
			if (checkDestination(battlefield, currentRowIndex - 1,
					currentColumnIndex) != null) {
				battlefield[currentRowIndex - 1][currentColumnIndex]
						.setDir(battlefield[currentRowIndex][currentColumnIndex]
								.getDir());
				battlefield[currentRowIndex][currentColumnIndex].setDir(null);
			}
			break;
		case 1://go West
			if (checkDestination(battlefield, currentRowIndex + 1,
					currentColumnIndex) != null) {
				battlefield[currentRowIndex + 1][currentColumnIndex]
						.setDir(battlefield[currentRowIndex][currentColumnIndex]
								.getDir());
				battlefield[currentRowIndex][currentColumnIndex].setDir(null);
			}
			break;
		case 2://go South
			if (checkDestination(battlefield, currentRowIndex,
					currentColumnIndex + 1) != null) {
				battlefield[currentRowIndex][currentColumnIndex + 1]
						.setDir(battlefield[currentRowIndex][currentColumnIndex]
								.getDir());
				battlefield[currentRowIndex][currentColumnIndex].setDir(null);
			}
			break;
		case 3://go North
			if (checkDestination(battlefield, currentRowIndex,
					currentColumnIndex - 1) != null) {
				battlefield[currentRowIndex][currentColumnIndex - 1]
						.setDir(battlefield[currentRowIndex][currentColumnIndex]
								.getDir());
				battlefield[currentRowIndex][currentColumnIndex].setDir(null);
			}
			break;
		}

	}
	/*This method check if the movement proposed above is valid, else
	 * it returns null
	 */
	private Square checkDestination(Square[][] battlefield,
			int proposedRowIndex, int proposedColumnIndex) {
		if (proposedRowIndex > 4
				|| proposedRowIndex < 0
				|| proposedColumnIndex > 4
				|| proposedColumnIndex < 0
				|| battlefield[proposedRowIndex][proposedColumnIndex].getDir() != null
				|| battlefield[proposedRowIndex][proposedColumnIndex]
						.getField().getIcon() == "M") {
			return null;
		} else
			return battlefield[proposedRowIndex][proposedColumnIndex];
	}

}
