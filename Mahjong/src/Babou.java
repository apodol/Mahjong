
import java.awt.event.ActionEvent;
import javax.swing.*;

//Apostolis Dolmes icsd14047
//Giannis Pyrgas icsd14167

public class Babou extends Plaketes {
    
    public Babou(int arithmosPlakidiou) {
        super(arithmosPlakidiou);
    }
    @Override
    public String toString(){
        return ("B"+getAr());}
    
    
    @Override
    public JButton buttonReturn(){         //methodos gia epistrofi button me tis kataliles fotografies analoga me ton arithmo plakidiou
        ImageIcon img;
        JButton but=new JButton();;
       
       if (getAr()==1){
           img = new ImageIcon("tiles/b1.png");
           but = new JButton(img);
           but.setBounds(310, 290, 42, 46);
           }
       else if (getAr()==2){
            img = new ImageIcon("tiles/b2.png");
            but= new JButton(img);
            but.setBounds(310, 290, 42, 46);
            }
       else if (getAr()==3){
            img = new ImageIcon("tiles/b3.png");
            but= new JButton(img);
            but.setBounds(310, 290, 42, 46);
            }
       else if (getAr()==4){
            img = new ImageIcon("tiles/b4.png");
            but= new JButton(img);
            but.setBounds(310, 290, 42, 46);
            }
       else if (getAr()==5){
            img = new ImageIcon("tiles/b5.png");
            but= new JButton(img);
            but.setBounds(310, 290, 42, 46);
            }
       else if (getAr()==6){
            img = new ImageIcon("tiles/b6.png");
            but= new JButton(img);
            but.setBounds(310, 290, 42, 46);
            }
       else if (getAr()==7){
            img = new ImageIcon("tiles/b7.png");
            but= new JButton(img);
            but.setBounds(310, 290, 42, 46);
            }
       else if (getAr()==8){
            img = new ImageIcon("tiles/b8.png");
            but= new JButton(img);
            but.setBounds(310, 290, 42, 46);
            }
       else if (getAr()==9){
            img = new ImageIcon("tiles/b9.png");
            but= new JButton(img);
            but.setBounds(310, 290, 42, 46);
            }
        but.addActionListener((ActionEvent e) -> {
          
        
        });
       
      
       return but;
    }
    
}
