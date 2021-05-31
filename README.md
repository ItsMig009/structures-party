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
