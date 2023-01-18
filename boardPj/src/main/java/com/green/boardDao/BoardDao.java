package com.green.boardDao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.green.vo.BoardVo;

public class BoardDao {
	
//------------------------------------------------------------
	@Autowired
	private SqlSession sqlSession;

//-----------------------------------------------------------
	//게시판 전체
	public List<BoardVo> selectAll(){
		return sqlSession.selectList("mybatis.mapper.board.selectAll");
	}
	
	//상세게시판
	public BoardVo selectByNum(String num) {
		return sqlSession.selectOne("mybatis.mapper.board.selectByNum",num);
	}
	
	//조회수증가
	public int readCount() {
		return sqlSession.selectOne("mybatis.mapper.board.readCount");
	}
	
	//게시판등록
	public void boardWrite(BoardVo bVo) {
		sqlSession.insert("mybatis.mapper.board.boardWrite");
	}
	
	//게시판 수정
	public void boardUpdate(String num) {
		sqlSession.update("mybatis.mapper.board.boardUpdate");
	}
	
	//게시판 삭제
	public void boardDelete(String num) {
		sqlSession.delete("mybatis.mapper.board.boardDelete");
	}
	
	//이메일인증
	public BoardVo selectByEmail(String email) {
		return sqlSession.selectOne("mybatis.mapper.board.selectByEmail");
	}
}

