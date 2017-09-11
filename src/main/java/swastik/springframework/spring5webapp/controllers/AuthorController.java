package swastik.springframework.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import swastik.springframework.spring5webapp.repository.AuthorRepository;

@Controller
public class AuthorController {
	
	
	private AuthorRepository authorRepository;
	
	public AuthorController(AuthorRepository authorRepository) {
		super();
		this.authorRepository = authorRepository;
	}



	@RequestMapping("/authors")
	public String getBooks(Model model){
		model.addAttribute("authors",authorRepository.findAll());
		return "authors";
	}

}
