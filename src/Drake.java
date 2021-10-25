import javax.swing.JFrame;
import javax.swing.JSlider;

public class Drake extends JFrame{
    customslider r,fp,ne,fl,fi,fc,l;
    public Drake(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        r = new customslider("r");
        fp = new customslider("fp");
        ne = new customslider("ne");
        fl = new customslider("fl");
        fi= new customslider("fi");
        fc = new customslider("fc");
        l = new customslider("l");

        
        
    }
}
