package BusReservation;

import javax.swing.*;
import java.awt.*;

public class BusReservationSystem extends JFrame {
    private CardLayout cardLayout;
    private JPanel mainPanel;

    public BusReservationSystem() {
        setTitle("Bus Reservation System");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        // Add panels
        mainPanel.add(new HomePanel(this), "Home");
        mainPanel.add(new BookPanel(this), "Book");
        mainPanel.add(new ViewPanel(this), "View");
        mainPanel.add(new CancelPanel(this), "Cancel");
        mainPanel.add(new SearchPanel(this), "Search");
        mainPanel.add(new AvailableBusesPanel(this), "AvailableBuses");

        add(mainPanel);
        cardLayout.show(mainPanel, "Home");
    }

    public void switchPanel(String panelName) {
        cardLayout.show(mainPanel, panelName);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BusReservationSystem frame = new BusReservationSystem();
            frame.setVisible(true);
        });
    }
}
