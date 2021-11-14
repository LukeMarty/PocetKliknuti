import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI implements ActionListener {
    
    private int pocetKliknuti = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;

    public GUI() {
    
        frame = new JFrame();
        
        JButton button = new JButton("Klikni");
        button.addActionListener(this);
        
        label = new JLabel("Pocet kliknuti: 0");
        
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);
        
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Moje GUI");
        frame.pack();
        frame.setVisible(true);
    
    }
    
    public static void main(String[]args) {
    
        new GUI();
    }
    
    public void actionPerformed(ActionEvent e) {
        pocetKliknuti ++;
        label.setText("Pocet kliknuti: " + pocetKliknuti);
    }
}
