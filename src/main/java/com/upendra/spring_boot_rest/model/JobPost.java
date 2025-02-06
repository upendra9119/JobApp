package com.upendra.spring_boot_rest.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@Component
public class JobPost {


	private int postId;
	private String postProfile; 
	private String postDesc;
	private Integer reqExperience;
	private List<String> postTechStack;


	public JobPost(int postId, String postProfile, String postDesc, Integer reqExperience, List<String> postTechStack) {
		this.postId = postId;
		this.postProfile = postProfile;
		this.postDesc = postDesc;
		this.reqExperience = reqExperience;
		this.postTechStack = postTechStack;
	}
	public int getPostId() { return postId; }
	public void setPostId(int postId) { this.postId = postId; }

	public String getPostProfile() { return postProfile; }
	public void setPostProfile(String postProfile) { this.postProfile = postProfile; }

	public String getPostDesc() { return postDesc; }
	public void setPostDesc(String postDesc) { this.postDesc = postDesc; }

	public Integer getReqExperience() { return reqExperience; }
	public void setReqExperience(Integer reqExperience) { this.reqExperience = reqExperience; }

	public List<String> getPostTechStack() { return postTechStack; }
	public void setPostTechStack(List<String> postTechStack) { this.postTechStack = postTechStack; }




}
