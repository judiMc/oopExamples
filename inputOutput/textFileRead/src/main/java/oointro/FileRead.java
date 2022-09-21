package oointro;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.FileSystems;
import java.util.List;
import java.io.IOException;


public class FileRead {
   private String fileName;
   private String location;

 
 public FileRead(String targetFile, String targetPath){
    fileName = targetFile;
    location = targetPath;
 }
    
 public void readWithString(){

    BufferedReader myReader = null;
    /*BufferedReader gives you the
  ability to read and process the file one line at a time
  BufferedReader will return null when it reaches EOF
  */
   String fullFileName = location + "/" + fileName;
    try {
      myReader = new BufferedReader(new FileReader(fullFileName));
      String oneLine = myReader.readLine();
      System.out.println(oneLine);
      myReader.close();
    } catch (IOException e) {
      //terrible exception handler
      System.out.println(e);
    }
  }
public void readWithPath(){
     Path path = FileSystems.getDefault().getPath(location, fileName);
    try {
      BufferedReader myReader = Files.newBufferedReader(path);
      String oneLine = myReader.readLine();
      System.out.println(oneLine);
      myReader.close();
    } catch (IOException e) {
      //terrible exception handler
      System.out.println(e);
    }

}

public void readWithFilesClass(){
      List<String> lines;
      Path path = FileSystems.getDefault().getPath(location, fileName);
      try{
      lines = Files.readAllLines(path);
      for(String line: lines){
        System.out.println(line);
      }
    }catch(IOException e){
       //do something to handle exception
            System.out.println(e.getMessage());
    }

}
}
