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

import java.util.List;

@Controller
public class MemoController {
    @Autowired
    private MemoService service;

    @GetMapping("/Memo")
    public String listAll(Model model) {
        List<MemoDTO> all = service.listAll();
        model.addAttribute("data", all);
        return "memo_input";
    }

    @PostMapping("/write_done")
    public String insert(MemoDTO dto){
        service.insert(dto);
        return "redirect:/Memo";
    }

    @GetMapping("/edit/{idx}")
    public String edit_form(@PathVariable("idx") int idx, Model model){
        System.out.println("idx : " + idx);
        MemoDTO dto = service.selectOne(idx);
        model.addAttribute("one", dto);
        return "edit_form";
    }

    @PostMapping("/edit")
    public String edit_form(MemoDTO dto){
        service.update(dto);
        return "redirect:/Memo";
    }
}
