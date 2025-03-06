package com.bj.training.crud.addressbook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class AddressbookController {
	
	@Autowired
	AddressbookService addressbookService;
	
	@RequestMapping(value = "/addressbook/addressbookXdmList")
	public String requestMethodName(Model model) {
		model.addAttribute("list", addressbookService.selectList());
		return "addressbook/addressbookXdmList";
	}

	@RequestMapping(value = "/addressbook/addressbookXdmView")
	public String addressbookXdmView(Model model, AddressbookDto addressbookDto) {
		model.addAttribute("item", addressbookService.selectOne(addressbookDto));
		return "addressbook/addressbookXdmView";
	}
	
	@RequestMapping(value = "/addressbook/addressbookXdmForm")
	public String addressbookXdmForm() {
		return "addressbook/addressbookXdmForm";
	}
	
	@RequestMapping(value = "/addressbook/addressbookXdmInst")
	public String addressbookXdmInst() {
		return "redirect:/addressbook/addressbookXdmList";
	}
	
	

}
