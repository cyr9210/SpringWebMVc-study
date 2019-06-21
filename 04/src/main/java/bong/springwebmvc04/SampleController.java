package bong.springwebmvc04;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    // preHandle
    // 요청처리
    // postHandler
    // view 랜더링
    // afterCompletion

    @GetMapping("/hello")
    public String hello(@RequestParam("id") Person person){
        return "hello " + person.getName();
    }

    @GetMapping("/message")
    public String message(@RequestBody String body){
        return body;
    }

    @GetMapping("/jsonMessage")
    public Person jsonMessage(@RequestBody Person person) {
        return person;
    }
}
