import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class View extends JFrame implements ActionListener,KeyListener{
    //hiiiii
    //where is this
    private static int width = 420;
    private static int height = 575;
    //instantiating the objects needed
    private Main mMain;
    JTextPane inputArea;
    JTextPane outputArea;
    JButton[] numberButtons = new JButton[16];
    JButton[] functionButtons = new JButton[4];
    Font myFont = new Font("Ink Free",Font.BOLD,35);
    Font smallFont = new Font("Ink Free", Font.BOLD, 15);
    JPanel numbersPanel = new JPanel();
    JPanel functionPanel = new JPanel();
    static String tempString;
    View(Main pMain) {
        mMain = pMain;
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(width, height);
        setLayout(null);
        setBackground(Color.WHITE); //set background sets color of the frame, method comes from JFrame
        setResizable(false);

        //setting up the input area
        inputArea = new JTextPane();
        inputArea.setFont(myFont);
        inputArea.setEditable(false);
        inputArea.setBounds(50,25,320,75);
        inputArea.setBackground(Color.white);
        inputArea.setOpaque(false);
        setResizable(false);


        //setting up output area so that the input is still visible after seeing results
        outputArea = new JTextPane();
        outputArea.setFont(smallFont);
        outputArea.setEditable(false);
        outputArea.setBounds(50,10,320,50);
        outputArea.setOpaque(false);
        //outputArea.setBackground(Color.black);
        setResizable(false);
        outputArea.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

        //setting up the numbers main panel buttons
        numbersPanel.setLayout(new GridLayout(4,4));
        numbersPanel.setBounds(50,125,320,325);
        functionPanel.setBounds(50,450,300,60);

        //adding buttons to the arrays
        for(int x =0; x<3; x++){
            numberButtons[x] = new JButton(String.valueOf(x+1));
        }
        numberButtons[3] = new JButton("+");
        for(int x =4; x<7; x++){
            numberButtons[x]= new JButton((String.valueOf(x)));
        }
        numberButtons[7]= new JButton("-");

        for(int x= 8; x < 11; x++) {
            numberButtons[x]= new JButton(String.valueOf(x-1));
        }

        numberButtons[11] = new JButton("/");
        numberButtons[12] = new JButton("(");
        numberButtons[13] = new JButton("0");
        numberButtons[14] = new JButton(")");
        numberButtons[15] = new JButton("*");

        //iterates through numberButtons array to set fonts, and add button to the panel
        for (int i = 0; i<16 ; i++){
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
            addButton(numbersPanel,numberButtons[i]);
        }

        //setting up the function buttons on the bottom
        functionButtons[0]= new JButton("Clr");
        functionButtons[1]= new JButton("Del");
        functionButtons[2]= new JButton("=");
        functionButtons[3] = new JButton(".");

        //sets the font of the function buttons and adds the buttons to functionPanel
        for (int i = 0; i<4 ; i++){
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false);
            functionButtons[i].addActionListener(this);
            addButton(functionPanel, functionButtons[i]);
        }


        add(outputArea);
        add(inputArea);
        add(functionPanel);
        add(numbersPanel);
        setVisible(true);

    }



    private void addButton(JPanel pPanel, JButton button) {
        pPanel.add(button);
        // this is referencing the button
        button.addActionListener(this);

    }
    private void evaluate() {
        String mExprStr = inputArea.getText();
        Expression expr = new Expression(mExprStr);
        Double result = expr.evaluate();
        inputArea.setText(result.toString());
    }
    public void messageBox(String pMessage) {
        JOptionPane.showMessageDialog(this, pMessage, "Message", JOptionPane.PLAIN_MESSAGE);
    }

    @Override
    public void actionPerformed(ActionEvent e) throws NumberFormatException{

        String actionCommand = e.getActionCommand();

        if (actionCommand.equals("1")) {
            inputArea.setText(inputArea.getText().concat(String.valueOf(1)));
            tempString = inputArea.getText();
        }
        if (actionCommand.equals("2")) {
            inputArea.setText(inputArea.getText().concat(String.valueOf(2)));
            tempString = inputArea.getText();
        }
        if (actionCommand.equals("3")) {
            inputArea.setText(inputArea.getText().concat(String.valueOf(3)));
            tempString = inputArea.getText();
        }
        if (actionCommand.equals("4")) {
            inputArea.setText(inputArea.getText().concat(String.valueOf(4)));
            tempString = inputArea.getText();
        }
        if (actionCommand.equals("5")) {
            inputArea.setText(inputArea.getText().concat(String.valueOf(5)));
            tempString = inputArea.getText();
        }
        if (actionCommand.equals("6")) {
            inputArea.setText(inputArea.getText().concat(String.valueOf(6)));
            tempString = inputArea.getText();
        }
        if (actionCommand.equals("7")) {
            inputArea.setText(inputArea.getText().concat(String.valueOf(7)));
            tempString = inputArea.getText();
        }
        if (actionCommand.equals("8")) {
            inputArea.setText(inputArea.getText().concat(String.valueOf(8)));
            tempString = inputArea.getText();
        }
        if (actionCommand.equals("9")) {
            inputArea.setText(inputArea.getText().concat(String.valueOf(9)));
            tempString = inputArea.getText();
        }
        if (actionCommand.equals("/")) {
            inputArea.setText(inputArea.getText().concat(String.valueOf("/")));
            tempString = inputArea.getText();
        }
        if (actionCommand.equals("*")) {
            inputArea.setText(inputArea.getText().concat(String.valueOf("*")));
            tempString = inputArea.getText();
        }
        if (actionCommand.equals("-")) {
            inputArea.setText(inputArea.getText().concat(String.valueOf("-")));
            tempString = inputArea.getText();
        }
        if (actionCommand.equals("+")) {
            inputArea.setText(inputArea.getText().concat(String.valueOf("+")));
            tempString = inputArea.getText();
        }
        if (actionCommand.equals("0")) {
            inputArea.setText(inputArea.getText().concat(String.valueOf(0)));
            tempString = inputArea.getText();
        }
        if (actionCommand.equals("(")) {
            inputArea.setText(inputArea.getText().concat(String.valueOf("(")));
            tempString = inputArea.getText();
        }
        if (actionCommand.equals(")")) {
            inputArea.setText(inputArea.getText().concat(String.valueOf(")")));
            tempString = inputArea.getText();
        }
        if (actionCommand.equals(".")){
            inputArea.setText(inputArea.getText().concat("."));
            tempString = inputArea.getText();
        }
        if (actionCommand.equals("=")) {
            outputArea.setText(tempString);
            System.out.println(tempString);
            evaluate();
        }

        if (actionCommand.equals("Clr")) {
            inputArea.setText("");
        }
        if (actionCommand.equals("Del")) {
            String tempString = inputArea.getText();
            tempString = tempString.substring(0,tempString.length()-1);
            inputArea.setText(tempString);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}