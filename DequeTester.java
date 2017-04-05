//Edward Luo
//APCS2 pd4
//HW29 -- Stress is the Best
//2017-04-05
    
public class DequeTester {

    public static void main( String[] args ) {

	// creates three ALDeques to test methods on: 

	Deque<String> Eddie = new DLLDeque<String>(); 
	Deque<String> Eugene = new DLLDeque<String>(); 
	Deque<String> Kli6 = new DLLDeque<String>();

	// TEST ONE: ADDING AND REMOVING 
	
	System.out.println("\n\nTEST ONE: ADDING AND REMOVING\n\n"); 

	System.out.println("Adding to Eddie... ");
	Eddie.addFirst("Luo!"); 
	Eddie.addFirst("Edward"); 
	Eddie.addFirst("is"); 
	Eddie.addFirst("name"); 
	Eddie.addFirst("My"); 
	System.out.println(Eddie); // "My name is Edward Luo!"

	System.out.println("Adding to Eugenio... ");
	Eugene.addFirst("Thomas!"); 
	Eugene.addFirst("Eugene"); 
	Eugene.addFirst("is"); 
	Eugene.addFirst("name"); 
	Eugene.addFirst("My"); 
	System.out.println(Eugene);  // "My name is Eugene Thomas!"

	System.out.println("Adding to Kli6");
	Kli6.addFirst("Li!"); 
	Kli6.addFirst("Kevin"); 
	Kli6.addFirst("is"); 
	Kli6.addFirst("name"); 
	Kli6.addFirst("My"); 
	System.out.println(Kli6);  // "My name is Kevin Li!"
	
	// Removes our names from the deque using pollLast: 

	System.out.println("Removing....."); 
	Eddie.pollLast(); 
	Eugene.pollLast(); 
	Kli6.pollLast();
	Eddie.pollLast(); 
	Eugene.pollLast(); 
	Kli6.pollLast();  
	System.out.println(Eddie); // "My name is"
	System.out.println(Eugene); // "My name is" 
	System.out.println(Kli6); // "My name is" 

	// Adds nicknames to each deque using addLast: 

	System.out.println("Adding nicknames..."); 
	Eddie.addLast("E-Luo!"); 
	Eugene.addLast("Eugenio!"); 
	Kli6.addLast("Kli6!");
	System.out.println(Eddie); // "My name is E-Luo!"
	System.out.println(Eugene); // "My name is Eugenio!" 
	System.out.println(Kli6); // "My name is Kli6!"
	
	// Gets only the nickname by using pollFirst:
 
	System.out.println("Removing greetings..."); 
	Eddie.pollFirst(); 
	Eugene.pollFirst();
	Kli6.pollFirst(); 
	Eddie.pollFirst(); 
	Eugene.pollFirst();
	Kli6.pollFirst(); 
	Eddie.pollFirst(); 
	Eugene.pollFirst();
	Kli6.pollFirst(); 
	System.out.println(Eddie); // "E-Luo!"
	System.out.println(Eugene); // "Eugenio!" 
	System.out.println(Kli6); // "Kli6!"

	// TEST TWO: PEEKING AND EMPTINESS 

	System.out.println("\n\nTEST TWO: PEEKING AND EMPTINESS\n\n");

	System.out.println("Nicknames^2..."); 
	System.out.println(Eddie.peekFirst()); // "E-Luo!"
	System.out.println(Eugene.peekFirst()); // "Eugenio!" 
	System.out.println(Kli6.peekFirst()); // "Kli6!"
	System.out.println(Eddie.peekLast()); // "E-Luo!"
	System.out.println(Eugene.peekLast()); // "Eugenio!" 
	System.out.println(Kli6.peekLast()); // "Kli6!"

	// Polls the nicknames by using pollFirst.

	/*
	// Tests isEmpty: 

	System.out.println("isEmpty pre-removal..."); 
        System.out.println(Eddie.isEmpty()); // false
	System.out.println(Eugene.isEmpty()); // false 
	System.out.println(Kli6.isEmpty()); // false
	System.out.println("Removing..."); 
	Eddie.pollFirst(); 
	Eugene.pollFirst();
	Kli6.pollFirst(); 
	System.out.println("isEmpty post-removal..."); 
        System.out.println(Eddie.isEmpty()); // true
	System.out.println(Eugene.isEmpty()); // true
	System.out.println(Kli6.isEmpty()); // true
	

	// TEST THREE: CONTAINS AND OCCURENCE-BASED REMOVAL
	
	System.out.println("\n\nTEST THREE: CONTAINS AND OCCURENCE-BASED REMOVAL\n\n"); 

	Deque<String> TBM = new ALDeque<String>(); 
	System.out.println("Filling TBM..."); 
	TBM.addLast("Digital"); 
	TBM.addLast("Feedback");	
	TBM.addLast("Analog");
	TBM.addLast("Feedback");
	System.out.println(TBM); // "Digital Feedback Analog Feedback"
	System.out.println("Testing contains..."); 
	System.out.println(TBM.contains("Digital")); // true
	System.out.println(TBM.contains("Thumbs?")); // false 	
	System.out.println("RFO of Feedback...");
	TBM.pollFirstOccurence("Feedback"); 
	System.out.println(TBM); // "Digital Analog Feedback" 
	System.out.println("RLO of Feedback..."); 
	TBM.pollLastOccurence("Feedback"); 
	System.out.println(TBM); // "Digital Analog" 

	*/
	// TEST FOUR: TO GET AN ERROR
	
	/*System.out.println("\n\nPolling from an empty deque... \n\n"); 
	System.out.println(Eddie.pollFirst()); // ERROR
	System.out.println(Eugene.pollFirst()); // ERROR
	System.out.println(Kli6.pollFirst()); // ERROR
	*/
	// Tests for methods not implemented in ALDeque but implemented in Deque interface:
	/*
	  "Stack" methods:

	  Deque<String> Joshua = new SDeque<String>();
	  
	  Joshua.push("Hi");
	  Joshua.push("I'm");
	  Joshua.push("trash");
	  Joshua.pop();
	  Joshua.pop("OP");
	  System.out.println( Joshua.peek() );

	  "Queue" methods:

	  Deque<String> Natasha = new QDeque<String>();

	  Natasha.add("IWETISIDIKF");
	  Natasha.poll();
	  Natasha.poll();
	  Natasha.offer("Oh, hello there, Joshua...");
	  System.out.println( Natasha.element() );
	  Natasha.poll();
	  Sytstem.out.println( Natasha.peek() );
	*/
    }

}
