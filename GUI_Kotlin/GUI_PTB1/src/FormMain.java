import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormMain {
    private JPanel pmain;
    private JTextField txthesoa;
    private JTextField txthesob;
    private JButton btngiai;
    private JButton btntiep;
    private JButton btnthoat;
    private JLabel txtketqua;

    public FormMain() {

        btngiai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // giai phuong trinh bac nhat
                double a = Double.parseDouble(txthesoa.getText());
                double b = Double.parseDouble(txthesob.getText());
                if(a == b){
                    txtketqua.setText("Phuong trinh vo so nghiem");
                }else if(a == 0 && b != 0){
                    txtketqua.setText("Phuong trinh vo nghiem ");
                }else{
                    txtketqua.setText("c = " + -b/ a);
                }

            }
        });
        btntiep.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txthesoa.setText("");
                txthesob.setText("");
                txtketqua.setText("");
                txthesoa.requestFocus();

            }
        });
        btnthoat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }
        });
    }

    public JPanel getPmain() {
        return pmain;
    }
}
