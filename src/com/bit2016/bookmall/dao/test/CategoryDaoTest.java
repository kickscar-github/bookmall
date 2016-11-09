package com.bit2016.bookmall.dao.test;

import java.util.List;

import com.bit2016.bookmall.dao.CategoryDao;
import com.bit2016.bookmall.vo.CategoryVo;

public class CategoryDaoTest {

	public static void main(String[] args) {
		//insert test
		//insertTest();

		//select test
		selectTest();
	}
	
	public static void selectTest() {
		List<CategoryVo> list = new CategoryDao().getList();
		for( CategoryVo vo : list ) {
			System.out.println( vo );
		}
	}
	
	public static void insertTest() {
		CategoryDao dao = new CategoryDao();
		
		CategoryVo vo1 = new CategoryVo();
		vo1.setName( "컴퓨터/IT" );
		dao.insert(vo1);
		
		CategoryVo vo2 = new CategoryVo();
		vo2.setName( "경제" );
		dao.insert(vo2);
	}
}
