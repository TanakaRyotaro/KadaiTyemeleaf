package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class InputController {
    @GetMapping("/input")
    public String getInput(@RequestParam("previous") String previous,Model model) {
        //文字列をModelに登録
        model.addAttribute("msg","値を入力してください");
        model.addAttribute("msg2","前回入力された値は「"+ previous +"」でした。");
        model.addAttribute("previous",previous);
        //outputに画面遷移
        return "input";
    }
}