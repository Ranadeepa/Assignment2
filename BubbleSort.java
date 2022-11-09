import java.util.*;
class BubbleSort{
    // Driver method to test above
    public static void main(String args[]) {
        //declare an array of integers
        int intArray[] = {23,43,13,65,11,62,76,9,71,84,34,96};
        //print original array
        System.out.println("Original array: " + Arrays.toString(intArray));
        int n = intArray.length;
        //iterate over the array comparing adjacent elements
        for (int i = 0; i &lt; n-1; i++)
            for (int j = 0; j &lt; n-i-1; j++)
                //if elements not in order, swap them    
                if (intArray[j] &gt; intArray[j+1])  {
                    int temp = intArray[j];
                    intArray[j] = intArray[j+1];
                    intArray[j+1] = temp;
                }
        //print the sorted array        
        System.out.println("Sorted array: " + Arrays.toString(intArray));
    }
}
              