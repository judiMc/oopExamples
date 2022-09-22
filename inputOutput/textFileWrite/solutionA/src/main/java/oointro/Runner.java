package oointro;

public class Runner {

  
  public static void main(String[] args) {
    /*the test file is in the assets subfolder.  Note that the
     subfolder name does not have a leading slash because it is 
     relative to the working directory */
   FileWrite myWriter = new FileWrite("test.txt","assets");
   //myWriter.writeWithString();
   //myWriter.writeWithPath();
    
   myWriter.writeWithFilesClass();

  }
}
