public class Counter{
	private int value;
	// Constructor for Counter class
	public Counter(){
		value = 0;
	}
	// Returns counter value
	public int getValue(){
		return value;
	}
	// Counter is incremented
	public void count(){
		value = value + 1;
	}
	// Counter is reset
	public void reset(){
		value = 0;
	}
	// Counter is decremented
	public void decrement(){
		value = value - 1;
	}
}