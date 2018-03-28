package com.springboot.mysql.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/water")
public class WaterController {
	@Autowired
	WaterRepository waterRepository;
	@RequestMapping("/welcome")
public String welcome()
{
	return "Welcome to Free Water at CTS!!";
}
	@RequestMapping("/welcome/free")
	public String welcomeFree()
	{
		return "You win 1 litre of free Cocktail!!!";
	}
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String addWater(@RequestBody UseWater usewater) {
		
		waterRepository.save(usewater);
		return "Saved the water in water tank: " + usewater.getQuantity() + " " + usewater.getContainer();
		
	}
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public String deleteWater(@PathVariable Integer id) {
		waterRepository.delete(id);		
		return "Emptied water in water tank";
	}
		@RequestMapping("/getallwater")
				public List<UseWater> getAllWater(){
				 List<UseWater> allwater=new ArrayList<>();
				waterRepository.findAll().forEach(allwater::add);
				return allwater;
				}
		@RequestMapping(value = "/update/{id}", method=RequestMethod.PUT)
		public String updateWater(@RequestBody UseWater usewater, @PathVariable Integer id) {
			//if(usewater.getId()==null)id is null always as we don't send id
				usewater.setId(id);
			waterRepository.save(usewater);
			return "updated water in water tank: " + usewater.getQuantity() + " " + usewater.getContainer();
}
}
