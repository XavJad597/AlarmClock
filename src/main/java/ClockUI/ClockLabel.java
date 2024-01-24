package ClockUI;

import javax.swing.*;
import java.awt.*;

public class ClockLabel extends JLabel {

    public ClockLabel() {
        // Set any default font or styling
    }

    // Optional: customize time display
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw the time in your preferred format and style
    }
}
