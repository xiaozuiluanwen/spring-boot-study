package com.wisely;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wisely.ch6_2_3.config.AuthorSettings;

//@ImportResource({"classpath:some-context.xml","classpath:another-context.xml"})
@RestController
@SpringBootApplication
public class ChApplication {
	
	@Autowired
	private AuthorSettings authorSettings;
	
	@Value("${book.author}")
	private String bookAuthor;
	
	@Value("${book.name}")
	private String bookName;

	@RequestMapping("/")
	String index() {
		return "book name is :" + bookName + " and book author is :" + bookAuthor;
	}
	
	@RequestMapping("/obj")
	String authorSettings() {
		return "author name is :" + authorSettings.getName() + " and author age is :" + authorSettings.getAge();
	}
	public static void main(String[] args) {
		SpringApplication.run(ChApplication.class, args);
	}
}
