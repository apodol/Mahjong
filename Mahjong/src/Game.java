//Apostolis Dolmes icsd14047
//Giannis Pyrgas icsd14167
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;       
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class Game {
    private JButton []koubia=new JButton[2];  //dimiourgia enos pinaka me 2 koubia,gia na ginoun oi sigrisis sthn methodo buttonCheck
    
    private ArrayList <Plaketes> listaTiles; //lista me ta tiles..gia na ginei collection.shuffle,,kai epita na boun tixea s enan pinaka me tin diataksi
    public Game(){
      
        
        
        
        listaTiles=new ArrayList(); //dimiourgia lista me tiles,,gia na tin anadiatakso tixea me tin Collections.shuffle.
                                    //etsi oste na boro na pernao ena ena me tin sira,ta tixea tiles ston katalilo pinaka
        ArrayList<JButton> buttons=new ArrayList();
        for (int i=0;i<4;i++){                     //dimiourgia 36 xaraktiron
              for (int j=1;j<=9;j++){
                  Xaraktiras x=new Xaraktiras(j);
                  listaTiles.add(x);
              }
        }
         for (int i=0;i<4;i++){                  //dimiourgia 36 kiklon
              for (int j=1;j<=9;j++){
                  Kiklos k=new Kiklos(j);
                  listaTiles.add(k);
              }
        }
         for (int i=0;i<4;i++){              //dimiourgia 36 babou
              for (int j=1;j<=9;j++){
                  Babou b=new Babou(j);
                  listaTiles.add(b);
              }
        }
         for (int i=0;i<2;i++){               //dimiourgia 8 epoxon
              for (int j=1;j<=4;j++){
                  Epoxes e=new Epoxes(j);
                  listaTiles.add(e);
              }
        }
         for (int i=0;i<2;i++){            //dimiourgia 8 louloudion
              for (int j=1;j<=4;j++){
                  Louloudia l=new Louloudia(j);
                  listaTiles.add(l);
              }
        }
         
         Collections.shuffle(listaTiles); // Anatopo8etisi ton plakidion stin lista tixea 
         
         
         
    }
        
    
    public Plaketes[][] pistaCreate(int arithmosPistas)
    {
                //dimiourgia enos pinaka s sxima tetragono,,opou exei 1 bazo tiles,,k opou 0 null
       int[][] tetragono = new int[][]{
         { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 ,1 },
         { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 ,1 },
         { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 ,1 },
         { 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1 ,1 },
         { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 ,1 },
         { 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1 ,1 },
         { 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1 ,1 },
         { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 ,1 },
         { 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1 ,1 },
         { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 ,1 },
         { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 ,1 },
         { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 ,1 }      
         
       };
       
       int[][] asteraki = new int[][]{                            //dimiourgia pinaka se sxima asteraki
         { 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0 },
         { 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0 },
         { 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0 },
         { 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0 },
         { 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0 },
         { 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0 },
         { 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0 },
         { 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1 },
         { 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1 },
         { 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0 },
         { 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0 },
         { 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0 },
         { 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0 },
         { 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0 },
         { 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0 },
         { 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0 }
    
       };
       
       int[][] piramida = new int[][]{                             //dimiourgia pinaka s sxima piramidas
         { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },  
         { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
         { 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
         { 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
         { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0 },
         { 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0 },
         { 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0 },
         { 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0 },
         { 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0 },
         { 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0 },
         { 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0 },
         { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }
      
       };
       
       int[][] paralilogramo = new int[][]{                          //dimiourgia pinaka s sxima paralilogramo
         { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 ,1, 1, 1, 1, 1 },
         { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 ,1, 1, 1, 1, 1 },
         { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 ,1, 1, 1, 1, 1 },
         { 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1 ,1, 1, 1, 1, 1 },
         { 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1 ,1, 1, 1, 1, 1 },
         { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 ,1, 1, 1, 1, 1 },
         { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 ,1, 1, 1, 1, 1 },
         { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 ,1, 1, 1, 1, 1 }
      
       };
       
       Plaketes [][]Pista;               //dimiourgia tou pinaka pou tha exei ta tiles
       
       if (arithmosPistas==1){             //1=tetragono
          Pista=new Plaketes[12][12];        //dimiourgia tou pinaka me ta tiles me tin katalili stixisi
           
       
          int indexListas=0;             //to index tis lista pou 8a anebenei pio kato kata 1 kathe fora p dn einai null kai na bazo to epomeno stixio
          for (int i=0;i<12;i++){
             for (int j=0;j<12;j++){
                  if (tetragono[i][j]==1){ //opou o pinakas sxediou exei 1,,bazoume to tile,,stin adistixi 8esi tou pinaka me ta tils
                     Pista[i][j]=listaTiles.get(indexListas);                
                     indexListas=indexListas+1;
                    }
                  else                     //opou o pinakas sxediou exei 0,,, bazoume null
                     Pista[i][j]=null;
                   
                }
            }
          return Pista;                         //return tou pinaka me ta tiles
        }
       else if (arithmosPistas==2){                //to idio gia asteraki
            Pista=new Plaketes[12][21];
            int indexListas=0;
            for (int i=0;i<12;i++){
                for (int j=0;j<21;j++){
                  if (piramida[i][j]==1){
                     Pista[i][j]=listaTiles.get(indexListas);
                     indexListas=indexListas+1;
                    }
                   else
                     Pista[i][j]=null;
                   
                }
            }
            return Pista;
        }
        else if (arithmosPistas==3){                //to idio gia piramida
            Pista=new Plaketes[16][15];
            int indexListas=0;
            for (int i=0;i<16;i++){
                for (int j=0;j<15;j++){
                  if (asteraki[i][j]==1){
                     Pista[i][j]=listaTiles.get(indexListas);
                     indexListas=indexListas+1;
                    }
                   else
                     Pista[i][j]=null;
                   
                }
            }
            return Pista;
        }
        else if (arithmosPistas==4){                //to idio gia paralilogramo
            Pista=new Plaketes[8][16];
            int indexListas=0;
            for (int i=0;i<8;i++){
                for (int j=0;j<16;j++){
                  if (paralilogramo[i][j]==1){
                     Pista[i][j]=listaTiles.get(indexListas);
                     indexListas=indexListas+1;
                    }
                   else
                     Pista[i][j]=null;
                   
                }
            }
            return Pista;
        }
       return null;
       
       
            
       
    }
    
   
        
  
    
    public boolean hasMove(JButton pista[][]){           //gia kathe eleuthero ,psaxnei na bri an iparxi tile,ektos tou eautou tou,p na einai idio
                                                        //sigrinodas tis eikones
       for (int i=0;i<pista.length;i++){
            for (int j=0;j<pista[0].length;j++){
                if (pista[i][j]!=null){
                     if (isFree(pista,i,j)){
                         for (int x=0;x<pista.length;x++){
                             for(int y=0;y<pista[0].length;y++){
                                    if (pista[x][y]!=null){
                                        if (isFree(pista,x,y)){
                                          if(pista[i][j].getIcon().toString().equals(pista[x][y].getIcon().toString()) && (pista[i][j]!=pista[x][y])){
                                           ;
                                             return false;
                                             
                                          }
                                          
                                          
                                    
                                    }}
                             
                             }
                         }
                        
                }}
            }}
         JOptionPane.showMessageDialog(null, "....GAME OVER....");
        return false;
    }
    
   public void helpMove(JButton pista[][],Plaketes [][]tiles){            //idios kodikas me thn hasMove,,mono pou alazi to xroma ton koubion gia tin boithia
         for (int i=0;i<pista.length;i++){
            for (int j=0;j<pista[0].length;j++){
                if (pista[i][j]!=null){
                     if (isFree(pista,i,j)){
                         for (int x=0;x<pista.length;x++){
                             for(int y=0;y<pista[0].length;y++){
                                    if (pista[x][y]!=null){
                                        if (isFree(pista,x,y)){
                                          if(pista[i][j].getIcon().toString().equals(pista[x][y].getIcon().toString()) && (pista[i][j]!=pista[x][y])){
                                             pista[i][j].setBackground(Color.red);
                                             pista[x][y].setBackground(Color.red);
                                            return;
                                             
                                          }
                                          
                                          
                                    
                                    }}
                             
                             }
                         }
                        
                }}
            }}
    }
    
    public boolean isFree(JButton pista[][],int sira,int stili){
       try{ //petaei error an to stili+1 einai out of bounds,,auto omos simenei oti einai kai eleu8euro,,opote otan piasi to exception,,return true
        if(pista[sira][stili+1]==null|| pista[sira][stili-1]==null){ //elegxos an de3ia k aristera einai eleuthero,..
           
            return true;
            
        }
        else{
           
        
            return false;}
        
        
        
        }
       catch(ArrayIndexOutOfBoundsException ignored) {
           
           
                return true;
       
       }

            
    
    }
    
  
    public boolean isEmpty(JButton pista[][]){            //emfanisi oloon ton eleutheron
        
         
            for (int i=0;i<pista.length;i++){        //an bri esto k ena stiixo pou dn einai null tote dn einai adia
                for (int j=0;j<pista[0].length;j++){
                    if(pista[i][j]!=null){
                          return false;
                       
                        }     
                    }
                }
          
                   JOptionPane.showMessageDialog(null, "....YOU WIN....");//edo erxete mono an dn bei pano,pou simnei oti einai ola NULL,ara nikise
            
            return true;
                
    }
    
  

    
    public void shufflePista(JButton pista[][]){ //anadiata3i tou pinakas os e3is: alagi kathe stixiou,,me ena alo tixeo simio
        JButton temp=new JButton();
        Random input=new Random();
        int sira=input.nextInt(pista.length);       //tixea sira kai stili gia alagi stixion,,
        int stili=input.nextInt(pista[0].length);
        
        for (int i=0;i<pista.length;i++){              //gia kathe stixio
            for (int j=0;j<pista[0].length;j++){
                if (pista[i][j]!=null){        //      p dn einai null
                while(pista[sira][stili]==null){              //anathesi tixeas siras kai stilis, p to stixio tou dn einai null
                    sira=input.nextInt(pista.length); 
                   stili=input.nextInt(pista[0].length);
                }
                temp=pista[i][j];                   //alagi ton stixion
                pista[i][j]=pista[sira][stili];
                pista[sira][stili]=temp;
                
                }
                
                
                    
            }}
        
        }
        
    
    
  public void deletePair(JButton [][]pista){
      
      for (int i=0;i<pista.length;i++){                 //gia kathe ena tile,,to opio einai eletheuro psaxno na bro allo tile p einai idia,
                                                        //k otan brethi ta apergopio,k kano tin thesi tous ston pinaka NULL
            for (int j=0;j<pista[0].length;j++){
                if (pista[i][j]!=null){
                     if (isFree(pista,i,j)){
                         for (int x=0;x<pista.length;x++){
                             for(int y=0;y<pista[0].length;y++){
                                    if (pista[x][y]!=null){
                                        if (isFree(pista,x,y)){
                                          if(pista[i][j].getIcon().toString().equals(pista[x][y].getIcon().toString()) && (pista[i][j]!=pista[x][y])){
                                             pista[i][j].setEnabled(false);
                                             pista[x][y].setEnabled(false);
                                             pista[i][j]=null;
                                             pista[x][y]=null;
                                             
                                            
                                             return;
                                             
                                          }
                                          
                                          
                                    
                                    }}
                             
                             }
                         }
                        
                }}
            }}
    }
  
  
    
    public boolean buttonCheck(JButton but1,JButton pinakasKoubion[][],Plaketes[][]tiles){
        //perni orisma to button pou patithike,,to opio to apothikeui ston ditheseo pinaka o opios dimiourgithike stin arxi tis klalasis
        //pernei orisma ton pinaka me ta koubia,,kai ton pinaka me ta tiles
        boolean a=false;     //xrisimopiite gia na do an to button  pou perasa,einai eleuthero
      
        
        for (int i=0;i<pinakasKoubion.length;i++){
            for(int j=0;j<pinakasKoubion[0].length;j++){
                if(pinakasKoubion[i][j]==but1){
                   
                     a=isFree(pinakasKoubion,i,j);             //an to button pou perasa einai eleuthero,a=true
                   
                }
            
            }
        }
        
        if (a==true){                 //efoson einai eleuthero
              
            if(koubia[0]==null){ //an i proti thesi tou dithesiou pinaka einai null,simenei oti dn iparxi koubi,,ara bazzoume to koubi stin thesi 1
                koubia[0]=but1;}
            else{          //an i proti thesi dn einai null,simenei oti exei koubi,,ara prepei na metakiniso to iparxon koubi stin epomeni thesi
                        //kai to koubi pou perastike benei stin proti thesi,,gia na ginoun oi elegxoi pio kato
                koubia[1]=koubia[0];
                koubia[0]=but1;
                if(koubia[0].getIcon().toString().equals(koubia[1].getIcon().toString())&&( koubia[0]!=koubia[1])){ //an ta koubia einai idia
                   koubia[1].setEnabled(false);  //apenergopiisi ton idion koubion
                   koubia[0].setEnabled(false);
                   for (int i=0;i<pinakasKoubion.length;i++){
                        for(int j=0;j<pinakasKoubion[0].length;j++){
                           if(pinakasKoubion[i][j]==koubia[0]){      //psaxno ston pinaka OLON ton koubion,,na bro ta dio koubia tou dithesiou pinaka
                                                                     //kai kano tis theseis null
                                pinakasKoubion[i][j]=null;}
                           if(pinakasKoubion[i][j]==koubia[1]){
                                pinakasKoubion[i][j]=null;}
                         }
                    }
                   koubia[1].setBackground(UIManager.getColor("Button.background"));
                   koubia[0].setBackground(UIManager.getColor("Button.background"));
                   
                   
                   koubia[0]=null;//efoson diagrafika ta koubia,,kano tis dio theseis tou diseou pinaka null,,gia na er8ou ta epomeno koubia pou 8a pati8oun
                   koubia[1]=null;
                   hasMove(pinakasKoubion); //elegxos meta tin diagrafi ton koubion,,an iparxi alli kinisi
                   
                   isEmpty(pinakasKoubion);//elegxos meta tin diagrafi ton koubion,,an h pista katharistike
                   
                }
                
                else{ //efoson ta koubia pou patithikan dn einai idia,,,ta alazo to xroma piso sto default. kai kano tis theseis tou dithesou pinaka NULL
                    koubia[1].setBackground(UIManager.getColor("Button.background"));
                    koubia[0].setBackground(UIManager.getColor("Button.background"));
                    koubia[1]=null;
                    koubia[0]=null;

                }
           
             
                
                
            }}
        else { //alios an patithi koubi to opio dn einai free...emfanizi enos messagedialog me to kalilo minima
            
            JOptionPane.showMessageDialog(null, "To tile den einai eleuthero");

            but1.setBackground(UIManager.getColor("Button.background")); //kai alagi tou xroma tous tou koubiou pou patithike sto default
        
        }
        

        return a;
    }
    
}
