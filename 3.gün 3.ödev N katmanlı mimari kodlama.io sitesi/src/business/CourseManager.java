package business;

import core.logging.Logger;
import dataAccess.course.CourseDao;
import entities.Course;

public class CourseManager {
	
	private CourseDao courseDao;
	private Logger[] loggers;
	
	
	
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	public void add(Course course) throws Exception 
	{
		
		Course[] courses= {
				new Course(1,"C",0),
				new Course(2,"C#",242),
				new Course(3,"Java",500)
		};
		
		for(Course crs:courses)
		{
			if(crs.getCourseName().equals(courses))
			{
				System.out.println("Kurs isimleri aynı olamaz.");
				throw new Exception("Lütfen farklı bir kurs ismi giriniz...");
			}
		}
		
		
		if(course.getPrice()<0.0)
		{
			System.out.println("Bir kursun fiyatı 0'dan düşük olamaz");
			throw new Exception("Lütfen kursun fiyatını en az 0 olacak şekilde tekrar giriniz...");
		}
		
		courseDao.add(course);
		
		for(Logger logger : loggers)
		{
			logger.log(course.getCourseName());
		}
			
		
	}
	
	

}
