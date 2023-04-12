import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Convertitore extends JFrame {
    private JLabel JL_celsius, JL_kelvin;
    private JTextField JTF_celsius, JTF_kelvin;
    private JButton JB_converti;
    public Convertitore(String title) throws HeadlessException {
        super(title);
        JL_celsius = new JLabel("Temperatura in Celsius");
        JL_kelvin = new JLabel("Temperatura in Kelvin");
        JTF_celsius = new JTextField();
        JTF_kelvin = new JTextField();
        JB_converti = new JButton("Converti Temperatura");

        JB_converti.addActionListener(
                new ActionListener()
                {
                    @Override public void actionPerformed(ActionEvent e) {
                        if(!JTF_celsius.getText().isEmpty() && !JTF_kelvin.getText().isEmpty()) {

                        }
                    }
                }
        );

        setSize(new Dimension(500,180));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(1,2));
        JPanel input = new JPanel(new GridLayout(4,1));
        input.add(JL_celsius);
        input.add(JTF_celsius);
        input.add(JL_kelvin);
        input.add(JTF_kelvin);
        input.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        rootPane.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        add(input);
        add(JB_converti);
        setResizable(false);
        setVisible(true);
    }

}
