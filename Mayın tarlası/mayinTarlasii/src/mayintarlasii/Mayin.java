
package Mayin;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import mayintarlasii.ResimMyn;
/**
 *
 * @author Denzk
 */
public class Mayin implements ActionListener {
    //bu sınıfın adı extends mayintarlasii 
    protected int kolonsys;
     protected int sutunsys;
      protected int mayinsys;
      JButton [][] buton;
      int [][] myn;
      int yasam;
     int i;
   int j;
      public void actionPerformed (ActionEvent e) {
          
        JButton butn = (JButton)e.getSource();
          Point resim = getArrayLocation(butn);
          if(myn[resim.x][resim.y]<0) {
              buton[resim.x][resim.y].setText("  ");
              gameover();
          }
          else if(myn[resim.x][resim.y]>0) {
              if(buton[resim.x][resim.y].getActionCommand()=="doldur");
              if(myn[resim.x][resim.y]==1) {
                  
                  buton[resim.x][resim.y].setText(" " + myn[resim.x][resim.y]);
                   buton[resim.x][resim.y].setOpaque(true);
                    buton[resim.x][resim.y].setForeground(Color.blue);
               
              }
              if(myn[resim.x][resim.y]==2){
                  buton[resim.x][resim.y].setText(" " + myn[resim.x][resim.y]);
                  buton[resim.x][resim.y].setOpaque(true);
                  buton[resim.x][resim.y].setForeground(Color.yellow);
              }
               if(myn[resim.x][resim.y]==3){
               buton[resim.x][resim.y].setText(" " + myn[resim.x][resim.y]);
               buton[resim.x][resim.y].setOpaque(true);
                  buton[resim.x][resim.y].setForeground(Color.red);
          }
               if(myn[resim.x][resim.y]>3){
        buton[resim.x][resim.y].setText(" " + myn[resim.x][resim.y]);
        buton[resim.x][resim.y].setOpaque(true);
         buton[resim.x][resim.y].setForeground(Color.green);
      }
               yasam--;
               if(yasam==0)
                   JOptionPane.showMessageDialog(null, "Başardın", "sonuc", JOptionPane.INFORMATION_MESSAGE);
    
}
      
else if(myn[resim.x][resim.y]==0) {
    butonac(resim.x, resim.y);
}
 }


public void gameover() {

 ResimMyn rm = new ResimMyn() ;

for(int i=0; i<myn.length; i++){
for(int j=0; j<myn.length; j++) {
if(myn[i][j]<0) {
    buton [i][j].setText("  ");
    ImageIcon myn = rm.myn();
    buton[i][j].setOpaque(true);
    buton[i][j].setForeground(Color.RED);
    buton[i][j].setIcon(myn);
}
else if(myn[i][j]==0) {
    buton[i][j].setText("  ");
    buton[i][j].setOpaque(true);
    buton[i][j].setForeground(Color.yellow);
}
else{
    buton[i][j].setText(""+ myn[i][j]);
    if(myn[i][j]==1) {
        buton[i][j].setText(""+ myn[i][j]);
        buton[i][j].setOpaque(true);
    buton[i][j].setForeground(Color.green);
    }
    if(myn[i][j]==2) {
        buton[i][j].setText(""+ myn[i][j]);
        buton[i][j].setOpaque(true);
    buton[i][j].setForeground(Color.cyan);
    }
    if(myn[i][j]==3) {
        buton[i][j].setText(""+ myn[i][j]);
        buton[i][j].setOpaque(true);
    buton[i][j].setForeground(Color.BLUE);
    }
     if(myn[i][j]>3) {
        buton[i][j].setText(""+ myn[i][j]);
        buton[i][j].setOpaque(true);
    buton[i][j].setForeground(Color.red);
    
}
}}}
JOptionPane.showMessageDialog(null, "Oyun Bitti", "Mayın Tarlası",JOptionPane.INFORMATION_MESSAGE );

}
public void butonac(int x, int y) {
if(x<0 || y<0 || x>buton.length-1 || y>buton.length-1)
return;
if (buton[x][y].getText()=="  ") {
    
    if(myn[x][y]>0) {
        if(myn[x][y]==1) {
            buton[x][y].setText(" "+ myn[x][y]);
            buton[x][y].setOpaque(true);
            buton[x][y].setForeground(Color.GREEN);
            
        }
        if(myn[x][y]==2) {
            buton[x][y].setText(" "+ myn[x][y]);
            buton[x][y].setOpaque(true);
            buton[x][y].setForeground(Color.yellow);
        }
         if(myn[x][y]==3) {
        buton[x][y].setText(" "+ myn[x][y]);
            buton[x][y].setOpaque(true);
            buton[x][y].setForeground(Color.cyan);
    }
         if(myn[x][y]>3) {
             buton[x][y].setText(" "+ myn[x][y]);
             buton[x][y].setOpaque(true);
             buton[x][y].setForeground(Color.red);
         }
         yasam--;
         if(yasam==0)
             JOptionPane.showMessageDialog(null, "Kazandınız", "sonuc", JOptionPane.INFORMATION_MESSAGE);
}
    if(myn[x][y]==0) {
        buton[x][y].setText("  ");
        buton[x][y].setOpaque(true);
    buton[x][y].setForeground(Color.white);
    
    yasam--;
    if(yasam==0)
        JOptionPane.showMessageDialog(null, "Kazandınız", "sonuc", JOptionPane.INFORMATION_MESSAGE );
    
    butonac(x-1, y-1); butonac(x-1, y+1); butonac(x+1, y); butonac(x+1, y-1);
    butonac(x-1,y); butonac(x, y+1); butonac(x, y-1); butonac(x+1, y+1);
    }
}}

public Point getArrayLocation(JButton butn){
Point pt = new Point(-1, -1) ;
for(int j=0; j<buton.length; j++) {
for( int k= 0; k<buton[j].length; k++) {
if(buton[j][k]==butn) {
pt.setLocation(j,k);
return pt;

}
}
}
return pt;
}

public JPanel getContent() {
JPanel panel = new JPanel (new GridBagLayout());
GridBagConstraints gbc = new GridBagConstraints();
gbc.weighty = 1.0;
gbc.weightx = 1.0;
for(int j = 0; j<buton.length; j++ ) {
for(int k = 0; k< buton[j].length; k++){
int n = j*buton[j].length + k+ 1;
buton[j][k]= new JButton("  ");
buton[j][k].addActionListener(this);
buton[j][k].setActionCommand("Doldur");
gbc.gridwidth = (k<buton[j].length-1) ? 1 : GridBagConstraints.REMAINDER;
panel.add(buton[j][k], gbc);

}
}
return panel;
}

public Mayin(int kolonsys, int sutunsys, int mayinsys) {
       this.kolonsys = kolonsys;
       this.sutunsys = sutunsys;
       this.mayinsys = mayinsys;
       buton = new JButton[kolonsys][sutunsys];
       myn = new int[kolonsys][sutunsys];
       Random rnd = new Random();
       int x,y;
    
       for(i=0; i<myn.length; i++){
           
           for(j=0; j<myn.length; j++) {
               myn[i][j]=0;
           }
       }
for(int j=0; j<mayinsys; j++) {
    
    x= rnd.nextInt(kolonsys);
    y= rnd.nextInt(sutunsys);
    if(myn[x][y]<0){
        j--;
        continue;
        
    }
        myn[x][y]=-100;
         try{myn[x-1][y]++;}catch(Exception e){}
         try{myn[x+1][y]++;}catch(Exception e){}
         try{myn[x][y-1]++;}catch(Exception e){}
         try{myn[x][y+1]++;}catch(Exception e){}
         try{myn[x-1][y-1]++;}catch(Exception e){}
         try{myn[x-1][y+1]++;}catch(Exception e){}
         try{myn[x+1][y-1]++;}catch(Exception e){}
         try{myn[x+1][y+1]++;}catch(Exception e){}
    }
}
}




    

       





     
      

