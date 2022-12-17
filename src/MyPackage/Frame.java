package MyPackage;

import javax.swing.*;

public class Frame extends JFrame{

    public Frame() {

        super ("Calculator");

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JTextField textField = new JTextField();
        JButton button = new JButton();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(200, 300);
        setVisible(true);

        //add(textField);
        //add(button);
        add(panel);
        panel.add(button);
        panel.add(textField);




    }


}
