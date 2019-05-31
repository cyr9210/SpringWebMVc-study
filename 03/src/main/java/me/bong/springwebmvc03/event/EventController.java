package me.bong.springwebmvc03.event;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
public class EventController {

    @GetMapping("/events")
    public String getEvents(Model model){
        Event event1 = new Event();
        event1.setName("spring web mvc study1");
        event1.setStarted(LocalDateTime.of(2019, 1, 15, 10, 10, 10));

        Event event2 = new Event();
        event2.setName("spring web mvc study2");
        event2.setStarted(LocalDateTime.of(2019, 1, 15, 10, 10, 10));

        List<Event> events = new ArrayList<>();

        events.add(event1);
        events.add(event2);

        model.addAttribute("events", events);
        model.addAttribute("message", "happy new year!!");
        return "events/list";
    }

}
