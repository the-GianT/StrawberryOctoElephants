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
	if (_size == 0) { 
	    _front = new DLLNode<T>(x, null, null);
	    _end = _front;  
	} 
	else {
	    _front.setPrev(new DLLNode<T>(x, null, _front));
	    _front = _front.getPrev();
	}
	_size++;
    }

    // Add element to the end w/o violating capacity restrictions
    public void addLast(T x) {
	if (_size == 0) { 
	    _front = new DLLNode<T>(x, null, null);
	    _end = _front;  
	} 
	else {
	    _end.setNext(new DLLNode<T>(x, _end, null));
	    _end = _end.getNext();
	}
	_size++;
    }
    
    // Remove and return first element, or return null if empty
    public T pollFirst() {
	DLLNode<T> rm = _front;
	if (_size == 0) {
	    return null;
	} else {
	    _front = _front.getNext();
	}
	_size--;
	return rm.getValue();
    }

    // Remove and return last element, or return null if empty
    public T pollLast() {
	DLLNode<T> rm = _end;
	if (_size == 0) {
	    return null;
	} else if (_size == 1) {
	    _front = null;		 
	} else {
	    _end = _end.getPrev();
	    _end.setNext(null);
	}
	_size--;
	return rm.getValue();
    }

    // Returns first element or null if empty
    public T peekFirst(){
	if(_size == 0){
	    return null;
	}
	return _front.getValue();
    }

    // Returns last element or null if empty
    public T peekLast(){
	if(_size == 0){
	    return null;
	}
	return _end.getValue();
    }

    // Returns the number of elements in deque
    public int size(){
	return _size;
    }
    
    // Return each node separated by spaces
    public String toString() {
	String retStr = "";
	DLLNode<T> dummy = _front; 
	while ( dummy != null ) { 
	    retStr += dummy.getValue() + " "; 
	    dummy = dummy.getNext(); 
	} 
	return retStr;
    }
    
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

	System.out.println("\nPrint Deque...");
	System.out.println(Pew); // I'm gonna make him an offer he can't refuse

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
	/*==================================	  
	  ==================================*/
    }
    
}
