Algorithms and Data Structures

Assignment 2

This assignment involves implementing several fundamental data structures from scratch, including MyArrayList, MyLinkedList, MyQueue, MyStack, MyMinHeap, and a common interface MyList.

1.MyArrayList is a custom-built dynamic array that allows random access to elements via indices.
It implements the MyList interface.
Supports operations such as adding, removing, and retrieving elements by index.
Automatically resizes its internal array when the current capacity is exceeded.

2.MyLinkedList
MyLinkedList is an implementation of a doubly linked list, where each node maintains references to both its previous and next nodes.
It also implements the MyList interface.
Enables efficient insertions and deletions at both the head and tail of the list.

3.MyQueue
MyQueue represents a queue data structure based on the First-In-First-Out (FIFO) principle.
Internally backed by a linked list.
Provides standard queue operations such as enqueue (add to back) and dequeue (remove from front).

4.MyStack
MyStack is a stack implementation that follows the Last-In-First-Out (LIFO) principle.
Built on top of a linked list.
Supports operations like push (add to top) and pop (remove from top).

5.MyMinHeap
MyMinHeap is a custom implementation of a min-heap data structure.
Maintains the heap property where each parent node is less than or equal to its children.
Designed as a complete binary tree, typically backed by an array.

MyList Interface The MyList interface defines a common set of methods that all list-like data structures should implement.
