package ee.taltech.volatilator.controller;

import org.springframework.web.bind.annotation.*;

@RequestMapping
@RestController
public class IndexController {

    @GetMapping
    public String index(){
        return "API is up!";
    }

}
