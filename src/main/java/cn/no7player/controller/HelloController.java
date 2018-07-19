package cn.no7player.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String greeting(@RequestParam(value="show", required=false, defaultValue="show") String show, Model model) {
        model.addAttribute("show", show);
        return "hello";
    }
    
}
