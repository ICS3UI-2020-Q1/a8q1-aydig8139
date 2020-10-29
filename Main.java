import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements Runnable, ActionListener{

  // Class Variables  
  JPanel mainPanel;

  JTextField nameInput;

  JButton helloButton;

  JLabel nameOutput;


  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Title");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(800,600);
    // shows the window
    frame.setVisible(true);

    //initialize the main JPanel
    mainPanel = new JPanel();

    //disable any layout helpers
    mainPanel.setLayout(null);

    //initialize the input text fields
    nameInput = new JTextField();

    //set the location and size 
    nameInput.setBounds(30, 20, 100, 20);

    //initialize the button
    helloButton = new JButton("Say Hello");

    //set the size and location of the buttons
    helloButton.setBounds(150, 100, 100, 20);

    //add an action listener to the button
    helloButton.addActionListener(this);

    //set the action command on the button
    helloButton.setActionCommand("Say Hello");

    //create label
    nameOutput = new JLabel();

    //layout the label by setting the coordinate and size 
    nameOutput.setBounds(30,60,100,20);

    //add the label to the main panel 
    mainPanel.add(nameOutput);

    //add the button to the panel
    mainPanel.add(helloButton);

    //add the text field to the panel
    mainPanel.add(nameInput);

    //add the panel to the window
    frame.add(mainPanel);
    

  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();

    if(command.equals("Say Hello")){
      //get the text from the text box
      String nameText = nameInput.getText();
      nameOutput.setText("Hello " + nameText);

  }
  }
  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    Main gui = new Main();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}
