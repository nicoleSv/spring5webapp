package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    private final static String AUTHORS = "authors";

    private final AuthorRepository authorController;

    public AuthorController(AuthorRepository authorController) {
        this.authorController = authorController;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model) {
        model.addAttribute(AUTHORS, authorController.findAll());
        return AUTHORS;
    }
}
