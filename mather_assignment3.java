/************************************************
 * Stephen Mather
 * CSCI 230
 * Assignment 3
 ************************************************/
package mather_assignment3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import javax.swing.*;


public class Mather_Assignment3 extends JFrame {
    //declare and initialize global variables
    static JPanel cards;
    private static String displayString1 = "";
    private static String displayString2 = "";
    private static String displayString3 = "";
    private static int numPressed = 0;
    private static double firstNumber = 0;
    private static double secondNumber = 0;
    private static double answer = 0;
    private static boolean actionPressed = false;
    private static char actionButton = '\n';
    
    
    
    
    public static void addComponentsToPane(Container myPane) {
        //set up GridBagLayout Pane and Constraints
        myPane.setLayout(new GridBagLayout());
	
        JPanel card1 = new JPanel();
        card1.setLayout(new GridBagLayout());
        GridBagConstraints gbc1 = new GridBagConstraints();
        
        JPanel card2 = new JPanel();
        card2.setLayout(new GridBagLayout());
        GridBagConstraints gbc2 = new GridBagConstraints();
        
        //add label as the screen
        JLabel screen = new JLabel();
        screen.setBackground(Color.white);
        screen.setOpaque(true);
        screen.setHorizontalAlignment(JLabel.RIGHT);
        gbc1.fill = GridBagConstraints.BOTH;
        gbc1.ipady = 30;
        gbc1.insets = new Insets(5,5,5,5); 
	gbc1.gridx = 0;
	gbc1.gridy = 0;
        gbc1.gridwidth = 3;
	card1.add(screen, gbc1);
        
        //add digit calculator buttons to the gridBagLayout
        Button buttonOne = new Button("1");
        gbc1.fill = GridBagConstraints.BOTH;
        gbc1.insets = new Insets(0,0,0,0); 
        gbc1.ipady = 25;
        gbc1.gridwidth = 1;
        gbc1.gridx = 0;
	gbc1.gridy = 1;
        buttonOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            numPressed = 1;
            if (!actionPressed) {
                displayString1 += numPressed;
                firstNumber = Double.valueOf(displayString1);
                screen.setText(displayString1);
            }
            else {
                displayString2 += numPressed;
                secondNumber = Double.valueOf(displayString2);
                screen.setText(displayString1 + displayString2);
            }
            }
        });
	card1.add(buttonOne, gbc1);
        
        Button buttonTwo = new Button("2");
        gbc1.fill = GridBagConstraints.BOTH;
        gbc1.gridx = 1;
	gbc1.gridy = 1;
        buttonTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            numPressed = 2;
            if (!actionPressed) {
                displayString1 += numPressed;
                firstNumber = Double.valueOf(displayString1);
                screen.setText(displayString1);
            }
            else {
                displayString2 += numPressed;
                secondNumber = Double.valueOf(displayString2);
                screen.setText(displayString1 + displayString2);
            }
            }
        });
	card1.add(buttonTwo, gbc1);
        
        Button buttonThree = new Button("3");
        gbc1.fill = GridBagConstraints.BOTH;
        gbc1.gridx = 2;
	gbc1.gridy = 1;
        buttonThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            numPressed = 3;
            if (!actionPressed) {
                displayString1 += numPressed;
                firstNumber = Double.valueOf(displayString1);
                screen.setText(displayString1);
            }
            else {
                displayString2 += numPressed;
                secondNumber = Double.valueOf(displayString2);
                screen.setText(displayString1 + displayString2);
            }
            }
        });
	card1.add(buttonThree, gbc1);
        
        Button buttonFour = new Button("4");
        gbc1.fill = GridBagConstraints.BOTH;
        gbc1.gridx = 0;
	gbc1.gridy = 2;
        buttonFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            numPressed = 4;
            if (!actionPressed) {
                displayString1 += numPressed;
                firstNumber = Double.valueOf(displayString1);
                screen.setText(displayString1);
            }
            else {
                displayString2 += numPressed;
                secondNumber = Double.valueOf(displayString2);
                screen.setText(displayString1 + displayString2);
            }
            }
        });
	card1.add(buttonFour, gbc1);
        
        Button buttonFive = new Button("5");
        gbc1.fill = GridBagConstraints.BOTH;
        gbc1.gridx = 1;
	gbc1.gridy = 2;
        buttonFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            numPressed = 5;
            if (!actionPressed) {
                displayString1 += numPressed;
                firstNumber = Double.valueOf(displayString1);
                screen.setText(displayString1);
            }
            else {
                displayString2 += numPressed;
                secondNumber = Double.valueOf(displayString2);
                screen.setText(displayString1 + displayString2);
            }
            }
        });
	card1.add(buttonFive, gbc1);
        
        Button buttonSix = new Button("6");
        gbc1.fill = GridBagConstraints.BOTH;
        gbc1.gridx = 2;
	gbc1.gridy = 2;
        buttonSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            numPressed = 6;
            if (!actionPressed) {
                displayString1 += numPressed;
                firstNumber = Double.valueOf(displayString1);
                screen.setText(displayString1);
            }
            else {
                displayString2 += numPressed;
                secondNumber = Double.valueOf(displayString2);
                screen.setText(displayString1 + displayString2);
            }
            }
        });
	card1.add(buttonSix, gbc1);
        
        Button buttonSeven = new Button("7");
        gbc1.fill = GridBagConstraints.BOTH;
        gbc1.gridx = 0;
	gbc1.gridy = 3;
        buttonSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            numPressed = 7;
            if (!actionPressed) {
                displayString1 += numPressed;
                firstNumber = Double.valueOf(displayString1);
                screen.setText(displayString1);
            }
            else {
                displayString2 += numPressed;
                secondNumber = Double.valueOf(displayString2);
                screen.setText(displayString1 + displayString2);
            }
            }
        });
	card1.add(buttonSeven, gbc1);
        
        Button buttonEight = new Button("8");
        gbc1.fill = GridBagConstraints.BOTH;
        gbc1.gridx = 1;
	gbc1.gridy = 3;
        buttonEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            numPressed = 8;
            if (!actionPressed) {
                displayString1 += numPressed;
                firstNumber = Double.valueOf(displayString1);
                screen.setText(displayString1);
            }
            else {
                displayString2 += numPressed;
                secondNumber = Double.valueOf(displayString2);
                screen.setText(displayString1 + displayString2);
            }
            }
        });
	card1.add(buttonEight, gbc1);
        
        Button buttonNine = new Button("9");
        gbc1.fill = GridBagConstraints.BOTH;
        gbc1.gridx = 2;
	gbc1.gridy = 3;
        buttonNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            numPressed = 9;
            if (!actionPressed) {
                displayString1 += numPressed;
                firstNumber = Double.valueOf(displayString1);
                screen.setText(displayString1);
            }
            else {
                displayString2 += numPressed;
                secondNumber = Double.valueOf(displayString2);
                screen.setText(displayString1 + displayString2);
            }
            }
        });
	card1.add(buttonNine, gbc1);
        
        Button buttonZero = new Button("0");
        gbc1.fill = GridBagConstraints.BOTH;
        gbc1.gridx = 0;
	gbc1.gridy = 4;
        buttonZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            numPressed = 0;
            if (!actionPressed) {
                displayString1 += numPressed;
                firstNumber = Double.valueOf(displayString1);
                screen.setText(displayString1);
            }
            else {
                displayString2 += numPressed;
                secondNumber = Double.valueOf(displayString2);
                screen.setText(displayString1 + displayString2);
            }
            }
        });
	card1.add(buttonZero, gbc1);
        
        //the decimal button
        Button buttonPoint = new Button(".");
        gbc1.fill = GridBagConstraints.BOTH;
        gbc1.gridx = 1;
	gbc1.gridy = 4;
        buttonPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            if (!actionPressed) {
                displayString1 += ".";
                firstNumber = Double.valueOf(displayString1);
                screen.setText(displayString1);
            }
            else {
                displayString2 += ".";
                secondNumber = Double.valueOf(displayString2);
                screen.setText(displayString1 + displayString2);
            }
            }
        });
	card1.add(buttonPoint, gbc1);
        
        //adding "action" buttons: + - * /
        Button buttonPlus = new Button("+");
        gbc1.fill = GridBagConstraints.BOTH;
        gbc1.gridx = 2;
	gbc1.gridy = 4;
        buttonPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actionPressed = true;
                actionButton = '+';
                displayString1 += " + ";
                screen.setText(displayString1);
            }
        });
	card1.add(buttonPlus, gbc1);
        
        Button buttonMinus = new Button("-");
        gbc1.fill = GridBagConstraints.BOTH;
        gbc1.gridx = 0;
	gbc1.gridy = 5;
        buttonMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actionPressed = true;
                actionButton = '-';
                displayString1 += " - ";
                screen.setText(displayString1);
            }
        });
	card1.add(buttonMinus, gbc1);
        
        Button buttonMult = new Button("*");
        gbc1.fill = GridBagConstraints.BOTH;
        gbc1.gridx = 1;
	gbc1.gridy = 5;
        buttonMult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actionPressed = true;
                actionButton = '*';
                displayString1 += " * ";
                screen.setText(displayString1);
            }
        });
	card1.add(buttonMult, gbc1);
        
        Button buttonDiv = new Button("/");
        gbc1.fill = GridBagConstraints.BOTH;
        gbc1.gridx = 2;
	gbc1.gridy = 5;
        buttonDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actionPressed = true;
                actionButton = '/';
                displayString1 += " / ";
                screen.setText(displayString1);
            }
        });
	card1.add(buttonDiv, gbc1);

        //set up the equals Button to call calculate() function
        //make sure this button takes up 2 columns
        Button buttonEquals = new Button("=");
        gbc1.fill = GridBagConstraints.BOTH;
        gbc1.gridwidth = 2;
        gbc1.gridx = 0;
	gbc1.gridy = 6;
        buttonEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculate();
                displayString3 = displayString1 + displayString2;
                displayString3 += " = ";
                displayString3 += answer;
                screen.setText(displayString3);
            }
        });
	card1.add(buttonEquals, gbc1);
        
        //clear all variables
        Button buttonClear = new Button("C");
        gbc1.fill = GridBagConstraints.BOTH;
        gbc1.gridx = 2;
	gbc1.gridy = 6;
        buttonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            actionButton = 'c';
            actionPressed = false;
            numPressed = 0;
            firstNumber = 0;
            secondNumber = 0;
            answer = 0;
            displayString1 = "";
            displayString2 = "";
            displayString3 = "";
            screen.setText(displayString1);
            }
        });
	card1.add(buttonClear, gbc1);
        
        Button buttonSettings = new Button("Settings");
        gbc1.fill = GridBagConstraints.BOTH;
        gbc1.gridwidth = 3;
        gbc1.gridx = 0;
        gbc1.gridy = 7;
        buttonSettings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        card1.add(buttonSettings, gbc1);
        
        cards = new JPanel(new CardLayout());
        cards.add(card1);
        
        myPane.add(cards);
    }
    
    public void itemStateChanged(ItemEvent evt) {
        CardLayout cl = (CardLayout)(cards.getLayout());
        cl.show(cards, (String)evt.getItem());
    }
    
    //perform calculations needed for the '=' button
    public static void calculate() {        
        if(actionButton == '+') {
            answer = firstNumber + secondNumber;
        }
        if(actionButton == '-') {
            answer = firstNumber - secondNumber;
        }
        if(actionButton == '*') {
            answer = firstNumber * secondNumber;
        }
        if(actionButton == '/') {
            answer = firstNumber / secondNumber;
        } 
    }
    
    //
    public static void main(String[] args) {
        //create and set up the main frame
        JFrame frame = new JFrame("Mather_Assignment3");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Set up the content pane.
        addComponentsToPane(frame.getContentPane());

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
}
