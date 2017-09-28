package ru.zaytsev;

import java.util.HashMap;
import java.util.Map;

import javax.jws.WebMethod;


public class FirstWebService {

	@WebMethod
	public Map<String, String> addTwoNumbers(){
		 
		Map<String, String> map = new HashMap<String, String>();
		map.put("KVSR", "902");
		map.put("FACT", "100101");
		return map;
    }
}
