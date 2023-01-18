package com.green.boardController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.green.boardDao.BoardDao;
import com.green.boardService.BoardService;
import com.green.vo.BoardVo;

@Controller
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	@RequestMapping("/boardList")
	public String list(Model model) {
		List<BoardVo> list = boardService.selectAll();
		System.out.println(list.get(0).getTitle());
		model.addAttribute("list", list);
	
		return "board/boardList";
	}
	
	@RequestMapping("/boardDetail")
	public ModelAndView view(@RequestParam String num) {
		boardService.readCount();
		BoardVo board = boardService.selectByNum(num);
		return new ModelAndView("board/boardDetail","board", board);
	}
	
	@RequestMapping("/boardWrite")
	public String boardWrite(@ModelAttribute BoardVo board) {
		boardService.boardWrite(board);
		return "board/boardWrite";
	}
	
//	@GetMapping("/boardWrite")
//	public String boardWrite(/*@ModelAttribute BoardVo board*/) {
////		boardDao.boardWrite(board);
//		return "board/boardWrite";
//	}
//	
//	@PostMapping("/boardWrite")
//	public String boardWrite2(@ModelAttribute BoardVo board) {
//		boardService.boardWrite(board);
//		return "board/boardList";
//	}
	
	@RequestMapping("/boardUpdate")
	public String boardUpdate(@ModelAttribute String num) {
		boardService.boardUpdate(num);
		return "redirect:/boardDetail";
	}
	
	@RequestMapping("/boardDelete")
	public String boardDelete(@PathVariable String num) {
		boardService.boardDelete(num);
		return "board/boardList";
	}
	
	//페이징 삭제시
}
