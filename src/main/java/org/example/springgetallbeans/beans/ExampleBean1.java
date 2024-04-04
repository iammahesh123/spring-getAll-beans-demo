package org.example.springgetallbeans.beans;


import org.springframework.stereotype.Component;

@Component("bean1")
public class ExampleBean1 {
    @Override
    public String toString() {
        return "This is ExampleBean1";
    }
}

