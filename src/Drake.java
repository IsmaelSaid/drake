import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Drake extends JFrame{
    customslider r,fp,ne,fl,fi,fc,l;
    JLabel labedFormule,lr,lfp,lne,lfl,lfi,lfc,ll,lN;
    JLabel t1,t2,t3,t4,t5,t6,t7;
    JTextField champFormule;
    public Drake(){
        // Définir le titre de JFrame
        setTitle("Drake");

        // Création d'un objet de la classe Jpanel
        JPanel p = new JPanel();

        // Définir la mise en page
        p.setLayout(new GridBagLayout());

        // Crée un objet de contraintes
        GridBagConstraints c = new GridBagConstraints();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        r = new customslider("r");
        lr= new JLabel("r");
        fp = new customslider("fp");
        ne = new customslider("ne");
        fl = new customslider("fl");
        fi= new customslider("fi");
        fc = new customslider("fc");
        l = new customslider("l");



        // Spécifie le padding externe de tous les composants
        c.insets = new Insets(1, 1, 1, 1);

        // Ajouter les contraintes

        // largeur des composant
        c.ipadx = 200;
        // hauteur des composant
        c.ipady = 20;

        //affichage des jslider
        //Affiche la formule
        c.gridy = 0;
        c.gridx = 1;
        labedFormule = new JLabel("N = (R*) * fp * ne * fl * fi * fc * L");
        p.add(labedFormule,c);

        //ligne 0
        c.gridy = 1;
        c.gridx = 0;
        lr = new JLabel("R*");
        p.add(lr,c);
        c.gridx = 1;
        c.gridy = 1;
        p.add(r,c);

        //ligne 1
        c.gridy = 2;
        c.gridx = 0;
        lfp = new JLabel("fp");
        p.add(lfp,c);
        c.gridx = 1;
        p.add(fp,c);

        //ligne2
        c.gridy = 3;
        c.gridx = 0;
        lne = new JLabel("ne");
        p.add(lne,c);
        c.gridx = 1;
        p.add(ne,c);
        //ligne3
        c.gridy = 4;
        c.gridx = 0;
        lfl = new JLabel("fl");
        p.add(lfl,c);
        c.gridx = 1;
        p.add(fl,c);
        //ligne4
        c.gridy = 5;
        c.gridx = 0;
        lfi = new JLabel("fi");
        p.add(lfi,c);
        c.gridx = 1;
        p.add(fi,c);
        //ligne5
        c.gridy = 6;
        c.gridx = 0;
        lfc = new JLabel("fc");
        p.add(lfc,c);
        c.gridx = 1;
        p.add(fc,c);
        //ligne 7
        c.gridy = 7;
        c.gridx = 0;
        ll = new JLabel("L");
        p.add(ll,c);
        c.gridx = 1;
        p.add(l,c);

        //label n
        c.gridx = 0;
        c.gridy = 8;
        lN = new JLabel("N= ");
        p.add(lN,c);

        //champs de saisie
        c.gridx = 1;
        champFormule = new JTextField();
        p.add(champFormule,c);

        /**********affichage partie droite *************/
        //ligne 0
        c.gridy = 1;
        c.gridx = 3;
        t1 = new JLabel(Integer.toString(r.getValue()));
        p.add(t1,c);

        //ligne 1
        c.gridy = 2;
        c.gridx = 3;
        t2 = new JLabel(Integer.toString(fp.getValue()));
        p.add(t2,c);
        //ligne2
        c.gridy = 3;
        c.gridx = 3;
        t3 = new JLabel(Integer.toString(ne.getValue()));
        p.add(t3,c);
        //ligne3
        c.gridy = 4;
        c.gridx = 3;
        t4 = new JLabel(Integer.toString(fl.getValue()));
        p.add(t4,c);
        //ligne4
        c.gridy = 5;
        c.gridx = 3;
        t5 = new JLabel(Integer.toString(fi.getValue()));
        p.add(t5,c);
        //ligne5
        c.gridy = 6;
        c.gridx = 3;
        t6 = new JLabel(Integer.toString(fc.getValue()));
        p.add(t6,c);
        //ligne 7
        c.gridy = 7;
        c.gridx = 3;
        t7 = new JLabel(Integer.toString(l.getValue()));
        p.add(t7,c);

        //event sur chaque slider
        r.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                t1.setText(Integer.toString(r.getValue()));
            }
        });

        fp.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                t2.setText(Integer.toString(fp.getValue()));
            }
        });

        ne.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                t3.setText(Integer.toString(ne.getValue()));
            }
        });
        fl.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                t4.setText(Integer.toString(fl.getValue()));
            }
        });
        fi.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                t5.setText(Integer.toString(fi.getValue()));
            }
        });
        fc.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                t6.setText(Integer.toString(fc.getValue()));
            }
        });
        l.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                t7.setText(Integer.toString(l.getValue()));
            }
        });

        // Création d'un objet de "WindowAdapter"
        WindowListener winAdap = new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                // quitter le système
                System.exit(0);
            }
        };

        // ajouter le listener "windowlistener "
        addWindowListener(winAdap);

        // ajouter le contenu
        getContentPane().add(p);

        // Définir la taille du JFrame
        setSize(800, 800);

        // Définir la visibilité de JFrame
        setVisible(true);
    }
}
