package com.github.jjarfi.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/ustj")
public class IndexController {
    @RequestMapping("/home")
    private String home(ModelMap modelMap) {
        modelMap.addAttribute("halo");
        return "index";
    }
}
