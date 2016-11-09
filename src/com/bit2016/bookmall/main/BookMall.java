package com.bit2016.bookmall.main;

import java.util.List;

import com.bit2016.bookmall.dao.CategoryDao;
import com.bit2016.bookmall.vo.CategoryVo;

public class BookMall {

	public static void main(String[] args) {
		
		CategoryDao dao = new CategoryDao();
		List<CategoryVo> list = dao.getList();
		
		System.out.println( "========= 카테고리 리스트  =======");
		for(CategoryVo vo : list ) {
			System.out.println( vo );
		}
		
	}

}
