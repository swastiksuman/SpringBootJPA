package swastik.springframework.spring5webapp.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import swastik.springframework.spring5webapp.model.Author;
import swastik.springframework.spring5webapp.model.Book;

public interface BookRepository extends CrudRepository<Book, Long>{
}
