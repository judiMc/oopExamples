package oointro;

public class Runner {

  
  public static void main(String[] args) {
    /*the test file is in the assets subfolder.  Note that the
     subfolder name does not have a leading slash because it is 
     relative to the working directory */
   FileRead myReader = new FileRead("test.txt","assets");
   myReader.readWithString();
   myReader.readWithPath();
    
   myReader.readWithFilesClass();

  }
}
