
import java.awt.event.*;
public class Logic {
    int Cell =1;
    public Logic(){
       
        GUI.button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
               
                AddNote();
            }
        });
       GUI.input.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
               
                AddNote();
            }
        });
    }
    public void AddNote(){
        if(Cell == 1 ){
            GUI.label.setText(GUI.input.getText());
            Cell++;
        }else if(Cell == 2 ){
            GUI.label1.setText(GUI.input.getText());
            Cell++;
        }else if(Cell == 3 ){
            GUI.label2.setText(GUI.input.getText());
            Cell++;
        }else if(Cell == 4 ){
            GUI.label3.setText(GUI.input.getText());
            Cell++;
        }else if(Cell == 5 ){
            GUI.label4.setText(GUI.input.getText());
            Cell = Cell -4;
        }
    }
}
