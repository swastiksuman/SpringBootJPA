package swastik.springframework.spring5webapp.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;




import swastik.springframework.spring5webapp.model.Book;
import swastik.springframework.spring5webapp.model.Publisher;
import swastik.springframework.spring5webapp.repository.BookRepository;

@Controller
public class BookController {
	
	private BookRepository bookRepository;
	
	public BookController(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}



	@RequestMapping("/books")
	public String getBooks(Model model){
		model.addAttribute("books",bookRepository.findAll());
		return "books";
	}
}
