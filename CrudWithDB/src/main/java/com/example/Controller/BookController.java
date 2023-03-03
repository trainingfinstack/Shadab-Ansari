package com.example.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
import com.example.models.Book;
import com.example.repo.BookRepo;
@RestController
public class BookController {
	@Autowired
	BookRepo bookRepository;
	@PostMapping("/bookSave")
	public String insertBook(@RequestBody Book book) {
		bookRepository.save(book);
		return "Your record is saved successfully !!";
	}
	@PostMapping("/multipleBookSave")
	public String insertBook(@RequestBody List<Book> book) {
		bookRepository.saveAll(book);
		return "Your record is saved successfully !!";
	}
	@GetMapping("/getAllBook")
	public List<Book> getBook(){ 
		return (List<Book>) bookRepository.findAll();
	}
	@GetMapping("getByBookName/{name}")
	public List<Book> getBook(@PathVariable("name") String bookName){
		return (List<Book>) bookRepository.findBybookName(bookName);
	}
	@GetMapping("/getByBookId/{bookId}")
	public Optional<Book> getBookId(@PathVariable("bookId") Long id) {
		return bookRepository.findById(id);
	}
}
