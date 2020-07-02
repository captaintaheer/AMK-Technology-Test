
public class Field {
	private String icon;
	/*This constructor initializes the icon to
	 * a default String "N".
	 */
		public Field() {
			icon = "N";
		}
	/*This constructor initializes the icon
	 * to a specific String.
	 */
		public Field(String icon) {
			this.icon = icon;
		}
	/*This method returns a String reference 
	 * of the icon.
	 */
		public String getIcon() {
			return icon;
		}

}
