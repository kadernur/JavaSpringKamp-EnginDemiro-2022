import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.category.HibernateCategoryDao;
import dataAccess.category.JdbcCategoryDao;
import dataAccess.course.HibernateCourseDao;
import dataAccess.instructor.JdbcInstructorDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		
		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger() };
		Category category = new Category(2,"Frontend", "Yeni kurs");
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(),loggers);
		categoryManager.add(category);
		System.out.println("*******************\n");
		
		
		Course course=new Course(4,"PHP",0);
		CourseManager courseManager=new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.add(course);
		System.out.println("*******************\n");
		
		
		Instructor instructor=new Instructor(1,"Kader Nur", "Tekin");
		InstructorManager instructorManager=new InstructorManager(new JdbcInstructorDao(), loggers);
		instructorManager.add(instructor);
		System.out.println("*******************\n");
		
	}

}
