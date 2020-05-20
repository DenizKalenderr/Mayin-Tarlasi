
package mayintarlasii;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class anaEkran {
    
   protected int kolonsys = 9;
   protected int sutunsys = 9;
   protected int mayinsys = 10;
   JFrame fr = new JFrame ("Mayın Tarlası");
   
   public static void main (String[] args) {
     anaEkran ekr = new anaEkran();
      ekr.ilkEkran();
   }
   public void ilkEkran() {
       
       fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       fr.getContentPane().add(new Mayin(9,9,10).getContent());
       fr.setSize(550, 450);
       fr.setLocation(300, 100);
       fr.setVisible(true);
    JMenuBar secim = new JMenuBar();
     secim.setSize(550,100);
      oyunTercihleri(secim);
      fr.setJMenuBar(secim);
      fr.repaint();
      fr.revalidate();
    
   }
   
   public void oyunTercihleri(JMenuBar secim) {
       JMenu dosya = new JMenu("Oyun");
       secim.add(dosya);
       JMenuItem Yeni = new JMenuItem("Yeni");
       dosya.add(Yeni);
       JMenuItem Acemi = new JMenuItem ("Acemi");
       dosya.add(Acemi);
       JMenuItem ortaDuzey = new JMenuItem ("Orta Düzey");
       dosya.add(ortaDuzey);
       JMenuItem Zor = new JMenuItem ("Zor");
       dosya.add(Zor);
       JMenuItem cikis = new JMenuItem ("Çıkış");
       dosya.add(cikis);
       
   
cikis.addActionListener(new ActionListener() {
       
   
        @Override
             public void actionPerformed(ActionEvent e) {
           System.exit(0);
  }
});
             
   Yeni.addActionListener(new ActionListener() {
       
       public void actionPermormed(ActionEvent e) {
       
       fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           fr.setVisible(false);
           anaEkran ekr = new anaEkran();
           JFrame frame = new JFrame("Oyun");
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.getContentPane().add(new Mayin(9,9,10).getContent);
           frame.setSize(550, 450);
           frame.setLocation(300, 100);
           frame.setVisible(true);
           JMenuBar tercih= new JMenuBar();
           frame.setJMenuBar(tercih);
           ekr.oyunTercihleri(tercih);
           ekr.fr = frame;
           }

           @Override
           public void actionPerformed(ActionEvent ae) {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          
           }

   });
    
   Acemi.addActionListener(new ActionListener() {
       
       @Override
       public void actionPerformed(ActionEvent e) {
           
           fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           fr.setVisible(false);
           anaEkran ekr = new anaEkran();
           JFrame frame = new JFrame("Oyun");
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.getContentPane().add(new Mayin(9,9,10));
           frame.setSize(550, 450);
           frame.setLocation(300, 100);
           frame.setVisible(true);
           JMenuBar tercih = new JMenuBar();
           frame.setJMenuBar(tercih);
           ekr.oyunTercihleri(tercih);
           ekr.fr = frame;
           
       }
   });
   
   ortaDuzey.addActionListener(new ActionListener() {
   
   @Override
   public void actionPerformed(ActionEvent e) {
       
       fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       fr.setVisible(false);
       anaEkran ekr = new anaEkran();
       JFrame frame = new JFrame("Oyun");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.getContentPane().add(new Mayin(16,16,40).getContent());
       frame.setSize(700, 500);
       frame.setLocation(300, 50);
       frame.setVisible(true);
       JMenuBar tercih = new JMenuBar();
       frame.setJMenuBar(tercih);
       ekr.oyunTercihleri(tercih);
       ekr.fr= frame;
       
   }
});
   
   Zor.addActionListener(new ActionListener() {
       
       @Override
       public void actionPerformed(ActionEvent e) {
           
           fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       fr.setVisible(false);
       anaEkran ekr = new anaEkran();
       JFrame frame = new JFrame("Oyun");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.getContentPane().add(new Mayin(16,30,99).getContent());
       frame.setSize(1500, 650);
       frame.setLocation(200, 30);
       frame.setVisible(true);
       JMenuBar tercih = new JMenuBar();
       frame.setJMenuBar(tercih);
       ekr.oyunTercihleri(tercih);
       ekr.fr= frame;
       }
   });
      
   
   }

    private JMenuBar JMenuBar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
 

   

    