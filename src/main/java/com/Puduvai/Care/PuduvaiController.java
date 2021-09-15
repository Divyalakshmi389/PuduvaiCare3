package com.Puduvai.Care;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class PuduvaiController {
	
	@Autowired
	ApiFetching apiFetching;
	
	@GetMapping("/")
	public String home(Model model)
	{
		List<Tracker> result=apiFetching.getResult();
		
		model.addAttribute("result",result);
		
		
		   return "Front";
	}

}
