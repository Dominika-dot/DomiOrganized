package com.dominikawebsite.titlecaseConverter;

import javax.swing.*;
import java.awt.*;
//simple title class converter
public class Main {

    public static void main(String[] args) {
        JFrame application = createGUI();
        application.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//on close java gui exits
        application.setVisible(true);
    }

    private static JFrame createGUI(){
        JTextField input = new JTextField();
        input.setPreferredSize(new Dimension(300,40));

        JButton convertButton = new JButton("Convert");
        JLabel output = new JLabel();
        output.setPreferredSize(new Dimension(300,40));

        convertButton.addActionListener(event ->{
            output.setText(TitlecaseConverter.convertionToTitleCase(input.getText()));
        });

        JFrame gui = new JFrame ("Title case converter");
        gui.setLayout(new FlowLayout());
        gui.add(input);
        gui.add(convertButton);
        gui.add(output);
        gui.pack();
        gui.setLocationRelativeTo(null); //centering the screen

        return gui;

    }
}
