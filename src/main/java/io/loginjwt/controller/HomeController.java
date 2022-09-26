package io.loginjwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sound.midi.ShortMessage;
import java.security.Principal;

@RestController
@RequestMapping
public class HomeController {
    @GetMapping
    String home(Principal principal){
        return "Hello  "+ principal.getName();
    }
}
