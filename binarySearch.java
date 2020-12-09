import java.util.*;
 
public class SearchTime {
 
           public SearchTime() {
 
           }
 
           // this searches values for an array of different integers
           public boolean binarySearch(int arr[], int start, int stop, int key) {
                      // uses stop and start values
                      if (stop >= 1) {
                                 if (start < stop) {
 
                                            // calculate the middle index by averaging the start and stop
                                            int midIndex = (start + stop) / 2;
                                            int midEle = arr[midIndex];
 
                                            // if midEle greater than key
                                            if (midEle > key) {
                                                       stop = midIndex;
                                                       return binarySearch(arr, start, stop, key);
                                                       // run binarySearch on first half
                                            }
                                            // if midEle less than key
                                            else if (midEle < key) {
                                                       start = midIndex + 1;
                                                       return binarySearch(arr, start, stop, key);
                                                       // run binarySearch on second half
                                            }
                                            // key must be the midEle
                                            else {
                                                       return true;
                                            }
                                 }
                      } else {
                                 // if not found, return false
                                 return false;
                      }
                      return false;
 
           }
 
           int partition(int arr[], int low, int high) {
                      int pivot = arr[high];
                      int i = (low - 1); // index of smaller element
                      // searching between the high and low elements
                      for (int j = low; j < high; j++) {
                                 // If current element is smaller than the pivot
                                 if (arr[j] < pivot) {
                                            i++;
                                            // swap arr[i] and arr[j]
                                            int temp = arr[i];
                                            arr[i] = arr[j];
                                            arr[j] = temp;
                                 }
                      }
                      // swap arr[i+1] and arr[high] (or pivot)
                      int temp = arr[i + 1];
                      arr[i + 1] = arr[high];
                      arr[high] = temp;
                      // increment the index
                      return i + 1;
           }
 
           void sort(int arr[], int low, int high) {
                      if (low < high) {
 
                                 // pi is partitioning index, arr[pi] is now at right place
                                 int pi = partition(arr, low, high);
 
                                 // Recursively sort elements before
                                 // partition and after partition
                                 sort(arr, low, pi - 1);
                                 sort(arr, pi + 1, high);
                      }
           }
 
           // this prints out the array
           static void printArray(int arr[]) {
                      int n = arr.length;
                      // traversing through the whole array size
                      for (int i = 0; i < n; ++i)
                                 System.out.print(arr[i] + " ");
                      System.out.println();
           }
 
           private static int getRandomNumberInRange(int min, int max) {
                      // throws an exception if the min and max do not make sense
                      if (min >= max) {
                                 throw new IllegalArgumentException("max must be greater than min");
                      }
 
                      // creating new random numbers between the range of min to max
                      Random r = new Random();
                      return r.nextInt((max - min) + 1) + min;
           }
 
           public static void main(String[] args) {
                      SearchTime sT = new SearchTime();
 
                      // this creates a new size array of what is listed in the homework
                      int sizeArray = 1000000;
                      int[] arr = new int[sizeArray];
 
                      // creating the random numbers from range of 1 to the number specified
                      for (int i = 0; i < sizeArray; i++) {
                                 arr[i] = (getRandomNumberInRange(1, 1000000));
                      }
 
                      // System.out.println("Unsorted: ");
                      // this printt out the array
                      //sT.printArray(arr);
                     
                      // counts start time
                      double start = System.nanoTime();
 
                      System.out.println("Sorting...");
                      sT.sort(arr, 0, arr.length - 1);
                      System.out.println("Sorted: ");
                      //sT.printArray(arr);
 
                      // sorts the array and counts the time in seconds
                      double finish = System.nanoTime();
                      double t = (finish - start) / 1000000000;
                      System.out.print("Sorting took ");
                      System.out.print(t);
                      System.out.println(" seconds\n\n\n\n");
 
                      // Start binary search to see if key is in the array
                      int key = 777;
                      Boolean check = sT.binarySearch(arr, 0, arr.length, key);
                      if (check) {
                                 System.out.println("Found key");
                      } else {
                                 System.out.println("Did not find key");
                      }
           }
}
 
