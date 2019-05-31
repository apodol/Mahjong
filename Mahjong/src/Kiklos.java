
import javax.swing.ImageIcon;
import javax.swing.JButton;

//Apostolis Dolmes icsd14047
//Giannis Pyrgas icsd14167
public class Kiklos extends Plaketes{
    
    public Kiklos(int arithmosPlakidiou) {
        super(arithmosPlakidiou);
    }
    @Override
    public String toString(){
        return ("K"+getAr());}
    
    public JButton buttonReturn(){
        ImageIcon img;
        JButton but;
       
       if (getAr()==1){//methodos gia epistrofi button me tis kataliles fotografies analoga me ton arithmo plakidiou
           img = new ImageIcon("tiles/c1.png");
           but = new JButton(img);
           but.setBounds(310, 290, 42, 46);
            return but;}
       else if (getAr()==2){
            img = new ImageIcon("tiles/c2.png");
            but= new JButton(img);
            but.setBounds(310, 290, 42, 46);
            return but;}
       else if (getAr()==3){
            img = new ImageIcon("tiles/c3.png");
            but= new JButton(img);
            but.setBounds(310, 290, 42, 46);
            return but;}
       else if (getAr()==4){
            img = new ImageIcon("tiles/c4.png");
            but= new JButton(img);
            but.setBounds(310, 290, 42, 46);
            return but;}
       else if (getAr()==5){
            img = new ImageIcon("tiles/c5.png");
            but= new JButton(img);
            but.setBounds(310, 290, 42, 46);
            return but;}
       else if (getAr()==6){
            img = new ImageIcon("tiles/c6.png");
            but= new JButton(img);
            but.setBounds(310, 290, 42, 46);
            return but;}
       else if (getAr()==7){
            img = new ImageIcon("tiles/c7.png");
            but= new JButton(img);
            but.setBounds(310, 290, 42, 46);
            return but;}
       else if (getAr()==8){
            img = new ImageIcon("tiles/b8.png");
            but= new JButton(img);
            but.setBounds(310, 290, 42, 46);
            return but;}
       else if (getAr()==9){
            img = new ImageIcon("tiles/c9.png");
            but= new JButton(img);
            but.setBounds(310, 290, 42, 46);
            return but;}
       
       but=new JButton();
       return but;
    }
    
}
