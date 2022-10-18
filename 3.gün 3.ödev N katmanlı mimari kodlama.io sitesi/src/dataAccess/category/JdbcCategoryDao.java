package dataAccess.category;

import java.util.List;

import entities.Category;

public class JdbcCategoryDao implements CategoryDao {
	


	@Override
	public void add(Category category) {
		
		
		System.out.println("Jdbc ile veri tabanına eklendi. " + category);
		
		
	}



}
