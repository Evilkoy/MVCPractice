package com.makson.mvcleaf.controller;

import com.makson.mvcleaf.service.FactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @Autowired
    private FactService factService;

    @GetMapping("/")
    public String goToHome(Model model) {
        model.addAttribute("head", "Choose");
        return "home";
    }

    @GetMapping("/home")
    public String getHello(Model model) {
        model.addAttribute("head", "Choose");
        return "home";
    }

    @GetMapping("/trivia")
    public String getTrivia(Model model) {
        model.addAttribute("head", "Trivia");
        model.addAttribute("fact", factService.getFact("trivia"));
        return "home";
    }

    @GetMapping("/year")
    public String getYear(Model model) {
        model.addAttribute("head", "Year");
        model.addAttribute("fact", factService.getFact("year"));
        return "home";
    }

    @GetMapping("/date")
    public String getDate(Model model) {
        model.addAttribute("head", "Date");
        model.addAttribute("fact", factService.getFact("date"));
        return "home";
    }

    @GetMapping("/math")
    public String getMath(Model model) {
        model.addAttribute("head", "Math");
        model.addAttribute("fact", factService.getFact("math"));
        return "home";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("head", "About application");
        model.addAttribute("fact", "All facts are taken from the site numbersapi.com, you can choose any option you want, to get some interesting information");
        return "about";
    }
}
