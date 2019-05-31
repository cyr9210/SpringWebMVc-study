package me.bong.springwebmvc03.event;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter @Getter
public class Event {

    private String name;

    private LocalDateTime started;
}
