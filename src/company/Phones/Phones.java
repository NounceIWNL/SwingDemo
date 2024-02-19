package company.Phones;

import company.sample2.Sample2;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;


public class Phones extends JFrame{
    private JScrollBar scrollBar1;
    private JTable table1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JPanel panel;

    public Phones(){
        setTitle("Phones");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 300);
        setContentPane(panel);
        String[] columnNames = {"Surname", "Name", "Address","Number"};
//        model = new DefaultTableModel(null, columnNames);
//        table.setModel(model);
        setLocationRelativeTo(null);
        setVisible(true);
//        button1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                for (Enumeration<AbstractButton> buttons = color2.getElements(); buttons.hasMoreElements()😉 {
//                    AbstractButton button = buttons.getNames();
//                    if (button.isSelected()) {
//                        label1.setText(button.getText());
//                    }
//                }
//            }
//        });
    }
    private void addMenu() {
        // create a menubar
        JMenuBar menuBar = new JMenuBar();

        // create a menu
        JMenu menu1 = new JMenu("Phone");

        // create menuitems
        JMenuItem mAdd = new JMenuItem("Add");
        JMenuItem mEdit = new JMenuItem("Edit");
        JMenuItem mDelete = new JMenuItem("Detele");
        JMenuItem mExit = new JMenuItem("Exit");

        // add menu items to menu
        menu1.add(mAdd);
        menu1.add(mEdit);
        menu1.add(mDelete);
        menu1.add(mExit);

        // add menu to menu bar
        menuBar.add(menu1);

        // add menubar to frame
        setJMenuBar(menuBar);

        mExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }

    public static void main(String[] args) {
        Phones phones = new Phones();
    }
}

