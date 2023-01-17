package com.learn.m_s.rest.webservice.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {

    @GetMapping("/v1/person")
    public PersionV1 getFirstVersionOfPerson(){
        return new PersionV1("Raushan Ranjan");
    }

    @GetMapping("/v2/person")
    public PersionV2 getSecondVersionOfPerson(){
        return new PersionV2(new Name("Raushan", "Ranjan"));
    }
}
