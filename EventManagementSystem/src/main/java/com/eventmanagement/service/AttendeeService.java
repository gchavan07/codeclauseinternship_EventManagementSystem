package com.eventmanagement.service;

import com.eventmanagement.Entity.Attendee;
import com.eventmanagement.repository.AttendeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendeeService {

    @Autowired
    private AttendeeRepository attendeeRepository;

    public Attendee addAttendee(Attendee attendee) {
        return attendeeRepository.save(attendee);
    }

    public List<Attendee> getAllAttendees() {
        return attendeeRepository.findAll();
    }

    public Attendee getAttendeeById(Long id) {
        return attendeeRepository.findById(id).orElse(null);
    }

    public void deleteAttendee(Long id) {
        attendeeRepository.deleteById(id);
    }

    public Attendee updateAttendee(Long id, Attendee updated) {
        Attendee attendee = attendeeRepository.findById(id).orElse(null);
        if (attendee != null) {
            attendee.setAttendeeName(updated.getAttendeeName());
            attendee.setAttendeeEmail(updated.getAttendeeEmail());
            attendee.setEvent(updated.getEvent());
            return attendeeRepository.save(attendee);
        }
        return null;
    }
}
