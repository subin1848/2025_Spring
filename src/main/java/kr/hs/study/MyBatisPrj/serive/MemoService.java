package kr.hs.study.MyBatisPrj.serive;

import kr.hs.study.MyBatisPrj.dto.MemoDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface MemoService {
    public void insert(MemoDTO m_dto);
    public void update(MemoDTO m_dto);
    public void delete(MemoDTO m_dto);
    public List<MemoDTO> listAll();
    public MemoDTO selectOne(int idx);
}
