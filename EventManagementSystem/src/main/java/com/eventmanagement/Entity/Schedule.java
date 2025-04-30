package com.eventmanagement.Entity;

import jakarta.persistence.*;
import java.time.LocalTime;

@Entity
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long scheduleId;

    private LocalTime scheduleTime;
    private String description;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    // Default constructor
    public Schedule() {
    }

    // Parameterized constructor
    public Schedule(LocalTime scheduleTime, String description, Event event) {
        this.scheduleTime = scheduleTime;
        this.description = description;
        this.event = event;
    }

    // Getters and Setters
    public Long getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Long scheduleId) {
        this.scheduleId = scheduleId;
    }

    public LocalTime getScheduleTime() {
        return scheduleTime;
    }

    public void setScheduleTime(LocalTime scheduleTime) {
        this.scheduleTime = scheduleTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    // toString() method
    @Override
    public String toString() {
        return "Schedule{" +
                "scheduleId=" + scheduleId +
                ", scheduleTime=" + scheduleTime +
                ", description='" + description + '\'' +
                ", event=" + (event != null ? event.getEventId() : "null") +
                '}';
    }
}
