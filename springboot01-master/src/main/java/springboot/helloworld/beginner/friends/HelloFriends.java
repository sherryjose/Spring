package springboot.helloworld.beginner.friends;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloFriends {
	
	@RequestMapping("/hello")
	public String SayHello() {
		return "Hello From SpringBoot";
	}

}
