package ru.mirea.task9;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private static int team1Score = 0;
    private static int team2Score = 0;

    public static void main(String[] args){
        createGUI();
    }

    public static void createGUI(){
        JFrame window       = new JFrame("Team1 vs Team2!");
        JButton team1       = new JButton("Team1");
        JButton team2       = new JButton("Team2");
        JLabel score        = new JLabel();
        JLabel lastScored   = new JLabel();
        Label winner        = new Label();
        Container container = window.getContentPane();

        container.setLayout(new FlowLayout( FlowLayout.LEFT, 10, 10));

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(550, 80);

        score.setText("Result " + team1Score + " X " + team2Score);
        winner.setText("Winner: TIE");
        lastScored.setText("Last scored: N/A");

        ActionListener act = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if (team1.equals(src)){
                    team1Score += 1;
                    lastScored.setText("Last scored: Team1");
                }
                else if(team2.equals(src)){
                    team2Score += 1;
                    lastScored.setText("Last scored: Team2");
                }

                score.setText("Result " + team1Score + " X " + team2Score);

                if (team1Score > team2Score){
                    winner.setText("Winner: Team1");
                }
                else if (team1Score < team2Score){
                    winner.setText("Winner: Team2");
                }
                else if (team1Score == team2Score){
                    winner.setText("Winner: TIE");
                }
            }
        };

        team1.addActionListener(act);
        team2.addActionListener(act);

        container.add(team1);
        container.add(team2);
        container.add(winner);
        container.add(score);
        container.add(lastScored);

        window.setVisible(true);
    }
}
