
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;


public class menuButtons  {

   public menuButtons(){}

    public void Start(int x,boolean fores){
       
       JFrame helps=new JFrame("BOITHIES"); //frame ton boithionn
       JFrame frame=new JFrame("Playing");//frame tis pistas
       
       frame.setSize(5700,5000);
       frame.setBounds(100, 100, 1650,800);
       
       helps.setBounds(13, 126, 35, 795);
       
       
       Container contHelps=helps.getContentPane();
       contHelps.setLayout(new FlowLayout());
       
      
       JButton shuffle=new JButton("Shuffle"); //button gia shuffle pistas
       
       
        contHelps.setVisible(true);
       
      
       contHelps.add(shuffle);
       
       frame.setVisible(true);
       Container cont=frame.getContentPane();
       
       Game g1=new Game();          //dimiourgia adikimenu pexnidiou gia dimiourgia piston,,kai gia xrisi olon ton methodos
       Plaketes [][]a=g1.pistaCreate(x); //dimiuourgia pistas
     
       
       
       GridLayout grid=new GridLayout(a.length,a[0].length);        //dimiuorgia gridlaytoyt me basi ta dimension tis pista pou dimiourgithike
       cont.setLayout(grid);
       JButton [][]buttons=new JButton[a.length][a[0].length]; //dimiourgia enos pinaka gia na balo ola ta koubia,me dimension opos pano
       
       
       
       for(int i=0;i<a.length;i++){                     //s kathe thesi i opia dn einai null,,,isagogi stin adistixi thesi tou pinaka
                                                        //ton JButton to katalilo button 
           for (int j=0;j<a[0].length;j++){
                if (a[i][j]==null){       //otan einai null i thesi isagogi null ston pinaka koubion
                      JButton b=new JButton();                 
                       b.setBounds(310, 290, 42, 46);
                       b.setEnabled(false);
                       buttons[i][j]=null;
                       cont.add(b);
                    
                
                
                }
                else{          //otan i thesi dn einai null
                   JButton koubi= a[i][j].buttonReturn(); //epistrofi enos koubiou,me basi to tile
                   koubi.addActionListener((ActionEvent e) -> { //to opio eexi axtion listener otan patithi na gini prasino kai na kalesi 
                                                                //tin methodo buttonCheck gia na ginoun oi elegxoi
                     
                       koubi.setBackground(Color.green);
                       g1.buttonCheck(koubi,buttons,a);
                      
                       });
                    buttons[i][j]=koubi;      //eisagogi tou koubi ston pinaka koubion
                    cont.add(koubi);
                
                }
           
           }
       }
       
        JButton nextMove=new JButton("Next Move");          //dimiourgia tou koubi boithias nextMove
      
        nextMove.addActionListener((ActionEvent e) -> {
          
            g1.helpMove(buttons,a);
            
          
       });
        
        JButton deleteTiles=new JButton("DeletePair");       //dimiorugia tou koubiou boithis deleteTiles
        deleteTiles.addActionListener((ActionEvent e) -> {
            
            g1.deletePair(buttons);
            g1.hasMove(buttons);
            g1.isEmpty(buttons);
            
          
       });
        
        
        
    
        
    contHelps.add(deleteTiles);       //add ton koubion
    contHelps.add(nextMove);
    helps.setVisible(true);
   
         
       
       shuffle.addActionListener((ActionEvent e) -> {         //action listener tou shuffle
         
          cont.removeAll(); //arxika kanei remove ola ta compoments
          GridLayout grid1=new GridLayout(a.length,a[0].length);//dimiourgi ena kainourgio layoyut
          cont.setLayout(grid1);
          g1.shufflePista(buttons);         //knaie suffle ta koubia me tin medthodo shufflePista stin klasi GAME
          for(int i=0;i<a.length;i++){
           for (int j=0;j<a[0].length;j++){
                if (buttons[i][j]==null){                   //otan einai null i thesi bazoume ena adio koubi
                      JButton b=new JButton();
                       b.setBounds(310, 290, 42, 46);
                       b.setEnabled(false);
                       buttons[i][j]=null;
                       cont.add(b);
                    
                
                
                }
                else{        //otan dn einai null i thesi bazoume sto container to adistixo koubi
                   
                  
                    
                    cont.add(buttons[i][j]);
                
                }
           
           }
       }
          
          frame.setContentPane(cont);

        });
       
       
      
     frame.setLocationRelativeTo(null);
       frame.pack(); //pack tis pistas
      
       
       //DIALOG
     if(fores==true){ //fores = gia na min 3anaemfanisti to dialog deuteri fora
       FlowLayout flo1=new FlowLayout();        //DIMIOURGIA enos layoyt,panel.kai dialog to opio benei mesa sto frame
       JPanel popUp=new JPanel(flo1);
       
       JDialog dialog=new JDialog(frame,"Epelse pista",true);
      
       dialog.setBounds(1700,100,700,300);
       dialog.setLocationRelativeTo(null);
       
       
       
       ImageIcon imageAsteraki=new ImageIcon("tiles/asteraki.png");            //oi eikones ton piston
       ImageIcon imageTetragono=new ImageIcon("tiles/tetragono.png");
       ImageIcon imageParalilogramo=new ImageIcon("tiles/paralilogramo.png");
       
       JButton asteraki=new JButton(imageAsteraki);         //koubi pou  adistixi stin fotografia  me to asteraki otan patithi
       asteraki.setPreferredSize(new Dimension(230, 200));
       asteraki.addActionListener((ActionEvent e) -> {
           dialog.dispose();                          //otan patithi to koubi simnenei oti epelekse ali pista.
                                                      //opote klino to dialog..klino to frame..kai 3anakano tin start
                                                       //na dimiourgia alo frame,,me pistaCreate(3)..dld alazi tin diataksi
           frame.dispose();
           Start(3,false);
          
        });
       
       JButton paralilogramo=new JButton(imageParalilogramo);      //to idio opos pano
       paralilogramo.setPreferredSize(new Dimension(200, 120));
       paralilogramo.addActionListener((ActionEvent e) -> {
           
           dialog.dispose();
           frame.dispose();
           helps.dispose();
           Start(4,false);
          
        });
       
       JButton tetragono=new JButton(imageTetragono);           //to idio opos pano
       tetragono.setPreferredSize(new Dimension(220, 150));
       tetragono.addActionListener((ActionEvent e) -> {
           dialog.dispose();
           helps.dispose();
           frame.dispose();
           Start(1,false);
          
        });
       
       JButton keepPlaying=new JButton("Keep Playing");            //otan patithi to keepPLaying simenei oti dn epelse ali pista
       keepPlaying.setPreferredSize(new Dimension(150, 40));   //ara klino mono to dialog,kai emfanizo boithies
       keepPlaying.addActionListener((ActionEvent e) -> {
           helps.dispose();
           dialog.dispose();
           helps.setVisible(true);
           
          
        });
       
       popUp.add(paralilogramo);      //isagogi ton koubion sto layout tou dialog
       
       popUp.add(asteraki);
   
       popUp.add(tetragono);
       popUp.add(keepPlaying);
       dialog.add(popUp);              //isagogi tou layout sto dialog
    
       dialog.setVisible(true);
     
       
     
     }
    
        
       
        
       
    }
    
