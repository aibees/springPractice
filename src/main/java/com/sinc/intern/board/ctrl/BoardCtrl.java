package com.sinc.intern.board.ctrl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.sinc.intern.board.service.BoardService;

@Controller
public class BoardCtrl {
	
	@Resource(name="boardS")
	private BoardService service;
	
	@RequestMapping("/board/listPage.do")
	public String getBoardList(Model model) {
		List<Object> boardList = service.getList();
		System.out.println(boardList);
		model.addAttribute("list", boardList);
		return "/board/listPage";
	}
}
