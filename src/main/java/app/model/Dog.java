package app.model;

import org.springframework.stereotype.Component;

@Component(value = "dog")
public class Dog extends Animal {
    @Override
    public String toString() {
        return "Im a Dog";
    }
}


