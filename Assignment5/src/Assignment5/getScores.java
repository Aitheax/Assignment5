package Assignment5;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;
public class getScores extends JFrame implements ActionListener {
/**
* @author Aitheax
* 11/4/2014
* This is the driver file for this assignment.
*/
JTextField[] txtScore = new JTextField[4];
JTextField[] txtWeight = new JTextField[4];
JButton btnScore = new JButton("Calcuate");
JPanel pnlScore = new JPanel(new GridLayout(5, 2));
JTextField txtDisplay = new JTextField();
JLabel label1 = new JLabel("Score");
JLabel label2 = new JLabel("Weight");
JLabel[] label = new JLabel[10];
int[] score = new int[4];
double[] weight = new double[4];
/**
* Defines a new ScoreGUI
*/
public getScores() {
for (int i = 0; i < txtScore.length; i++) {
txtScore[i] = new JTextField(6);
txtWeight[i] = new JTextField(6);
pnlScore.add(txtScore[i]);
pnlScore.add(txtWeight[i]);
}
/**
* Formats the text boxes and the output boxes 
*/
btnScore.addActionListener(this);
add(txtDisplay, BorderLayout.NORTH);
add(pnlScore);
add(btnScore, BorderLayout.SOUTH);
setVisible(true);
pack();
pnlScore.add(label1, BorderLayout.CENTER);
pnlScore.add(label2, BorderLayout.CENTER);
}
@Override
public void actionPerformed(ActionEvent arg0) {
for (int i = 0; i < score.length; i++) {
score[i] = Integer.parseInt(txtScore[i].getText());
weight[i] = Double.parseDouble(txtWeight[i].getText());
}
txtDisplay.setText(ScoreCalculator.calScore(score, weight) + "");
}
public static void main(String[] args) {
new getScores();
}
}