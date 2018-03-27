package springboot.helloworld.beginner.friends;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetFriends {
	
	@Autowired
	private FriendsService friendsService;
	
	@RequestMapping("/friends")
	public List<Friend> getFriends() {
		return friendsService.getFriends();
	}
	
	@RequestMapping("/friends/{id}")
	public Friend getFriend(@PathVariable String id) {
		return friendsService.getFriend(id);
		
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/friends")
	public void addFriend(@RequestBody Friend friend) {
		friendsService.addFriend(friend);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/friends/{id}")
	public void deleteFriend(@PathVariable String id) {
		friendsService.deleteFriend(id);
	}
	
	
	
	
}
