package dev.be.moduleapi.controller;

import dev.be.moduleapi.service.DemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DemoController {

    private final DemoService demoService;

    @GetMapping("/save")
    private String save(){
        return demoService.save();

    }

    @GetMapping("/find")
    private String find(){
        return demoService.find();

    }
}
