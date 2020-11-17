import java.io.*;
import java.util.*;
//Kaylah Tan

public class FileParser {
    public static void main(String[] args) {
   StringBuilder fullText = new StringBuilder();
  Scanner fReader = null;

   try {
   File f = new File("63782-0.txt");
   fReader = new Scanner(f);

   while (fReader.hasNextLine()) {
  fullText.append(fReader.nextLine());
                                 }
   } catch (FileNotFoundException e) {
   System.out.println("File not found");
   e.printStackTrace();
                      }

    String fullS = fullText.toString().toLowerCase();
    String[] words = fullS.split("\\W+");

    String current = "";
    String longest = " ";
    int ave = 0;
    int count = 0;
    int maxCount = 0;
    String word = "";

  // getting the longest word
  for (int i = 0; i < words.length - 1; i++) {
       current = words[i];
       if (current.length() > longest.length()) {
          longest = current;
                                 }
                                 // counts the average word length
                                 ave += current.length();
                      }
                      ave = ave / words.length;

                      for (int i = 0; i < words.length - 1; i++) {
                                 count = 1;
                                 // Count each word in the file and store it in variable count
                                 for (int j = i + 1; j < words.length; j++) {
                                            if (words[i].equals(words[j])) {
                                                       count++;
                                            }
                                 }
                                 // determine most repeated word
                                 if (count > maxCount) {
                                            maxCount = count;
                                            word = words[i];
                                 }
                      }
  System.out.println("Longest word: " + longest);
  System.out.println("Average word length: " + ave);
  System.out.println("Most repeated word: " + word);

  // print the words?
//                  for (String w : words) {
//                             System.out.println(w);
//                  }
           }
}
