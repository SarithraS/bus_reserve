package BusReservation;

 import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SearchPanel extends JPanel {
    private JTextField searchField;
    private JTable resultsTable;

    public SearchPanel(BusReservationSystem parentFrame) {
        setLayout(new BorderLayout());
        setBackground(Color.MAGENTA);

        JPanel searchPanel = new JPanel(new GridLayout(1, 3, 10, 10));
        searchPanel.setBackground(Color.MAGENTA);

        JLabel searchLabel = new JLabel("Search by Name:");
        searchLabel.setForeground(Color.WHITE);
        searchField = new JTextField();
        
        JButton searchButton = new JButton("Search");
        searchButton.setBackground(Color.GREEN);
        searchButton.setForeground(Color.WHITE);
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = searchField.getText();
                // Implement search logic here
                Object[][] results = {
                    {"John Doe", "Bus 101"}
                    // Populate this with actual search results
                };
                resultsTable.setModel(new javax.swing.table.DefaultTableModel(
                    results,
                    new String[] {"Name", "Bus Number"}
                ));
            }
        });

        searchPanel.add(searchLabel);
        searchPanel.add(searchField);
        searchPanel.add(searchButton);

        add(searchPanel, BorderLayout.NORTH);

        resultsTable = new JTable();
        add(new JScrollPane(resultsTable), BorderLayout.CENTER);

        JButton backButton = new JButton("Back");
        backButton.setBackground(Color.RED);
        backButton.setForeground(Color.WHITE);
        backButton.addActionListener(e -> parentFrame.switchPanel("Home"));
        add(backButton, BorderLayout.SOUTH);
    }
}
 
