package ru.mirea.task5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Football {
    private static int score1, score2;
    private static String lastScorer = "N/A", winner = "DRAW";
    public static void main(String[] args) {
        JFrame frame = new JFrame("Football match");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        JPanel panelTeam = new JPanel();
        JButton button1 = new JButton("AC Milan");
        JButton button2 = new JButton("Real Madrid");
        panelTeam.add(button1);
        panelTeam.add(button2);
        JLabel labelScore = new JLabel(String.format("Result: %d X %d", score1, score2), JLabel.CENTER);
        JLabel labelLastScorer = new JLabel(String.format("Last Scorer: %s", lastScorer));
        JLabel labelWinner = new JLabel(String.format("Winner: %s", winner));
        JPanel panelScore = new JPanel();
        JPanel panelWinner = new JPanel();
        panelScore.add(labelScore);
        panelScore.add(labelLastScorer);
        panelWinner.add(labelWinner);
        frame.getContentPane().add(BorderLayout.PAGE_START, panelTeam);
        frame.getContentPane().add(BorderLayout.CENTER, panelScore);
        frame.getContentPane().add(BorderLayout.PAGE_END, panelWinner);
        frame.setResizable(false);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                score1++;
                labelScore.setText(String.format("Result: %d X %d", score1, score2));
                lastScorer = "AC Milan";
                labelLastScorer.setText(String.format("Last Scorer: %s", lastScorer));
                if (score1 > score2) {
                    winner = "AC Milan";
                    labelWinner.setText(String.format("Winner: %s", winner));
                } else if (score2 > score1){
                    winner = "Real Madrid";
                    labelWinner.setText(String.format("Winner: %s", winner));
                } else {
                    winner = "DRAW";
                    labelWinner.setText(String.format("Winner: %s", winner));
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                score2++;
                labelScore.setText(String.format("Result: %d X %d", score1, score2));
                lastScorer = "Real Madrid";
                labelLastScorer.setText(String.format("Last Scorer: %s", lastScorer));
                if (score1 > score2) {
                    winner = "AC Milan";
                    labelWinner.setText(String.format("Winner: %s", winner));
                } else if (score2 > score1){
                    winner = "Real Madrid";
                    labelWinner.setText(String.format("Winner: %s", winner));
                } else {
                    winner = "DRAW";
                    labelWinner.setText(String.format("Winner: %s", winner));
                }
            }
        });
        frame.setVisible(true);
    }
}
