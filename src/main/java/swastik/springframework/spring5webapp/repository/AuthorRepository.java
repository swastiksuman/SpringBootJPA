package swastik.springframework.spring5webapp.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import swastik.springframework.spring5webapp.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{
}
