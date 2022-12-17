package MyPackage;

import javax.swing.*;



public class TextPanel extends JTextArea{

    private JTextField textField;

    public TextPanel(){

        JTextField textArea = new JTextField();

        textField.setText("Hello");
        setVisible(true);
        setSize(100, 100);



    }
}
