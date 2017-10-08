package communityuni.com.ui;

import javax.swing.*;

/**
 * Created by cafe on 04/06/2017.
 */
public class SanPhamUI extends JFrame {
    public SanPhamUI(String title)
    {
        super(title);
        setContentPane(new SanPhamPanel().getPnMain());
    }
    public void showWindow()
    {

        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setVisible(true);
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // If Nimbus is not available, you can set the GUI to another look and feel.
            JOptionPane.showMessageDialog(null,e.toString());
        }
    }
}
