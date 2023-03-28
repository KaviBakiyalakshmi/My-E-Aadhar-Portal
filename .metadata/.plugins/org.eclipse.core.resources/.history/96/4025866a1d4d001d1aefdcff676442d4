package com.attendance.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.attendance.demo.entity.Attendance;
import com.attendance.demo.service.AttendanceService;


//@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/attendance")

public class AttendanceController {
	
		
		
		@Autowired
		private AttendanceService service;
		
		@PostMapping("/")
		public ResponseEntity<Attendance> adduser(@RequestBody Attendance u){
			
			Attendance attendance= service.addAttendance(u);
			
			if(attendance!=null)
				return new ResponseEntity<Attendance>(attendance,HttpStatus.CREATED);
			else
				return new ResponseEntity<Attendance>(attendance,HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
		
		
		@GetMapping("/")
		public List<Attendance> getAllAttendance(){
			return service.getAllAttendance();
		}
		
		
		
		@GetMapping("/{employeeid}")
		public ResponseEntity<Attendance>getAttendanceById (@PathVariable long employeeid){
			Attendance attendance= service.getAttendanceById(employeeid);
			
			if(attendance!=null)
				return new ResponseEntity<Attendance>(attendance, HttpStatus.FOUND);
			else
				return new ResponseEntity<Attendance>(attendance, HttpStatus.NOT_FOUND);
		}
		
		
		@PutMapping("/{employeeid}")
		public ResponseEntity<Object> updateAttendance(@PathVariable long employeeid,@RequestBody Attendance newAttendance){
			Attendance attendance= service.updateAttendance(employeeid, newAttendance);
			
			if (attendance!=null)
				return new ResponseEntity<Object>(attendance,HttpStatus.OK);
			else
				return new ResponseEntity<Object>("Attendance is not Available to Update",HttpStatus.NOT_FOUND);
		}
		
		
		@DeleteMapping("/{employeeid}")
		public ResponseEntity<String>deleteAttendance(@PathVariable long employeeid){
			boolean result = service.deleteAttendance(employeeid);
			if(result) 
				return new ResponseEntity<String>("Object Deleted",HttpStatus.OK);
			else
				return new ResponseEntity<String>("NO user Found", HttpStatus.NOT_FOUND);
			
		}
	 
	}

