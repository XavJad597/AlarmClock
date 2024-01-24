package Functionalities;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;

public class Clock {
    private LocalDateTime currentTime;

    public Clock() {
        // Initialize with current system time
        this.currentTime = LocalDateTime.now();
    }

    public Clock(int hours, int minutes, int seconds) {
        this.currentTime = LocalDateTime.of(LocalDateTime.now().toLocalDate(), LocalTime.of(hours, minutes, seconds));
    }

    public int getHours() {
        return currentTime.getHour();
    }

    public int getMinutes() {
        return currentTime.getMinute();
    }

    public int getSeconds() {
        return currentTime.getSecond();
    }

    public void setHours(int hours) {
        if (hours >= 0 && hours <= 23) {
            this.currentTime = this.currentTime.withHour(hours); // Update hour
        } else {
            throw new IllegalArgumentException("Invalid hours value: " + hours);
        }
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes <= 59) {
            this.currentTime = this.currentTime.withMinute(minutes); // Update minutes
        } else {
            throw new IllegalArgumentException("Invalid minutes value: " + minutes);
        }
    }

    public void setSeconds(int seconds) {
        if (seconds >= 0 && seconds <= 59) {
            this.currentTime = this.currentTime.withSecond(seconds); // Update seconds
        } else {
            throw new IllegalArgumentException("Invalid seconds value: " + seconds);
        }
    }
    public void startAutomaticUpdates() {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                updateTime();
            }
        }, 0, 1000); // Update every second (1000 milliseconds)
    }

//    public void updateTime() {
//        this.currentTime = this.currentTime.plusSeconds(1); // Increment by one second
//
//        // Handle overflow to minutes and hours:
//        if (this.currentTime.getSecond() == 0) {
//            if (this.currentTime.getMinute() == 59) {
//                this.currentTime = this.currentTime.withHour(this.currentTime.getHour() + 1).withMinute(0);
//            } else {
//                this.currentTime = this.currentTime.withMinute(this.currentTime.getMinute() + 1);
//            }
//        }
//
//        // Reset to 00:00:00 if it reaches 24:00:00:
//        if (this.currentTime.getHour() == 24) {
//            this.currentTime = this.currentTime.withHour(0);
//        }
//    }
public void updateTime() {
    // Get the current system time
    this.currentTime = LocalDateTime.now();
}

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", getHours(), getMinutes(), getSeconds());
    }
}

//    private int hours;
//    private int minutes;
//    private int seconds;
//    private LocalDateTime  current_time;
//
//    public Clock(int i, int i1, int i2) {
//        // Initialize with current system time
//        // You can use java.time.LocalDateTime for modern Java versions
//        // or java.util.Calendar for older versions.
//        this.current_time = LocalDateTime.now(); // Get the current time
//    }
//
//    public int getHours() {
//        return hours;
//    }
//
//    public int getMinutes() {
//        return minutes;
//    }
//
//    public int getSeconds() {
//        return seconds;
//    }
//
//    // Setter methods
//    public void setHours(int hours) {
//        if (hours >= 0 && hours <= 23) {
//            this.current_time = this.current_time.withHour(hours); // Update hour
//        } else {
//            throw new IllegalArgumentException("Invalid hours value: " + hours);
//        }
//    }
//
//    public void setMinutes(int minutes) {
//        if (minutes >= 0 && minutes <= 59) {
//            this.current_time = this.current_time.withMinute(minutes); // Update minutes
//        } else {
//            throw new IllegalArgumentException("Invalid minutes value: " + minutes);
//        }
//    }
//
//    public void setSeconds(int seconds) {
//        if (seconds >= 0 && seconds <= 59) {
//            this.current_time = this.current_time.withSecond(seconds); // Update seconds
//        } else {
//            throw new IllegalArgumentException("Invalid seconds value: " + seconds);
//        }
//    }
//    public void updateTime() {
//        this.current_time = this.current_time.plusSeconds(1); // Increment by one second
//
//        // Handle overflow to minutes and hours:
//        if (this.current_time.getSecond() == 0) {
//            if (this.current_time.getMinute() == 59) {
//                this.current_time = this.current_time.withHour(this.current_time.getHour() + 1).withMinute(0);
//            } else {
//                this.current_time = this.current_time.withMinute(this.current_time.getMinute() + 1);
//            }
//        }
//
//        // Reset to 00:00:00 if it reaches 24:00:00:
//        if (this.current_time.getHour() == 24) {
//            this.current_time = this.current_time.withHour(0);
//        }
//    }
//
//}