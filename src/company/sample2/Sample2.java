package company.sample2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;


public class Sample2 extends JFrame{
    private JRadioButton blackRadioButton;
    private JRadioButton whiteRadioButton;
    private JButton button1;
    private JPanel panel;
    private JLabel label1;
    private ButtonGroup color2;

    public Sample2(){
        setTitle("Sample2");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 300);
        setContentPane(panel);
        setLocationRelativeTo(null);
        setVisible(true);
//        button1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                for (Enumeration<AbstractButton> buttons = color2.getElements(); buttons.hasMoreElements() {
//                    AbstractButton button = button1.getName();
//                    if (button.isSelected()) {
//                        label1.setText(button.getText());
//                    }
//                }
//            }
//        });
    }

    public static void main(String[] args) {
        Sample2 sample2 = new Sample2();
    }
}
