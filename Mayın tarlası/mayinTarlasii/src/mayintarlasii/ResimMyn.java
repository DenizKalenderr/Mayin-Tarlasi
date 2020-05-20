/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayintarlasii;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;

public class ResimMyn extends mayintarlasii{

    public ImageIcon myn() {
       
     java.net.URL dosyaYolu = getClass().getResource("mayin.jpg");
     ImageIcon resim = new ImageIcon(dosyaYolu);
        return resim;
    }
}
    

