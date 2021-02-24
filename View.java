import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;


public class View extends JFrame implements ActionListener {
    private static int height = 800;
    private static int width = 700;
    public JTextArea inputArea = new JTextArea();
    private int x = 1;
    private Main mMain;


    View(Main pMain) {
        mMain = pMain;
        setBackground(Color.WHITE); //set background sets color of the frame, method comes from JFrame
        setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); //sets the location of frame to open center of the screen, null is center
        JPanel numbersPanel = new JPanel();
        numbersPanel.setLayout(new GridLayout(4,5));
        addButton(numbersPanel, "7");
        addButton(numbersPanel, "8");
        addButton(numbersPanel, "9");
        addButton(numbersPanel, "(");
        addButton(numbersPanel, ")");
        addButton(numbersPanel, "4");
        addButton(numbersPanel, "5");
        addButton(numbersPanel, "6");
        addButton(numbersPanel, "*");
        addButton(numbersPanel, "/");
        addButton(numbersPanel, "3");
        addButton(numbersPanel, "2");
        addButton(numbersPanel, "1");
        addButton(numbersPanel, "+");
        addButton(numbersPanel, "-");
        addButton(numbersPanel, ".");
        addButton(numbersPanel, "0");
        addButton(numbersPanel, "=");
        addButton(numbersPanel, "CLEAR");
        addButton(numbersPanel, "BKSPCE");
        JPanel mainPanel = new JPanel();
        inputArea.setWrapStyleWord(true);
        inputArea.setEditable(true);
        inputArea.setPreferredSize(new Dimension(600, 200));
        JPanel inputPanel = new JPanel();
        inputPanel.add(inputArea);
        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(javax.swing.Box.createVerticalGlue());
        numbersPanel.setPreferredSize(new Dimension(500, 500));
        mainPanel.add(numbersPanel, BorderLayout.SOUTH);
        mainPanel.add(javax.swing.Box.createVerticalGlue());
        add(mainPanel);
        setVisible(true);

    }



    private void addButton(JPanel pPanel, String pText) {
        JButton button = new JButton(pText);

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
            inputArea.append("1");
        }
        if (actionCommand.equals("2")) {
            inputArea.append("2");
        }
        if (actionCommand.equals("3")) {
            inputArea.append("3");
        }
        if (actionCommand.equals("4")) {
            inputArea.append("4");
        }
        if (actionCommand.equals("5")) {
            inputArea.append("5");
        }
        if (actionCommand.equals("6")) {
            inputArea.append("6");
        }
        if (actionCommand.equals("7")) {
            inputArea.append("7");
        }
        if (actionCommand.equals("8")) {
            inputArea.append("8");
        }
        if (actionCommand.equals("9")) {
            inputArea.append("9");
        }
        if (actionCommand.equals("/")) {
            inputArea.append("/");
        }
        if (actionCommand.equals("*")) {
            inputArea.append("*");
        }
        if (actionCommand.equals("-")) {
            inputArea.append("-");
        }
        if (actionCommand.equals("+")) {
            inputArea.append("+");
        }
        if (actionCommand.equals("0")) {
            inputArea.append("0");
        }
        if (actionCommand.equals("(")) {
            inputArea.append("(");
        }
        if (actionCommand.equals(")")) {
            inputArea.append(")");
        }
        if (actionCommand.equals("=")) {
            evaluate();
        }

        if (actionCommand.equals("CLEAR")) {
            inputArea.setText("");
        }
        if (actionCommand.equals("BKSPCE")) {
            String tempString = inputArea.getText();
            tempString = tempString.substring(0,tempString.length()-1);
            inputArea.setText(tempString);
        }
    }
}