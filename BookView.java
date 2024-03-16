/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KoonD
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class BookView implements ActionListener{
    private JFrame fr;
    private JPanel pn1,pn2,pn3,pn4,pn5;
    private JLabel lb1,lb2,lb3;
    private JTextField nf,pf,page;
    private JComboBox cb;
    private JButton left,right,add,update,delete;
    private int now = 0;
    public BookView(){
        fr = new JFrame();
        pn1 = new JPanel();
        pn2 = new JPanel();
        pn3 = new JPanel();
        pn4 = new JPanel();
        pn5 = new JPanel();
        fr.setLayout(new GridLayout(5,0));
        fr.add(pn1);
        fr.add(pn2);
        fr.add(pn3);
        fr.add(pn4);
        fr.add(pn5);
        pn1.setLayout(new GridLayout(0,2));
        pn2.setLayout(new GridLayout(0,2));
        pn3.setLayout(new GridLayout(0,2));
        lb1 = new JLabel("Name");
        nf = new JTextField();
        lb2 = new JLabel("Price");
        pf = new JTextField();
        lb3 = new JLabel("Type");
        cb = new JComboBox();
        pn1.add(lb1);
        pn1.add(nf);
        pn2.add(lb2);
        pn2.add(pf);
        pn3.add(lb3);
        pn3.add(cb);
        
        cb.addItem("General");
        cb.addItem("Computer");
        cb.addItem("Math&Sci");
        cb.addItem("Photo");
        cb.setSelectedItem("General");
        
        left = new JButton("<<<");
        right = new JButton (">>>");
        page = new JTextField();
        
        pn4.add(left);
        pn4.add(page);
        page.setPreferredSize(new Dimension(60,30));
        pn4.add(right);
        add = new JButton("Add");
        update = new JButton("Update");
        delete = new JButton("Delete");
        pn5.add(add);
        pn5.add(update);
        pn5.add(delete);
        add.addActionListener(this);
        fr.setSize(300,200);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource().equals(add)){
            new BookAdd();
        } else if (e.getSource().equals(update)){
            JOptionPane.showMessageDialog(null, "Done it", "update", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource().equals(delete)){
            JOptionPane.showMessageDialog(null, "Done it", "delete", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public static void main(String[] args) {
        new BookView();
    }
}
