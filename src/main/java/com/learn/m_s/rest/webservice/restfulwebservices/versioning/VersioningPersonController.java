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

    @GetMapping(path = "/person", params = "version=1")
    public PersionV1 getFirstVersionOfPersonRequestParameter(){
        return new PersionV1("Raushan Ranjan");
    }

    @GetMapping(path = "/person", params = "version=2")
    public PersionV2 getSecondVersionOfPersonRequestParameter(){
        return new PersionV2(new Name("Raushan", "Ranjan"));
    }

    @GetMapping(path = "/person/header", headers = "X-API-VERSION=1")
    public PersionV1 getFirstVersionOfPersonRequestHeader(){
        return new PersionV1("Raushan Ranjan");
    }
    @GetMapping(path = "/person/header", headers = "X-API-VERSION=2")
    public PersionV2 getSecondVersionOfPersonRequestHeader(){
        return new PersionV2(new Name("Raushan", "Ranjan"));
    }

    @GetMapping(path = "/person/accept", produces = "application/vnd.company.app-v1+json")
    public PersionV1 getFirstVersionOfPersonAcceptHeader(){
        return new PersionV1("Raushan Ranjan");
    }

    @GetMapping(path = "/person/accept", produces = "application/vnd.company.app-v2+json")
    public PersionV2 getSecondVersionOfPersonAcceptHeader(){
        return new PersionV2(new Name("Raushan", "Ranjan"));
    }
}
