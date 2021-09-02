package com.mvc.upgrade.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvc.upgrade.model.dto.MYBoardDto;


@Repository
public class MYBoardDaoImpl implements MYBoardDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
		
	@Override
	public List<MYBoardDto> selectList() {
		List<MYBoardDto> list = new ArrayList<MYBoardDto>();
		//List<MYBoardDto> list = sqlSession.selectList(NAMESPACE + "selectList"); 이렇게도 가능
		try {
			list = sqlSession.selectList(NAMESPACE + "selectList");
		} catch (Exception e) {
			e.printStackTrace();
		}				
		return list;
	}

	@Override
	public MYBoardDto selectOne(int myno) {
		MYBoardDto dto = null;
		
		try {
			dto = sqlSession.selectOne(NAMESPACE + "selectOne",myno);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto;
	}

	@Override
	public int insert(MYBoardDto dto) {
		int res = 0;
		res = sqlSession.insert(NAMESPACE + "insert",dto);
		return res;
	}

	@Override
	public int update(MYBoardDto dto) {
		int res = 0;
		res = sqlSession.update(NAMESPACE + "update" ,dto);
		return res;
	}

	@Override
	public int delete(int myno) {
		int res = 0;
		res = sqlSession.delete(NAMESPACE + "delete",myno);
		return res;
	}

}
