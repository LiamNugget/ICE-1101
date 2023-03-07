public class CounterTester{
	public static void main(String[] args)
	{
		System.out.println("Testing Counter Class");
		System.out.println("********************");
		Counter tally = new Counter();
		int value = tally.getValue();
		System.out.println("Counter value: " +value);
		tally.count();
		value = tally.getValue();
		System.out.println("Counter value: " +value);
		tally.count();
		value = tally.getValue();
		System.out.println("Counter value: " +value);
		tally.decrement();
		value = tally.getValue();
		System.out.println("Counter value: " +value);
		tally.reset();
		value = tally.getValue();
		System.out.println("Counter value: " +value);
		tally.count();
		value = tally.getValue();
		System.out.println("Counter value: " +value);
		tally.count();
		value = tally.getValue();
		System.out.println("Counter value: " +value);
	}
}