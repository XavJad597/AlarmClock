import ClockUI.ClockFrame;
import Functionalities.Clock;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Create a Clock object
        SwingUtilities.invokeLater(() -> {
            ClockFrame clockFrame = new ClockFrame();
            clockFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application when the frame is closed
        });
        // Optional: Stop automatic updates when needed
        // clock.stopAutomaticUpdates(); // If you implement a stopping mechanism
    }
}

//public class Main {
//    public static void main(String[] args) {
//        // Test default constructor
//        Clock defaultClock = new Clock();
//        System.out.println("Default Functionalities.Clock: " + defaultClock);
//
//        // Test parameterized constructor
//        Clock parameterizedClock = new Clock();
//        System.out.println("Parameterized Functionalities.Clock: " + parameterizedClock);
//
//        // Test getter methods
//        Clock newTime =new Clock();
//        System.out.println("the time is "+ newTime);
//
//        System.out.println("Hours: " + parameterizedClock.getHours());
//        System.out.println("Minutes: " + parameterizedClock.getMinutes());
//        System.out.println("Seconds: " + parameterizedClock.getSeconds());
//
//        // Test setter methods
////        parameterizedClock.setHours(18);
////        parameterizedClock.setMinutes(05);
////        parameterizedClock.setSeconds(3);
////        System.out.println("Updated Functionalities.Clock: " + parameterizedClock);
//
//        // Test updateTime method
//        for (int i = 0; i < 10; i++) {
//            parameterizedClock.updateTime();
//            System.out.println("Updated Functionalities.Clock: " + parameterizedClock);
//        }
//    }
//}
