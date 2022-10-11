package com.showmual.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.showmual.dao.TeammateDao;
import com.showmual.model.TeammateVO;

@Service("teammateService")
@Transactional
public class TeammateService {
	
	@Autowired
	private TeammateDao teammateDao;

	// 생성자 만들기
	public TeammateService(TeammateDao teammateDao) {
		this.teammateDao = teammateDao;
	}
	
	Logger logger = LoggerFactory.getLogger("com.showmual.service.TeammateService");
	
	public List<TeammateVO> TeammateList() {
		List<TeammateVO> teammateList = teammateDao.selectTeammate();
		logger.info("=============> TeammateService 진입");
		return teammateList;
	}
	
}
