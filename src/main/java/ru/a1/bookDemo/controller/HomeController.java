package ru.a1.bookDemo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.a1.bookDemo.repo.BookRepository;

@Controller
public class HomeController {

    private BookRepository bookRepository;

    @Autowired
    public HomeController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/")
    public String getIndex(Model model)  {
        model.addAttribute("books", bookRepository.findAll());
        return "index";
    }
}
