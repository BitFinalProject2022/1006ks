package com.showmual.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.showmual.model.TeammateVO;

@Mapper
@Repository("teammateDao")
public interface TeammateDao {
	
	public List<TeammateVO> selectTeammate() throws DataAccessException;
	
}
