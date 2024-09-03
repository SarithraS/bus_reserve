package BusReservation;

import javax.swing.*;
import java.awt.*;

class HomePanel extends JPanel {
    public HomePanel(BusReservationSystem parentFrame) {
        setLayout(new GridLayout(6, 1, 10, 10));
        setBackground(Color.CYAN);

        JLabel welcomeLabel = new JLabel("Welcome to Bus Reservation System", JLabel.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 20));
        welcomeLabel.setForeground(Color.BLUE);
        add(welcomeLabel);

        JButton bookButton = new JButton("Book Ticket");
        bookButton.addActionListener(e -> parentFrame.switchPanel("Book"));
        add(bookButton);

        JButton viewButton = new JButton("View Reservations");
        viewButton.addActionListener(e -> parentFrame.switchPanel("View"));
        add(viewButton);

        JButton cancelButton = new JButton("Cancel Reservation");
        cancelButton.addActionListener(e -> parentFrame.switchPanel("Cancel"));
        add(cancelButton);

        JButton searchButton = new JButton("Search Reservation");
        searchButton.addActionListener(e -> parentFrame.switchPanel("Search"));
        add(searchButton);

        JButton availableBusesButton = new JButton("View Available Buses");
        availableBusesButton.addActionListener(e -> parentFrame.switchPanel("AvailableBuses"));
        add(availableBusesButton);
    }
}
