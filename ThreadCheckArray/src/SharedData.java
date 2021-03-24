import java.util.ArrayList;

/**
 * @author yuval
 *
 */
public class SharedData 
{
	/**
	 * array - the array where we are searching for the sum
	 * winArray - the subarray where we found the sum
	 * flag - indicate if we found the sum
	 * b - the sum we are searching
	 */
	private ArrayList<Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	/** the constructor defines two parameters
	 * 
	 * @param array		ArrayList of numbers
	 * @param b			sum we want to find in array
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}

	/**
	 * 
	 * @return the winning array
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/**
	 * 
	 * @param winArray		the winning array we want to set
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/**
	 * 
	 * @return array
	 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	/**
	 * 
	 * @return b
	 */
	public int getB() 
	{
		return b;
	}

	/**
	 * 
	 * @return flag
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/**
	 * 
	 * @param flag		set the flag
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
