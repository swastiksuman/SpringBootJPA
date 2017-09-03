package swastik.springframework.spring5webapp.repository;

import org.springframework.data.repository.CrudRepository;

import swastik.springframework.spring5webapp.model.Book;
import swastik.springframework.spring5webapp.model.Publisher;

public interface PublisherRepository  extends CrudRepository<Publisher, Long>{

}
