package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.Random;

public class App {
    static int remainingTurns = 3;

    public static void main(String[] args){
        createGUI();
    }

    public static void createGUI(){
        JFrame window = new JFrame("Guess it!");
        JTextField edit = new JTextField();
        JButton guess = new JButton("Guess!");
        Container container = window.getContentPane();

        guess.setBounds(140,10, 80, 30);
        edit.setBounds(10, 10, 120, 30);

        final int[] receivedNumber = new int[1];
        Random rand = new Random();
        int tmp = rand.nextInt(0,20);

        FocusListener focus = new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                edit.setForeground(Color.RED);
            }

            @Override
            public void focusLost(FocusEvent e) {
                if(!edit.getText().isEmpty() && edit.isEditable()){
                    edit.setText("");
                    edit.setForeground(Color.BLACK);
                }
            }
        };

        ActionListener checker = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if (guess.equals(src)){
                    try{
                        receivedNumber[0] = Integer.parseInt(edit.getText());

                        if (remainingTurns >= 1) {
                            if (receivedNumber[0] == tmp) {
                                edit.setText("You won!");
                                edit.setEditable(false);
                            } else {
                                if (receivedNumber[0] > tmp) {
                                    edit.setText("Wrong, less!");
                                }
                                else{
                                    edit.setText("Wrong, more!");
                                }
                                remainingTurns -= 1;

                                if (remainingTurns == 0){
                                    edit.setText("Game over!");
                                    edit.setEditable(false);
                                }
                            }
                        }
                    }
                    catch (NumberFormatException ex) {
                        edit.setText("Not a number!");
                    }
                }
            }
        };

        guess.addActionListener(checker);
        guess.addFocusListener(focus);

        window.setSize(400, 90);
        window.setLayout(null);
        window.add(guess);
        window.add(edit);

        window.setVisible(true);
    }

}
