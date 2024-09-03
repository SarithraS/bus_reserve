package BusReservation;

import javax.swing.*;
import java.awt.*;

class ViewPanel extends JPanel {
    private JTable reservationsTable;

    public ViewPanel(BusReservationSystem parentFrame) {
        setLayout(new BorderLayout());
        setBackground(Color.PINK);

        String[] columnNames = {"Name", "Bus Number"};
        Object[][] data = {
            {"John Doe", "Bus 101"},
            {"Jane Smith", "Bus 202"}
            // Populate this with actual reservation data
        };

        reservationsTable = new JTable(data, columnNames);
        add(new JScrollPane(reservationsTable), BorderLayout.CENTER);

        JButton backButton = new JButton("Back");
        backButton.setBackground(Color.RED);
        backButton.setForeground(Color.WHITE);
        backButton.addActionListener(e -> parentFrame.switchPanel("Home"));
        add(backButton, BorderLayout.SOUTH);
    }
}
