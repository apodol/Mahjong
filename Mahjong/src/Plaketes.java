
import javax.swing.ImageIcon;
import javax.swing.JButton;

//Apostolis Dolmes icsd14047
//Giannis Pyrgas icsd14167


public class Plaketes {
   private int arithmosPlakidiou;
 
    public Plaketes(int arithmosPlakidiou)
    {
       this.arithmosPlakidiou=arithmosPlakidiou;
    }
      public Plaketes(){}
    
    public int getAr(){
        return arithmosPlakidiou;}
    
    public JButton buttonReturn(){//OVVERIDE methodos gia epistrofi button me tis kataliles fotografies analoga me ton arithmo plakidiou
       JButton but=new JButton();
       return but;
    }
    
  
    
  
    //ilopiisi equals gia na kano equals ta epilegmena tiles
   @Override
    public boolean equals(Object obj) {
        if (obj==null){
          
            return false;}
    String e="Epoxes"; //Strings gia to an einai louloudi i epoxi,,etsi oste pio kato na elenkso an ta onomata tou getClass,einai ena apo auta,to opio simenei
                       //oti dn prepei na elegxi arithmous,,mas ftanei mono ta onomata pou epistrefi to getClass().getName() na einai idia.px Epoxes=Epoxes
    String l="Louloudia";
        if(obj.getClass()==this.getClass()){           //elegxos an einai idiou tipou oi klasis
            if (this.getClass().getName().equals(e) || this.getClass().getName().equals(l)){          //elgxos an einai epoxes h louloudia
                
                return true;                                       //an einai epoxes h louloudia tote epistrofi true gt dn mas niazi o arithmos
            }
            Plaketes a=(Plaketes)obj;                //casting
            if (arithmosPlakidiou==a.getAr()){       //an oi arithmoi einai idioi
            
                return true;}
            else
                return false;
            
               
            
           
            
    }
        
        
    return false;}

    @Override
    public int hashCode() {  //hascode ,,dn mas endiaferi i epistrofi,gia auto ebala kati stin tixix
       return 5;
    }
}
