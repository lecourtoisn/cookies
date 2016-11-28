package net.atos;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class Sample {
    private Stock stock = new Stock();

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "Hello, world ! What a beautiful day to be alive !";
    }

    @RequestMapping(value = "/cookies", params = {})
    @ResponseBody
    public String cookies() {
        int nbCookies = stock.incrCookies();
        return "You have " + nbCookies + " cookies";
    }


}
