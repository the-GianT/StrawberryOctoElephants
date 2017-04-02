### StrawberryOctoElephants

##Architecture Selection: Double-Linked List

 Our team decided to use a double-linked list because it was much more efficent than an array based architecture and much easier to implement. It was more efficent to use DLLNode becuase we were able to change the order of the elements by simply moving the pointers and not the physical data itself. For example, if we have a list of [ 3,4,5,6] and we wished to add the number 2 at index 0, and array based architecture would first have to shift all the elements to the right and then place the number 2. However, with a DLLNode, all we have to do is change two pointers. The runtime for the array based architecture would've been O(n) while the DLLNode's runtime would be O(1). In addition, it was easier to implement the DLLNode becuase DLLNode contained methods that allowed us to acess the data very easily (especially the "prev" methods). This allowed us to push and pop from both sides of the Deque without problems.  

## Method Selections

addFirst(T x): Allows for enqueuing to one end.

addLast(T x): Allows for enqueuing to the other end.

pollFirst(): Means of dequeuing for one side. Returns null if data set is empty, which avoids errors.

pollLast(): Means of dequeuing for the other side. Also returns null if data set is empty.

peekFirst(): Allows for retrieval of first element. Useful to see what you are going to enqueue or dequeue.

peekLast(): Allows for retrieval of last element. Useful to see what you are enqueuing or dequeuing.

toString(): Allows for printing of data set in a easy to read manner.

size(): Accessor that returns the number of elements inside data set.



