
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Me
 */
class IconLabel extends JLabel {

  public IconLabel(String img) {
    this(new ImageIcon(img));
  }

  public IconLabel(ImageIcon icon) {
    setIcon(icon);
    
    setIconTextGap(0);
 
    setBorder(null);
    setText(null);
    setSize(icon.getImage().getWidth(null), icon.getImage().getHeight(null));
  }

}
