package com.sinc.intern.board.ctrl;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sinc.intern.board.model.vo.BoardDTO;
import com.sinc.intern.board.model.vo.BoardVO;
import com.sinc.intern.board.service.BoardService;


/*
 * Dashboard CRUD를 위한 Controller
 * 
 * */
@Controller
public class BoardCtrl {
	
	@Resource(name="boardS")
	private BoardService service;
	
	
	@RequestMapping("/board/listPage.do")
	public String getBoardList(Model model) {
		List<Object> boardList = service.getList();
		model.addAttribute("list", boardList);
		return "/board/listPage";
	}
	
	
	@RequestMapping("/board/registerForm.do")
	public String newBoard() {
		return "board/register";
	}
	
	
	@RequestMapping(value="/board/register.do", method=RequestMethod.POST)
	public String newRegister(BoardDTO boardDTO) {
		int insertResult = service.registerBoard(boardDTO);
		
		if(insertResult == 0) { // error
			return "error_common";
		}
		else { // success
			return "redirect:/board/listPage.do";
		}
	}
	
	@RequestMapping(value="/board/readPage.do", method=RequestMethod.GET)
	public String viewContent(@RequestParam("seq") int seq, Model model) {
		Object result = service.getData(seq);
		model.addAttribute("board", result);
		return "board/readPage";
	}
	
	@RequestMapping(value="/board/removePage.do", method=RequestMethod.GET)
	public String removeContent(@RequestParam("seq") int seq, Model model) {
		int removeResult = service.removeData(seq);
		if(removeResult == 1) {
			return "redirect:/board/listPage.do";
		}
		else {
			return "error_common";
		}
	}
	
	@RequestMapping(value="/board/modifyPage.do", method=RequestMethod.GET)
	public String modifyContent(BoardVO boardvo, Model model) {
		int modifyResult = service.modifyData(boardvo);
		if(modifyResult == 1) {
			return "redirect:/board/listPage.do";
		}
		else {
			return "error_common";
		}
	}
	
	@RequestMapping(value="/board/search.do", method=RequestMethod.POST)
	public List<Object> searchList(@RequestBody HashMap<String, Object> map) {
//		map.put("type", type);
//		map.put("keyword", keyword);
//		
		System.out.println(map);
		
		return service.searchData(map);
	}
}
