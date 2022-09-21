package oointro;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.FileSystems;
import java.util.List;
import java.io.IOException;
import java.nio.file.StandardOpenOption;

public class FileWrite {
   private String fileName;
   private String location;

 
 public FileWrite(String targetFile, String targetPath){
    fileName = targetFile;
    location = targetPath;
 }
    
 public void writeWithString(){

    FileWriter myWriter = null;
 
   String fullFileName = location + "/" + fileName;
    try {
      myWriter = new FileWriter(fullFileName);
        myWriter.write("this is what I want in the file");
      myWriter.close();
    } catch (IOException e) {
      //terrible exception handler
      System.out.println(e.getMessage());
    }
  }
public void writeWithPath(){
     Path path = FileSystems.getDefault().getPath(location, fileName);
    try {
      BufferedWriter myWriter = Files.newBufferedWriter(path);
            myWriter.write("this is what I want in the file");

      myWriter.close();
    } catch (IOException e) {
      //terrible exception handler
      System.out.println(e.getMessage());
    }

}

public void writeWithFilesClass(){

      Path path = FileSystems.getDefault().getPath(location, fileName);
      try{
      Files.writeString(path,"this is what I want in the file");
      Files.writeString(path,"and another thing", StandardOpenOption.APPEND);

    }catch(IOException e){
       //do something to handle exception
            System.out.println(e.getMessage());
    }

}
}
