package de.tum.in.ase.eist;

import java.time.Duration;
import java.time.LocalTime;

public abstract class TimeSlot {
	// TODO: implement according to problem statement

    private LocalTime startTime;
    private LocalTime endTime;

    public TimeSlot(LocalTime startTime, LocalTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public Duration getDuration() {
        return Duration.ofHours(endTime.getHour() - startTime.getHour());
    }
}
