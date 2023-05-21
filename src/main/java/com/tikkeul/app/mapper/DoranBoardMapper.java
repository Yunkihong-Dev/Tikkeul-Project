package com.tikkeul.app.mapper;

import com.tikkeul.app.domain.dto.DoranBoardDTO;
import com.tikkeul.app.domain.vo.DoranBoardVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface DoranBoardMapper {
    /*도란보드 최보근*/
//    게시글 목록
    public List<DoranBoardDTO> selectAll(Pagination pagination);

//    게시글 추가
    public void insert(DoranBoardVO doranBoardVO);

//    게시글 조회
    public Optional<DoranBoardDTO> select(Long Id);

//    게시글 수정
    public void update(DoranBoardDTO doranBoardDTO);

//    게시글 삭제
    public void delete(Long id);


}
