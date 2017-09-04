
public class Clock {

    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;

    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        // the counters that represent hours, minutes and seconds are created and set to have the correct initial values
        hours = new BoundedCounter(hoursAtBeginning);
        hours.setValue(hoursAtBeginning);

        minutes = new BoundedCounter(minutesAtBeginning);
        minutes.setValue(minutesAtBeginning);

        seconds = new BoundedCounter(secondsAtBeginning);
        seconds.setValue(secondsAtBeginning);
        System.out.println("h 0 : " + minutes + " " + seconds);
    }

    public void tick() {
        // Clock advances by one second
        if (seconds.getValue() != 59) {
            seconds.next();

        } else {
            seconds.setValue(0);
            minutes.next();
            if (minutes.getValue() == 60) {
                minutes.setValue(0);
                hours.next();
                if (hours.getValue() == 24) {
                    hours.setValue(00);
                }
            }
        }

    }

    public String toString() {
        // returns the string representation
        return hours + ":" + minutes + ":" + seconds;
    }
}
