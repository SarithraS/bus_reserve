package BusReservation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CancelPanel extends JPanel {
    private JTextField reservationField;

    public CancelPanel(BusReservationSystem parentFrame) {
        setLayout(new GridLayout(3, 2, 10, 10));
        setBackground(Color.ORANGE);

        JLabel reservationLabel = new JLabel("Reservation ID:");
        reservationLabel.setForeground(Color.BLACK);
        reservationField = new JTextField();

        JButton cancelButton = new JButton("Cancel");
        cancelButton.setBackground(Color.RED);
        cancelButton.setForeground(Color.WHITE);
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String reservationId = reservationField.getText();
                // Implement cancellation logic here
                JOptionPane.showMessageDialog(CancelPanel.this, "Reservation " + reservationId + " canceled");
                reservationField.setText("");
            }
        });

        JButton backButton = new JButton("Back");
        backButton.setBackground(Color.RED);
        backButton.setForeground(Color.WHITE);
        backButton.addActionListener(e -> parentFrame.switchPanel("Home"));

        add(reservationLabel);
        add(reservationField);
        add(new JLabel());
        add(cancelButton);
        add(new JLabel());
        add(backButton);
    }
}
