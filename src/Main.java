
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
    public static void main(String[] args) {
        // Array of primitive integers
        // Not an dynamic data structure, it's size cannot be changed once created.
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
    }
}
