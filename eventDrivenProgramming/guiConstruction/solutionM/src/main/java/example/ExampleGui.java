package example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ExampleGui extends JFrame
{
	public static final int WIDTH = 600;
	public static final int HEIGHT = 500;

	private DefaultListModel todoList;
	private JTextField textField;

	public ExampleGui(){
		super();
		setSize(WIDTH, HEIGHT);
		setTitle("Todo List");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new BorderLayout());
		
		add(inputContainer(), BorderLayout.NORTH);
		add(listContainer(), BorderLayout.CENTER);

		setVisible(true);
	}

	private JPanel inputContainer() {
		JPanel container = new JPanel();
		container.setBackground(Color.DARK_GRAY);

		JLabel label = new JLabel("TODO: ", JLabel.CENTER);
		label.setForeground(Color.WHITE);
		container.add(label);

		textField = new JTextField(30);
		textField.setFont(new Font("Arial", Font.PLAIN, 16));
		container.add(textField);

		JButton button = new JButton("Add To List");
		button.setBackground(Color.GREEN);
		button.addActionListener(event->addToList(textField.getText()));
		container.add(button);

		return container;
	}

	private JPanel listContainer() {
		JPanel container = new JPanel();
		container.setBackground(Color.GRAY);

		todoList = new DefaultListModel();
		JList jList = new JList(todoList);
		jList.setPreferredSize(new Dimension(390, 410));
		jList.setFont(new Font("Arial", Font.PLAIN, 20));
		container.add(jList);
		return container;
	}

	private void addToList(String text) {
		if (text.length() > 0) { // if textfield is empty
			String bulletString = "+ " + text;

			// check to make sure the element isn't already in the list
			for (int i = 0; i < todoList.getSize(); i++) {
				if (bulletString.equals(todoList.getElementAt(i))) {
					return;
				}
			}
			todoList.addElement(bulletString);
			textField.setText("");
		}
	}

	public static void main(String[] args) {
		ExampleGui gui = new ExampleGui();
	}
}