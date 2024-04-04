package org.example.springgetallbeans.beans;

import org.springframework.stereotype.Component;

@Component("bean2")
public class ExampleBean2 {
    @Override
    public String toString() {
        return "This is ExampleBean2";
    }
}

