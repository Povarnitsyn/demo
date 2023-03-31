package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@RequestMapping("/product")
public class ProductController {

@GetMapping("/product")
public String getPrice(String price, Model model){
		 model.addAttribute("price",price);
    return "product";
}

}
