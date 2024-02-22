package company.Phones;

import company.PhoneDelete.PhoneDelete;
import company.sample2.Sample2;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;


public class Phones extends JFrame {
    private JTable table;
    private JButton addButton;
    private JButton editButton;
    private JButton deleteButton;
    private JPanel panel;
    private JButton button1;
    private JButton button2;

    private DefaultTableModel model;

    public static List<Phone> phones = new ArrayList<>();

    static {
        phones.add(new Phone("surname", "name", "address", "phone"));
        phones.add(new Phone("surname", "name", "address", "phone"));
    }

    public Phones() {
        setTitle("Sample2");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 550);

        String[] columnNames = {"Surname", "Name", "Address", "Number"};
        model = new DefaultTableModel(null, columnNames);
        for (Phone phone:phones)
        model.addRow(new String[]{phone.getSurname(), phone.getName(), phone.getAddress(), phone.getNumber()});
        table.setModel(model);

        setContentPane(panel);
        setLocationRelativeTo(null);
        addMenu();
        setVisible(true);

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PhoneDelete dialog = new PhoneDelete();
                dialog.setSize(300, 250);
                dialog.setLocationRelativeTo(null);

//dialog.pack();
                dialog.setTitle("Вы уверены?");
                dialog.setVisible(true);


                /*
                int row = table.getSelectedRow();
                model.removeRow(row);
                phones.remove(row);
                System.out.println(Arrays.toString(phones.toArray()));

                 */
            }
        });
    }

    public static void main(String[] args) {
        Phones phones = new Phones();
    }

    private void addMenu() {
        // create a menubar
        JMenuBar menuBar = new JMenuBar();

        // create a menu
        JMenu menu1 = new JMenu("Phone");

        // create menuitems
        JMenuItem mAdd = new JMenuItem("Add");
        JMenuItem mEdit = new JMenuItem("Edit");
        JMenuItem mDelete = new JMenuItem("Delete");
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


}

