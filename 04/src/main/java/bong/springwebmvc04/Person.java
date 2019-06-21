package bong.springwebmvc04;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Setter @Getter
@ToString
@Entity
@XmlRootElement
public class Person {

    @Id @GeneratedValue
    private Long id;

    private String name;
}
