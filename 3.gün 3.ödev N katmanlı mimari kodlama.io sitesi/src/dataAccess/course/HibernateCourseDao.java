package dataAccess.course;

import entities.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("kursu hibernate ile veri tabanına eklendi.: " +course);
		
	}

}
