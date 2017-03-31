// StrawberryOctoElephants
// Marcus Ng, Ish Mahdi, and Thomas Lin
// LAB #02: All Hands on Deque! (Not Schenectady; rather, synecdoche.)
// 2017-3-31

public interface Deque<E> {

    // Add element to the front w/o violating capacity restrictions
    public void addFirst( T x );

    // Add element to the end w/o violating capacity restrictions
    public void addLast( T x );

    // Remove and return first element, or return null if empty
    public E pollFirst();

    // Remove and return last element, or return null if empty
    public E pollLast();

    // Return first element
    public E peekFirst();

    // Return last element
    public E peekLast();
    
}
