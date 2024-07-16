package org.lordy.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class HelloController {


    @GetMapping("/")
    public Flux<String> hello(){
        return Flux.just("hello");
    }


    @GetMapping("/login")
    public Flux<String> login(){
        return Flux.just("login");
    }


    @GetMapping("/api/private")
    public Flux<String> privateMessage(){
        return Flux.just("private");
    }


}
