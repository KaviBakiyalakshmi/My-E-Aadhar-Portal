package com.attendance.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.attendance.demo.entity.Attendance;

public interface AttendanceRepo extends JpaRepository<Attendance,Long>{
	

}