package com.eventmanagement.repository;

import com.eventmanagement.Entity.Attendee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AttendeeRepository extends JpaRepository<Attendee, Long> {
    List<Attendee> findByAttendeeName(String attendeeName);
    List<Attendee> findByAttendeeEmail(String attendeeEmail);
}
