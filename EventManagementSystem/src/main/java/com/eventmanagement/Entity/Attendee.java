package com.eventmanagement.Entity;

import jakarta.persistence.*;

@Entity
public class Attendee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long attendeeId;

    private String attendeeName;
    private String attendeeEmail;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    // Constructors
    public Attendee() {
    }

    public Attendee(String attendeeName, String attendeeEmail, Event event) {
        this.attendeeName = attendeeName;
        this.attendeeEmail = attendeeEmail;
        this.event = event;
    }

    // Getters and Setters
    public Long getAttendeeId() {
        return attendeeId;
    }

    public void setAttendeeId(Long attendeeId) {
        this.attendeeId = attendeeId;
    }

    public String getAttendeeName() {
        return attendeeName;
    }

    public void setAttendeeName(String attendeeName) {
        this.attendeeName = attendeeName;
    }

    public String getAttendeeEmail() {
        return attendeeEmail;
    }

    public void setAttendeeEmail(String attendeeEmail) {
        this.attendeeEmail = attendeeEmail;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    // toString method
    @Override
    public String toString() {
        return "Attendee{" +
                "attendeeId=" + attendeeId +
                ", attendeeName='" + attendeeName + '\'' +
                ", attendeeEmail='" + attendeeEmail + '\'' +
                ", event=" + (event != null ? event.getEventId() : "null") +
                '}';
    }
}
