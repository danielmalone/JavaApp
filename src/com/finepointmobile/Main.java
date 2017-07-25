package com.finepointmobile;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Main extends Frame implements ActionListener {

    private Label label;

    public Main() {

        setLayout(new FlowLayout());
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        try {
            String text = URLReader.fetch();
            label = new Label(text);
            add(label);
        } catch (IOException e) {
            e.printStackTrace();
        }


        Button button = new Button("Submit");
        button.addActionListener(this);
        add(button);

        TextField textField = new TextField("Welcome!");
        add(textField);

        setTitle("Fine Point Mobile | Software");
        setVisible(true);
    }

    public static void main(String[] args) {
        // write your code here
        System.out.println("Welcome!");
        User user = new User("Daniel", "Malone");
        System.out.println(user.getFirstName());

        Main app = new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("here");
    }
}
