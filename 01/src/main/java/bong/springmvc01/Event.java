package bong.springmvc01;

import lombok.*;

import java.time.LocalDateTime;


@Getter @Setter
@Builder @NoArgsConstructor @AllArgsConstructor
public class Event {
    private String name;

    private int limitOfEnrollment;

    private LocalDateTime startDate;

    private LocalDateTime endDate;
}
