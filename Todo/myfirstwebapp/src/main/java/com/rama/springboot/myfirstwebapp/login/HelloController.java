package com.rama.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello What are you doing right now?";
	}

	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer s = new StringBuffer();
		s.append("<html>");
		s.append("<title>");
		s.append("yo222");
		s.append("</title>");
		s.append("<body>");
		s.append("Inside body");
		s.append("</body>");
		s.append("</html>");
		return s.toString();
	}

	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}

}
