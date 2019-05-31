
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;


public class arxikiOthoni extends JFrame {             //edw arxikopioude ta JComponents tis protis othonis
    
    private JButton enarksi,about,stoixia,kanones,exit;  //arxikopiisi koubion
    private JTextArea message;           //ena minima pou emfanizete otan anigi to app WELCOME TO SIMPLE MAJHONG
    
    public arxikiOthoni(){
        super ("Simple Majhong");
        setSize(1700,1000);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        
        message=new JTextArea("Welcome to  SIMPLE MAJHONG ");           //epeksergasia tou minimatos WELCOME
        
        message.setBounds(460, 310,111111, 111111);
        message.setFont(new Font("Arial",Font.PLAIN,50));
        message.setForeground(Color.gray);
        
        message.setOpaque(false);
    
      
        
        enarksi=new JButton("START");                 //epeksergasia tou START
        enarksi.setBounds(710, 510, 250, 50);
        enarksi.setFont(new Font("Arial",Font.PLAIN,20));
        
        kanones=new JButton("RULES");//epeksergasia tou rules
        kanones.setBounds(710, 570, 250, 50);
        kanones.setFont(new Font("Arial",Font.PLAIN,20));
        
        stoixia=new JButton("PLAYER INFO");//epeksergasia tou playerinfo
        stoixia.setBounds(710, 630, 250, 50);
        stoixia.setFont(new Font("Arial",Font.PLAIN,20));
        
        about=new JButton("CREDITS");//epeksergasia tou credits
        about.setBounds(710, 690, 250, 50);
        about.setFont(new Font("Arial",Font.PLAIN,20));
        
        exit=new JButton("EXIT");//epeksergasia tou exit
        exit.setBounds(710, 750, 250, 50);
        exit.setFont(new Font("Arial",Font.PLAIN,20));
        
        
        Container cont=getContentPane();
        cont.setLayout(null);
     
    
    IconLabel label = new IconLabel(new ImageIcon("te.png")); //dimiourgia ikonas stin opia 8a boun pano ta JCOMPONENTS
   
    
    enarksi.setBackground(Color.gray);          //alagi xromaton ton koubion
    kanones.setBackground(Color.gray);
    stoixia.setBackground(Color.gray);     
    about.setBackground(Color.gray);
    exit.setBackground(Color.gray);
    message.setBackground(Color.red);
   
    
        
    label.add(enarksi);      //isagogi ton koubion
    label.add(kanones);
    label.add(stoixia);
    label.add(about);
    label.add(exit);
    label.add(message);
   
   
    
    
    
    cont.add(label);
    

    
        
    
        
    setContentPane(cont);
        
        enarksi.addActionListener((ActionEvent e) -> { //actionlistener me to pou patithi i enarksi na kalesti to menuButton start,,to opio periexei
                                                    //ola osa prepei na ginoun
            menuButtons start1=new menuButtons();
            start1.Start(2,true);
          
        });
        kanones.addActionListener((ActionEvent e) -> { //to idio opos pano
           menuButtons kanonas=new menuButtons();
           kanonas.rules();
        
        });
        stoixia.addActionListener((ActionEvent e) -> {//to idio opos pano
          menuButtons stixia=new menuButtons();
          stixia.playerInfo();
        
        });
        about.addActionListener((ActionEvent e) -> {//to idio opos pano
          menuButtons aboutt=new menuButtons();
          aboutt.credits();
        
        });
        exit.addActionListener((ActionEvent e) -> { //otan patithi to exit,,dispose to frame
          dispose();
        
        });
        

    
    
    }
    
}
