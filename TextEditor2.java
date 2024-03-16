/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KoonD
 */
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
public class TextEditor2 implements ActionListener{
        private JFrame fr;
        private JTextArea ar;
        private JMenuBar mb;
        private JMenu fl;
        private JMenuItem it1,it2,it3,it4;
        private JPanel pn1;
        
        public TextEditor2(){
            fr = new JFrame("My TextEditor2");
            fr.setLayout(new BorderLayout());
            ar = new JTextArea();
            mb = new JMenuBar();
            fl = new JMenu("File");
            it1 = new JMenuItem("New");
            it2 = new JMenuItem("Open");
            it3 = new JMenuItem("Save");
            it4 = new JMenuItem("Close");
            pn1 = new JPanel();
            
            fr.setJMenuBar(mb);
            fr.add(pn1, BorderLayout.CENTER);
            pn1.add(ar);
            pn1.setLayout(new FlowLayout());
            mb.add(fl);
            fl.add(it1);
            fl.add(it2);
            fl.add(it3);
            fl.addSeparator();
            fl.add(it4);
            
            it1.addActionListener(this);
            it2.addActionListener(this);
            it3.addActionListener(this);
            it4.addActionListener(this);
            
            fr.setSize(200,150);
            fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fr.setVisible(true);
        }
        @Override
        public void actionPerformed(ActionEvent ex){
            if (ex.getSource().equals(it1)){
                ar.setText("");
            } else if (ex.equals(it2)){
                JFileChooser fc = new JFileChooser();
                fc.showOpenDialog(fr); 
                File f = fc.getSelectedFile();
                String text = "";
                try (FileReader fr = new FileReader(f)){
                    int tmp;
                    while ((tmp = fr.read()) != -1){
                        text  += (char) tmp;
                }
                }catch (IOException ez){
                    ez.printStackTrace();
                }
            } else if (ex.getSource().equals(it3)){
                JFileChooser fc = new JFileChooser();
                fc.showSaveDialog(fr); 
                File f = fc.getSelectedFile();
                String text = ar.getText();
                
                try (FileWriter fw = new FileWriter(f)){
                    for (int i = 0; i < text.length() ; i++){
                        fw.write(text.charAt(i));
                    }
                } catch (IOException ez){
                    ez.printStackTrace();
                }
            } else if (ex.equals(it4)){
                System.exit(0);
            }
        }
}
