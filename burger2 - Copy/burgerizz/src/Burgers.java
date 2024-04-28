import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class Burgers {

    private JButton button1;
    private JComboBox<String> burgerbox;
    private JTextField textField1;
    private JComboBox<String> komplekts;
    private JComboBox<String> Sauce;
    private JLabel Paldies;
    private JLabel Pasutijums;
    private JLabel greetings;
    private JLabel welcome;
    private JSpinner spinner1;

    private JLabel skaits;
    private JPanel rootPanel;
    private JLabel Summa;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Burger");
        frame.setContentPane(new Burgers().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 450);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

    }



    private void createUIComponents() {
        burgerbox = new JComboBox<>();
        burgerbox.addItem("Siera Burgers");
        burgerbox.addItem("Dubultais Siera Burgers");
        burgerbox.addItem("Bekona burgers");
        burgerbox.addItem("Rizz burgers");
        burgerbox.addItem("Kebaba burgers");

        komplekts = new JComboBox<>();
        komplekts.addItem("Bez kompletka");
        komplekts.addItem("Mazais komplekts");
        komplekts.addItem("Lielais komplekts");

        Sauce = new JComboBox<>();
        Sauce.addItem("Bez mērces");
        Sauce.addItem("Kečups");
        Sauce.addItem("Majonēze");
        Sauce.addItem("Gurķu mērce");
        Sauce.addItem("Karri mērce");
        Sauce.addItem("Kīploku mērce");


    }
public Burgers(){

    spinner1.setValue(1);
    spinner1.setEditor(new JSpinner.NumberEditor(spinner1,"#"));
    spinner1.addChangeListener(e1 ->
    {
        int value =(int) spinner1.getValue();
        if (value<1){
            spinner1.setValue(1);
        }
    });
    button1.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String name = textField1.getText();


        String burger = (String) burgerbox.getSelectedItem();
        String komplekt = (String) komplekts.getSelectedItem();
        String merce = (String) Sauce.getSelectedItem();

        int daudzums = (int) spinner1.getValue();
        double summa = 0;

        int optionresult = JOptionPane.showConfirmDialog(null, "Vai Jūs esat pārliecināti par pasūtījuma satura precizitāti?");
        if (optionresult == JOptionPane.YES_OPTION) {




            Burger2 burgerz = new Burger2(burger, komplekt, merce, daudzums, summa, name);
            summa = burgerz.Sum1();
            Paldies.setText("Paldies par Jūsu pasūtījumu " + textField1.getText() + "!");
            Pasutijums.setText("Jūsu pasūtījums ir: " + daudzums + " " + burger + ", " + komplekt + " un " + merce + ".");
            Summa.setText("Jūsu pasūtījuma summa ir: " + summa + " eiro.");
            try {
                FileWriter writer = new FileWriter("Burger.txt", true);
                writer.write("\n" + burgerz.printinfo());


                writer.close();

            } catch (IOException E) {
                System.out.println("Ir radusies kļūda!");
            }


        }else{
            Paldies.setText("");
            Pasutijums.setText("Meģiniet vēlreiz!");
            Summa.setText("");
        }
    }
});

}

}

