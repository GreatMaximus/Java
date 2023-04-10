package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainAppLogin2 extends JFrame {
    public JLabel label1 = new JLabel("Username");
    public JLabel label2 = new JLabel("Password");
    public JLabel label3 =  new JLabel (" ");
    public JLabel label4 = new JLabel("Not a member?");
    public JLabel label5 = new JLabel("Sign Up!");
    public JLabel label6 = new JLabel("Already have any account?");
    public JLabel label7 = new JLabel("Login!");

    public JButton button = new JButton("Login");
    public JButton button2 = new JButton("Sign Up");
    public JTextField userNameInput = new JTextField();
    public JTextField passwordInput = new JTextField();

    MainAppLogin2(){
        super("Login Form");
        this.setBounds(300,300,290,230);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(null);
        label1.setBounds(10,0,100,30);
        userNameInput.setBounds(10,30,150,20);
        label2.setBounds(10,50,100,30);
        passwordInput.setBounds(10,80,150,20);
        button.setBounds(10,110,100,30);
        label3.setBounds(10,140,200,20);
        label4.setBounds(70,160,90,30);
        label5.setBounds(160,160,60,30);
        label5.setForeground(Color.magenta);
        Font myFont = new Font ("Helvetica", Font.ITALIC,15);
        label5.setFont(myFont);
        label5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JFrame frame;
                frame = new JFrame("Sign up form");
                frame.setVisible(true);
                frame.setSize(290,230);
                Container container2 = new Container();
                container2 = frame.getContentPane();
                container2.setLayout(null);
                label1.setBounds(10,0,100,30);
                userNameInput.setBounds(10,30,150,20);
                label2.setBounds(10,50,100,30);
                passwordInput.setBounds(10,80,150,20);
                button2.setBounds(10,110,100,30);
                label6.setBounds(30,160,160,30);
                label7.setBounds(190,160,90,30);
                container2.add(label1);
                container2.add(label2);
                container2.add(userNameInput);
                container2.add(passwordInput);
                container2.add(button2);
                container2.add(label6);
                container2.add(label7);
            }
        });

        Point point = new Point(0,0);
        Toolkit tkit = Toolkit.getDefaultToolkit();
        Image img = tkit.getImage("pointer.png");
        Cursor cursor = tkit.createCustomCursor(img,point,"pointer");
        label5.setCursor(cursor);

        container.add(label1);
        container.add(label2);
        container.add(label3);
        container.add(label4);
        container.add(label5);
        container.add(userNameInput);
        container.add(passwordInput);
        container.add(button);

        button.addActionListener(new Events());
    }
    class Events implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String username = "Max";
            String password = "12345";
            if(username.equals(userNameInput.getText()) && password.equals(passwordInput.getText())){
                System.out.println("Welcome");
                label3.setText("Welcome");
                label3.setForeground(Color.green);
            }else{
                System.out.println("Wrong password or username");
                label3.setText("Wrong password or username");
                label3.setForeground(Color.red);
            }
        }
    }
}
