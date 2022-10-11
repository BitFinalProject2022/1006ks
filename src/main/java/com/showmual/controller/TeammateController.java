package com.showmual.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.showmual.model.TeammateVO;
import com.showmual.service.TeammateService;

@Controller("teammateController")
public class TeammateController {
	
	@Autowired
	TeammateVO teammateVO;
	@Autowired
	TeammateService teammateService;
	
	List<TeammateVO> teammate = new ArrayList<TeammateVO>();
	
	Logger logger = LoggerFactory.getLogger("com.showmual.controller.TeammateController");
	
	@RequestMapping("/test")
	public String home() {
		return "test";
	}
	
	@RequestMapping("/teammateList")
	@ResponseBody
	public List<TeammateVO> selectTeammate() {
		teammate = teammateService.TeammateList();
		logger.info("================> selectTeammate 메서드 진입");
		return teammate;
	}
	
//	@RequestMapping(value = "/teammateList", method = RequestMethod.POST)
//	public List<TeammateVO> selectTeammate() {
//		teammate = teammateService.TeammateList();
//		logger.info("================> selectTeammate 메서드 진입");
//		return teammate;
//	}
	
}
