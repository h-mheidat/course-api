package io.javabrains.springbootstarter.course;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class CourseService {
	
	@Autowired
	private CourseDAO courseDAO;

	public List<Course> getAllCourse(String topicId) {
		List <Course> courses = new ArrayList<>();
		courseDAO.findByTopicId(topicId)
		.forEach(courses::add);
		return courses ;
	}
	
	public Optional<Course> getCourse(String id) {
		return courseDAO.findById(id);
	}
	
	public void addCourses(Course course) {
		courseDAO.save(course);
	}

	public void updateCourse(Course course) {
		courseDAO.save(course);
	}

	public void deleteCourse(String id) {
		courseDAO.deleteById(id);
	}

}
