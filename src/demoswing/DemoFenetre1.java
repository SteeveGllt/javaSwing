package demoswing;

import javax.swing.*;

public class DemoFenetre1 {
    public static void main(String[] args) {
        // TODO Instancier une JFrame
        JFrame frame = new JFrame();
        //TODO Modifier le titre de la fenêtre
        frame.setTitle("Ma first fenêtre");
        //TODO Modifier la taille (400*300)
        frame.setSize(400,300);
        //TODO Taille non modifiable par l'utilisateur
        frame.setResizable(false);
        //TODO Un Click sur croix entraîne fermeture de la fenêtre
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //TODO Centrer la fenêtre
        frame.setLocationRelativeTo(null);
        // TODO Afficher la JFrame
        frame.setVisible(true);
    }
}
