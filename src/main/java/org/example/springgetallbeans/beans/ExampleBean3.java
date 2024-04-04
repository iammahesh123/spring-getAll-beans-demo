package org.example.springgetallbeans.beans;

import org.springframework.stereotype.Component;

@Component("bean3")
public class ExampleBean3 {
    @Override
    public String toString() {
        return "This is ExampleBean3";
    }
}

