package ru.a1.bookDemo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.a1.bookDemo.model.Book;

import java.util.Optional;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

}
