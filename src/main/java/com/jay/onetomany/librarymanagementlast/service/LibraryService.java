package com.jay.onetomany.librarymanagementlast.service;

import com.jay.onetomany.librarymanagementlast.entity.*;
import com.jay.onetomany.librarymanagementlast.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class LibraryService {

    @Autowired
    AuthorsRepository authorsRepository;

    @Autowired
    BookAuthorsRepo bookAuthorsRepo;

    @Autowired
    BooksRepo booksRepo;


    @Autowired
    GenresRepo genresRepo;

    @Autowired
    PublishersRepo publishersRepo;

    @Autowired
    MembersRepo membersRepo;

    @Autowired
    TransactionsRepo transactionsRepo;

  public Object addAuthors(Authors authors)
  {

      return authorsRepository.save(authors);

  }

  public Object addBook(BookAuthors bookAuthors)
  {
      return bookAuthorsRepo.save(bookAuthors);
  }

  public Object addGenre(Genres genres)
  {
      return genresRepo.save(genres);
  }

    public Object addPublishers(Publishers publishers)
    {
        return publishersRepo.save(publishers);
    }

    public Object addFullBook(Books book)
    {
        return booksRepo.save(book);
    }

    public Object addMember(Members members)
    {
        return membersRepo.save(members);
    }

    public Object newTransaction(Transactions transactions)
    {
        LocalDateTime now = LocalDateTime.now();

        LocalDateTime dueDate=now.plusWeeks(2);
        if(transactions.getTransactionType().equals("borrow"))
        {

            Books books = booksRepo.findByBookId(transactions.getBookId());

            if(books.getQuantity() == 1)
                     books.setQuantity(0);
            else
            {
                return "The book you want is not available";
            }

            booksRepo.save(books);
            transactions.setReturnDate(null);
            transactionsRepo.save(transactions);


        }

        else{
            Books books = booksRepo.findByBookId(transactions.getBookId());

            books.setQuantity(1);

            booksRepo.save(books);
            transactions.setReturnDate(now);
            transactionsRepo.save(transactions);

        }

        transactions.setDueDate(dueDate);
        transactionsRepo.save(transactions);
        return transactions;
    }

    public Object booksAvailable()
    {
        return booksRepo.findAll();
    }
    public Object generesAvailable()
    {
        Set<Long> s = booksRepo.findByBook();

        Set<String> s1= genresRepo.findByIdd(s);
        return s1;

    }

    public Object deleteBookByName(String name)
    {
        long bookId = booksRepo.findByBookName(name);

        booksRepo.deleteById(bookId);

        return "book deleted successfully";
    }



}
