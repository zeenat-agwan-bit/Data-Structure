package collection;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {
     public static void main( String[] args )
   { 
      try {
      File file = new File("C:\\newfile.txt");
     /*createNewFile() will return true if file gets 
       * created or if the file is 
       * already present it would return false
       */
             boolean filepresent = file.createNewFile();
      if (filepresent){
           System.out.println("File is created successfully");
      }
      else{
           System.out.println("File is already present at the specified  location");
      }
     } catch (IOException e) {
      System.out.println("Exception Occurred:");
         e.printStackTrace();
   }
   }
     
}
/*
//way 2


public class CreateFileUsingFileOutputStream {
    public static void main (String args[]){    
        String data = "Test Java Hungry";
        FileOutputStream out = new FileOutputStream("c://temp//testFile.txt");
        out.write(data.getBytes());
        out.close();
    }    
}


*/