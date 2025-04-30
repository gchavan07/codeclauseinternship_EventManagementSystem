package com.eventmanagement.repository;

import com.eventmanagement.Entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
    List<Schedule> findByEventEventId(Long eventId);
    List<Schedule> findByScheduleTime(String scheduleTime);
}
