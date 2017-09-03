package swastik.springframework.spring5webapp.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import swastik.springframework.spring5webapp.model.Author;
import swastik.springframework.spring5webapp.model.Book;
import swastik.springframework.spring5webapp.model.Publisher;
import swastik.springframework.spring5webapp.repository.AuthorRepository;
import swastik.springframework.spring5webapp.repository.BookRepository;
import swastik.springframework.spring5webapp.repository.PublisherRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>{
	
	private AuthorRepository authorRepository;
	private BookRepository bookRepository;
	private PublisherRepository publisherRepository;
	
	public DevBootstrap(AuthorRepository authorRepository,
			BookRepository bookRepository, PublisherRepository publisherRepository) {
		super();
		this.publisherRepository = publisherRepository;
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		initData();
	}
	
	private void initData(){
		Publisher publisher = new Publisher();
		publisher.setAddress("Chowringhee");
		publisherRepository.save(publisher);
		publisher.setName("McMillan");
		Author eric = new Author("eric", "evans");
		Book book = new Book("acasdc", "1234", publisher);
		eric.getBooks().add(book);
		book.getAuthors().add(eric);
		authorRepository.save(eric);
		bookRepository.save(book);
	}

}
