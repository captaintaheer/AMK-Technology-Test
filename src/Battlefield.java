
public class Battlefield {
	
	private Square[][] battlefield; // battlefield a 2 dimensional array of                                    Square class.
	private static final int HEIGHT = 4;// constant to create the height of the                                 battlefield.
	private static final int LENGTH = 4; // constant to create the height of the                                     battlefield.
	private int counter;// counter used in getDirCount()
						// method.
	
	
	/*
	 * It creates a two dimensional array of the Square class to create the
	 * battlefield using both constants HEIGHT and LENGTH Then it creates 8
	 * possible directions ,and 4 bulletproof cells in random cells in the
	 * battlefield.
	 */
	public Battlefield() {
		battlefield = new Square[HEIGHT][LENGTH];// creates a battlefield of 4x4
		
		counter = 0;

		for (int row = 0; row < battlefield.length; row++) {

			for (int column = 0; column < battlefield[row].length; column++) {
				battlefield[row][column] = new Square(null,null);
				battlefield[row][column].setFeild(null);

			}

		}
		
		for (int dir = 0; dir < 8; dir++) {// creates 8 directions in random
											// positions in the battlefield.
			battlefield[RandomUtil.nextInt(4)][RandomUtil.nextInt(4)]
					.setDir(new Direction());

		}
		while (getDirCount() < 8) {// makes sure that 8 directions are created in
									// the inizialization.
			battlefield[RandomUtil.nextInt(4)][RandomUtil.nextInt(4)]
					.setDir(new Direction());
		}
		
		for (int bulletProof = 0; bulletProof < 4; bulletProof++) {// crates 5 mountain
															// bulletProof in
															// random positions
															// in the
															// battlefield.
			battlefield[RandomUtil.nextInt(4)][RandomUtil.nextInt(4)]
					.setFeild(new Field("M"));
		}

		while (getFieldCount() < 4) {// makes sure that 4 bulletProof are
										// created in the inizialization.
			battlefield[RandomUtil.nextInt(4)][RandomUtil.nextInt(4)]
					.setFeild(new Field("M"));
		}
	}
	
	public int getDirCount() {
		counter = 0;
		for (int row = 0; row < battlefield.length; row++) {
			for (int column = 0; column < battlefield[row].length; column++) {
				if (battlefield[row][column].getDir() != null) {
					counter++;
				}
			}
		}
		return counter;
	}
	
	public int getFieldCount() {
		counter = 0;
		for (int row = 0; row < battlefield.length; row++) {
			for (int column = 0; column < battlefield[row].length; column++) {
				if (battlefield[row][column].getField().getIcon() == "M") {
					counter++;
				}
			}
		}
		return counter;
	}
	
	public void moveSoldier() {
		for (int row = 0; row < battlefield.length; row++) {
			for (int column = 0; column < battlefield.length; column++) {
				if (battlefield[row][column].getDir() != null) {
					battlefield[row][column].getDir().move(battlefield, row,
							column);
				}
			
			}
		}

	}
	
	/*
	 * This method goes through each square in the battlefield and demands each
	 * square to check if soldier can shoot.
	 */
	public void soldierFights() {

		for (int row = 0; row < battlefield.length; row++) {
			for (int column = 0; column < battlefield[row].length; column++) {
				battlefield[row][column].fight();
			}
		}
	}

}
