package com.eastcom.social.bio.open.rest.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class DataApiController {

	@RequestMapping(method = RequestMethod.GET)
	public String hello() {
		return "hello!";

	}
}
