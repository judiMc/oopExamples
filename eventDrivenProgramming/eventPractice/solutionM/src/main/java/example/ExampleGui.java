package example;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Container;
import java.awt.TextField;
import java.awt.event.ActionListener;

public class ExampleGui extends JFrame
{
	
	private ExampleController myController;

	public static final int WIDTH = 600;
	public static final int HEIGHT = 500;
	Container contentPane;
	/*if you need a component to be accessible to all 
	methods make it a member variable*/
	TextField globalTextField; 

	public ExampleGui(ExampleController theController){
		super();
		myController = theController;
		setUpSize();
		setMainContainer();

	}

	private void setUpSize(){

		setSize(WIDTH, HEIGHT);
		setTitle("A Gui Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}

	//the next few methods set up the three panels used for the demo GUI
	private void setMainContainer(){
		contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        //note the nested function call
        contentPane.add(interactWithProgramPanel(), BorderLayout.CENTER);
	}

	/* the  panel returned by this function is set up with buttons and additional panels 
	which, in turn, have listeners that interact with the controller.  
	In a more complex program the controller would get its data from a 
	third class known as the 'model'   */
	private JPanel interactWithProgramPanel(){
	    JPanel examplePanel = new JPanel();
	    examplePanel.setLayout(new GridLayout(0,1));
	    globalTextField = new TextField("here there will be text");
		examplePanel.add(globalTextField);
		//more nested function calls
		examplePanel.add(showStringValueButton());
		examplePanel.add(setStringValueButton());
		return examplePanel;
	}

		private JButton showStringValueButton(){
		JButton exampleButton = new JButton("display current value of string value in controller/model");
		exampleButton.addActionListener(event->showString());
		return exampleButton;
	}

	private JButton setStringValueButton(){
		JButton exampleButton = new JButton("set string value of controller/model");
		exampleButton.addActionListener(event->changeString("dinosaur"));
		return exampleButton;
	}


	/* event handler methods that might be useful  */
 	private void changeString(String text){
 		myController.setString(text);
 	}
 	private void showString(){
 		globalTextField.setText(myController.toString());
 	}

	public static void main(String[] args) {
		ExampleGui gui = new ExampleGui(new ExampleController());
		gui.setVisible(true);
	}
}