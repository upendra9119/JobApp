package com.upendra.spring_boot_rest.controller;

import com.upendra.spring_boot_rest.model.JobPost;
import com.upendra.spring_boot_rest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class JobRestController {

    @Autowired
    JobService service;

    @GetMapping("jobposts")
    @ResponseBody
    public List<JobPost> getalljobs(){
        return service.returnAllJobPosts();
    }

    @GetMapping("jobpost/{postId}")
    public JobPost getjob(@PathVariable("postId") int postId){
        return service.getJob(postId);
    }


    @PostMapping("jobpost")
    public JobPost addjob(@RequestBody JobPost jobpost){
        service.addJobPost(jobpost);
        return service.getJob(jobpost.getPostId());

    }


    @PutMapping("jobpost")
    public JobPost updatejob(@RequestBody JobPost jobpost){
        service.updateJobPost(jobpost);
        return service.getJob(jobpost.getPostId());
    }

    @DeleteMapping("jobpost/{id}")
    public String deletejob(@PathVariable("id") int postId){
        service.deletejob(postId);
        return "deleted";
    }
}


