package com.valdnersilva.bookstoremaneger.repository;

import com.valdnersilva.bookstoremaneger.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
