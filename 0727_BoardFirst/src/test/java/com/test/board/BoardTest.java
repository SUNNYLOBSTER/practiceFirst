package com.test.board;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.min.edu.dto.RootBoardDto;
import com.min.edu.model.BoardImpl;
import com.min.edu.model.IBoard;

public class BoardTest {

	@Test
	public void test() {
		IBoard dao = new BoardImpl();

//		List<RootBoardDto> lists = dao.rootSelect();
		
		List<RootBoardDto> lists = dao.detailSelect(1);
		
		assertNotNull(lists);
		
		
	}

}
