package org.lordy.demo.web;

import cn.dev33.satoken.stp.StpUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class HelloController {




    @GetMapping("/login")
    public Flux<String> login(String username, String password){
        if("zhang".equals(username) && "123456".equals(password)) {
            StpUtil.login(10001);
            return Flux.just("success");
        }
        return Flux.just("fail");
    }


    @GetMapping("/isLogin")
    public Flux<Boolean> privateMessage(){
        return Flux.just(StpUtil.isLogin());
    }

    @GetMapping("/logout")
    public Flux<Boolean> logout(){
        StpUtil.logout();
        return Flux.empty();
    }

}
