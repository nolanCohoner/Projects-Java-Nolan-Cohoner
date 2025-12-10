package fr.sdv.m12526.demoboot.Round;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class ClassA {

    private ClassB classB;

    @Autowired
    @Lazy
    public ClassA(ClassB classB) {
        this.classB = classB;
    }

}
