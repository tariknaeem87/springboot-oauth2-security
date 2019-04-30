package com.dell.myfirstapp.rest;

import java.time.LocalTime;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

	@GetMapping("/")
	public String helloWorld() {
		return ("The Current time is  "+ LocalTime.now());
		}
	@PostMapping("/workout")
	public String getDailyWorkout() {
		return "Run 5k";
	  	}
	
	@GetMapping("/fortune")
	public String getDailyFortune() {
		return "your lucky day";
		
	}	
	
	
	@Value("${coach.name}")
	private String coachName;
	
	@Value("${team.name}")
	private String teamName;
	
	@GetMapping("/teaminfo")
	public String getTeamInfo() {
		return ("Team member Name : "+ coachName +", Team Name : "+teamName);
		}		

}
