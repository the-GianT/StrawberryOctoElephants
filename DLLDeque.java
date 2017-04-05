// StrawberryOctoElephants
// Marcus Ng, Ish Mahdi, and Thomas Lin
// LAB #02: All Hands on Deque! (Not Schenectady; rather, synecdoche.)
// 2017-3-31

public class DLLDeque<T> implements Deque<T> {

    private DLLNode<T> _front, _end;
    private int _size;
    
    // Default constructor
    public DLLDeque() {
	_front = null;
	_end = null;
	_size = 0;
    }

    // Add element to the front w/o violating capacity restrictions
    public void addFirst(T x) {
	// If the deque is empty
	if (_size == 0) {
	    // Add a node to the deque
	    _front = new DLLNode<T>(x, null, null);
	    _end = _front;  
	} else {
	    // Add a new node to the front and set the old _front's previous to the new node
	    _front.setPrev(new DLLNode<T>(x, null, _front));
	    _front = _front.getPrev();
	}
	_size++;
    } // O(1)

    // Add element to the end w/o violating capacity restrictions
    public void addLast(T x) {
	// If the deque is empty
	if (_size == 0) {
	    // Add a node to the deque
	    _front = new DLLNode<T>(x, null, null);
	    _end = _front;  
	} else {
	    // Add a new node to the end and set the old _end's next to the new node
	    _end.setNext(new DLLNode<T>(x, _end, null));
	    _end = _end.getNext();
	}
	_size++;
    } // O(1)
    
    // Remove and return first element, or return null if empty
    public T pollFirst() {
	DLLNode<T> rm = _front;
	// Return null if the deque is empty
	if (_size == 0) {
	    return null;
	} else {
	    // Set _front the next node in the deque
	    _front = _front.getNext();
	}
	_size--;
	// Return the value of the removed node
	return rm.getValue();
    } // O(1)

    // Remove and return last element, or return null if empty
    public T pollLast() {
	DLLNode<T> rm = _end;
	// Return null if the deque is empty
	if (_size == 0) {
	    return null;
	} else if (_size == 1) {
	    // If deque's size is 1, then set _front to null
	    _front = null;		 
	} else {
	    // Set _end to the new _end node's next pointer to null
	    _end = _end.getPrev();
	    _end.setNext(null);
	}
	_size--;
	// Return the value of the old node
	return rm.getValue();
    } // O(1)

    // Returns first element or null if empty
    public T peekFirst(){
	if(_size == 0){
	    return null;
	}
	return _front.getValue();
    } // O(1)

    // Returns last element or null if empty
    public T peekLast(){
	if(_size == 0){
	    return null;
	}
	return _end.getValue();
    } // O(1)

    // Returns the number of elements in deque
    public int size(){
	return _size;
    } // O(1)
    
    // Return each node separated by spaces
    public String toString() {
	String retStr = "";
	DLLNode<T> dummy = _front; 
	while ( dummy != null ) { 
	    retStr += dummy.getValue() + " "; 
	    dummy = dummy.getNext(); 
	} 
	return retStr;
    } // O(n)
    
    public static void main(String[] args) {

	Deque<String> Pew = new DLLDeque<String>();

	System.out.println("\nEnqueuing...");
	Pew.addFirst("an");
	Pew.addLast("offer");
	Pew.addFirst("him");
	Pew.addLast("he");
	Pew.addFirst("make");
	Pew.addLast("can't");
	Pew.addFirst("gonna");
	Pew.addLast("refuse");
	Pew.addFirst("I'm");

	System.out.println("\nPeek...");
	System.out.println(Pew.peekFirst()); // I'm
	System.out.println(Pew.peekLast()); // refuse
	
	System.out.println("\nPrint Deque...");
	System.out.println(Pew); // I'm gonna make him an offer he can't refuse

	System.out.println("\nSize...");
	System.out.println(Pew.size()); // 9
	
	System.out.println("\nDequeuing...");
	System.out.println(Pew.pollFirst()); // I'm
	System.out.println(Pew.pollLast()); // refuse
	System.out.println(Pew.pollFirst()); // gonna
	System.out.println(Pew.pollLast()); // can't
	System.out.println(Pew.pollFirst()); // make
	System.out.println(Pew.pollLast()); // he
	System.out.println(Pew.pollFirst()); // him
	System.out.println(Pew.pollLast()); // offer
	System.out.println(Pew.pollFirst()); // an
		
	System.out.println("\nEmpty Deque Dequeue (return null)...");
	System.out.println(Pew.pollFirst());
	System.out.println(Pew.pollLast());
	System.out.println("\nPeek...(null)");
	System.out.println(Pew.peekFirst()); // null
	System.out.println(Pew.peekLast()); // null

	System.out.println("\nSize...");
	System.out.println(Pew.size()); // 0
	/*==================================	  
	  ==================================*/
    }
    
}


