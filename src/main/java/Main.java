import Functionalities.Clock;

public class Main {
    public static void main(String[] args) {
        // Test default constructor
        Clock defaultClock = new Clock();
        System.out.println("Default Functionalities.Clock: " + defaultClock);

        // Test parameterized constructor
        Clock parameterizedClock = new Clock();
        System.out.println("Parameterized Functionalities.Clock: " + parameterizedClock);

        // Test getter methods
        System.out.println("Hours: " + parameterizedClock.getHours());
        System.out.println("Minutes: " + parameterizedClock.getMinutes());
        System.out.println("Seconds: " + parameterizedClock.getSeconds());

        // Test setter methods
//        parameterizedClock.setHours(18);
//        parameterizedClock.setMinutes(05);
//        parameterizedClock.setSeconds(3);
//        System.out.println("Updated Functionalities.Clock: " + parameterizedClock);

        // Test updateTime method
        for (int i = 0; i < 10; i++) {
            parameterizedClock.updateTime();
            System.out.println("Updated Functionalities.Clock: " + parameterizedClock);
        }
    }
}
