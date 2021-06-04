
/*
 * Copyright 2021 Miguel Jardines
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

/*
 The Array
 - How they are stored in memory
 - Big O Notation - A more objective measure than running time.
 - Great for Random Access Memory given the index is known
 */



public class Main {
    public static void arraysReview(){
        System.out.println("Array of primitive integers");
        System.out.println("Not an dynamic data structure, it's size cannot be changed once created");
        int [] intArray = new int[7];
        //
        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] =-15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }


        // Get number 7
        int index = -1;
        for (int i = 0; i < intArray.length; i++) {
            if(intArray[i] == 7) {
                index = i;
                break;
            }
        }
        System.out.println("Index of 7: "+index);
        System.out.println("Considering worse case, 7 was at the end of the array so index will be 7");
        System.out.println("As the size of the array increases the worst case scenario requires looping to the entire array.");
        System.out.println("Therefore, the time complexity is linear");
        System.out.println("Operation Time Complexity");
        System.out.println("Retrieve with index. |      O(1) Constant time");
        System.out.println("Retrieve with  no index |      O(n)Linear time");
        System.out.println("Add an element to a full array |     O(n) Create a new array and copy operation depends of size of array");
        System.out.println("Add an element to the end of an array (array has space) |      O(1)");
        System.out.println("Insert of update an element at a specific index |      O(1) index is known");
        System.out.println("Delete an element by setting it to null (known index) |      O(1)");
        System.out.println("Delete an element by setting it to null (unknown index) |       Search is required O(n)");
        System.out.println("Delete an element by shifting elements |      Worse case is O(n)");
    }

    private static void bubbleSort() {
        int [] intArray = new int[7];
        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] =-15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        System.out.println("+++++++++++++Welcome to bubble sort!+++++++++++++");
        System.out.println("Input:");
        for (int k = 0; k < intArray.length; k++) {
            System.out.println(intArray[k]);
        }
        int UnsortedPartitionIndex = intArray.length;
        int j = 0;
        System.out.println("For this algorithm we follow the following steps:");
        System.out.println("Keep 2 variables: One element decreases starting from:" + intArray.length + "to 1."+"Used for keeping the index of the last sorted element in the second partition.");
        System.out.println("The second variable starts at 0 and ends at length minus one. Used for comparison based swapping operations.");
        System.out.println("");
        swap(intArray,j,UnsortedPartitionIndex);
        System.out.println("Bubble Sort is an in place memory algorithm");
        System.out.println("The extra memory needed does not depended on the number of items being sorted");
        System.out.println("That is the swapping of elements is done using local variables and the same memory already allocated is reused.");
        System.out.println("The length of the array stays the same after sorting is complete.");
        System.out.println("Time complexity O(n)^2");
        System.out.println("- This means for 1 item we get 1 step, for 10 items we do 100 steps, for 100 items we do 10000 steps.");
        System.out.println("Algorithm degrades quickly!!");
    }

    public static void swap(int [] intArray, int x, int UnsortedPartitionIndex){

        while (UnsortedPartitionIndex != 0) {
            System.out.println("==========  Round:"+(7-UnsortedPartitionIndex)+"  ==========");
            for (int j=x;j<intArray.length-1;j++) {
                if (intArray[j] > intArray[j+1]) {
                    int temp = intArray[j];
                    int temp1 = intArray[j+1];
                    System.out.println("Number "+temp+" was swapped with "+temp1+".");
                    intArray[j] = intArray[j+1];
                    intArray[j+1] = temp;
                }
            }
            for (int k = 0; k < intArray.length; k++) {
                System.out.print(intArray[k]);
                if(k < intArray.length-1){
                    System.out.print(", ");
                }

            }
            System.out.println();
            System.out.println("*******************************");
            System.out.println();

            UnsortedPartitionIndex--;
        }
    }

    public static void main(String[] args) {
        arraysReview();
        bubbleSort();
    }



}
