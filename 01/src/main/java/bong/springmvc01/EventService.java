package bong.springmvc01;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class EventService {

    public List<Event> getEvents(){
        Event event = new Event().builder()
                .name("스프링 웹 MVC 스터디")
                .startDate(LocalDateTime.of(2019, 1, 10, 10, 10))
                .endDate(LocalDateTime.of(2019, 1, 10, 12, 10))
                .limitOfEnrollment(5)
                .build();

        Event event2 = new Event().builder()
                .name("스프링 웹 MVC 스터디")
                .startDate(LocalDateTime.of(2019, 1, 11, 10, 10))
                .endDate(LocalDateTime.of(2019, 1, 11, 12, 10))
                .limitOfEnrollment(5)
                .build();

        List<Event> list = new ArrayList();
        list.add(event);
        list.add(event2);

        return list;
    }
}
