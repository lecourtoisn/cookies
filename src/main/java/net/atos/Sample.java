package net.atos;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class Sample {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello, world ! What a beautiful day to be alive !";
    }
}
