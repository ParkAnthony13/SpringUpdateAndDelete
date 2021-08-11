package parkanthony.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import parkanthony.models.Book;
import parkanthony.repositories.BookRepository;

@Service
public class BookService {
	private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    public Book update(Long id, String title, String desc, String lang, int pages) {
    	Book edited = bookRepository.findById(id).get(); // repo find -> gets Optional and .get returns value (book instance or row)
    	edited.setTitle(title);
    	edited.setDescription(desc);
    	edited.setLanguage(lang);
    	edited.setNumberOfPages(pages); // we make edits
    	return bookRepository.save(edited); // use (dot)save and puts book row back into Repo data
    }
    public void deleteBook(Long id) {
    	Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            bookRepository.deleteById(id);
        }
    }
}
