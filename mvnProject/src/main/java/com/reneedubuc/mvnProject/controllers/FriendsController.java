package com.reneedubuc.mvnProject.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FriendsController {

	List<String> friends = new ArrayList<String>();
	
	@RequestMapping(value = "/friends", method = RequestMethod.POST) // /friends is endpoint we are listening to and only on POST channel
	public String addFriend(@RequestBody String friend) {
		friends.add(friend);
		return "Successfully added: " + friend;
	} //@ReturnBody indicates its the same type as listed next, String
	
	@RequestMapping("/friends") //automatically GET so no method needed
	public List<String> getFriends(){
		return friends;
	}
}
