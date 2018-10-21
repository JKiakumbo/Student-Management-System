package pl.jkiakumbo.studentmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.jkiakumbo.studentmanagement.dao.CoursesDAO;
import pl.jkiakumbo.studentmanagement.dao.StudentDAO;
import pl.jkiakumbo.studentmanagement.pojo.Course;
import pl.jkiakumbo.studentmanagement.pojo.Student;

@Service("studentManagementService")
public class StudentManagementService {

	private CoursesDAO coursesDAO;
	private StudentDAO studentDAO;
		
	
	@Autowired
	public void setCoursesDAo(CoursesDAO coursesDAO)
	{
		this.coursesDAO = coursesDAO;
	}
	
	@Autowired
	public void setStudentDAO(StudentDAO studentDAO)
	{
		this.studentDAO = studentDAO;
	}
	
	public List<Course> getCourses()
	{
		return coursesDAO.getCourses();
	}
	
	
	public Student getStudent(String emailId)
	{
		return studentDAO.getStudent(emailId);
	}
}
