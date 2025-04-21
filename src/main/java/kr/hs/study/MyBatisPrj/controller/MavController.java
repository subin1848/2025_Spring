package kr.hs.study.MyBatisPrj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MavController {
    @GetMapping("/mav")
    public ModelAndView mav(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("item", "lay Devine");
//        item이라는 박스에 lay Devine(data)을 넣는 st..
        mv.setViewName("mav_result");
        return mv;
    }
}
