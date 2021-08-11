package parkanthony.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import parkanthony.models.Book;



@Repository
public interface BookRepository extends CrudRepository<Book, Long>{ // the table name and the key type Long
	// this method retrieves all the books from the database
	List<Book> findAll();
	// this method finds books with descriptions containing the search string
	List<Book> findByDescriptionContaining(String search);
	// this method counts how many title contain a certain string
	Long countByTitleContaining(String search);
	// this method deletes a book that starts with a specific title
	Long deleteByTitleStartingWith(String search);
}
