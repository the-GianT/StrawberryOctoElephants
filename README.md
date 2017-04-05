# StrawberryOctoElephants
### Marcus Ng, Thomas Lin, and Ish Mahdi

## Architecture Selection: Double-Linked List

 Our team decided to use a double-linked list because it was much more efficient than an array based architecture and much easier to implement. It was more efficient to use DLLNode because we were able to change the order of the elements by simply moving the pointers and not the physical data itself. For example, if we have a list of [ 3,4,5,6] and we wished to add the number 2 at index 0, and array based architecture would first have to shift all the elements to the right and then place the number 2. However, with a DLLNode, all we have to do is change two pointers. The runtime for the array based architecture would've been O(n) while the DLLNode's runtime would be O(1). In addition, it was easier to implement the DLLNode because DLLNode contained methods that allowed us to access the data very easily (especially the "prev" methods). This allowed us to push and pop from both sides of the Deque without problems.

     	       .------.------.------.------.
                   |A_  _ |A /\  |A _   |A .   |
                   |( \/ )| /  \ | ( )  | / \  |
                   | \  / | \  / |(_x_) |(_,_) |
                   |  \/ A|  \/ A|  Y  A|  I  A|
                   `------^------^------'------'  -Deque of Cards
		                     (courtesy of http://ascii.co.uk/art/cards)
   

## Method Selections

addFirst(T x): Allows for enqueuing to the front. We did not choose to implement the offerFirst() because we did not want a size restriction on the data set.

addLast(T x): Allows for enqueuing to the end. We did not choose to implement offerLast() because we did not want a size restriction on the data set.

pollFirst(): Means of dequeuing the first element. We chose this method over removeFirst() because it returns null if data set is empty, which avoids throwing a NoSuchElementException.

pollLast(): Means of dequeuing the last element. We chose this method over removeLast() because it returns null if data set is empty, which avoids throwing a NoSuchElementException.

peekFirst(): Allows for retrieval of first element. Useful to see what you are going to enqueue or dequeue.

peekLast(): Allows for retrieval of last element. Useful to see what you are going to enqueue or deque.

toString(): Allows for printing of the data in the deque starting from the front to the end.

size(): Accessor that returns the number of elements inside data set. This allows us to access the value of the _size variable outside of the class.

## Improvements

DLLDeque.java
- Added test cases for peekFirst()
- Added test cases for peekLast()
- Added test cases for size()

