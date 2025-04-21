package kr.hs.study.MyBatisPrj.serive;

import kr.hs.study.MyBatisPrj.dto.MemoDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface MemoService {
//    추상메서드 : crud 삽입, 조회, 수정, 삭제
//  1. insert
    public void insert(MemoDTO m_dto);
//  2. update
    public void update(int idx);
//  3. delete
    public void delete(int idx);
//  4. select
    public List<MemoDTO> list();

}
