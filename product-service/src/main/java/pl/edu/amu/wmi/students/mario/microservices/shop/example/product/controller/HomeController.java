package pl.edu.amu.wmi.students.mario.microservices.shop.example.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Mariusz on 2017-06-04.
 */
@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping
    public String home() {
        return "redirect:/swagger-ui.html";
    }
}
