import javax.swing.JFrame;



import javax.swing.*;
import java.awt.*;
public class GUI {
    public static JFrame frame;
    public static JPanel panel;
    public static JButton button;
    public static JLabel label;
    public static JLabel label1;
    public static JLabel label2;
    public static JLabel label3;
    public static JLabel label4;
    public static JTextField input;
    public static GridBagLayout layout;
    public static GridBagConstraints gbc;
    
    public GUI(){
        frame = new JFrame("ediwhihdw");
        panel = new JPanel();
        button = new JButton("KILCIHCUHCHA");
        label = new JLabel("");
        label1 = new JLabel("");
        label2 = new JLabel("");
        label3 = new JLabel("");
        label4 = new JLabel("");
        input = new JTextField("",20);
        layout = new GridBagLayout();
        gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.CENTER;
        
        
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panel.setLayout(layout);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.requestFocus();
        frame.setLocationRelativeTo(null);
        frame.add(panel);
        addobjects(input, 0, 0, 1, 1);
        addobjects(button, 1, 0, 1, 1);
        addobjects(label, 0,1,2, 1);
        addobjects(label1, 0,2,2, 1);
        addobjects(label2, 0,3,2, 1);
        addobjects(label3, 0,4,2, 1);
        addobjects(label4, 0,5,2, 1);
        frame.pack();
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.requestFocus();



    }
    public void addobjects(Component comp,int gridx,int gridy,int gridwidth,int gridheigth){
        gbc.gridx = gridx;
        gbc.gridy = gridy;
        gbc.gridheight = gridheigth;
        gbc.gridwidth = gridwidth;
        layout.addLayoutComponent(comp,gbc);
        panel.add(comp,gbc);

    }
    
}
