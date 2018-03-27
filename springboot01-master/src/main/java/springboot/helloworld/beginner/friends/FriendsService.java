package springboot.helloworld.beginner.friends;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FriendsService {
	
	@Autowired
	private FriendsRepository friendRepository;
	
	private List<Friend> friends = new ArrayList<>(Arrays.asList(
			new Friend("one","Mahendra", "Gujarat"),
			new Friend("two","Manoj", "Abu"),
			new Friend("three",	"Naren", "Jodhpur")
			)); 

	public List<Friend> getFriends() {
		//return friends;
		List<Friend> friends = new ArrayList<>();
		friendRepository.findAll().forEach(friends::add);
		return friends;
	}

	public Friend getFriend(String id) {
		// TODO Auto-generated method stub
		//return friends.stream().filter(f -> f.getId().equals(id)).findFirst().get();
		return friendRepository.findOne(id);
	}

	public void addFriend(Friend friend) {
		// TODO Auto-generated method stub
		//friends.add(friend);
		friendRepository.save(friend);
	}

	public void updateFriend(String id, Friend friend) {
		// TODO Auto-generated method stub
		/*for (int i = 0; i <friends.size(); i++) {
			Friend f = friends.get(i);
			if(f.getId().equals(id)) {
				friends.set(i, friend);
				return;
				}
		}*/
		friendRepository.save(friend);
		
		
	}

	public void deleteFriend(String id) {
		// TODO Auto-generated method stub
		//friends.removeIf( f -> f.getId().equals(id)); 
		friendRepository.delete(id);
	}
	
}





