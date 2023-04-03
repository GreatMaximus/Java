package com.company;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class MainApp2 extends JFrame {
    public JButton button = new JButton("Click");
    public JTextField input = new JTextField("");
    public JLabel label = new JLabel("Input:");
    public JRadioButton radio1 = new JRadioButton("1",true);
    public JRadioButton radio2 = new JRadioButton("2");
    public JCheckBox check = new JCheckBox("Check", true);

    public MainApp2(){
        super("Example form");
        int width = 300;
        int height = 200;
        int x = 1920/2 - width/2;
        int y = 1080/2 - height/2;
        this.setBounds(x,y,width,height);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,2,10,10));
        Font myFont = new Font ("Dialog", Font.BOLD,20);
        label.setFont(myFont);
        label.setForeground(Color.red);
        button.setForeground(Color.blue);
        Border emptyBorder = new EmptyBorder (0,20,0,0);
        label.setBorder(emptyBorder);
        container.add(label);
        container.add(input);
        radio1.setBorder(emptyBorder);
        check.setBorder(emptyBorder);
        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        container.add(radio1);
        container.add(radio2);
        radio1.setSelected(true);

        container.add(check);
        button.addActionListener(new ButtonEventListener());
        container.add(button);
    }
    class ButtonEventListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String message = " ";
            message += "Button was pressed \n";
            message += "Text is " + input.getText() + "\n";
            message += (radio1.isSelected() ? "Radio 1" : "Radio2 " + "was selected\n");
            message += "Checkbox: " + (check.isSelected() ? "checked" : "unchecked " + "status\n");
            JOptionPane.showMessageDialog(null,message,"Output",JOptionPane.PLAIN_MESSAGE);


        }
    }
}
