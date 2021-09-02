package com.mvc.upgrade.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mvc.upgrade.model.biz.MemberBiz;
import com.mvc.upgrade.model.dto.MemberDto;

@Controller
public class MemberController {
	
	private Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	private MemberBiz biz;	
	
	@RequestMapping("/loginform.do")
	public String loginForm() {
		
		logger.info("[Controller] loginform.do");
		
		
		
		return "memberlogin";
	}
	
	@ResponseBody
	@RequestMapping(value="/ajaxlogin.do",method=RequestMethod.POST)
	public Map<String, Boolean> ajaxLogin(@RequestBody MemberDto dto, HttpSession session){
		logger.info("[Controller] ajaxlogin.do");
		
		
		/*
		 * @RequestBody : request 객체의 body에 저장되어 넘어오는 데이터 -> java object에 binding(만들어놓은 dto에 넣어준단 소리)
		 * 이전에 model이런건 넘어오는 값이 String타입이었음. 지금 얘는 문자열 아닌 것(지금은 json객체)도 넣어줄 수 있음
		 * @ResponseBody : java object -> response 객체의 body에 binding(이전엔 model-> viewresolver거치고 이랬는데
		 * 얘는 중간 안거치고 바로 response객체 body에 넣음
		 */
		MemberDto res = biz.login(dto);
		boolean check = false;
		if(res != null) {
			check = true;
			session.setAttribute("login", res);
		}
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		map.put("check", check);
		return map;
		//response body에 담은 map을 jackson이 json형태로 바꿔줌
	}
	
	
	
	
}
