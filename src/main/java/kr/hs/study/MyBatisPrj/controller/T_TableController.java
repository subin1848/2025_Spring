package kr.hs.study.MyBatisPrj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class T_TableController {
    @GetMapping("/t_table")
    public String ttable(){
        return "table_input";
    }
    @PostMapping("table_result")
    public String ttable(@RequestParam("t_table_num") int t_table_num, Model model){
        String result = "";
        for(int i = 1; i < 10; i++){
            result += (t_table_num + " X " + i + " = " + t_table_num*i + "\r\n");

        }
        model.addAttribute("list", result);
        return "result";
    }


}
