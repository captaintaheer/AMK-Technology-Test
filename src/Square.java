
public class Square {
	private Direction dir;
	private Field field;
/*This constructor accepts references to
 * field , dir objects.
 */
	public Square(Field field, Direction dir) {
		field = new Field();
		dir = new Direction();
	}
/*This method returns a reference to
 * a field object inside the square.
 */
	public Field getField() {
		return field;
	}
/* This method sets an dir into the square
 * if the reference is null the field is made to normal
 * field.
 * 
 */
	public void setFeild(Field field) {
		this.field = field;
		if (field==null){
			this.field=new Field();
		}
	}
	/*This method returns a reference to
	 * an dir object inside the square.
	 */
	public Direction getDir() {
		return dir;
	}
	/* This method sets an dir into the square
	 * if the reference is null the dir is removed
	 * from the square.
	 */
	public void setDir(Direction dir) {
		this.dir = dir;
	}
	
	public void fight() {
		if (dir != null ) {

			if (dir.getPosition() > 0) {
				
			}
		}
	}

	
}
