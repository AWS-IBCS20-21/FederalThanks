import java.util.Arrays;
import java.util.Collections;
 
public class BinarySearch {
           public BinarySearch() {
           }
 
           public int search(int[] words, int value) {
                      return search(words, value, 0, words.length - 1);
           }
 
           private int search(int[] words, int value, int min, int max) {
                      int mid = (max + min) / 2;
 
                      if (words[mid] == value) {
                                 return mid;
                      } else if (words[mid] > value) {
                                 return search(words, value, min, mid - 1);
                      } else if (words[mid] < value) {
                                 return search(words, value, mid + 1, max);
                      } else {
                                 return -1;
                      }
           }
 
           public static void main(String[] args) {
                      BinarySearch search = new BinarySearch();
                      int[] arr = new int[] { 15, 20, 24, 6, 8, -2, 0, 11, 9, -18, 25 };
                      System.out.println("Array to sort search: " + (Arrays.toString(arr)));
                      System.out.println("Sorting...");
                      Arrays.sort(arr);
                      System.out.println("Sorted array: " + (Arrays.toString(arr)));
                      System.out.println("The index of the number 8 in the array is: " + search.search(arr, 8));
 
           }
}
