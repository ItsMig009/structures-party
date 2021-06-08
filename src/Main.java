
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
    public static void arraysReview(int [] intArray){
        System.out.println("Array of primitive integers");
        System.out.println("Not an dynamic data structure, it's size cannot be changed once created");

        printArrayOfInteger(intArray);

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
    public static void bubbleSort(int [] intArray) {

        System.out.println("+++++++++++++Welcome to bubble sort!+++++++++++++");
        System.out.println("+++++++++++++A stable sorting algorithm!+++++++++++++");
        System.out.println("Input:");
        printArrayOfInteger(intArray);
        System.out.println("For this algorithm we follow the following steps:");
        System.out.println("Keep 2 variables: One element decreases starting from:" + intArray.length + "to 1."+"Used for keeping the index of the last sorted element in the second partition.");
        System.out.println("The second variable starts at 0 and ends at length minus one. Used for comparison based swapping operations.");
        System.out.println("");
        int UnsortedPartitionIndex = intArray.length;
        for (int i = UnsortedPartitionIndex; i>0 ; i--) {
            for (int j = 0; j < intArray.length - 1; j++) {
                if(intArray[j] > intArray[j+1]){
                    int k = j;
                    int g = j+1;
                    intArray = swap(intArray,k,g);
                }
            }
        }
        printArrayOfInteger(intArray);
        System.out.println("Bubble Sort is an in-place memory algorithm.");
        System.out.println("The extra memory needed does not depended on the number of items being sorted.");
        System.out.println("That is the swapping of elements is done using local variables and the same memory already allocated is reused.");
        System.out.println("The length of the array stays the same after sorting is complete.");
        System.out.println("Time complexity O(n)^2.");
        System.out.println("- This means for 1 item we get 1 step, for 10 items we do 100 steps, for 100 items we do 10000 steps.");
        System.out.println("Algorithm degrades quickly!!");
    }
    public static int [] swap(int [] intArray, int k, int g){
        if(k==g){
            return intArray;
        }
        int temp = intArray[k];
        intArray[k] = intArray[g];
        intArray[g] = temp;
        return intArray;
    }
    public static int [] createArray(){
        int [] intArray = new int[7];
        intArray[0] = 30;
        intArray[1] = 42;
        intArray[2] =-32;
        intArray[3] = -3;
        intArray[4] = 59;
        intArray[5] = 0;
        intArray[6] = -1;
        return intArray;
    }
    public static void printArrayOfInteger(int [] intArray){
        for (int k = 0; k < intArray.length; k++) {
            System.out.print(intArray[k]);
            if(k < intArray.length-1){
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public static void stableVsUnstableSortAlgorithms(){

        System.out.println("Stable: Keeps the relative order of duplicate items when sorting elements");
        System.out.println("Unstable: Breaks the relative order of duplicate items when sorting elements");

    }
    public static void insertionSort(int [] arr) {
        int unsortedPartitionIndex = arr.length - 1;
        int maxValueIndex = 0;

        for (int i = unsortedPartitionIndex; i > 1; i--) {
            for (int j = 0; j < unsortedPartitionIndex; j++) {
                if (arr[j] > arr[j+1]) {
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("Array at (j="+j+","+arr[j]+")");
                    System.out.println("Array at (j+1="+(j+1)+","+ arr[j + 1]+")");
                    if(arr[j] > arr[maxValueIndex]){
                        maxValueIndex = j;
                    }
                }
            }
            System.out.println("!=======================!=====================!========================!===============");
            System.out.println("Max Value found!!! (" + arr[maxValueIndex] + ") at Max index (" + maxValueIndex + ") Unsorted elements ("+i+")");
            arr = swap(arr,maxValueIndex,i);
            System.out.println("*--------------------------------------Max value swapped--------------------------------------*");

            System.out.println();
            System.out.println();
            System.out.println("*--------------------------------------Input "+i+"--------------------------------------*");
            printArrayOfInteger(arr);
        }
    }
    public static void main(String[] args) {
        int [] arr = createArray();
        System.out.println("*--------------------------------------Initial Input--------------------------------------*");
        printArrayOfInteger(arr);
        // arraysReview(arr);
        // bubbleSort(arr);
        insertionSort(arr);

    }

}
