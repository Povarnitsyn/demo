package com.example.demo.controllers;

import com.example.demo.entities.Product;
import com.example.demo.services.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@RequestMapping("/product")
public class ProductController {
    @Autowired
    public  ProductRepository productRepository;
    @GetMapping("/product")
    public String getPrice(int id, Model model){
        var query=productRepository.findById(id);
        var product=query.get();

           // model.addAttribute("I",id);
            model.addAttribute("name",product.getName());
        return "product";
    }

}
