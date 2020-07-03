import java.util.Random;

public class RandomUtil {
	
	private static final Random random = new Random();

	private RandomUtil() {
	}
/*This method returns a random number 
 * from 0 to the maximum-1.
 */
	public static int nextInt(int max) {
		return random.nextInt(max);
	}

}
