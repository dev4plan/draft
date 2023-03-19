package ru.web.webproject;

import java.util.List;

public class Error {
    private List<Error> errorList;
    private final Error error;

    public Error(Error error) {
        this.error = error;
    }

}
