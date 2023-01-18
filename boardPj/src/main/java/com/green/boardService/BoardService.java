package com.green.boardService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.boardDao.BoardDao;
import com.green.vo.BoardVo;

public class BoardService {
	
	
	@Autowired
	private BoardDao boardDao;
	
	//전체읽어오기
	public List<BoardVo> selectAll(){
		return boardDao.selectAll(); 
	}
	
	//조회수
	public void readCount() {}
	
	//상세보기
	public BoardVo selectByNum(String num) {
		return boardDao.selectByNum(num);
	}
	
	//글쓰기
	public void boardWrite(BoardVo board) {}
	
	//글수정
	public void boardUpdate(String num) {}
	
	public void boardDelete(String num) {}
	
	
	
	
	
}
