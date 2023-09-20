package com.example.URLHitCounter.contrller;

import com.example.URLHitCounter.Services.CountServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CURDController {
    @Autowired
    CountServices countServices;
    @PostMapping("api/v1/visitor-count-app")
    public String increaseURLHit(){
        countServices.IncreaseCount();
        return "count increase";
    }
    @GetMapping("count")
    public Integer totalHits(){
        return countServices.getTotalCount();
    }
    @PostMapping("api/v1/visitor-count-app/username/{yourusername}/count")
    public void increaseCountForUser(@PathVariable String yourusername){
        countServices.IncreaseCounterUser(yourusername);
    }
    @GetMapping("api/v1/visitor-count-app/username/{yourusername}/count")
    public String getCountForUser(@PathVariable String yourusername){
        return countServices.getTotalHitCountForUser(yourusername);
    }



}
