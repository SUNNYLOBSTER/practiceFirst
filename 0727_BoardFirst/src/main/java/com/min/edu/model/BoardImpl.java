package com.min.edu.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.min.edu.database.SqlsessionFactoryManager;
import com.min.edu.dto.RootBoardDto;

public class BoardImpl implements IBoard {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	private final String NS = "com.min.edu.model.BoardImpl.";
	private SqlSessionFactory manager;
	
	public BoardImpl() {
		manager = SqlsessionFactoryManager.getFactory();
	}
	
	@Override
	public List<RootBoardDto> rootSelect() {
		logger.info("rootSelect  전체 글 조회");
		SqlSession session = manager.openSession();
		List<RootBoardDto> lists = session.selectList(NS+"rootSelect");
		return lists;
	}

	@Override
	public List<RootBoardDto> detailSelect(int seq) {
		logger.info("detailSelect 상세 글 조회 : 글번호 :: " + seq);
		SqlSession session = manager.openSession();
		return session.selectOne(NS+"detailSelect", seq);
	}

	@Override
	public boolean insertRoot(Map<String, Object> map) {
		logger.info("insertRoot root글 입력", map);
		SqlSession session = manager.openSession(true);
		int row = session.insert(NS+"insertRoot", map);
		return row>0? true:false;
	}

	@Override
	public boolean insertReply(Map<String, Object> map) {
		logger.info("insertReply 답글 입력", map);
		SqlSession session = manager.openSession(true);
		int row = session.insert(NS+"insertReply");
		return row>0?true:false;
	}

	@Override
	public boolean updateRoot(Map<String, Object> map) {
		logger.info("updateRoot root글 수정", map);
		SqlSession session = manager.openSession(true);
		int row = session.update(NS+"updateRoot");
		return row>0?true:false;
	}

	@Override
	public boolean deleteRoot(int seq) {
		logger.info("deleteRoot 원글 삭제", seq);
		SqlSession session = manager.openSession(true);
		int row = session.update(NS+"deleteRoot", seq);
		return row>0?true:false;
	}

	@Override
	public boolean updateReply(Map<String, Object> map) {
		logger.info("updateReply 답글 수정", map);
		SqlSession session = manager.openSession(true);
		int row = session.update(NS+"updateReply", map);
		return row>0?true:false;
	}

	@Override
	public boolean deleteReply(int ref) {
		logger.info("deleteReply 답글 삭제", ref);
		SqlSession session = manager.openSession();
		int row = session.update(NS+"deleteReply", ref);
		return row>0?true:false;
	}

	@Override
	public boolean testest() {
		// TODO Auto-generated method stub
		return false;
	}

}
