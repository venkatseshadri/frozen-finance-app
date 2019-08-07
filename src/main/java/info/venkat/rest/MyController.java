package info.venkat.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class MyController {

    @RequestMapping("/request")
    public String myMethod()
    {
        System.out.println("Hi");
        return "Good Bye";
    }
}
