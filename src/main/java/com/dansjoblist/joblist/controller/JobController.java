package com.dansjoblist.joblist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties.Job;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/jobs")
public class JobController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public ResponseEntity<List<Job>> getJobs() {
        String url = "http://dev3.dansmultipro.co.id/api/recruitment/positions.json";
        ResponseEntity<List<Job>> responseEntity = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Job>>() {
                });
        List<Job> jobs = responseEntity.getBody();

        return ResponseEntity.ok(jobs);
    }

}
