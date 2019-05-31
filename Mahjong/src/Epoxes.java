
import javax.swing.ImageIcon;
import javax.swing.JButton;

//Apostolis Dolmes icsd14047
//Giannis Pyrgas icsd14167
public class Epoxes extends Plaketes{
    
    public Epoxes(int arithmosPlakidiou) {
        super(arithmosPlakidiou);
    }
    
    @Override
    public String toString(){
        return ("E"+getAr());}
    
    public JButton buttonReturn(){ //methodos gia epistrofi button me tis kataliles fotografies analoga me ton arithmo plakidiou
        ImageIcon img;
        JButton but;
       
       if (getAr()==1){
           img = new ImageIcon("tiles/s1.png");
           but = new JButton(img);
           but.setBounds(310, 290, 42, 46);
            return but;}
       else if (getAr()==2){
            img = new ImageIcon("tiles/s2.png");
            but= new JButton(img);
            but.setBounds(310, 290, 42, 46);
            return but;}
       else if (getAr()==3){
            img = new ImageIcon("tiles/s3.png");
            but= new JButton(img);
            but.setBounds(310, 290, 42, 46);
            return but;}
       else if (getAr()==4){
            img = new ImageIcon("tiles/s4.png");
            but= new JButton(img);
            but.setBounds(310, 290, 42, 46);
            return but;}
       
       
       but=new JButton();
       return but;
    }
     @Override
    public boolean equals(Object obj) {
        if (obj==null){
          
            return false;}

        if(obj.getClass()==this.getClass()){           //elegxos an einai idiou tipou oi klasis
                  //elgxos an einai epoxes h louloudia
                
                return true;                                       //an einai epoxes h louloudia tote epistrofi true gt dn mas niazi o arithmos
          
            
               
            
           
            
    }
        
        
    return false;}

    @Override
    public int hashCode() {  //hascode ,,dn mas endiaferi i epistrofi,gia auto ebala kati stin tixix
       return 5;
    }
    
    
    
}
