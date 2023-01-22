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
    private final JRadioButton wuerfelEinsButton = new JRadioButton();
    private final JRadioButton wuerfelZweiButton = new JRadioButton();
    private final JRadioButton wuerfelDreiButton = new JRadioButton();
    private final JRadioButton wuerfelVierButton = new JRadioButton();
    private final JRadioButton wuerfelFuenfButton = new JRadioButton();
    private final JLabel wuerfelEinsLabel = new JLabel();
    private final JLabel wuerfelZweiLabel = new JLabel();
    private final JLabel wuerfelDreiLabel = new JLabel();
    private final JLabel wuerfelVierLabel = new JLabel();
    private final JLabel wuerfelFuenfLabel = new JLabel();


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
        contentPane.add(wuerfelPanel());
        contentPane.add(figurenPanel());
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

    private JPanel wuerfelPanel() {
        final JPanel wuerfelPanel = new JPanel();
        final JPanel topRow = new JPanel();
        final JPanel bottomRow = new JPanel();
        topRow.add(wuerfelEinsLabel);
        topRow.add(wuerfelZweiLabel);
        topRow.add(wuerfelDreiLabel);
        topRow.add(wuerfelVierLabel);
        topRow.add(wuerfelFuenfLabel);
        bottomRow.add(wuerfelEinsButton);
        bottomRow.add(wuerfelZweiButton);
        bottomRow.add(wuerfelDreiButton);
        bottomRow.add(wuerfelVierButton);
        bottomRow.add(wuerfelFuenfButton);
        return wuerfelPanel;
    }

    private JPanel figurenPanel() {
        final JPanel panel = new JPanel();
        for (int i = 0; i < 13; i++) {
            final JPanel row = new JPanel();
            row.add(new JLabel());
        }
        return panel;
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
        final boolean[] wA = new boolean[5];
        wA[0] = wuerfelEinsButton.isSelected();
        wA[1] = wuerfelZweiButton.isSelected();
        wA[2] = wuerfelDreiButton.isSelected();
        wA[3] = wuerfelVierButton.isSelected();
        wA[4] = wuerfelFuenfButton.isSelected();
        dieSteuerung.geklicktWuerfeln(wA);
    }

    public void zeigeBestenliste(Endstand[] endstaende) {
        final JPanel panel = new JPanel();
        final JScrollPane scrollPane = new JScrollPane();
        final JScrollBar scrollBar = new JScrollBar();
        scrollPane.add(scrollBar);
        for (Endstand endstand : endstaende) {
            final JPanel innerPanel = new JPanel();
            innerPanel.add(new JLabel(endstand.liesName()));
            innerPanel.add(new JLabel(String.valueOf(endstand.liesPunkte())));
        }
        JOptionPane.showMessageDialog(panel, "Bestenliste");
    }

    public void zeigeGewinnerkarte(boolean[] eingetragen, int[] punktzahl) {
    }

    public void zeigeWuerfel(int[] augenzahl) {
    }
}
