package com.abispring.demoproject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class AbiviewController {
	@GetMapping("/")
	public String myMethod(Model model) {
		model.addAttribute("name", "Abinaya from Ramnad");
		return "index";
	}
}
