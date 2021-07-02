package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.classes.Livre;

@Controller
public class LivreController {
@RequestMapping(method =RequestMethod.POST,path = "livre" )
public String getLivre(Model m,@RequestParam String titre,@RequestParam String auteur,@RequestParam double prix)
{
	Livre l=new Livre(titre,auteur,prix);
	m.addAttribute("livre",l.toString());
	return "livre";
}
@GetMapping("")
public String createLivre()
{
return "create";	
}



}
