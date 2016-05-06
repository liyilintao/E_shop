package cn.it.shop.sevice.impl;
import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.it.shop.model.Category;
import cn.it.shop.service.CategoryService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:beans.xml")
public class CategoryServiceImplTest {

	@Resource
	private CategoryService categoryService;
	
	@Test
	public void testSave() {
		categoryService.save(new Category("����һ��", true));
	}

	@Test
	public void testUpdate() {
		categoryService.update(new Category(2, "����һ��2", true));
	}

	@Test
	public void testGet() {
		System.out.println(categoryService.get(2));
	}

	@Test
	public void testQuery() {
		for(Category temp : categoryService.query()) {
			System.out.println(temp);
		}
	}

	@Test
	public void testDelete() {
		categoryService.delete(3);
	}
	
	@Test
	public void testQueryJoinAccount() {
		for(Category c : categoryService.queryJoinAccount("",1,2)) {
			System.out.println(c + "," + c.getAccount());
		}
	}
	
	@Test
	public void testGetCount() {
		System.out.println(categoryService.getCount(""));
	}
}
