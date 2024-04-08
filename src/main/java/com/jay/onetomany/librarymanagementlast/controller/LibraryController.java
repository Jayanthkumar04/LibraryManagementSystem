package com.jay.onetomany.librarymanagementlast.controller;

import com.jay.onetomany.librarymanagementlast.entity.*;
import com.jay.onetomany.librarymanagementlast.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;

@RestController
@RequestMapping("library")
public class LibraryController {

    @Autowired
    LibraryService libraryService;



    @PostMapping("addAuthors")
    public Object addAuthors(@RequestBody Authors authors)
    {

         return libraryService.addAuthors(authors);

    }
    @PostMapping("addBook")
    public Object addBook(@RequestBody BookAuthors bookAuthors)
    {
        return libraryService.addBook(bookAuthors);

    }

    @PostMapping("addGenres")
    public Object addGenre(@RequestBody Genres genres)
    {
        return libraryService.addGenre(genres);
    }

    @PostMapping("addPublishers")
    public Object addPublishers(@RequestBody Publishers publishers)
    {
        return libraryService.addPublishers(publishers);
    }

    @PostMapping("addFullBook")
    public Object addFullBook(@RequestBody Books book)
    {
        return libraryService.addFullBook(book);
    }


    @PostMapping("addMember")
    public Object addMember(@RequestBody Members members)
    {
        return libraryService.addMember(members);
    }

    @PostMapping("transaction")
    public Object newTransaction(@RequestBody Transactions transactions)
    {
        return libraryService.newTransaction(transactions);
    }

    @GetMapping("booksAvailable")
    public Object booksAvailable()
    {
        return libraryService.booksAvailable();
    }

    @GetMapping("generesAvailable")

    public Object generesAvailable()
    {
        return libraryService.generesAvailable();
    }

    @DeleteMapping("/deleteBook/{name}")
    public Object deleteBookByName(@PathVariable String name)
    {
        return libraryService.deleteBookByName(name);
    }


}
