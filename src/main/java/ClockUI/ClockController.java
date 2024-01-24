package ClockUI;
import Functionalities.Clock;

import javax.swing.*;

public class ClockController {
    private Clock clock;
    private ClockLabel clockLabel;


    public ClockController(Clock clock, ClockLabel clockLabel) {
        this.clock = clock;
        this.clockLabel = clockLabel;
    }

    public void startClock() {
        clock.startAutomaticUpdates(); // Start updates in Clock

        Timer timer = new Timer(1000, e -> clockLabel.setText(clock.toString())); // Update label every second
        timer.start();
    }
}
