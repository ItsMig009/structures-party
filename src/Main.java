
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
package practice.learnprogramming.structuresparty;


import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    private static void arraysReview(int[] intArray) {
        System.out.println("Array of primitive integers");
        System.out.println("Not an dynamic data structure, it's size cannot be changed once created");

        printArrayOfInteger(intArray);

        // Get number 7
        int index = -1;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i]==7) {
                index = i;
                break;
            }
        }
        System.out.println("Index of 7: " + index);
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

    private static void printArrayOfInteger(int[] intArray) {
        for (int k = 0; k < intArray.length; k++) {
            System.out.print(intArray[k]);
            if (k < intArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    private static ArrayList createArrays() {
        ArrayList list = new ArrayList<int[]>();
        ArrayList<Integer> random = new ArrayList<Integer>();
        ArrayList<Integer> random1 = new ArrayList<Integer>();
        random.add(20);
        random.add(30);
        random.add(15);
        random.add(10);
        random.add(7);
        random.add(5);
        random.add(1);
        random.add(10);
        random.add(50);
        random.add(20);

        random1.add(20);
        random1.add(30);
        random1.add(15);
        random1.add(10);
        random1.add(7);
        random1.add(5);
        random1.add(1);
        random1.add(10);
        random1.add(50);
        random1.add(20);
        list.add(random);
        list.add(random1);
        return list;
    }
    private static void printArrayOfIntObjects(ArrayList<Integer> arrOfInts) {
        // assume Integer
        Iterator<Integer> it = arrOfInts.iterator();
        if (it.hasNext()) {
            System.out.print(it.next());
        }
        while (it.hasNext()) {
            System.out.print(", " + it.next());
        }
    }
    private static void bubbleSort(int[] intArray) {

        System.out.println("+++++++++++++Welcome to bubble sort!+++++++++++++");
        System.out.println("+++++++++++++A stable sorting algorithm!+++++++++++++");
        System.out.println("Input:");
        printArrayOfInteger(intArray);
        System.out.println("For this algorithm we follow the following steps:");
        System.out.println("Keep 2 variables: One element decreases starting from:" + intArray.length + "to 1." + "Used for keeping the index of the last sorted element in the second partition.");
        System.out.println("The second variable starts at 0 and ends at length minus one. Used for comparison based swapping operations.");
        System.out.println("");
        int UnsortedPartitionIndex = intArray.length;
        for (int i = UnsortedPartitionIndex; i > 0; i--) {
            for (int j = 0; j < intArray.length - 1; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    int k = j;
                    int g = j + 1;
                    intArray = swap(intArray, k, g);
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
    private static int[] swap(int[] intArray, int k, int g) {
        if (k==g) {
            return intArray;
        }
        int temp = intArray[k];
        intArray[k] = intArray[g];
        intArray[g] = temp;
        return intArray;
    }
    private static int[] createArrayToSort() {
        int[] intArray = new int[10];
        intArray[0] = 30;
        intArray[1] = 42;
        intArray[2] = -32;
        intArray[3] = -3;
        intArray[4] = 59;
        intArray[5] = 0;
        intArray[6] = -1;
        intArray[7] = -22;
        intArray[8] = -90;
        intArray[9] = -100;

        return intArray;
    }
    private static int[] createArrayOfPrices() {
        int[] intArray = new int[10];
        intArray[0] = 20;
        intArray[1] = 30;
        intArray[2] = 15;
        intArray[3] = 10;
        intArray[4] = 70;
        intArray[5] = 20;
        intArray[6] = 15;
        intArray[7] = 10;
        intArray[8] = 5;
        intArray[9] = 1;

        return intArray;
    }
    private static int[] createAnotherArrayOfPrices() {
        int[] intArray = new int[10];
        intArray[0] = 20;
        intArray[1] = 30;
        intArray[2] = 50;
        intArray[3] = 45;
        intArray[4] = 50;
        intArray[5] = 100;
        intArray[6] = 40;
        intArray[7] = 30;
        intArray[8] = 20;
        intArray[9] = 10;

        return intArray;
    }
    private static void stableVsUnstableSortAlgorithms() {

        System.out.println("Stable: Keeps the relative order of duplicate items when sorting elements");
        System.out.println("Unstable: Breaks the relative order of duplicate items when sorting elements");

    }
    private static void selectionSort(int[] arr) {
        int unsortedPartitionIndex = arr.length - 1;
        int maxValueIndex = 0;

        for (int i = unsortedPartitionIndex; i > 1; i--) {
            for (int j = 0; j < unsortedPartitionIndex; j++) {
                if (arr[j] > arr[j + 1]) {
//                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//                    System.out.println("Array at (j=" + j + "," + arr[j] + ")");
//                    System.out.println("Array at (j+1=" + (j + 1) + "," + arr[j + 1] + ")");
                    if (arr[j] > arr[maxValueIndex]) {
                        maxValueIndex = j;
                    }
                }
            }
            System.out.println("!=======================!=====================!========================!===============");
            System.out.println("Max Value found!!! (" + arr[maxValueIndex] + ") at Max index (" + maxValueIndex + ") Unsorted elements (" + i + ")");
            arr = swap(arr, maxValueIndex, i);
            System.out.println("*--------------------------------------Max value swapped--------------------------------------*");

            System.out.println();
            System.out.println();
            System.out.println("*--------------------------------------Input " + i + "--------------------------------------*");
            printArrayOfInteger(arr);
        }
    }
    private static void insertionSort(int[] arr) {
        printArrayOfInteger(arr);

        // starting with element at position zero in the sorted array
        // we compare element at position zero with the first element of the sorted array at position one
        // if the element at position 1 is less than element at position zero then we shift element at position zero
        // and insert element at position one.
        // if element at position 1 is greater, we do nothing.
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++) {
            int currentElement = arr[firstUnsortedIndex];
            int i; // declared outside the loop so that the index value is kept after the loop
            // this condition arr[i - 1] > currentElement keeps is in the right position for insertion.
            for (i = firstUnsortedIndex; i > 0 && arr[i - 1] > currentElement; i--) {
                shiftRight(arr, i - 1);
            }
            arr[i] = currentElement;
        }
        printArrayOfInteger(arr);

    }
    private static void shiftRight(int[] arr, int i) {
        arr[i + 1] = arr[i];
    }
    private static void shellSort(int[] arr) {
        printArrayOfInteger(arr);
        // Initialize and reduce gap value
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            // Iterate each sub-array starting at gave value gap/2 and ending in 1.
            // When gap is 1, insertion sort starts at position 1 and comparing each element behind.
            for(int i = gap;i < arr.length; i++){
                int newElement = arr[i]; // store current element at i
                int index = i; // store the index for shifting

                while (index >= gap && arr[index-gap] > newElement){
                    // element on the right is stored to the left of the array
                    arr[index] = arr[index-gap];
                    // index minus the gap allows for one shift only
                    index -= gap;
                }
                // new Element is inserted in place of element found to be greater.
                arr[index] = newElement;
            }
        }
        printArrayOfInteger(arr);
    }
    private static void shellSortP(int [] arr){

        for (int gap = arr.length / 2; gap > 0; gap/=2) {

            for (int i = gap; i < arr.length; i++) {
                int newElement = arr[i];
                int index = i;

                while(index >= gap && arr[index-gap] > newElement){
                    arr[index] = arr[index-gap];
                    index-=gap;
                }
                arr[index] = newElement;
            }
        }
        printArrayOfInteger(arr);
    }
    private static int factorialRecursive(int num) {
        if (num == 0 || num == 1){
            return 1;
        }
        return num * factorialRecursive(num-1);
    }
    private static int maxProfit(int[] stockPrices) {
        int possibleMaxProfit = 0;
        int maxProfit = -10000;
        int minPrice = 0;
        int maxPrice = 0;
        if(stockPrices.length > 1){
            minPrice = stockPrices[0];
            maxPrice = minPrice;
            System.out.println("Initial Min Price is:" + minPrice);
            System.out.println("Initial Max Price is:" + maxPrice);

        }

        for (int i = 1; i < stockPrices.length; i++) {

            // new min price found, look ahead and find new possible max profit
            if(stockPrices[i] < minPrice){
                System.out.println("New Min Price found . . .");
                minPrice = stockPrices[i];
                // reset max price and possible max profit
                maxPrice = minPrice;
                possibleMaxProfit = stockPrices[i] - stockPrices[i-1];
                System.out.println("Min and Max Price reset to:" + minPrice );
                System.out.println("Max profit is now: "+ possibleMaxProfit);
            }

            if (stockPrices[i] > maxPrice){
                System.out.println("New Max Price found . . .");
                // if new max price, update max price and recalculate possibleMaxProfit
                maxPrice = stockPrices[i];
                System.out.println("Max Price changed to:" + maxPrice);
                possibleMaxProfit = maxPrice - minPrice;
                System.out.println("Max profit updated to: "+ possibleMaxProfit);
            }

            if(possibleMaxProfit > maxProfit){
                maxProfit = possibleMaxProfit;
            }
        }
        System.out.println("Max profit is: "+ maxProfit);
        return  maxProfit;
    }
    public static void main(String[] args) {
        System.out.println("*--------------------------------------Initial Input--------------------------------------*");
        int[] arr1 = createArrayOfPrices();
        int[] arr2 = createAnotherArrayOfPrices();
        int[] arr3 = createDecreasingArrayOfPrices();

        printArrayOfInteger(arr1);
        System.out.println(new StringBuilder().append("The max profit is:").append(maxProfit(arr1)));
        System.out.println("*----------------------------------------------------------------------------------------*");

        printArrayOfInteger(arr2);
        System.out.println(new StringBuilder().append("The max profit is:").append(maxProfit(arr2)));
        System.out.println("*----------------------------------------------------------------------------------------*");

        printArrayOfInteger(arr3);
        System.out.println(new StringBuilder().append("The max profit is:").append(maxProfit(arr3)));
        System.out.println("*----------------------------------------------------------------------------------------*");

        System.out.println("*--------------------------------------Result Output--------------------------------------*");
        System.out.println();
    }

    private static int[] createDecreasingArrayOfPrices() {
        int[] intArray = new int[10];
        intArray[0] = 100;

        for (int i = 1; i < intArray.length; i++) {
            intArray[i] = intArray[i-1] - 5;
        }
        return intArray;
    }
}
