package com.finepointmobile;

import java.awt.*;

public class Main extends Frame {

    public Main() {
        setLayout(new FlowLayout());
        Label label = new Label("First name:");
        add(label);
        setTitle("Daniel");
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        // write your code here
        System.out.println("Welcome!");
        User user = new User("Daniel", "Malone");
        System.out.println(user.getFirstName());

        Main app = new Main();
    }
}
