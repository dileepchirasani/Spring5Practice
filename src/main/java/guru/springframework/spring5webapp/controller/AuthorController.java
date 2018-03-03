package guru.springframework.spring5webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.spring5webapp.repository.AuthorRepository;

@Controller
public class AuthorController {
	
private AuthorRepository auRepository;

public AuthorController(AuthorRepository auRepository) {
	this.auRepository = auRepository;
}

@RequestMapping("/authors")
public String getAuthors(Model model) {
	model.addAttribute("authors",auRepository.findAll());
	return "authors";
}

}
