package BusReservation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class BookPanel extends JPanel {
    private JTextField nameField;
    private JTextField busNumberField;

    public BookPanel(BusReservationSystem parentFrame) {
        setLayout(new GridLayout(5, 2, 10, 10));
        setBackground(Color.LIGHT_GRAY);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setForeground(Color.BLACK);
        nameField = new JTextField();
        
        JLabel busNumberLabel = new JLabel("Bus Number:");
        busNumberLabel.setForeground(Color.BLACK);
        busNumberField = new JTextField();

        JButton bookButton = new JButton("Book");
        bookButton.setBackground(Color.GREEN);
        bookButton.setForeground(Color.WHITE);
        bookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String busNumber = busNumberField.getText();
                // Implement booking logic here
                JOptionPane.showMessageDialog(BookPanel.this, "Ticket booked for " + name + " on bus " + busNumber);
                nameField.setText("");
                busNumberField.setText("");
            }
        });

        JButton backButton = new JButton("Back");
        backButton.setBackground(Color.RED);
        backButton.setForeground(Color.WHITE);
        backButton.addActionListener(e -> parentFrame.switchPanel("Home"));

        add(nameLabel);
        add(nameField);
        add(busNumberLabel);
        add(busNumberField);
        add(new JLabel());
        add(bookButton);
        add(new JLabel());
        add(backButton);
    }
}
