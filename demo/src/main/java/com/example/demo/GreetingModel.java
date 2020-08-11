package com.example.demo;

import lombok.*;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;

public class GreetingModel extends RepresentationModel<GreetingModel> {
    @Getter
    @Setter
    private String greeting;

    public GreetingModel(String greeting) {
        this.greeting = greeting;
    }
}
