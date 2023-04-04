package com.example.demo.controllers;

import com.example.demo.entities.Product;
import com.example.demo.entities.Specifications;
import com.example.demo.services.ProductRepository;
import com.example.demo.services.SpecificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
//@RequestMapping("/product")
public class ProductController {
    @Autowired
    public  ProductRepository productRepository;
    @Autowired
    public SpecificationRepository specificationRepository;
    @GetMapping("/product")
    public String getPrice(int id, Model model){
        var query=productRepository.findById(id);
        var product=query.get();
        var arrayList=new ArrayList<Specifications>();
        var query2=specificationRepository.findAll();

        for (Specifications specifications:query2)
        {
            arrayList.add(specifications);
        }
        model.addAttribute("nameSpecifications",arrayList);

           // model.addAttribute("I",id);
            model.addAttribute("name",product.getName());
        return "product";
    }

}
