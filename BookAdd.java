import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
public class BookAdd implements ActionListener{
    private JLabel lname,lprice,ltype;
    private JTextField nf,np;
    private JFrame fr;
    private JPanel pn1,pn2,pn3,pn4;
    private JButton bn;
    private JComboBox typeb;
    public BookAdd(){
        lname = new JLabel("Name");
        lprice = new JLabel("Price");
        ltype = new JLabel("Type");
        nf = new JTextField();
        np = new JTextField();
        pn1 = new JPanel();
        pn2 = new JPanel();
        pn3 = new JPanel();
        pn4 = new JPanel();
        bn = new JButton("Insert");
        typeb = new JComboBox();
        typeb.addItem("General");
        typeb.addItem("Computer");
        typeb.addItem("Math&Sci");
        typeb.addItem("Photo3");
        typeb.setSelectedItem("General");
        fr = new JFrame();
        fr.setLayout(new GridLayout(4,0));
        fr.add(pn1);
        fr.add(pn2);
        fr.add(pn3);
        fr.add(pn4);
        pn1.setLayout(new GridLayout(0,2));
        pn2.setLayout(new GridLayout(0,2));
        pn3.setLayout(new GridLayout(0,2));
        pn1.add(lname);
        pn1.add(nf);
        pn2.add(lprice);
        pn2.add(np);
        pn3.add(ltype);
        pn3.add(typeb);
        pn4.add(bn);
        bn.addActionListener(this);
        fr.setSize(200,200);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource().equals(bn)){
            JOptionPane.showMessageDialog(null, "Done it", "", JOptionPane.INFORMATION_MESSAGE);
            fr.dispose();
        }
            
    }
    public static void main(String[] args) {
        new BookAdd();
    }
}
