package com.example.demo;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.MediaTypes;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

@RestController
public class HomeController {
    @GetMapping(value = "/admin", produces = MediaTypes.HAL_JSON_VALUE)
    public RepresentationModel<GreetingModel> hello() {
        GreetingModel greeting = new GreetingModel("Hello, World!");
        Link selfLink = linkTo(HomeController.class).withSelfRel();
        greeting.add(selfLink);
        return greeting;
    }
}
