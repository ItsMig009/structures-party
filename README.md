# Structures Party
What I learned about: 
Arrays,
Linked Lists,
Trees,
Hashtable,
Stacks,
Queues,
Heaps,
Sort algorithms,
Search algorithms.
## Section 1: Intro

### Introduction to data structures
What is a data structure?
- Answer: Organizes and stores data.
- Answer: Each DS has strengths and weaknesses.
- Example: An array as a data structure.

What is the best data structure to use?
- Answer: It depends!

### Introduction to algorithms
What is an algorithm?
Answer: A set of steps to accomplish a task
Example: Making Tea

**Important Note!!!** 
- The steps of an algorithm can be implemented in many ways.
- Many algorithms can accomplish the same task.

## Section 2: Arrays and Big O Notation

####Time Complexity:
- Number of steps that take to execute an algorithm 
  
####Memory Complexity:
- Amount of memory that takes to run an algorithm
- Not an issue nowadays.

**Important Note!!!**
- We use the worst case, upper bound, to get the absolute time complexity of the task at hand.

#####Algorithm example:
- Add Sugar to Tea:
- 1. Fetch the bowl containing the sugar
- 2. Get a spoon
- 3. Scoop out sugar using the spoon
- 4. Pour the sugar from the spoon into the tea
- 5. Repeat steps 3 and 4 until desired amount of sugar

**Resource**:

Big O Complexity Analysis Table:

| Number of Sugars | Steps Required | Time Complexity|
| ------------- |:-------------:| -----:|
| 1 | 4  | 2(1)+2 |
| 2 | 6  | 2(2)+2 |
| 3 | 8  | 2(3)+2 |
| 4 | 10 | 2(4)+2 |

The time complexity gives us an idea of how an algorithm will perform depending on the number of items it has to deal with.

- n - number of sugars required
- Total number of steps - 2n+2
- As n grows the number of steps grows
- The 2 in 2n ,and the +2 remain constant, so they don't factor into the time complexity.
- The value of n determines the growth rate
- Time complexity is O(n).
- Linear Time Complexity.

Big (O) Values Table:

| Big-O |   Best to Worst |
| ---- |:----:|
| O(1) | Constant | 
| O(n) | Linear | 
| O(n log base2 n)| n log-star n |
| O(n^2) | Quadratic |
| **Big (O) Notation** | **Provides an objective time complexity that is hardware independent.**

# Quick Review of Arrays in Java

####Arrays
Contiguous block in memory
- Resizing an array does not guarantee the extra space added will be in the same contiguous block of memory
- Static length (Not a dynamic data structure)
- Block is allocated for that array.

Every element occupies the same amount of space in memory
- For primitives, the actual primitives will be stored in memory.
- For Objects, a reference to the Object instances will be stored in memory
- - The consistent size of a reference allows us to create an Array of objects without violating the constraint that all elements stored in the array occupy the same space.

If an array starts at memory address x, and the size of each element in the array is y, we can calculate the memory address of the ith element by using x+i*y
- Starting at the 1st at index 0 if we want the 5th element we look 5 indexes forward.
- If the index of an element is known, the time to get that element will be the same regardless of where the element is stored in the array.

Pros:
- Retrieving elements if index is known.
1. Fixed size of element multiplied by index (Offset)
2. Get the Start address of the array
3. Add the start address to the result of the multiplication.    

Big (O) Array Operations Values Table:

**Retrieve operation examples:**

| Number of Elements|    Steps to Retrieve |
| ---- |:----:|
| 1 | 3 | 
| 1000 | 3 | 
| 100000| 3 |
| 1000000 | 3 |
| 1000000000 | 3 |
|Big O| O(1)|


Cons:
- If we don't know the index then the time complexity increases to linear assuming the worst case scenario

| Operation| Time Complexity |
| ---- |:----:|
| Retrieve with index | O(1) Constant time | 
| Retrieve with  no index | Linear time | 
| Add an element to a full array | O(n) Create a new array and copy operation depends of size of array|
| Add an element to the end of an array (array has space) | O(1) |
| Insert of update an element at a specific index| O(1) index is known |
| Delete an element by setting it to null (known index)| O(1)|
| Delete an element by setting it to null (unknown index)| Search is required O(n)|
| Delete an element by shifting elements | Worse case is O(n)|
