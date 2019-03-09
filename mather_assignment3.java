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
    static JPanel cards;
    //declare and initialize global variables
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
	
        //cards = new JPanel(new CardLayout());
        JPanel card1 = new JPanel();
        card1.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        //add label as the screen
        JLabel screen = new JLabel();
        screen.setBackground(Color.white);
        screen.setOpaque(true);
        screen.setHorizontalAlignment(JLabel.RIGHT);
        c.fill = GridBagConstraints.BOTH;
        c.ipady = 30;
        c.insets = new Insets(5,5,5,5); 
	c.gridx = 0;
	c.gridy = 0;
        c.gridwidth = 3;
	card1.add(screen, c);
        
        //add digit calculator buttons to the gridBagLayout
        Button buttonOne = new Button("1");
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(0,0,0,0); 
        c.ipady = 25;
        c.gridwidth = 1;
        c.gridx = 0;
	c.gridy = 1;
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
	card1.add(buttonOne, c);
        
        Button buttonTwo = new Button("2");
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 1;
	c.gridy = 1;
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
	card1.add(buttonTwo, c);
        
        Button buttonThree = new Button("3");
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 2;
	c.gridy = 1;
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
	card1.add(buttonThree, c);
        
        Button buttonFour = new Button("4");
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
	c.gridy = 2;
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
	card1.add(buttonFour, c);
        
        Button buttonFive = new Button("5");
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 1;
	c.gridy = 2;
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
	card1.add(buttonFive, c);
        
        Button buttonSix = new Button("6");
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 2;
	c.gridy = 2;
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
	card1.add(buttonSix, c);
        
        Button buttonSeven = new Button("7");
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
	c.gridy = 3;
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
	card1.add(buttonSeven, c);
        
        Button buttonEight = new Button("8");
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 1;
	c.gridy = 3;
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
	card1.add(buttonEight, c);
        
        Button buttonNine = new Button("9");
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 2;
	c.gridy = 3;
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
	card1.add(buttonNine, c);
        
        Button buttonZero = new Button("0");
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
	c.gridy = 4;
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
	card1.add(buttonZero, c);
        
        //the decimal button
        Button buttonPoint = new Button(".");
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 1;
	c.gridy = 4;
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
	card1.add(buttonPoint, c);
        
        //adding "action" buttons: + - * /
        Button buttonPlus = new Button("+");
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 2;
	c.gridy = 4;
        buttonPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actionPressed = true;
                actionButton = '+';
                displayString1 += " + ";
                screen.setText(displayString1);
            }
        });
	card1.add(buttonPlus, c);
        
        Button buttonMinus = new Button("-");
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
	c.gridy = 5;
        buttonMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actionPressed = true;
                actionButton = '-';
                displayString1 += " - ";
                screen.setText(displayString1);
            }
        });
	card1.add(buttonMinus, c);
        
        Button buttonMult = new Button("*");
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 1;
	c.gridy = 5;
        buttonMult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actionPressed = true;
                actionButton = '*';
                displayString1 += " * ";
                screen.setText(displayString1);
            }
        });
	card1.add(buttonMult, c);
        
        Button buttonDiv = new Button("/");
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 2;
	c.gridy = 5;
        buttonDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actionPressed = true;
                actionButton = '/';
                displayString1 += " / ";
                screen.setText(displayString1);
            }
        });
	card1.add(buttonDiv, c);

        //set up the equals Button to call calculate() function
        //make sure this button takes up 2 columns
        Button buttonEquals = new Button("=");
        c.fill = GridBagConstraints.BOTH;
        c.gridwidth = 2;
        c.gridx = 0;
	c.gridy = 6;
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
	card1.add(buttonEquals, c);
        
        //clear all variables
        Button buttonClear = new Button("C");
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 2;
	c.gridy = 6;
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
	card1.add(buttonClear, c);
        
        Button buttonSettings = new Button("Settings");
        c.fill = GridBagConstraints.BOTH;
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 7;
        buttonSettings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        card1.add(buttonSettings, c);
        
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
