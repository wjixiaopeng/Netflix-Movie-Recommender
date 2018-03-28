package MovieRS;
import java.util.Random;

/** Generate random integers in a certain range. */
public  class RandomRange {
	
	public RandomRange(){}

	public int showRandomInteger(int aStart, int aEnd){
		if (aStart > aEnd) {
			throw new IllegalArgumentException("Start cannot exceed End.");
		}
		//get the range, casting to long to avoid overflow problems
		long range = (long)aEnd - (long)aStart + 1;
		// compute a fraction of the range, 0 <= frac < range
		long fraction = (long)(range * new Random().nextDouble());
		int randomNumber =  (int)(fraction + aStart); 
		return randomNumber;
		//    log("Generated : " + randomNumber);
	}



} 
