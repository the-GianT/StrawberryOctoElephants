public class DequeTester2
{
    public static void main ( String[] args ) {
        
	//testing for add, assuming toString is correct & add is implemented to insert at the _end
	Deque <String> test = new DLLDeque <String>();
	Deque <String> experiment = new DLLDeque <String> ();
	test.addLast("1");
	test.addLast("2");
	test.addLast("3");
	System.out.println("should read 1<---2<---3 or 3--->2--->1, wherein 1 is the _front");
        System.out.println("your implementation: " + test);
	
	// new DQ 
	System.out.println("\nTesting peekLast() ");
	System.out.println("Adding 'hi'");
	experiment.addLast("hi");
	if (experiment.peekLast()== "hi") 
	    System.out.println ("success");
	else
	    System.out.println ("failed");
	System.out.println("Adding 'b'");
	experiment.addLast("b");
	if (experiment.peekLast() == "b") 
	    System.out.println ("success");
	else
	    System.out.println ("failed");
	System.out.println("Adding 'whatsGood'");
	experiment.addLast("whatsGood");
	if (experiment.peekLast() == "whatsGood") 
	    System.out.println ("success");
	else
	    System.out.println ("failed");
	System.out.println("\nTesting peekFirst:");
	if (experiment.peekFirst() == "hi")
	    System.out.println ("success");
	else
	    System.out.println ("failed");

	// testing for size()
	System.out.println("Testing for size()");
	if (experiment.size() == 3)
	    System.out.println ("success");
	else
	    System.out.println ("failed");

	// testing for addFirst()
	System.out.println ("\nTesting for addFirst()");
	experiment.addFirst("zimbabwe");
	if (experiment.peekFirst() == "zimbabwe")
	    System.out.println ("success");
	else
	    System.out.println ("failed");

	//testing for addLast()
	System.out.println ("\nTesting for addLast()");
	experiment.addLast("zambia");
	if (experiment.peekLast() == "zambia")
	    System.out.println ("success");
	else
	    System.out.println ("failed");

	// pollFirst(), assuming that they are the same 
	System.out.println("\nTesting pollFirst()");
	if (experiment.pollFirst() == "zimbabwe")
	    System.out.println ("success");
	else
	    System.out.println ("failed");

	// pollLast()
	System.out.println("\nTesting pollLast()");
	if (experiment.pollLast() == "zambia")
	    System.out.println ("success");
	else
	    System.out.println ("failed");

	System.out.println("\nShould return null eventually...");
        System.out.println(experiment.pollFirst());
	System.out.println(experiment.pollFirst());
	System.out.println(experiment.pollFirst());
	System.out.println(experiment.pollFirst());
	System.out.println(experiment.pollFirst());

	//adding more to experiment
	System.out.println ("\nAdding more to experiment....");
	experiment.addFirst("internet");
	experiment.addFirst("power");

	/************************
	 * No remove method is present in this version of Deque

	System.out.println("\nTesting remove()");
	System.out.println(experiment.remove());
	System.out.println(experiment.remove());
	System.out.println("\nShould throw an exception...");
	experiment.remove();

	************************/
    }
}
