// StrawberryOctoElephants
// Marcus Ng, Ish Mahdi, and Thomas Lin
// LAB #02: All Hands on Deque! (Not Schenectady; rather, synecdoche.)
// 2017-3-31

public interface Deque<E> {

    // Add element to the front w/o violating capacity restrictions
    public void addFirst( E x );

    // Add element to the end w/o violating capacity restrictions
    public void addLast( E x );
    
    // Remove and return first element, or return null if empty
    public E pollFirst();

    // Remove and return last element, or return null if empty
    public E pollLast();

    // Look at the first element, or return null if empty
    public T peekFirst();

    // Look at the last element, or return null if empty
    public T peekLast();

    // Return the current size of the deque
    public int size();
    
}
