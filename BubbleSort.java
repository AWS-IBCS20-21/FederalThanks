import java.util.Scanner;
//Kaylah Tan
public class BubbleSorter {

public void bubble(int[] array) {  
for (int i = array.length - 1; i > 0; i--) { 
for (int j = 0; j < i; j++) 
if ((array[j] > (array[j + 1])) && i != j) {
int temp = array[j];
array[j] = array[j + 1];
array[j + 1] = temp;
            }
         }
      }
   }
public int[] makeArray(int size) {
int[] array = new int[size];
for (int i = 0; i < array.length; i++)
array[i] = (int) (Math.random() * size);
      }
      return array;
   }

public void print(int[] arr)
System.out.print("["); 
for (int i = 0; i < arr.length; i++) {
System.out.print(arr[i]);
if (i == arr.length - 1) {
break;
} else {
System.out.print(", ");
         }
      }
      System.out.println("]");
   }

public final int timeSort(int[] arr) {
long start = System.nanoTime();
bubble(arr);
long end = System.nanoTime();
return (int) ((end - start));
   }

public static void main(String[] args) {
BubbleSorter sorter = new BubbleSorter();
int[] arr = sorter.makeArray(100);
System.out.print("Pre-sorted: ");
sorter.print(arr);
System.out.print("Sorted: ");
sorter.bubble(arr);
sorter.print(arr);
System.out.println("Time calculated is " + sorter.timeSort(arr) + " nanoseconds.");
   }
}
