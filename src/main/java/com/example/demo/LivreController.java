package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.classes.Livre;

@Controller
public class LivreController {
@RequestMapping(method =RequestMethod.GET,path = "livre" )
public String getLivre(Model m)
{
	Livre l=new Livre("mon livre", "Moi", 3);
	m.addAttribute("livre",l.toString());
	return "livre";
}
@GetMapping("")
public String createLivre()
{
return "create";	
}



}
