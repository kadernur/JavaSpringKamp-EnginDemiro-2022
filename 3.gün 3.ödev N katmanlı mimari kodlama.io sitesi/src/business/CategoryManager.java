package business;

import core.logging.Logger;
import dataAccess.category.CategoryDao;
import entities.Category;

public class CategoryManager {
	
	private CategoryDao categoryDao;
	private Logger[] loggers;
	
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
	
		this.categoryDao = categoryDao;
		this.loggers=loggers;
	}
	
	
	public void add(Category category) throws Exception
	{
		
			
		Category[] categories = {
				new Category(1,"Yazılım Kursları","Güzel kurslar vs."),
				new Category(2,"Donanım Kursları","Güzel kurslar vs."),
				new Category(3,"Veri Bilimi Kursları","Güzel kurslar vs.")
			
	};
		
		for (Category ctgry : categories) {
			if (ctgry.getCategoryName().equals(category.getCategoryName())) {
				
				System.out.println("Kategori isimleri aynı olamaz");
				throw new Exception("Lütfen yeni bir kategori ismi giriniz...");
			}
		}
		
		categoryDao.add(category);
		
		
		for (Logger logger : loggers) { 
			logger.log(category.getCategoryName());
		}
	}

}
