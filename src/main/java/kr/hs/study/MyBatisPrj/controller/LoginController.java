package kr.hs.study.MyBatisPrj.controller;

import kr.hs.study.MyBatisPrj.dto.LoginDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String login(){
        return "login_input";
    }

    @PostMapping("login_result")
    public String login(@ModelAttribute LoginDTO l_dto, Model model){

        if(l_dto.getUserId().equals("subin@naver.com") && l_dto.getUserPass() == 1111){
            model.addAttribute("result", "로그인 성공!!!");
            return "login_result";
        }

        model.addAttribute("result", "로그인 실패!!!");

        return "login_result";
    }
}
