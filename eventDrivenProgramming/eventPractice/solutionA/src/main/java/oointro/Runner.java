package oointro;

public class Runner {

  /**
   * Main Class 
   * @param args
   */
  public static void main(String[] args) {
    ExampleController modelController = new ExampleController();
    ExampleGui thing = new ExampleGui(modelController);
    thing.setVisible(true);

  }
}
