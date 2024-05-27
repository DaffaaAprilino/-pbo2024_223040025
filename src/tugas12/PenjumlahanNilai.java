package tugas12;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class PenjumlahanNilai extends JFrame implements ActionListener {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField Angka1;
    private JTextField Angka2;
    private JButton button;

    public PenjumlahanNilai(){
    Angka1 = new JTextField("");
    Angka2 = new JTextField("");
    button = new JButton("Jumlah");

    button.addActionListener(this);

    setLayout(new GridLayout(3,1));
    add(Angka1);
    add(Angka2);
    add(button);

    pack();
    setVisible(true);
    setSize(300, 200);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        try{
            int angkaPertama = Integer.parseInt(Angka1.getText());
            int angkaKedua = Integer.parseInt(Angka2.getText());
            int hasil = angkaPertama + angkaKedua ;

            JOptionPane.showMessageDialog(null, "Jumlah :" + hasil);

        }catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Masukkan angka yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
