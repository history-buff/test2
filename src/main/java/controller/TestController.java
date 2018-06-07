package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping(value="/test")
	String test() {
		return "廖敏，哈哈哈哈哈哈哈";
	}

}
