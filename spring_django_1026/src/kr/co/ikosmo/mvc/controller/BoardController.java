package kr.co.ikosmo.mvc.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.ikosmo.mvc.dao.BoardDAO;
import kr.co.ikosmo.mvc.vo.BoardVO;

@Controller
public class BoardController {
   @Autowired
   private BoardDAO dao;
   
   @RequestMapping("/{step}")
   public String viewPage(@PathVariable String step) {
	   return step;
	   }
   
   @GetMapping(value="/boardlist")
   public String boardList(Model m) {
      List<BoardVO> lisv = dao.getBoardList();
      m.addAttribute("lisv",lisv);
      return "boardList";
   }   
   
   
   @RequestMapping(value = "/saveBoard")
   public String insertBoard(BoardVO vo) throws IOException{
	   dao.insertBoard(vo);
	   return "boardList";	  
	
}
   
   

}

