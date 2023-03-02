 package com.example.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.models.Book;
@Component
public interface BookRepo extends JpaRepository<Book,Long>  {

}
