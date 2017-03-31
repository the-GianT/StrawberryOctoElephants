// Marcus Ng
// APCS2 pd4
// HW #19: Generically Speaking...
// 2017-3-16

/*****************************************************
 * class DLLNode
 * Implements a node, for use in lists and other container classes.
 *****************************************************/

public class DLLNode<T>
{

    private T _cargo;    //cargo
    private DLLNode _nextNode; //pointer to next LLNode
    private DLLNode _prevNode; //pointer to previous LLNode
    
    // constructor -- initializes instance vars
    public DLLNode( T value, DLLNode next, DLLNode previous ) 
    {
	_cargo = value;
	_nextNode = next;
	_prevNode = previous;
    }


    //--------------v  ACCESSORS  v--------------
    public T getCargo() { return _cargo; }

    public DLLNode getNext() { return _nextNode; }

    public DLLNode getPrev() { return _prevNode; }
    //--------------^  ACCESSORS  ^--------------


    //--------------v  MUTATORS  v--------------
    public T setCargo( T newCargo ) {
	T oldCargo = _cargo;
	_cargo = newCargo;
	return oldCargo;
    }

    public DLLNode setNext( DLLNode newNext ) {
	DLLNode oldNode = _nextNode;
	_nextNode = newNext;
	return oldNode;
    }

    public DLLNode setPrev( DLLNode newPrev ) {
	DLLNode oldNode = _prevNode;
	_prevNode = newPrev;
	return oldNode;
    }
    //--------------^  MUTATORS  ^--------------


    // override inherited toString
    public String toString() { return _cargo.toString(); }
    
}//end class DLLNode
