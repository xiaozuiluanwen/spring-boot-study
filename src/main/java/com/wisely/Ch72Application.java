package com.wisely;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class Ch72Application {

	@RequestMapping("/")
	public String index(Model model) {
		Person single = new Person("aa",11);
		
		java.util.List<Person> people = new ArrayList<Person>();
		Person person1 = new Person("xx",11);
		Person person2 = new Person("yy",11);
		Person person3 = new Person("zz",11);
		people.add(person1);
		people.add(person2);
		people.add(person3);
		
		model.addAttribute("singlePerson", single);
		model.addAttribute("people", people);
		
		return "thymeleaf";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Ch72Application.class, args);
	}
}
