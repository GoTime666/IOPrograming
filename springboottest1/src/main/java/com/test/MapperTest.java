package com.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.MySpringBootApplication;
import com.bean.Book;
import com.mapper.BookMapper;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=MySpringBootApplication.class)
public class MapperTest {
	@Autowired
	private BookMapper bookMapper;
	
	@Test
	public void test() {
		List<Book> books=bookMapper.queryAllBook();
		System.out.println(books);
	}
}
