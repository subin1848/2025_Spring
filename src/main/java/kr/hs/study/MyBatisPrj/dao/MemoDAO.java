package kr.hs.study.MyBatisPrj.dao;

import kr.hs.study.MyBatisPrj.dto.MemoDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemoDAO {
    public void insert(MemoDTO m_dto);
    public void update(MemoDTO m_dto);
    public void delete(int idx);
    public List<MemoDTO> listAll();
    public MemoDTO selectOne(int idx);
}
