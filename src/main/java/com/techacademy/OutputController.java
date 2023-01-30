package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class OutputController {
    @PostMapping("/output")
    public String postOutput(@RequestParam("previous") String previous, Model model) {
        model.addAttribute("msg","入力された値は「"+ previous +"」です。");
        model.addAttribute("previous",previous);
        return "output";
    }
}