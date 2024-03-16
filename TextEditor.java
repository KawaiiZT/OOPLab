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
import java.io.File;
import java.io.*;
public class TextEditor implements ActionListener{
    private JFrame fr;
    private JTextArea ar;
    private JPanel pn1;
    private JMenuBar menub;
    private JMenu menu;
    private JMenuItem it1;
    private JMenuItem it2;
    private JMenuItem it3;
    private JMenuItem it4;
    private JFileChooser fc;
    private File f;
    public TextEditor(){
        fr = new JFrame("My Text Editor");
        ar = new JTextArea();
        pn1 = new JPanel();
        menub = new JMenuBar();
        menu = new JMenu("File");
        it1 = new JMenuItem("New");
        it2 = new JMenuItem("Open");
        it3 = new JMenuItem("Save");
        it4 = new JMenuItem("Close");
        fc = new JFileChooser();
        
        fr.setJMenuBar(menub);
        menub.add(menu);
        menu.add(it1);
        menu.add(it2);
        menu.add(it3);
        menu.addSeparator();
        menu.add(it4);
        fr.add(pn1);
        pn1.add(ar);
        
        it1.addActionListener(this);
        it2.addActionListener(this);
        it3.addActionListener(this);
        it4.addActionListener(this);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(500,200);
        fr.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ev){
        if (ev.getSource().equals(it1)){
            ar.setText("");
        }
        else if(ev.getSource().equals(it4)){
            System.exit(0);
        }
        else if(ev.getSource().equals(it2)){
            fc.showOpenDialog(fr);
            f = fc.getSelectedFile();
            String txt = "";
        try (FileReader fr = new FileReader(f)){
            int tmp;
            while ((tmp = fr.read()) != -1){
                txt += (char) tmp;
            }
        } catch (IOException ex){
            ex.printStackTrace();
        } 
        ar.setText(txt);
        }
        else if(ev.getSource().equals(it3)){
            fc.showSaveDialog(fr);
            f = fc.getSelectedFile();
            File file = fc.getSelectedFile();
            String text = ar.getText();
            
            try ( FileWriter fw = new FileWriter(file)) {
                for (int i = 0; i < text.length(); i++) {
                    fw.write(text.charAt(i));
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        new TextEditor();
    }
}
