import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class customslider extends JSlider {
    int valeur;
    JLabel name;
    int min,max;


    customslider(String label){
        name = new JLabel(label);
        min=1;
        max=100;
        this.setMaximum(max);
        this.setMinimum(min);
        this.setValue(1);

   }

}
        
