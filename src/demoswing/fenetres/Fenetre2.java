package demoswing.fenetres;

import javax.swing.*;
import java.awt.event.*;
import java.util.Locale;

public class Fenetre2 extends JFrame {
    private JPanel container = new JPanel(); // Instanciation d'un container
    private JButton bouton = new JButton("Bouton"); // Instanciation d'un bouton
    private JTextField text = new JTextField("Zone de texte"); // Instanciation d'une zone de texte
    private JComboBox<String> combo = new JComboBox<String>(); // Instanciation d'une combobox
    private JLabel label = new JLabel("C'est un label"); // Instanciation d'un label

    //TODO Constructeur de la fenêtre 2
    public Fenetre2(){
        //TODO Modifier le titre de la fenêtre
        setTitle("Ma first fenêtre");
        //TODO Modifier la taille (400*300)
        setSize(400,300);
        //TODO Taille non modifiable par l'utilisateur
        setResizable(false);
        //TODO Un Click sur croix entraîne fermeture de la fenêtre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //TODO Centrer la fenêtre
        setLocationRelativeTo(null);

        //Ajout d'évènement lorsqu'on clique sur le bouton
        bouton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Vous avez cliqué");
            }
        });
        //Ajout d'évènement lorsqu'on rentre un texte, il se convertit en majuscule
        text.addKeyListener(new KeyListener() {
            @Override
            public void keyReleased(KeyEvent e) {
                    JTextField textField = (JTextField) e.getSource();
                    String text = textField.getText();
                    textField.setText(text.toUpperCase(Locale.ROOT));
                }
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }
        });
        //Ajout d'évènement lorsqu'on choisi l'item dans la liste
        combo.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED){
                    System.out.println("Vous avez selectionné " + e.getItem());
                }
            }
        });
        //Ajout d'évènement lorsqu'on clique sur le label
        label.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Vous avez cliqué sur le label");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });






        //Ajout des items dans la combobox
        combo.addItem("Java");
        combo.addItem("PHP");
        combo.addItem("C#");

        //Ajout des composants dans le container
        container.add(combo);
        container.add(bouton);
        container.add(text);
        container.add(label);
        setContentPane(container);

    }

}
