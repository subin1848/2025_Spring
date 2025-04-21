package kr.hs.study.MyBatisPrj.controller;

import kr.hs.study.MyBatisPrj.dto.ScoreDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ScoreController {
    @GetMapping("/score")
    public String Score(){
        return "score_input";
    }

    @PostMapping("score_result")
    public String Score(@ModelAttribute ScoreDTO s_dto, Model model){

        s_dto.setSum(s_dto.getKor() + s_dto.getEng() + s_dto.getMath());
        s_dto.setAvg(s_dto.getSum()/3.0);

        model.addAttribute("s_result", s_dto);

        return "score_result";
    }
}
