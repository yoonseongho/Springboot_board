package com.board.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class mainController {
	
	@GetMapping("/jump")
	@ResponseBody
	public String index() {
		return "index";
	}
	
	@GetMapping("/")
	public String root() {
		return "redirect:/question/list";
	}
}