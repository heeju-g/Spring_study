package com.hello.mvc.model;

import org.springframework.stereotype.Repository;

@Repository
public class HelloDao {
	
	public String getHello() {
		
		// TODO : 06. dao에서 return(지금은 디비연결 안했으니까)
		return "Spring";
		
	}

}
