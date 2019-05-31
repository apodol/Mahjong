
import javax.swing.ImageIcon;
import javax.swing.JButton;

//Apostolis Dolmes icsd14047
//Giannis Pyrgas icsd14167
public class Xaraktiras extends Plaketes{
    
    public Xaraktiras(int arithmosPlakidiou) {
        super(arithmosPlakidiou);
    }
    @Override
    public String toString(){
        return ("X"+getAr());}
    
    public JButton buttonReturn(){//methodos gia epistrofi button me tis kataliles fotografies analoga me ton arithmo plakidiou
        ImageIcon img;
        JButton but;
       
       if (getAr()==1){
           img = new ImageIcon("tiles/x1.png");
           but = new JButton(img);
           but.setBounds(310, 290, 42, 46);
            return but;}
       else if (getAr()==2){
            img = new ImageIcon("tiles/x2.png");
            but= new JButton(img);
            but.setBounds(310, 290, 42, 46);
            return but;}
       else if (getAr()==3){
            img = new ImageIcon("tiles/x3.png");
            but= new JButton(img);
            but.setBounds(310, 290, 42, 46);
            return but;}
       else if (getAr()==4){
            img = new ImageIcon("tiles/x4.png");
            but= new JButton(img);
            but.setBounds(310, 290, 42, 46);
            return but;}
       else if (getAr()==5){
            img = new ImageIcon("tiles/x5.png");
            but= new JButton(img);
            but.setBounds(310, 290, 42, 46);
            return but;}
       else if (getAr()==6){
            img = new ImageIcon("tiles/x6.png");
            but= new JButton(img);
            but.setBounds(310, 290, 42, 46);
            return but;}
       else if (getAr()==7){
            img = new ImageIcon("tiles/x7.png");
            but= new JButton(img);
            but.setBounds(310, 290, 42, 46);
            return but;}
       else if (getAr()==8){
            img = new ImageIcon("tiles/x8.png");
            but= new JButton(img);
            but.setBounds(310, 290, 42, 46);
            return but;}
       else if (getAr()==9){
            img = new ImageIcon("tiles/x9.png");
            but= new JButton(img);
            but.setBounds(310, 290, 42, 46);
            return but;}
       
       but=new JButton();
       return but;
    }
    
}
