package ru.mirea.task5;

import javax.swing.*;

public class Picture {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Picture");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        String imgPath = args[0];
        ImageIcon imageIcon = new ImageIcon(imgPath);
        JLabel label = new JLabel(imageIcon);
        frame.getContentPane().add(label);
        frame.setVisible(true);
    }
}
