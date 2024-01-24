package ClockUI;

import Functionalities.Clock;

import javax.swing.*;

public class ClockFrame extends JFrame {

    private Clock clock;
    private ClockLabel clockLabel;
    private ClockController controller;

    public ClockFrame() {
        // Initialize and layout components
        clock = new Clock();
        clockLabel = new ClockLabel();
        controller = new ClockController(clock, clockLabel);

        // Add clockLabel to the frame
        add(clockLabel);

        // Pack and make visible
        pack();
        setVisible(true);

        // Start the clock
        controller.startClock();
    }
}
