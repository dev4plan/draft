package ru.web.webproject;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Comment {
    private int counter;
    private String id;
    private String value;

    public Comment(int counter, String id, String value) {
        this.counter = counter;
        this.id = id;
        this.value = value;
    }
}
