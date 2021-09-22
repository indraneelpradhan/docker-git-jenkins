package sonu.techie.awsdeploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v2")
public class MainController {

    @GetMapping("/get")
    public String home(){return "Welcome to aws deployment";}
}
