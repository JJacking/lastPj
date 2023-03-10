package com.green.boardDao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.green.vo.BoardVo;
import com.green.vo.CommentVo;

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
	public BoardVo selectByNum(int num) {
		return sqlSession.selectOne("mybatis.mapper.board.selectByNum",num);
	}
	
	//조회수증가
	public void readCount(int num) {
		sqlSession.selectOne("mybatis.mapper.board.readCount",num);
	}
	
	//게시판등록
	public void boardWrite(BoardVo bVo) {
		sqlSession.insert("mybatis.mapper.board.boardWrite",bVo);
	}
	
	//게시판 수정
	public void boardUpdate(BoardVo bVo) {
		sqlSession.update("mybatis.mapper.board.boardUpdate",bVo);
	}
	
	//게시판 삭제
	public void boardDelete(int num) {
		sqlSession.delete("mybatis.mapper.board.boardDelete",num);
	}
	
	//댓글등록
	public void commentWrite(CommentVo cVo) {
		sqlSession.insert("mybatis.mapper.comment.commentWrite",cVo);
	}
	
	//댓글불러오기
	public List<CommentVo> selectTargetComment(int num) {
		return sqlSession.selectList("mybatis.mapper.comment.selectTargetComment",num);
	}
	
	
	//댓글수정
	public void commentUpdate(CommentVo cVo) {
		sqlSession.update("mybatis.mapper.comment.commentUpdate",cVo);
	}
	
	//댓글삭제
	public void commentDelete(int cno) {
		sqlSession.delete("mybatis.mapper.comment.commentDelete",cno);
	}
	
	
}

