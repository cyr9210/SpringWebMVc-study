package me.bong.springwebmvc05;

import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
//@RequestMapping("/hello")
public class SampleController {

//    @RequestMapping(value = "/{name:[a-z]+}", method = RequestMethod.GET)  //@GetMapping("/hello")로 사용할 수 있다.
//    @ResponseBody
//    public String hello(@PathVariable String name) {
//        return "hello " + name;
//    }

//    @RequestMapping(value = "/bong")
//    @ResponseBody
//    public String hellobong() {
//        return "hello";
//    }

    @RequestMapping(value = "/hello",
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
            method = RequestMethod.GET
    )
    @ResponseBody
    public String hello() {
        return "hello";
    }

    @PostMapping
    @ResponseBody
    public String helloPost() {
        return "hello";
    }
}
