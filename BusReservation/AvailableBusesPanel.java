package BusReservation;

// public class AvailableBusesPanel {
    
// }
import javax.swing.*;
import java.awt.*;

class AvailableBusesPanel extends JPanel {
    private JTable busesTable;

    public AvailableBusesPanel(BusReservationSystem parentFrame) {
        setLayout(new BorderLayout());
        setBackground(Color.YELLOW);

        String[] columnNames = {"Bus Number", "Route", "Available Seats"};
        Object[][] data = {
            {"Bus 101", "Route A", "30"},
            {"Bus 202", "Route B", "20"}
            // Populate this with actual bus data
        };

        busesTable = new JTable(data, columnNames);
        add(new JScrollPane(busesTable), BorderLayout.CENTER);

        JButton backButton = new JButton("Back");
        backButton.setBackground(Color.RED);
        backButton.setForeground(Color.WHITE);
        backButton.addActionListener(e -> parentFrame.switchPanel("Home"));
        add(backButton, BorderLayout.SOUTH);
    }
}
