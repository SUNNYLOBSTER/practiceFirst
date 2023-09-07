package com.min.edu.model;

import java.util.List;
import java.util.Map;

import com.min.edu.dto.RootBoardDto;

public interface IBoard {
	
//	전체 글 조회
	public List<RootBoardDto> rootSelect();

//	상세 조회
	public List<RootBoardDto> detailSelect(int seq);

//	Root글 입력
	public boolean insertRoot(Map<String, Object> map);

//	답글 입력
	public boolean insertReply(Map<String, Object> map);

//	root글 수정
	public boolean updateRoot(Map<String, Object> map);

//	root글 삭제
	public boolean deleteRoot(int seq);
	
//	답글 수정
	public boolean updateReply(Map<String, Object> map);
	
//	답글 삭제
	public boolean deleteReply(int ref);

}
