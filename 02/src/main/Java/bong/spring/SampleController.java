package bong.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {

    @Autowired
    MyService myService;

    @GetMapping("/sample")
    public String sample(){
        return "sample";
    }
}
