package swing1;
import com.sun.javaws.util.JfxHelper;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class windows {
    public static  void  main(String[] args){
        JFrame frm = new JFrame("Window");
        frm.setSize(400,400);
        frm.setLocation(200,200);
        frm.setLayout(null);
        final JLabel imgae= new JLabel();
        ImageIcon pic = new ImageIcon("image/2012.jpg");
        imgae.setIcon(pic);
        imgae.setBounds(60,50,pic.getIconWidth(),pic.getIconHeight());

        JButton btn = new JButton("Hide pic");
        btn.setBounds(200,200,100,100);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imgae.setVisible(false);
            }
        });
        frm.add(imgae);
        frm.add(btn);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);
    }
}
