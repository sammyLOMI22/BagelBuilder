import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class BagelBuilderGUI extends JFrame {
    private JLabel titlelb;
    private JRadioButton radioPlainB;
    private JRadioButton radioWWB;
    private JButton calcButton1;
    private JRadioButton radioBlueB;
    private JRadioButton radioCranB;
    private JRadioButton radioCRB;
    private JRadioButton radioEB;
    private JLabel toppingsLB;
    private JCheckBox checkBoxButter;
    private JCheckBox checkBoxCC;
    private JCheckBox checkBoxPB;
    private JCheckBox checkBoxJam;
    private JLabel totalLB;
    private JPanel panel;
    private JLabel toppingLB;
    private JLabel bagelLB;

    public BagelBuilderGUI() {
        this.setTitle("Welcome to Bagel World!");
        //this.setSize(1000,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel);
        this.pack();

        calcButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double bagelAmt = 0;
                double topAMT = 0.0;
                double orderT = 0;

                bagelAmt = getBagelTotal();
                topAMT = getToppings();
                orderT = bagelAmt + topAMT;

                NumberFormat formatter = NumberFormat.getCurrencyInstance();

                JOptionPane.showMessageDialog(null, "Bagel total: " + String.valueOf(formatter.format(bagelAmt)) + " Toppings Total: " + String.valueOf(formatter.format(topAMT)) + " Grand Total: " + String.valueOf(formatter.format(orderT)));
                //bagelLB.setText("Bagel total: "+String.valueOf(bagelAmt));
                //toppingsLB.setText("Toppings Total: "+ String.valueOf(topAMT));
                //totalLB.setText(" Grand Total: " + String.valueOf(orderT));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new BagelBuilderGUI();
        frame.setVisible(true);
    }

    public Double getBagelTotal() {
        double bagelAMT = 0;
        if (radioPlainB.isSelected()) {
            bagelAMT = 1.50;
        } else if (radioBlueB.isSelected()) {
            bagelAMT = 2.50;
        } else if (radioCranB.isSelected()) {
            bagelAMT = 2.55;
        } else if (radioCRB.isSelected()) {
            bagelAMT = 2.75;
        } else if (radioWWB.isSelected()) {
            bagelAMT = 2.00;
        } else if (radioEB.isSelected()) {
            bagelAMT = 2.95;
        }
        return bagelAMT;
    }

    public double getToppings() {
        double topT = 0;
        if (checkBoxButter.isSelected()) {
            topT = topT + 0.10;
        }
        if (checkBoxCC.isSelected()) {
            topT = topT + 0.95;
        }
        if (checkBoxPB.isSelected()) {
            topT = topT + 0.95;
        }
        if (checkBoxJam.isSelected()) {
            topT = topT + 0.95;
        }
        return topT;
    }



}
