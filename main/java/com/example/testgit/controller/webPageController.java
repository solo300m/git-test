package com.example.testgit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.logging.Logger;

@Controller
public class webPageController {

    @GetMapping("/")
    public String startPage(Model model){
        model.addAttribute("title", "Главная страница сайта.");
        Logger.getLogger(webPageController.class.getSimpleName()).info("get controller "+webPageController.class.getSimpleName());
        return "index";
    }
}
