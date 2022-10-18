package dataAccess.category;

import java.util.List;

import entities.Category;

public class HibernateCategoryDao implements CategoryDao {
	
	

	@Override
	public void add(Category category) {
		
		
		System.out.println("Categori hibernate ile veri tabanına eklendi. " + category);
		
		
	}

	
}
