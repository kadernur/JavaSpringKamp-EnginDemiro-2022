package dataAccess.instructor;

import entities.Instructor;

public class JdbcInstructorDao  implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Instructor Jdbc ile veri tabanına eklendi." +instructor);
		
	}
	

}
