package com.eventmanagement.repository;

import com.eventmanagement.Entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {
    List<Event> findByEventLocation(String eventLocation);
    List<Event> findByEventName(String eventName);
}
