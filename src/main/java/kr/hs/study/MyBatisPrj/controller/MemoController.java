package kr.hs.study.MyBatisPrj.controller;

import kr.hs.study.MyBatisPrj.dto.MemoDTO;
import kr.hs.study.MyBatisPrj.serive.MemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemoController {
    @Autowired
    private MemoService service;

    @GetMapping("Memo")
    public String memo(){
        return "memo_input";
    }
    @PostMapping("/memo_result")
    public String insert(MemoDTO m_DTO){
        System.out.println("a:"+m_DTO.getMemo());
        service.insert(m_DTO);
        return "memo_result";
    }
}
