# Physical Data Structure 
## Array and Linked List
### Array
Array is a DS consisting of collections of elements, each identified by unique index.
 A collection of similar data type.
 ### Linked List
 A linked list is a linear data structure where each element is a separate object. 
 Each element (we will call it a node) of a list is comprising of two items - the data and a reference to the next node. 
 The last node has a reference to null. The entry point into a linked list is called the head of the list. (wiki)
 #### components of Linked list are the following
  - Node - contains the data and reference to the next and/ or to previous node
  - Head - the first element in the linked list
  - Tail - the last element in the linked list

### Array vs Linked List
 1. Separate Node - Each node are separate in Linked List
 2. Variable Length - Linked List is variable length but not array
 3. Random access - we can access elements of array randomly but not in linked list
 
 ### Types of Linked List
 1. Singly Linked List(SLL) - each node store the data of the node and the next node.
 2. Circular Singly Linked List - the tail of the node's next node is the head of the SLL. 
 Basically it creates a circle. This data structure can be used in games to keep track of the order of the players. 
 3. Doubly Linked List - Each node has data, next node and previous node
 4. Circular Doubly Linked List - the last node's (tail) next node is the head 
 
 ### Memorry storing both Array and LinkedList
 * Array is stored in a contiguous memory. That's why array is a fixed size data structure. 
 * LinkedList is not stored in contiguous memory. That's why LinkedList's size is variable. 
 

 
 
 
