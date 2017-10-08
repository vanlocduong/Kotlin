package UI;

import javax.swing.*;

public class SanPhamUI extends JFrame {
    public  SanPhamUI(String title){
        super(title);
        setContentPane(new FormMain().getPmain());

    }
    public  void showWindows(){
        setSize(300,250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
