package com.aditya.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.aditya.model.JobPost;
import com.aditya.service.JobService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class JobController {

	@Autowired
	private JobService service;

	// ************************************************************************

	@GetMapping({"/","/home"})
	public String home() {
		return "home";
	}

	// ************************************************************************

	@GetMapping("/addjob")
	public String addJob() {
		return "addjob";
	}

	// ************************************************************************

	// controller method for getting all job posts
	@GetMapping("/viewalljobs")
	public String viewJobs(Model model) {

		List<JobPost> jobPosts = service.getAllJobs();
		model.addAttribute("jobPosts", jobPosts);
		return "viewalljobs";
	}
	
	// ************************************************************************

	@PostMapping("/handleForm")
	public String handleAddJobForm(JobPost jobPost,Model model) {
		model.addAttribute("jobPost", jobPost);
		service.addJob(jobPost);
		System.out.println(jobPost);
		  return "success";

		
	}

	@GetMapping("jobPosts")
	public List<JobPost> getAllJobs(){
		return service.getAllJobs();
	}


	
	
	
	
	
	
	
	
	
	
}
