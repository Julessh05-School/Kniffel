package benutzerschnittstelle;

import fachkonzepte.Endstand;
import steuerung.Steuerung;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;

public final class Benutzerschnittstelle extends JFrame {

    private final Steuerung dieSteuerung;

    private final JButton wuerfelnButton = new JButton();

    public Benutzerschnittstelle() {
        init();
        dieSteuerung = new Steuerung(this);
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ce) {
            System.out.print("Error: " + ce.getLocalizedMessage());
        }
        EventQueue.invokeLater(() -> {
            final Benutzerschnittstelle ui = new Benutzerschnittstelle();
            ui.setVisible(true);
        });
    }

    private void init() {
        setTitle("Kniffel");
        setEnabled(true);
        setResizable(true);
        final JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        setFocusable(true);
        requestFocus();
        setAlwaysOnTop(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1000, 600);
        setContentPane(contentPaneInit());
        setVisible(true);
    }

    private JPanel contentPaneInit() {
        final JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new GridBagLayout());
        wuerfelnButton.setText("Wuerfeln");
        wuerfelnButton.setAction(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                geklicktWuerfeln();
            }
        });
        contentPane.add(wuerfelnButton);
        return contentPane;
    }

    public String erfrageSpielername() {
        return JOptionPane.showInputDialog("Enter your Name");
    }

    public void geklicktEintragen() {
        // TODO: change
        dieSteuerung.geklicktEintragen(0);
    }

    public void geklicktNeuesSpiel() {
        dieSteuerung.neuesSpielGeklickt();
    }

    public void geklicktWuerfeln() {
    }

    public void zeigeBestenliste(Endstand[] endstaende) {

    }

    public void zeigeGewinnerkarte(boolean[] eingetragen, int[] punktzahl) {

    }

    public void zeigeWuerfel(int[] augenzahl) {

    }
}
