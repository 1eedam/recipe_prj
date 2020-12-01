package kr.co.ikosmo.mvc.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.ikosmo.mvc.vo.BoardVO;

@Repository
public class BoardDAO {

   
   @Autowired
   private SqlSessionTemplate ss;
   
   public List<BoardVO> getBoardList(){
      
      //
      return ss.selectList("board.list");
   }
   
   
   public void insertBoard(BoardVO vo) {
	   System.out.println("inserBoard호출");
	   ss.insert("board.insert", vo);
	
}
   
   
   
}