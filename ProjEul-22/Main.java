import java.util.Scanner;
import java.util.Arrays;

import java.io.File;
import java.io.FileNotFoundException; // Import this class to handle errors

class Main {
  public static void main(String[] args) {
    int total = 0;
    int Totaltemp = 0;
    try {
      String filename = "p022_names.txt";
      String list = "";
      int locationIn = 0;
      int commaLocation = 0;
      File names = new File(filename);
      Scanner filereader = new Scanner(names);
      list = filereader.nextLine();
      //System.out.println(list);
      int nameCount = 1;
      for (int i = 0; i < list.length(); i++) {
        if (list.charAt(i) == ',') {
          nameCount++;
        }
      }
      //System.out.println(nameCount);
      String[] nameArray = new String[nameCount];
      locationIn = list.indexOf("\"", locationIn+1);
      for(int i = 0; i<nameCount; i++){
        if(i == 0){
          nameArray[i] = list.substring(0+1, list.indexOf(",", i)-1);
          //System.out.println(nameArray[i]);
        }
        else {
          locationIn = list.indexOf("\"", locationIn+1);
          locationIn = list.indexOf("\"", locationIn+1);
          commaLocation = list.indexOf(",", commaLocation+1);
          nameArray[i] = list.substring(list.indexOf(",", commaLocation)+2, list.indexOf("\"",locationIn));
          
        }
      }
      Arrays.sort(nameArray);
      for(int i = 0; i < nameArray.length; i++){
        //System.out.println(nameArray[i]);
        Totaltemp = 0;
        for(int j = 0; j < nameArray[i].length(); j++){
           Totaltemp += nameArray[i].charAt(j)-64;
        }
        total += Totaltemp*(i+1);
      }
    } catch (FileNotFoundException e) {
      System.out.println("Error: " + e);
    }
    System.out.println(total);
  }
}