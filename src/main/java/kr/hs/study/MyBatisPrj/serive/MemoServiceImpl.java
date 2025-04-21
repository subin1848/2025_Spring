package kr.hs.study.MyBatisPrj.serive;

import kr.hs.study.MyBatisPrj.dao.MemoDAO;
import kr.hs.study.MyBatisPrj.dto.MemoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemoServiceImpl implements MemoService {
    @Autowired
    private MemoDAO m_dao;

    @Override
    public void insert(MemoDTO m_dto) {
        m_dao.insert(m_dto);
    }

    @Override
    public void update(int idx) {

    }

    @Override
    public void delete(int idx) {

    }

    @Override
    public List<MemoDTO> list() {
        return List.of();
    }
}
