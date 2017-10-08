package UI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.util.Vector;

public class FormMain {
    private JPanel pmain;
    private JTable tbsanpham;
    private JPanel jpanchitietsanpham;
    private JTextField txtmasanpham;
    private JTextField txttensanpham;
    private JTextField txtdongia;
    private JButton txtluu;
    private JButton txttiep;
    private JButton txtxoa;
    private JButton txtthoat;
    private  JTable jTablesanpham;
    private DefaultTableModel defaultTableModelsanpham;

    public JPanel getPmain() {
        return pmain;
    }

    public FormMain() {

        tbsanpham.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                int row = tbsanpham.getSelectedRow();
                String ma = tbsanpham.getValueAt(row,0).toString();
                String ten = tbsanpham.getValueAt(row,1).toString();
                double gia = Double.parseDouble(tbsanpham.getValueAt(row,2).toString());
                txtmasanpham.setText(ma);
                txttensanpham.setText(ten);
                txtdongia.setText(gia+"");
            }
        });
        txtluu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Vector<String> vector= new Vector<>();
                vector.add(txtmasanpham.getText());
                vector.add(txttensanpham.getText());
                vector.add(txtdongia.getText());
                defaultTableModelsanpham.addRow(vector);


            }
        });
        txttiep.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtmasanpham.setText("");
                txttensanpham.setText("");
                txtdongia.setText("");
                txtmasanpham.requestFocus();

            }
        });
        txtxoa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // xoa
                if(tbsanpham.getSelectedRow() >= 0){
                    defaultTableModelsanpham.removeRow(tbsanpham.getSelectedRow());
                }


            }
        });
        txtthoat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        defaultTableModelsanpham= new DefaultTableModel();
        defaultTableModelsanpham.addColumn("Mã Sản Phẩm");
        defaultTableModelsanpham.addColumn("Tên Sản Phẩm");
        defaultTableModelsanpham.addColumn("Giá");
        jTablesanpham = new JTable(defaultTableModelsanpham);

    }
}
