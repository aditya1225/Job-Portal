package com.aditya.model;

import lombok.*;
import org.springframework.stereotype.Component;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Component
public class JobPost {
	private int postId;
	private String postProfile;
	private String postDesc;
	private int reqExperience;


//	public JobPost() {
//
//	}
	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public String getPostProfile() {
		return postProfile;
	}

	public void setPostProfile(String postProfile) {
		this.postProfile = postProfile;
	}

	public String getPostDesc() {
		return postDesc;
	}

	public void setPostDesc(String postDesc) {
		this.postDesc = postDesc;
	}

	public int getReqExperience() {
		return reqExperience;
	}

	public void setReqExperience(int reqExperience) {
		this.reqExperience = reqExperience;
	}

	public List<String> getPostTechStack() {
		return postTechStack;
	}

	public void setPostTechStack(List<String> postTechStack) {
		this.postTechStack = postTechStack;
	}

	private List<String> postTechStack;
}
