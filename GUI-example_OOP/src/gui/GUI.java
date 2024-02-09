/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI {
    
    static JTextField num1 = new JTextField(4);
    static JTextField num2 = new JTextField(4);
    static JTextField sum = new JTextField(4);
    static JButton button = new JButton("SUM");
    
    static JTextField text = new JTextField("Try new font styles",20);
    static JCheckBox bold =new JCheckBox("Bold");
    static JCheckBox italic =new JCheckBox("italic");
    
    public static void main(String[] args) {
        //2 numbers sum example
        JFrame frame1 = new JFrame("example 1");
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(500,150);
        frame1.setLayout(new FlowLayout());
        frame1.add(new JLabel("Number 1: " ));
        frame1.add(num1);
        
        frame1.add(new JLabel("Number 2: " ));
        frame1.add(num2);
        
        frame1.add(button);
        
        frame1.add(new JLabel("Result: " ));
        frame1.add(sum);
        
        button.addActionListener(new Handler());
        
        //bold or italic example
        text.setFont(new Font("serif",Font.PLAIN,12));
        frame1.add(text);
        frame1.add(bold);
        frame1.add(italic);
        
        Handler changeFont = new Handler();
        bold.addItemListener(changeFont);
        italic.addItemListener(changeFont);
    }
    
    static class Handler implements ActionListener, ItemListener{
    
    @Override
    public void actionPerformed(ActionEvent event){
    int no1 = Integer.parseInt(num1.getText());
    int no2 = Integer.parseInt(num2.getText());
    
    sum.setText(Integer.toString(no1+no2));
    }
    @Override
    public void itemStateChanged(ItemEvent event){
    int varBold=Font.PLAIN;
    int varitalic=Font.PLAIN;
    
    if(bold.isSelected())
        varBold = Font.BOLD;
    
    if(italic.isSelected())
        varitalic = Font.ITALIC;
    
    text.setFont(new Font("Serif",varBold+varitalic,12));
    }
    
    }
    
    
}