   public void rules(){                          //koubi tou rules,,pou otan patithi emfanizi text s ena frame
       JFrame frame=new JFrame("Rules");
       
     
       frame.setSize(1100,700);
       frame.setLocationRelativeTo(null);
       frame.setVisible(true);
       Container cont=frame.getContentPane();
       FlowLayout flo=new FlowLayout();
       frame.setBackground(Color.black);
       cont.setLayout(flo);
       JTextArea text=new JTextArea("Για να αφαιρέσει ο παίκτης ένα ζευγάρι πλακιδίων θα πρέπει να ισχύουν οι ακόλουθες\n" +
                                "συνθήκες:\n" +
                                "▪ Αν τα πλακίδια του ζευγαριού προέρχονται από τις ομάδες χαρακτήρων, κύκλων και\n" +
                                "μπαμπού, τότε θα πρέπει να είναι πανομοιότυπα.\n" +
                                "▪ Ειδικά για τα πλακίδια εποχών και λουλουδιών, ο παίκτης μπορεί να συνδυάσει\n" +
                                "οποιαδήποτε πλακίδια από την ίδια κατηγορία.\n" +
                                "▪ Κάθε πλακίδιο του ζευγαριού θα πρέπει να είναι ελεύθερο. Δηλαδή να μην υπάρχει\n" +
                                "άλλο γειτονικό πλακίδιο που να βρίσκεται στα αριστερά ή στα δεξιά του.");
       text.setFont(new Font("Arial",Font.PLAIN,26));
       text.setForeground(Color.red);
       text.setBackground(Color.gray);
       
       text.setEnabled(false);
       cont.setBackground(Color.gray);
       cont.add(text);
       frame.pack();
       
   }
   
   public void playerInfo(){ //koubi tou playertinfo,,pou otan patithi emfanizi text  ne ta stixia ton melon s ena frame
       
       JFrame frame=new JFrame("Player Info");
       
     
       frame.setSize(1100,700);
       frame.setBounds(810, 400, 500, 500);
       frame.setVisible(true);
       Container cont=frame.getContentPane();
       FlowLayout flo=new FlowLayout();
       frame.setBackground(Color.black);
       cont.setLayout(flo);
       JButton enter=new JButton("ENTER");
       enter.addActionListener((ActionEvent e) -> {        //kai otan patithi enter na klisi to frame
           frame.dispose();
        });
       
       JLabel onomaEponimo=new JLabel("Onomateponimo:");
       
       JTextField stixia=new JTextField("                                               ");
     
  
       
       cont.setBackground(Color.gray);
       cont.add(onomaEponimo);
       cont.add(stixia);
       cont.add(enter);
       
       frame.pack();
       
   
   
   }
   public void credits(){                //to idio opos pano 
       JFrame frame=new JFrame("Creators");
       
     
       frame.setSize(100,100);
       frame.setBounds(710, 400, 500, 150);
       frame.setVisible(true);
       Container cont=frame.getContentPane();
       FlowLayout flo=new FlowLayout();
      
       cont.setLayout(flo);
       
       JLabel epikefalida = new JLabel("CREATORS OF THIS APP");
       epikefalida.setFont(new Font("Arial",Font.PLAIN,30));
       
       
       JLabel melos1 = new JLabel("Apostolis Dolmes || icsd14047");
       JLabel melos2 = new JLabel("&  Giannis Pyrgas   || icsd14167");
       
       cont.setBackground(Color.gray);
       cont.add(epikefalida);
       cont.add(melos1);
       cont.add(melos2);
   }
   
   
   
   
   
    
    
    
}
