package com.example.Phonebook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.Phonebook.domain.Phonebook;
import com.example.Phonebook.service.PhonebookService;

@Controller
public class PhonebookController {
 
	@Autowired
	private PhonebookService service;
	
	@GetMapping("/")
	public String viewHomePage(Model model) {
List<Phonebook> listphonebook = service.listAll();
model.addAttribute("listphonebook", listphonebook);
System.out.print("Get /");
return "index";
}
	@GetMapping("/new")
	public String add(Model model) {
		model.addAttribute("phonebook", new Phonebook());
		return "new";
	}
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String savePhonebook(@ModelAttribute("phonebook")Phonebook std) {
		service.save(std);
		return "redirect:/";
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditPhoneBookPage(@PathVariable(name="id")int id) {
	ModelAndView mav =new ModelAndView("new");
	Phonebook std = service.get(id);
	mav.addObject("phonebook",std);
	return mav;
	}
	@RequestMapping("/delete/{id}")
	public String deletephonebook(@PathVariable(name="id")int id ) {
	service.delete(id);
	return "redirect:/";

	}
	

}
