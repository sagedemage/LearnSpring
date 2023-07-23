/* Building an Application with Spring Boot */

package com.example.LearnSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
